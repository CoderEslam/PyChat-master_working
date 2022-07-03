// Generated by view binder compiler. Do not edit!
package personal.droid.pychat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.mxn.soul.flowingdrawer_core.FlowingDrawer;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import personal.droid.pychat.R;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final FlowingDrawer rootView;

  @NonNull
  public final FlowingDrawer drawerLayout;

  @NonNull
  public final RecyclerView menuRecyclerView;

  @NonNull
  public final SwipeRefreshLayout menuRecyclerViewSwipeRefresh;

  @NonNull
  public final EditText searchContact;

  private ActivityMainBinding(@NonNull FlowingDrawer rootView, @NonNull FlowingDrawer drawerLayout,
      @NonNull RecyclerView menuRecyclerView,
      @NonNull SwipeRefreshLayout menuRecyclerViewSwipeRefresh, @NonNull EditText searchContact) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
    this.menuRecyclerView = menuRecyclerView;
    this.menuRecyclerViewSwipeRefresh = menuRecyclerViewSwipeRefresh;
    this.searchContact = searchContact;
  }

  @Override
  @NonNull
  public FlowingDrawer getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      FlowingDrawer drawerLayout = rootView.findViewById(R.id.drawer_layout);
      if (drawerLayout == null) {
        missingId = "drawerLayout";
        break missingId;
      }
      RecyclerView menuRecyclerView = rootView.findViewById(R.id.menu_recycler_view);
      if (menuRecyclerView == null) {
        missingId = "menuRecyclerView";
        break missingId;
      }
      SwipeRefreshLayout menuRecyclerViewSwipeRefresh = rootView.findViewById(R.id.menu_recycler_view_swipe_refresh);
      if (menuRecyclerViewSwipeRefresh == null) {
        missingId = "menuRecyclerViewSwipeRefresh";
        break missingId;
      }
      EditText searchContact = rootView.findViewById(R.id.searchContact);
      if (searchContact == null) {
        missingId = "searchContact";
        break missingId;
      }
      return new ActivityMainBinding((FlowingDrawer) rootView, drawerLayout, menuRecyclerView,
          menuRecyclerViewSwipeRefresh, searchContact);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
