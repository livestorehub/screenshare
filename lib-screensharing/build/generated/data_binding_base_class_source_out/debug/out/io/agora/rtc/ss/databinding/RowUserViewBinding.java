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
import androidx.viewbinding.ViewBinding;
import de.hdodenhof.circleimageview.CircleImageView;
import io.agora.rtc.ss.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowUserViewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivShare;

  @NonNull
  public final ImageView ivStatus;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView tvFname;

  @NonNull
  public final TextView tvLname;

  @NonNull
  public final TextView tvStatus;

  private RowUserViewBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivShare,
      @NonNull ImageView ivStatus, @NonNull CircleImageView profileImage, @NonNull TextView tvFname,
      @NonNull TextView tvLname, @NonNull TextView tvStatus) {
    this.rootView = rootView;
    this.ivShare = ivShare;
    this.ivStatus = ivStatus;
    this.profileImage = profileImage;
    this.tvFname = tvFname;
    this.tvLname = tvLname;
    this.tvStatus = tvStatus;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowUserViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowUserViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_user_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowUserViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivShare;
      ImageView ivShare = rootView.findViewById(id);
      if (ivShare == null) {
        break missingId;
      }

      id = R.id.ivStatus;
      ImageView ivStatus = rootView.findViewById(id);
      if (ivStatus == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.tvFname;
      TextView tvFname = rootView.findViewById(id);
      if (tvFname == null) {
        break missingId;
      }

      id = R.id.tvLname;
      TextView tvLname = rootView.findViewById(id);
      if (tvLname == null) {
        break missingId;
      }

      id = R.id.tvStatus;
      TextView tvStatus = rootView.findViewById(id);
      if (tvStatus == null) {
        break missingId;
      }

      return new RowUserViewBinding((LinearLayout) rootView, ivShare, ivStatus, profileImage,
          tvFname, tvLname, tvStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}