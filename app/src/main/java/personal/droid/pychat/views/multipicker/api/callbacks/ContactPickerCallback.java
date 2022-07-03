package personal.droid.pychat.views.multipicker.api.callbacks;


import personal.droid.pychat.views.multipicker.api.entity.ChosenContact;

/**
 * Created by kbibek on 2/27/16.
 */
public interface ContactPickerCallback extends PickerCallback {
    void onContactChosen(ChosenContact contact);
}
