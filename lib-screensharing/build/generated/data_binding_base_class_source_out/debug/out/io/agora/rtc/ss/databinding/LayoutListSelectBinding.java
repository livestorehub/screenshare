// Generated by data binding compiler. Do not edit!
package io.agora.rtc.ss.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import io.agora.rtc.ss.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LayoutListSelectBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivClose;

  @NonNull
  public final LinearLayout llSearch;

  @NonNull
  public final LinearLayout llView;

  @NonNull
  public final RecyclerView rvAgentList;

  protected LayoutListSelectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivClose, LinearLayout llSearch, LinearLayout llView, RecyclerView rvAgentList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivClose = ivClose;
    this.llSearch = llSearch;
    this.llView = llView;
    this.rvAgentList = rvAgentList;
  }

  @NonNull
  public static LayoutListSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_list_select, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LayoutListSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LayoutListSelectBinding>inflateInternal(inflater, R.layout.layout_list_select, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutListSelectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.layout_list_select, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LayoutListSelectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LayoutListSelectBinding>inflateInternal(inflater, R.layout.layout_list_select, null, false, component);
  }

  public static LayoutListSelectBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LayoutListSelectBinding bind(@NonNull View view, @Nullable Object component) {
    return (LayoutListSelectBinding)bind(component, view, R.layout.layout_list_select);
  }
}
