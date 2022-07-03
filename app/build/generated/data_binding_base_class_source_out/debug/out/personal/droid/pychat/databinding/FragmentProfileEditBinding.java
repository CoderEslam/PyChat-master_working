// Generated by view binder compiler. Do not edit!
package personal.droid.pychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import personal.droid.pychat.R;

public final class FragmentProfileEditBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final ImageView changeImage;

  @NonNull
  public final ImageView done;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ImageView userImage;

  @NonNull
  public final TextView userName;

  @NonNull
  public final EditText userNameEdit;

  @NonNull
  public final EditText userStatus;

  private FragmentProfileEditBinding(@NonNull LinearLayout rootView, @NonNull ImageView back,
      @NonNull ImageView changeImage, @NonNull ImageView done, @NonNull ProgressBar progressBar,
      @NonNull ImageView userImage, @NonNull TextView userName, @NonNull EditText userNameEdit,
      @NonNull EditText userStatus) {
    this.rootView = rootView;
    this.back = back;
    this.changeImage = changeImage;
    this.done = done;
    this.progressBar = progressBar;
    this.userImage = userImage;
    this.userName = userName;
    this.userNameEdit = userNameEdit;
    this.userStatus = userStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      ImageView back = rootView.findViewById(R.id.back);
      if (back == null) {
        missingId = "back";
        break missingId;
      }
      ImageView changeImage = rootView.findViewById(R.id.changeImage);
      if (changeImage == null) {
        missingId = "changeImage";
        break missingId;
      }
      ImageView done = rootView.findViewById(R.id.done);
      if (done == null) {
        missingId = "done";
        break missingId;
      }
      ProgressBar progressBar = rootView.findViewById(R.id.progressBar);
      if (progressBar == null) {
        missingId = "progressBar";
        break missingId;
      }
      ImageView userImage = rootView.findViewById(R.id.userImage);
      if (userImage == null) {
        missingId = "userImage";
        break missingId;
      }
      TextView userName = rootView.findViewById(R.id.userName);
      if (userName == null) {
        missingId = "userName";
        break missingId;
      }
      EditText userNameEdit = rootView.findViewById(R.id.userNameEdit);
      if (userNameEdit == null) {
        missingId = "userNameEdit";
        break missingId;
      }
      EditText userStatus = rootView.findViewById(R.id.userStatus);
      if (userStatus == null) {
        missingId = "userStatus";
        break missingId;
      }
      return new FragmentProfileEditBinding((LinearLayout) rootView, back, changeImage, done,
          progressBar, userImage, userName, userNameEdit, userStatus);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
