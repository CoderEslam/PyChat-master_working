package personal.droid.pychat.views.multipicker.api;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.util.Log;

import androidx.fragment.app.Fragment;

import personal.droid.pychat.views.multipicker.api.callbacks.ContactPickerCallback;
import personal.droid.pychat.views.multipicker.api.entity.ChosenContact;
import personal.droid.pychat.views.multipicker.api.exceptions.PickerException;
import personal.droid.pychat.views.multipicker.core.PickerManager;
import personal.droid.pychat.views.multipicker.utils.LogUtils;


/**
 * Choose a contact from your address book
 */
public class ContactPicker extends PickerManager {
    private final static String TAG = ContactPicker.class.getSimpleName();

    private ContactPickerCallback callback;

    /**
     * Constructor for choosing a contact from an {@link Activity}
     *
     * @param activity
     */
    public ContactPicker(Activity activity) {
        super(activity, Picker.PICK_CONTACT);
    }

    /**
     * Constructor for choosing a contact from a {@link Fragment}
     *
     * @param fragment
     */
    public ContactPicker(Fragment fragment) {
        super(fragment, Picker.PICK_CONTACT);
    }

    /**
     * Constructor for choosing a contact from a {@link android.app.Fragment}
     *
     * @param appFragment
     */
    public ContactPicker(android.app.Fragment appFragment) {
        super(appFragment, Picker.PICK_CONTACT);
    }

    /**
     * Listener which gets callbacks when the choosen contact is ready to be used
     *
     * @param callback
     */
    public void setContactPickerCallback(ContactPickerCallback callback) {
        this.callback = callback;
    }

    /**
     * Initiate the Contact Chooser.
     * <p>
     * Make sure you have {@link Manifest.permission#READ_CONTACTS} in your Manifest file.
     * <p>
     * Else a {@link RuntimeException} will be raised.
     */
    public void pickContact() {
        try {
            checkPermission();
            pick();
        } catch (PickerException e) {
            e.printStackTrace();
            if (callback != null) {
                callback.onError(e.getMessage());
            }
        }
    }

    @Override
    protected String pick() throws PickerException {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        if (extras != null) {
            intent.putExtras(extras);
        }
        pickInternal(intent, Picker.PICK_CONTACT);
        return null;
    }

    /**
     * Call this method from
     * onActivityResult()
     *
     * @param data
     */
    @Override
    public void submit(Intent data) {
        if (data != null) {
            if (data.getData() != null) {
                if (data.getData() instanceof Uri) {
                    Uri uri = data.getData();
                    LogUtils.d(TAG, "submit: " + uri);
                    queryForContact(uri);
                }
            }
        }
    }

    private int getRawContactId(int contactId) {
        int rawContactId = -1;
        String[] projection = {ContactsContract.RawContacts._ID};
        String selection = ContactsContract.RawContacts.CONTACT_ID + " = ?";
        String[] selectionArgs = {contactId + ""};
        Cursor cursor = getContext().getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, projection, selection, selectionArgs, null);
        if(cursor!=null && cursor.getCount()>0) {
            if (cursor.moveToFirst()) {
                rawContactId = cursor.getInt(cursor.getColumnIndexOrThrow(ContactsContract.RawContacts._ID));
            }
            cursor.close();
        }
        return rawContactId;
    }

    private void queryForContact(Uri uri) {
        String[] projection = {
                ContactsContract.Contacts.DISPLAY_NAME,
                ContactsContract.Contacts.PHOTO_URI,
                ContactsContract.Contacts._ID
        };

        ChosenContact contact = new ChosenContact();
        contact.setRequestId(requestId);

        Cursor cursor = getContext().getContentResolver().query(uri, projection, null, null, null);
        int contactId = 0;
        if (cursor.moveToFirst()) {
            contactId = cursor.getInt(cursor.getColumnIndexOrThrow(ContactsContract.Contacts._ID));
            String displayName = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts.DISPLAY_NAME));
            String photoUri = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.Contacts.PHOTO_URI));
            contact.setDisplayName(displayName);
            contact.setPhotoUri(photoUri);
        }

        int rawContactId = getRawContactId(contactId);

        if (rawContactId != -1) {

            String selection = ContactsContract.Data.RAW_CONTACT_ID + " = ?";
            String[] selectionArgs = {rawContactId + ""};


            Cursor rawContactCursor = getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI,
                    new String[]{
                            ContactsContract.Data.MIMETYPE,
                            ContactsContract.Data.DATA1
                    }, selection, selectionArgs, null);

            try {
                while (rawContactCursor.moveToNext()) {
                    String mimeType = rawContactCursor.getString(0);
                    String data = rawContactCursor.getString(1);

                    if (mimeType.equals(ContactsContract.CommonDataKinds.StructuredName.CONTENT_ITEM_TYPE)) {
                        contact.setDisplayName(data);
                    }
                    if (mimeType.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE)) {
                        contact.addPhone(data);
                    }
                    if (mimeType.equals(ContactsContract.CommonDataKinds.Email.CONTENT_ITEM_TYPE)) {
                        contact.addEmail(data);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rawContactCursor.close();
            }
            cursor.close();
            try {
                if (callback != null) {
                    callback.onContactChosen(contact);
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } else {
            callback.onError("Contact Not found - Error - Please report to developer");
        }
    }

    private void checkPermission() {
        boolean permissionGranted = getContext().checkCallingOrSelfPermission(Manifest.permission.READ_CONTACTS) == PackageManager.PERMISSION_GRANTED;
        LogUtils.d(TAG, "checkIfPermissionsAvailable: In Manifest(READ_CONTACTS): " + permissionGranted);
        if (!permissionGranted) {
            Log.e(TAG, Manifest.permission.READ_CONTACTS + " permission is missing in manifest file");
            throw new RuntimeException("Permissions missing in Manifest");
        }
    }
}
