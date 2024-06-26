package vn.xdeuhug.movieXD;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vn.xdeuhug.movieXD.databinding.CrashActivityBindingImpl;
import vn.xdeuhug.movieXD.databinding.DialogConfirmBindingImpl;
import vn.xdeuhug.movieXD.databinding.DialogNotificationBindingImpl;
import vn.xdeuhug.movieXD.databinding.HomeActivityBindingImpl;
import vn.xdeuhug.movieXD.databinding.SplashActivityBindingImpl;
import vn.xdeuhug.movieXD.databinding.SuccessDialogBindingImpl;
import vn.xdeuhug.movieXD.databinding.WaitDialogBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CRASHACTIVITY = 1;

  private static final int LAYOUT_DIALOGCONFIRM = 2;

  private static final int LAYOUT_DIALOGNOTIFICATION = 3;

  private static final int LAYOUT_HOMEACTIVITY = 4;

  private static final int LAYOUT_SPLASHACTIVITY = 5;

  private static final int LAYOUT_SUCCESSDIALOG = 6;

  private static final int LAYOUT_WAITDIALOG = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.crash_activity, LAYOUT_CRASHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.dialog_confirm, LAYOUT_DIALOGCONFIRM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.dialog_notification, LAYOUT_DIALOGNOTIFICATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.home_activity, LAYOUT_HOMEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.splash_activity, LAYOUT_SPLASHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.success_dialog, LAYOUT_SUCCESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.xdeuhug.movieXD.R.layout.wait_dialog, LAYOUT_WAITDIALOG);
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
        case  LAYOUT_CRASHACTIVITY: {
          if ("layout/crash_activity_0".equals(tag)) {
            return new CrashActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for crash_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGCONFIRM: {
          if ("layout/dialog_confirm_0".equals(tag)) {
            return new DialogConfirmBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_confirm is invalid. Received: " + tag);
        }
        case  LAYOUT_DIALOGNOTIFICATION: {
          if ("layout/dialog_notification_0".equals(tag)) {
            return new DialogNotificationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_notification is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEACTIVITY: {
          if ("layout/home_activity_0".equals(tag)) {
            return new HomeActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SPLASHACTIVITY: {
          if ("layout/splash_activity_0".equals(tag)) {
            return new SplashActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for splash_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SUCCESSDIALOG: {
          if ("layout/success_dialog_0".equals(tag)) {
            return new SuccessDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for success_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_WAITDIALOG: {
          if ("layout/wait_dialog_0".equals(tag)) {
            return new WaitDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for wait_dialog is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/crash_activity_0", vn.xdeuhug.movieXD.R.layout.crash_activity);
      sKeys.put("layout/dialog_confirm_0", vn.xdeuhug.movieXD.R.layout.dialog_confirm);
      sKeys.put("layout/dialog_notification_0", vn.xdeuhug.movieXD.R.layout.dialog_notification);
      sKeys.put("layout/home_activity_0", vn.xdeuhug.movieXD.R.layout.home_activity);
      sKeys.put("layout/splash_activity_0", vn.xdeuhug.movieXD.R.layout.splash_activity);
      sKeys.put("layout/success_dialog_0", vn.xdeuhug.movieXD.R.layout.success_dialog);
      sKeys.put("layout/wait_dialog_0", vn.xdeuhug.movieXD.R.layout.wait_dialog);
    }
  }
}
