// Generated by view binder compiler. Do not edit!
package personal.droid.pychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import personal.droid.pychat.R;

public final class DialogVCardDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView addToContactText;

  @NonNull
  public final TextView close;

  @NonNull
  public final LinearLayout contactAdd;

  @NonNull
  public final CircleImageView contactImage;

  @NonNull
  public final TextView contactName;

  @NonNull
  public final RecyclerView recyclerEmail;

  @NonNull
  public final RecyclerView recyclerPhone;

  private DialogVCardDetailBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView addToContactText, @NonNull TextView close, @NonNull LinearLayout contactAdd,
      @NonNull CircleImageView contactImage, @NonNull TextView contactName,
      @NonNull RecyclerView recyclerEmail, @NonNull RecyclerView recyclerPhone) {
    this.rootView = rootView;
    this.addToContactText = addToContactText;
    this.close = close;
    this.contactAdd = contactAdd;
    this.contactImage = contactImage;
    this.contactName = contactName;
    this.recyclerEmail = recyclerEmail;
    this.recyclerPhone = recyclerPhone;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogVCardDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogVCardDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_v_card_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogVCardDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView addToContactText = rootView.findViewById(R.id.addToContactText);
      if (addToContactText == null) {
        missingId = "addToContactText";
        break missingId;
      }
      TextView close = rootView.findViewById(R.id.close);
      if (close == null) {
        missingId = "close";
        break missingId;
      }
      LinearLayout contactAdd = rootView.findViewById(R.id.contactAdd);
      if (contactAdd == null) {
        missingId = "contactAdd";
        break missingId;
      }
      CircleImageView contactImage = rootView.findViewById(R.id.contactImage);
      if (contactImage == null) {
        missingId = "contactImage";
        break missingId;
      }
      TextView contactName = rootView.findViewById(R.id.contactName);
      if (contactName == null) {
        missingId = "contactName";
        break missingId;
      }
      RecyclerView recyclerEmail = rootView.findViewById(R.id.recyclerEmail);
      if (recyclerEmail == null) {
        missingId = "recyclerEmail";
        break missingId;
      }
      RecyclerView recyclerPhone = rootView.findViewById(R.id.recyclerPhone);
      if (recyclerPhone == null) {
        missingId = "recyclerPhone";
        break missingId;
      }
      return new DialogVCardDetailBinding((RelativeLayout) rootView, addToContactText, close,
          contactAdd, contactImage, contactName, recyclerEmail, recyclerPhone);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
