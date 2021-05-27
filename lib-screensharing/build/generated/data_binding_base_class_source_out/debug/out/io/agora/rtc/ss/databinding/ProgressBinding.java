// Generated by view binder compiler. Do not edit!
package io.agora.rtc.ss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.agora.rtc.ss.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProgressBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final TextView loadingMsg;

  private ProgressBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar loader,
      @NonNull TextView loadingMsg) {
    this.rootView = rootView;
    this.loader = loader;
    this.loadingMsg = loadingMsg;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProgressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProgressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.progress, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProgressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.loader;
      ProgressBar loader = rootView.findViewById(id);
      if (loader == null) {
        break missingId;
      }

      id = R.id.loading_msg;
      TextView loadingMsg = rootView.findViewById(id);
      if (loadingMsg == null) {
        break missingId;
      }

      return new ProgressBinding((LinearLayout) rootView, loader, loadingMsg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
