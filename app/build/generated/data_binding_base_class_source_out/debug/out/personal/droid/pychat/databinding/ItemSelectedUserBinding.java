// Generated by view binder compiler. Do not edit!
package personal.droid.pychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import personal.droid.pychat.R;

public final class ItemSelectedUserBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView userName;

  private ItemSelectedUserBinding(@NonNull TextView rootView, @NonNull TextView userName) {
    this.rootView = rootView;
    this.userName = userName;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSelectedUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSelectedUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_selected_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSelectedUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      TextView userName = rootView.findViewById(R.id.user_name);
      if (userName == null) {
        missingId = "userName";
        break missingId;
      }
      return new ItemSelectedUserBinding((TextView) rootView, userName);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
