// Generated by data binding compiler. Do not edit!
package com.example.week2_group2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.week2_group2.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentOnboarding2Binding extends ViewDataBinding {
  @NonNull
  public final Button button4;

  @NonNull
  public final ImageView imageView111;

  @NonNull
  public final ImageView imageView112;

  @NonNull
  public final ImageView imageView70;

  @NonNull
  public final ImageView imageView79;

  @NonNull
  public final ImageView imageView80;

  @NonNull
  public final ImageView imageView81;

  @NonNull
  public final ImageView imageView82;

  @NonNull
  public final ImageView imageView83;

  @NonNull
  public final ImageView imageView84;

  @NonNull
  public final ImageView imageView85;

  @NonNull
  public final ImageView imageView86;

  @NonNull
  public final ImageView imageView96;

  @NonNull
  public final ImageView imageView97;

  @NonNull
  public final ImageView imageView98;

  protected FragmentOnboarding2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      Button button4, ImageView imageView111, ImageView imageView112, ImageView imageView70,
      ImageView imageView79, ImageView imageView80, ImageView imageView81, ImageView imageView82,
      ImageView imageView83, ImageView imageView84, ImageView imageView85, ImageView imageView86,
      ImageView imageView96, ImageView imageView97, ImageView imageView98) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button4 = button4;
    this.imageView111 = imageView111;
    this.imageView112 = imageView112;
    this.imageView70 = imageView70;
    this.imageView79 = imageView79;
    this.imageView80 = imageView80;
    this.imageView81 = imageView81;
    this.imageView82 = imageView82;
    this.imageView83 = imageView83;
    this.imageView84 = imageView84;
    this.imageView85 = imageView85;
    this.imageView86 = imageView86;
    this.imageView96 = imageView96;
    this.imageView97 = imageView97;
    this.imageView98 = imageView98;
  }

  @NonNull
  public static FragmentOnboarding2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboarding2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboarding2Binding>inflateInternal(inflater, R.layout.fragment_onboarding_2, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentOnboarding2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentOnboarding2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentOnboarding2Binding>inflateInternal(inflater, R.layout.fragment_onboarding_2, null, false, component);
  }

  public static FragmentOnboarding2Binding bind(@NonNull View view) {
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
  public static FragmentOnboarding2Binding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentOnboarding2Binding)bind(component, view, R.layout.fragment_onboarding_2);
  }
}