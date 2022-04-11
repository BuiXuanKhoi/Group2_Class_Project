// Generated by data binding compiler. Do not edit!
package com.example.week2_group2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.week2_group2.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final ImageView btnLogin;

  @NonNull
  public final EditText emailLogin2;

  @NonNull
  public final ImageView imageView63;

  @NonNull
  public final ImageView imageView72;

  @NonNull
  public final ImageView imageView74;

  @NonNull
  public final ImageView imageView75;

  @NonNull
  public final ImageView imageView76;

  @NonNull
  public final ImageView imageView77;

  @NonNull
  public final ImageView imageView78;

  @NonNull
  public final EditText passLogin2;

  @NonNull
  public final TextView textView16;

  @NonNull
  public final TextView textView17;

  protected FragmentLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView btnBack, ImageView btnLogin, EditText emailLogin2, ImageView imageView63,
      ImageView imageView72, ImageView imageView74, ImageView imageView75, ImageView imageView76,
      ImageView imageView77, ImageView imageView78, EditText passLogin2, TextView textView16,
      TextView textView17) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.btnLogin = btnLogin;
    this.emailLogin2 = emailLogin2;
    this.imageView63 = imageView63;
    this.imageView72 = imageView72;
    this.imageView74 = imageView74;
    this.imageView75 = imageView75;
    this.imageView76 = imageView76;
    this.imageView77 = imageView77;
    this.imageView78 = imageView78;
    this.passLogin2 = passLogin2;
    this.textView16 = textView16;
    this.textView17 = textView17;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLoginBinding>inflateInternal(inflater, R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
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
  public static FragmentLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLoginBinding)bind(component, view, R.layout.fragment_login);
  }
}