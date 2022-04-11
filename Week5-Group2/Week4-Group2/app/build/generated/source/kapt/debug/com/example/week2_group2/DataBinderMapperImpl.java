package com.example.week2_group2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.week2_group2.databinding.ActivityMenuBindingImpl;
import com.example.week2_group2.databinding.ActivityProfileBindingImpl;
import com.example.week2_group2.databinding.ActivityResBindingImpl;
import com.example.week2_group2.databinding.FragmentChoiceBindingImpl;
import com.example.week2_group2.databinding.FragmentHomeScreenBindingImpl;
import com.example.week2_group2.databinding.FragmentLoginBindingImpl;
import com.example.week2_group2.databinding.FragmentOnboarding1BindingImpl;
import com.example.week2_group2.databinding.FragmentOnboarding2BindingImpl;
import com.example.week2_group2.databinding.FragmentOnboarding3BindingImpl;
import com.example.week2_group2.databinding.FragmentProfileScreenBindingImpl;
import com.example.week2_group2.databinding.FragmentSignupBindingImpl;
import com.example.week2_group2.databinding.FragmentSplashBindingImpl;
import com.example.week2_group2.databinding.FragmentWelcomeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMENU = 1;

  private static final int LAYOUT_ACTIVITYPROFILE = 2;

  private static final int LAYOUT_ACTIVITYRES = 3;

  private static final int LAYOUT_FRAGMENTCHOICE = 4;

  private static final int LAYOUT_FRAGMENTHOMESCREEN = 5;

  private static final int LAYOUT_FRAGMENTLOGIN = 6;

  private static final int LAYOUT_FRAGMENTONBOARDING1 = 7;

  private static final int LAYOUT_FRAGMENTONBOARDING2 = 8;

  private static final int LAYOUT_FRAGMENTONBOARDING3 = 9;

  private static final int LAYOUT_FRAGMENTPROFILESCREEN = 10;

  private static final int LAYOUT_FRAGMENTSIGNUP = 11;

  private static final int LAYOUT_FRAGMENTSPLASH = 12;

  private static final int LAYOUT_FRAGMENTWELCOME = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.activity_menu, LAYOUT_ACTIVITYMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.activity_profile, LAYOUT_ACTIVITYPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.activity_res, LAYOUT_ACTIVITYRES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_choice, LAYOUT_FRAGMENTCHOICE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_home__screen, LAYOUT_FRAGMENTHOMESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_onboarding_1, LAYOUT_FRAGMENTONBOARDING1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_onboarding_2, LAYOUT_FRAGMENTONBOARDING2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_onboarding_3, LAYOUT_FRAGMENTONBOARDING3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_profile__screen, LAYOUT_FRAGMENTPROFILESCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_signup, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_splash, LAYOUT_FRAGMENTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.week2_group2.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMENU: {
          if ("layout/activity_menu_0".equals(tag)) {
            return new ActivityMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPROFILE: {
          if ("layout/activity_profile_0".equals(tag)) {
            return new ActivityProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRES: {
          if ("layout/activity_res_0".equals(tag)) {
            return new ActivityResBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_res is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHOICE: {
          if ("layout/fragment_choice_0".equals(tag)) {
            return new FragmentChoiceBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_choice is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOMESCREEN: {
          if ("layout/fragment_home__screen_0".equals(tag)) {
            return new FragmentHomeScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home__screen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING1: {
          if ("layout/fragment_onboarding_1_0".equals(tag)) {
            return new FragmentOnboarding1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING2: {
          if ("layout/fragment_onboarding_2_0".equals(tag)) {
            return new FragmentOnboarding2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTONBOARDING3: {
          if ("layout/fragment_onboarding_3_0".equals(tag)) {
            return new FragmentOnboarding3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_onboarding_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILESCREEN: {
          if ("layout/fragment_profile__screen_0".equals(tag)) {
            return new FragmentProfileScreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile__screen is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_signup_0".equals(tag)) {
            return new FragmentSignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSPLASH: {
          if ("layout/fragment_splash_0".equals(tag)) {
            return new FragmentSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_menu_0", com.example.week2_group2.R.layout.activity_menu);
      sKeys.put("layout/activity_profile_0", com.example.week2_group2.R.layout.activity_profile);
      sKeys.put("layout/activity_res_0", com.example.week2_group2.R.layout.activity_res);
      sKeys.put("layout/fragment_choice_0", com.example.week2_group2.R.layout.fragment_choice);
      sKeys.put("layout/fragment_home__screen_0", com.example.week2_group2.R.layout.fragment_home__screen);
      sKeys.put("layout/fragment_login_0", com.example.week2_group2.R.layout.fragment_login);
      sKeys.put("layout/fragment_onboarding_1_0", com.example.week2_group2.R.layout.fragment_onboarding_1);
      sKeys.put("layout/fragment_onboarding_2_0", com.example.week2_group2.R.layout.fragment_onboarding_2);
      sKeys.put("layout/fragment_onboarding_3_0", com.example.week2_group2.R.layout.fragment_onboarding_3);
      sKeys.put("layout/fragment_profile__screen_0", com.example.week2_group2.R.layout.fragment_profile__screen);
      sKeys.put("layout/fragment_signup_0", com.example.week2_group2.R.layout.fragment_signup);
      sKeys.put("layout/fragment_splash_0", com.example.week2_group2.R.layout.fragment_splash);
      sKeys.put("layout/fragment_welcome_0", com.example.week2_group2.R.layout.fragment_welcome);
    }
  }
}
