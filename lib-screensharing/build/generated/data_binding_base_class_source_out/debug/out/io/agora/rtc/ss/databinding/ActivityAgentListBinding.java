// Generated by view binder compiler. Do not edit!
package io.agora.rtc.ss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import io.agora.rtc.ss.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAgentListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivBack;

  @NonNull
  public final LinearLayout llProgress;

  @NonNull
  public final TextView loadingMsg;

  @NonNull
  public final RecyclerView rvAgentList;

  @NonNull
  public final TextView tvNoData;

  private ActivityAgentListBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivBack,
      @NonNull LinearLayout llProgress, @NonNull TextView loadingMsg,
      @NonNull RecyclerView rvAgentList, @NonNull TextView tvNoData) {
    this.rootView = rootView;
    this.ivBack = ivBack;
    this.llProgress = llProgress;
    this.loadingMsg = loadingMsg;
    this.rvAgentList = rvAgentList;
    this.tvNoData = tvNoData;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAgentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAgentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_agent_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAgentListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivBack;
      ImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.llProgress;
      LinearLayout llProgress = rootView.findViewById(id);
      if (llProgress == null) {
        break missingId;
      }

      id = R.id.loading_msg;
      TextView loadingMsg = rootView.findViewById(id);
      if (loadingMsg == null) {
        break missingId;
      }

      id = R.id.rvAgentList;
      RecyclerView rvAgentList = rootView.findViewById(id);
      if (rvAgentList == null) {
        break missingId;
      }

      id = R.id.tvNoData;
      TextView tvNoData = rootView.findViewById(id);
      if (tvNoData == null) {
        break missingId;
      }

      return new ActivityAgentListBinding((LinearLayout) rootView, ivBack, llProgress, loadingMsg,
          rvAgentList, tvNoData);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
