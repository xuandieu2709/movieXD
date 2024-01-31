package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/09/16
 * desc   : PopupWindow 技术基类
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\f9:;<=>?@ABCDB\r\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J%\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0016\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0012\u0010 \u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010!\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020\u00132\b\b\u0001\u0010&\u001a\u00020$H\u0016J\u0012\u0010\'\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010(\u001a\u00020\u00132\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0002J\u001a\u0010*\u001a\u00020\u00132\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\fH\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u001bH\u0016J*\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010\u00192\u0006\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001bH\u0016J*\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u00010\u00192\u0006\u00104\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "Landroid/widget/PopupWindow;", "Lvn/xdeuhug/base/action/ActivityAction;", "Lvn/xdeuhug/base/action/HandlerAction;", "Lvn/xdeuhug/base/action/ClickAction;", "Lvn/xdeuhug/base/action/AnimAction;", "Lvn/xdeuhug/base/action/KeyboardAction;", "Landroid/widget/PopupWindow$OnDismissListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dismissListeners", "", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "popupBackground", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$PopupBackground;", "showListeners", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "addOnDismissListener", "", "listener", "addOnShowListener", "dismiss", "findViewById", "V", "Landroid/view/View;", "id", "", "(I)Landroid/view/View;", "getContext", "getWindowLayoutType", "onDismiss", "removeOnDismissListener", "removeOnShowListener", "setActivityAlpha", "alpha", "", "setBackgroundDimAmount", "dimAmount", "setOnDismissListener", "setOnDismissListeners", "listeners", "setOnShowListeners", "setOverlapAnchor", "overlapAnchor", "", "setWindowLayoutType", "type", "showAsDropDown", "anchor", "xOff", "yOff", "gravity", "showAtLocation", "parent", "x", "y", "Builder", "DismissListenerWrapper", "OnClickListener", "OnCreateListener", "OnDismissListener", "OnShowListener", "PopupBackground", "PopupWindowLifecycle", "ShowPostAtTimeWrapper", "ShowPostDelayedWrapper", "ShowPostWrapper", "ViewClickWrapper", "app_debug"})
public class BasePopupWindow extends android.widget.PopupWindow implements vn.xdeuhug.base.action.ActivityAction, vn.xdeuhug.base.action.HandlerAction, vn.xdeuhug.base.action.ClickAction, vn.xdeuhug.base.action.AnimAction, vn.xdeuhug.base.action.KeyboardAction, android.widget.PopupWindow.OnDismissListener {
    private final android.content.Context context = null;
    private vn.xdeuhug.luckyMoney.other.BasePopupWindow.PopupBackground popupBackground;
    private java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener> showListeners;
    private java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener> dismissListeners;
    
    public BasePopupWindow(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.Context getContext() {
        return null;
    }
    
    /**
     * 设置一个销毁监听器
     *
     * @param listener       销毁监听器对象
     */
    @java.lang.Override
    @java.lang.Deprecated
    public void setOnDismissListener(@org.jetbrains.annotations.Nullable
    android.widget.PopupWindow.OnDismissListener listener) {
    }
    
    /**
     * 添加一个显示监听器
     *
     * @param listener      监听器对象
     */
    public void addOnShowListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener listener) {
    }
    
    /**
     * 添加一个销毁监听器
     *
     * @param listener      监听器对象
     */
    public void addOnDismissListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener listener) {
    }
    
    /**
     * 移除一个显示监听器
     *
     * @param listener      监听器对象
     */
    public void removeOnShowListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener listener) {
    }
    
    /**
     * 移除一个销毁监听器
     *
     * @param listener      监听器对象
     */
    public void removeOnDismissListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener listener) {
    }
    
    /**
     * 设置显示监听器集合
     */
    private final void setOnShowListeners(java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener> listeners) {
    }
    
    /**
     * 设置销毁监听器集合
     */
    private final void setOnDismissListeners(java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener> listeners) {
    }
    
    /**
     * [PopupWindow.OnDismissListener]
     */
    @java.lang.Override
    public void onDismiss() {
    }
    
    @java.lang.Override
    public void showAsDropDown(@org.jetbrains.annotations.Nullable
    android.view.View anchor, int xOff, int yOff, int gravity) {
    }
    
    @java.lang.Override
    public void showAtLocation(@org.jetbrains.annotations.Nullable
    android.view.View parent, int gravity, int x, int y) {
    }
    
    @java.lang.Override
    public void dismiss() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public <V extends android.view.View>V findViewById(@androidx.annotation.IdRes
    int id) {
        return null;
    }
    
    @java.lang.Override
    public void setWindowLayoutType(int type) {
    }
    
    @java.lang.Override
    public int getWindowLayoutType() {
        return 0;
    }
    
    @java.lang.Override
    public void setOverlapAnchor(boolean overlapAnchor) {
    }
    
    /**
     * 设置背景遮盖层的透明度
     */
    public void setBackgroundDimAmount(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float dimAmount) {
    }
    
    /**
     * 设置 Activity 窗口透明度
     */
    private final void setActivityAlpha(float alpha) {
    }
    
    @org.jetbrains.annotations.Nullable
    public android.app.Activity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public android.os.Handler getHandler() {
        return null;
    }
    
    public void hideKeyboard(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public boolean post(@org.jetbrains.annotations.NotNull
    java.lang.Runnable runnable) {
        return false;
    }
    
    public boolean postAtTime(@org.jetbrains.annotations.NotNull
    java.lang.Runnable runnable, long uptimeMillis) {
        return false;
    }
    
    public boolean postDelayed(@org.jetbrains.annotations.NotNull
    java.lang.Runnable runnable, long delayMillis) {
        return false;
    }
    
    public void removeCallbacks() {
    }
    
    public void removeCallbacks(@org.jetbrains.annotations.NotNull
    java.lang.Runnable runnable) {
    }
    
    public void setOnClickListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener listener, @org.jetbrains.annotations.NotNull
    @androidx.annotation.IdRes
    int... ids) {
    }
    
    public void setOnClickListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnClickListener listener, @org.jetbrains.annotations.NotNull
    android.view.View... views) {
    }
    
    public void setOnClickListener(@org.jetbrains.annotations.NotNull
    @androidx.annotation.IdRes
    int... ids) {
    }
    
    public void setOnClickListener(@org.jetbrains.annotations.NotNull
    android.view.View... views) {
    }
    
    public void showKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public void showKeyboard(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    public void startActivity(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    public void startActivity(@org.jetbrains.annotations.NotNull
    java.lang.Class<? extends android.app.Activity> clazz) {
    }
    
    public void toggleSoftInput(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\r\n\u0002\b\u0018\b\u0016\u0018\u0000 p*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001pB\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u0016H\u0016\u00a2\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010+\u001a\u00020#H\u0016\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u00020!H\u0016J\u0010\u00100\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u00101\u001a\u000202H\u0016J%\u00103\u001a\u0004\u0018\u0001H4\"\n\b\u0001\u00104*\u0004\u0018\u00010\u00102\b\b\u0001\u00105\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u00106J\n\u00107\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u00108\u001a\u00020\u0007H\u0016J\n\u00109\u001a\u0004\u0018\u00010!H\u0016J\b\u0010:\u001a\u00020\u001cH\u0016J\b\u0010;\u001a\u00020\u001cH\u0016J\u0010\u0010<\u001a\u0002022\u0006\u0010=\u001a\u00020>H\u0016J\u0018\u0010?\u001a\u0002022\u0006\u0010=\u001a\u00020>2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u0002022\u0006\u0010=\u001a\u00020>2\u0006\u0010C\u001a\u00020AH\u0016J\u0017\u0010D\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ!\u0010F\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016\u00a2\u0006\u0002\u0010IJ!\u0010F\u001a\u00028\u00002\b\b\u0001\u0010J\u001a\u00020\n2\b\b\u0001\u0010K\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ\u0017\u0010M\u001a\u00028\u00002\b\b\u0001\u0010N\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u0010OJ\u0017\u0010P\u001a\u00028\u00002\b\u0010Q\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0002\u0010RJ\u0017\u0010P\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0015\u0010S\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010TJ\u0015\u0010U\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0015\u0010V\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ!\u0010W\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016\u00a2\u0006\u0002\u0010ZJ!\u0010W\u001a\u00028\u00002\b\b\u0001\u0010J\u001a\u00020\n2\b\b\u0001\u0010[\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ!\u0010\\\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016\u00a2\u0006\u0002\u0010IJ!\u0010\\\u001a\u00028\u00002\b\b\u0001\u0010J\u001a\u00020\n2\b\b\u0001\u0010K\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ\'\u0010]\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000fH\u0016\u00a2\u0006\u0002\u0010^J\u0015\u0010_\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u0013H\u0016\u00a2\u0006\u0002\u0010`J\u0015\u0010a\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010TJ!\u0010b\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016\u00a2\u0006\u0002\u0010ZJ!\u0010b\u001a\u00028\u00002\b\b\u0001\u0010J\u001a\u00020\n2\b\b\u0001\u0010[\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ!\u0010c\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\b\b\u0001\u0010d\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ\u0015\u0010e\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010TJ\u001f\u0010f\u001a\u00028\u00002\b\b\u0001\u00105\u001a\u00020\n2\u0006\u0010g\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010LJ\u0015\u0010h\u001a\u00028\u00002\u0006\u0010\'\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0015\u0010i\u001a\u00028\u00002\u0006\u0010j\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0015\u0010k\u001a\u00028\u00002\u0006\u0010j\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010EJ\u0012\u0010l\u001a\u0002022\b\u0010m\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010n\u001a\u0002022\b\u0010o\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b$\u0010\u0018R\u000e\u0010&\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006q"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "B", "Lvn/xdeuhug/base/action/ActivityAction;", "Lvn/xdeuhug/base/action/ResourcesAction;", "Lvn/xdeuhug/base/action/ClickAction;", "Lvn/xdeuhug/base/action/KeyboardAction;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animStyle", "", "backgroundDimAmount", "", "clickArray", "Landroid/util/SparseArray;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnClickListener;", "Landroid/view/View;", "contentView", "createListener", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnCreateListener;", "dismissListeners", "", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "getDismissListeners", "()Ljava/util/List;", "dismissListeners$delegate", "Lkotlin/Lazy;", "focusable", "", "gravity", "height", "outsideTouchable", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "showListeners", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "getShowListeners", "showListeners$delegate", "touchable", "width", "xOffset", "yOffset", "addOnDismissListener", "listener", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "addOnShowListener", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "create", "createPopupWindow", "dismiss", "", "findViewById", "V", "id", "(I)Landroid/view/View;", "getContentView", "getContext", "getPopupWindow", "isCreated", "isShowing", "post", "runnable", "Ljava/lang/Runnable;", "postAtTime", "uptimeMillis", "", "postDelayed", "delayMillis", "setAnimStyle", "(I)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setBackground", "drawable", "Landroid/graphics/drawable/Drawable;", "(ILandroid/graphics/drawable/Drawable;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "viewId", "drawableId", "(II)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setBackgroundDimAmount", "dimAmount", "(F)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setContentView", "view", "(Landroid/view/View;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setFocusable", "(Z)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setGravity", "setHeight", "setHint", "text", "", "(ILjava/lang/CharSequence;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "stringId", "setImageDrawable", "setOnClickListener", "(ILvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnClickListener;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setOnCreateListener", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnCreateListener;)Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "setOutsideTouchable", "setText", "setTextColor", "color", "setTouchable", "setVisibility", "visibility", "setWidth", "setXOffset", "offset", "setYOffset", "showAsDropDown", "anchor", "showAtLocation", "parent", "Companion", "app_debug"})
    public static class Builder<B extends vn.xdeuhug.luckyMoney.other.BasePopupWindow.Builder<B>> implements vn.xdeuhug.base.action.ActivityAction, vn.xdeuhug.base.action.ResourcesAction, vn.xdeuhug.base.action.ClickAction, vn.xdeuhug.base.action.KeyboardAction {
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        public static final vn.xdeuhug.luckyMoney.other.BasePopupWindow.Builder.Companion Companion = null;
        private static final int DEFAULT_ANCHORED_GRAVITY = 8388659;
        
        /**
         * PopupWindow 对象
         */
        private vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow;
        
        /**
         * PopupWindow 布局
         */
        private android.view.View contentView;
        
        /**
         * 动画样式
         */
        private int animStyle = -1;
        
        /**
         * 宽度和高度
         */
        private int width = -2;
        private int height = -2;
        
        /**
         * 重心位置
         */
        private int gravity = 8388659;
        
        /**
         * 水平偏移
         */
        private int xOffset = 0;
        
        /**
         * 垂直偏移
         */
        private int yOffset = 0;
        
        /**
         * 是否可触摸
         */
        private boolean touchable = true;
        
        /**
         * 是否有焦点
         */
        private boolean focusable = true;
        
        /**
         * 是否外层可触摸
         */
        private boolean outsideTouchable = false;
        
        /**
         * 背景遮盖层透明度
         */
        private float backgroundDimAmount = 0.0F;
        
        /**
         * PopupWindow 创建监听
         */
        private vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnCreateListener createListener;
        
        /**
         * PopupWindow 显示监听
         */
        private final kotlin.Lazy showListeners$delegate = null;
        
        /**
         * PopupWindow 销毁监听
         */
        private final kotlin.Lazy dismissListeners$delegate = null;
        
        /**
         * 点击事件集合
         */
        private android.util.SparseArray<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnClickListener<android.view.View>> clickArray;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        /**
         * PopupWindow 显示监听
         */
        private final java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener> getShowListeners() {
            return null;
        }
        
        /**
         * PopupWindow 销毁监听
         */
        private final java.util.List<vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener> getDismissListeners() {
            return null;
        }
        
        /**
         * 设置布局
         */
        @org.jetbrains.annotations.NotNull
        public B setContentView(@androidx.annotation.LayoutRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public B setContentView(@org.jetbrains.annotations.Nullable
        android.view.View view) {
            return null;
        }
        
        /**
         * 设置动画，已经封装好几种样式，具体可见[AnimAction]类
         */
        @org.jetbrains.annotations.NotNull
        public B setAnimStyle(@androidx.annotation.StyleRes
        int id) {
            return null;
        }
        
        /**
         * 设置宽度
         */
        @org.jetbrains.annotations.NotNull
        public B setWidth(int width) {
            return null;
        }
        
        /**
         * 设置高度
         */
        @org.jetbrains.annotations.NotNull
        public B setHeight(int height) {
            return null;
        }
        
        /**
         * 设置重心位置
         */
        @org.jetbrains.annotations.NotNull
        public B setGravity(int gravity) {
            return null;
        }
        
        /**
         * 设置水平偏移量
         */
        @org.jetbrains.annotations.NotNull
        public B setXOffset(int offset) {
            return null;
        }
        
        /**
         * 设置垂直偏移量
         */
        @org.jetbrains.annotations.NotNull
        public B setYOffset(int offset) {
            return null;
        }
        
        /**
         * 是否可触摸
         */
        @org.jetbrains.annotations.NotNull
        public B setTouchable(boolean touchable) {
            return null;
        }
        
        /**
         * 是否有焦点
         */
        @org.jetbrains.annotations.NotNull
        public B setFocusable(boolean focusable) {
            return null;
        }
        
        /**
         * 是否外层可触摸
         */
        @org.jetbrains.annotations.NotNull
        public B setOutsideTouchable(boolean outsideTouchable) {
            return null;
        }
        
        /**
         * 设置背景遮盖层的透明度
         */
        @org.jetbrains.annotations.NotNull
        public B setBackgroundDimAmount(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
        float dimAmount) {
            return null;
        }
        
        /**
         * 设置创建监听
         */
        @org.jetbrains.annotations.NotNull
        public B setOnCreateListener(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnCreateListener listener) {
            return null;
        }
        
        /**
         * 添加显示监听
         */
        @org.jetbrains.annotations.NotNull
        public B addOnShowListener(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener listener) {
            return null;
        }
        
        /**
         * 添加销毁监听
         */
        @org.jetbrains.annotations.NotNull
        public B addOnDismissListener(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener listener) {
            return null;
        }
        
        /**
         * 设置文本
         */
        @org.jetbrains.annotations.NotNull
        public B setText(@androidx.annotation.IdRes
        int viewId, @androidx.annotation.StringRes
        int stringId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public B setText(@androidx.annotation.IdRes
        int id, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        /**
         * 设置文本颜色
         */
        @org.jetbrains.annotations.NotNull
        public B setTextColor(@androidx.annotation.IdRes
        int id, @androidx.annotation.ColorInt
        int color) {
            return null;
        }
        
        /**
         * 设置提示
         */
        @org.jetbrains.annotations.NotNull
        public B setHint(@androidx.annotation.IdRes
        int viewId, @androidx.annotation.StringRes
        int stringId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public B setHint(@androidx.annotation.IdRes
        int id, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        /**
         * 设置可见状态
         */
        @org.jetbrains.annotations.NotNull
        public B setVisibility(@androidx.annotation.IdRes
        int id, int visibility) {
            return null;
        }
        
        /**
         * 设置背景
         */
        @org.jetbrains.annotations.NotNull
        public B setBackground(@androidx.annotation.IdRes
        int viewId, @androidx.annotation.DrawableRes
        int drawableId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public B setBackground(@androidx.annotation.IdRes
        int id, @org.jetbrains.annotations.Nullable
        android.graphics.drawable.Drawable drawable) {
            return null;
        }
        
        /**
         * 设置图片
         */
        @org.jetbrains.annotations.NotNull
        public B setImageDrawable(@androidx.annotation.IdRes
        int viewId, @androidx.annotation.DrawableRes
        int drawableId) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public B setImageDrawable(@androidx.annotation.IdRes
        int id, @org.jetbrains.annotations.Nullable
        android.graphics.drawable.Drawable drawable) {
            return null;
        }
        
        /**
         * 设置点击事件
         */
        @org.jetbrains.annotations.NotNull
        public B setOnClickListener(@androidx.annotation.IdRes
        int id, @org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnClickListener<? extends android.view.View> listener) {
            return null;
        }
        
        /**
         * 创建
         */
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"RtlHardcoded"})
        public vn.xdeuhug.luckyMoney.other.BasePopupWindow create() {
            return null;
        }
        
        /**
         * 显示为下拉
         */
        public void showAsDropDown(@org.jetbrains.annotations.Nullable
        android.view.View anchor) {
        }
        
        /**
         * 显示在指定位置
         */
        public void showAtLocation(@org.jetbrains.annotations.Nullable
        android.view.View parent) {
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public android.content.Context getContext() {
            return null;
        }
        
        /**
         * 当前 PopupWindow 是否创建了
         */
        public boolean isCreated() {
            return false;
        }
        
        /**
         * 当前 PopupWindow 是否显示了
         */
        public boolean isShowing() {
            return false;
        }
        
        /**
         * 销毁当前 PopupWindow
         */
        public void dismiss() {
        }
        
        /**
         * 创建 PopupWindow 对象（子类可以重写此方法来改变 PopupWindow 类型）
         */
        @org.jetbrains.annotations.NotNull
        protected vn.xdeuhug.luckyMoney.other.BasePopupWindow createPopupWindow(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        /**
         * 获取 PopupWindow 的根布局
         */
        @org.jetbrains.annotations.Nullable
        public android.view.View getContentView() {
            return null;
        }
        
        /**
         * 根据 id 查找 View
         */
        @org.jetbrains.annotations.Nullable
        @java.lang.Override
        public <V extends android.view.View>V findViewById(@androidx.annotation.IdRes
        int id) {
            return null;
        }
        
        /**
         * 获取当前 PopupWindow 对象
         */
        @org.jetbrains.annotations.Nullable
        public vn.xdeuhug.luckyMoney.other.BasePopupWindow getPopupWindow() {
            return null;
        }
        
        /**
         * 延迟执行
         */
        public void post(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable) {
        }
        
        /**
         * 延迟一段时间执行
         */
        public void postDelayed(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable, long delayMillis) {
        }
        
        /**
         * 在指定的时间执行
         */
        public void postAtTime(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable, long uptimeMillis) {
        }
        
        @org.jetbrains.annotations.Nullable
        public android.app.Activity getActivity() {
            return null;
        }
        
        @androidx.annotation.ColorInt
        public int getColor(@androidx.annotation.ColorRes
        int id) {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public android.content.res.Resources getResources() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public java.lang.String getString(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public java.lang.String getString(@androidx.annotation.StringRes
        int id, @org.jetbrains.annotations.NotNull
        java.lang.Object... formatArgs) {
            return null;
        }
        
        public <S extends java.lang.Object>S getSystemService(@org.jetbrains.annotations.NotNull
        java.lang.Class<S> serviceClass) {
            return null;
        }
        
        public void hideKeyboard(@org.jetbrains.annotations.Nullable
        android.view.View view) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
        
        public void setOnClickListener(@org.jetbrains.annotations.Nullable
        android.view.View.OnClickListener listener, @org.jetbrains.annotations.NotNull
        @androidx.annotation.IdRes
        int... ids) {
        }
        
        public void setOnClickListener(@org.jetbrains.annotations.Nullable
        android.view.View.OnClickListener listener, @org.jetbrains.annotations.NotNull
        android.view.View... views) {
        }
        
        public void setOnClickListener(@org.jetbrains.annotations.NotNull
        @androidx.annotation.IdRes
        int... ids) {
        }
        
        public void setOnClickListener(@org.jetbrains.annotations.NotNull
        android.view.View... views) {
        }
        
        public void showKeyboard(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        public void showKeyboard(@org.jetbrains.annotations.Nullable
        android.view.View view) {
        }
        
        public void startActivity(@org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
        }
        
        public void startActivity(@org.jetbrains.annotations.NotNull
        java.lang.Class<? extends android.app.Activity> clazz) {
        }
        
        public void toggleSoftInput(@org.jetbrains.annotations.Nullable
        android.view.View view) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder$Companion;", "", "()V", "DEFAULT_ANCHORED_GRAVITY", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
    
    /**
     * PopupWindow 生命周期绑定
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00182\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0018B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$PopupWindowLifecycle;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "activity", "Landroid/app/Activity;", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "(Landroid/app/Activity;Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onDismiss", "onShow", "registerActivityLifecycleCallbacks", "unregisterActivityLifecycleCallbacks", "Companion", "app_debug"})
    static final class PopupWindowLifecycle implements android.app.Application.ActivityLifecycleCallbacks, vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener, vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener {
        private android.app.Activity activity;
        private vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow;
        @org.jetbrains.annotations.NotNull
        public static final vn.xdeuhug.luckyMoney.other.BasePopupWindow.PopupWindowLifecycle.Companion Companion = null;
        
        public PopupWindowLifecycle(@org.jetbrains.annotations.Nullable
        android.app.Activity activity, @org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
            super();
        }
        
        @java.lang.Override
        public void onActivityCreated(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.Nullable
        android.os.Bundle savedInstanceState) {
        }
        
        @java.lang.Override
        public void onActivityStarted(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        @java.lang.Override
        public void onActivityResumed(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        @java.lang.Override
        public void onActivityPaused(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        @java.lang.Override
        public void onActivityStopped(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        @java.lang.Override
        public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.NotNull
        android.os.Bundle outState) {
        }
        
        @java.lang.Override
        public void onActivityDestroyed(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
        
        @java.lang.Override
        public void onDismiss(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
        
        /**
         * 注册 Activity 生命周期监听
         */
        private final void registerActivityLifecycleCallbacks() {
        }
        
        /**
         * 反注册 Activity 生命周期监听
         */
        private final void unregisterActivityLifecycleCallbacks() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$PopupWindowLifecycle$Companion;", "", "()V", "with", "", "activity", "Landroid/app/Activity;", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            public final void with(@org.jetbrains.annotations.NotNull
            android.app.Activity activity, @org.jetbrains.annotations.Nullable
            vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
            }
        }
    }
    
    /**
     * PopupWindow 背景遮盖层实现类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$PopupBackground;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "()V", "alpha", "", "onDismiss", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "onShow", "setAlpha", "app_debug"})
    static final class PopupBackground implements vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener, vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener {
        private float alpha = 0.0F;
        
        public PopupBackground() {
            super();
        }
        
        public final void setAlpha(float alpha) {
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
        
        @java.lang.Override
        public void onDismiss(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
    }
    
    /**
     * 销毁监听包装类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$DismissListenerWrapper;", "Ljava/lang/ref/SoftReference;", "Landroid/widget/PopupWindow$OnDismissListener;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "referent", "(Landroid/widget/PopupWindow$OnDismissListener;)V", "onDismiss", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    static final class DismissListenerWrapper extends java.lang.ref.SoftReference<android.widget.PopupWindow.OnDismissListener> implements vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnDismissListener {
        
        public DismissListenerWrapper(@org.jetbrains.annotations.Nullable
        android.widget.PopupWindow.OnDismissListener referent) {
            super(null);
        }
        
        @java.lang.Override
        public void onDismiss(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
    }
    
    /**
     * 点击事件包装类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$ViewClickWrapper;", "Landroid/view/View$OnClickListener;", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "listener", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnClickListener;", "Landroid/view/View;", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnClickListener;)V", "onClick", "", "view", "app_debug"})
    static final class ViewClickWrapper implements android.view.View.OnClickListener {
        private final vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow = null;
        private final vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnClickListener<android.view.View> listener = null;
        
        public ViewClickWrapper(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow, @org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnClickListener<android.view.View> listener) {
            super();
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
    }
    
    /**
     * post 任务包装类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$ShowPostWrapper;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "runnable", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)V", "getRunnable", "()Ljava/lang/Runnable;", "onShow", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    static final class ShowPostWrapper implements vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Runnable runnable = null;
        
        public ShowPostWrapper(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Runnable getRunnable() {
            return null;
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
    }
    
    /**
     * postDelayed 任务包装类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$ShowPostDelayedWrapper;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "runnable", "Ljava/lang/Runnable;", "delayMillis", "", "(Ljava/lang/Runnable;J)V", "onShow", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    static final class ShowPostDelayedWrapper implements vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener {
        private final java.lang.Runnable runnable = null;
        private final long delayMillis = 0L;
        
        public ShowPostDelayedWrapper(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable, long delayMillis) {
            super();
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
    }
    
    /**
     * postAtTime 任务包装类
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$ShowPostAtTimeWrapper;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "runnable", "Ljava/lang/Runnable;", "uptimeMillis", "", "(Ljava/lang/Runnable;J)V", "onShow", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    static final class ShowPostAtTimeWrapper implements vn.xdeuhug.luckyMoney.other.BasePopupWindow.OnShowListener {
        private final java.lang.Runnable runnable = null;
        private final long uptimeMillis = 0L;
        
        public ShowPostAtTimeWrapper(@org.jetbrains.annotations.NotNull
        java.lang.Runnable runnable, long uptimeMillis) {
            super();
        }
        
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow) {
        }
    }
    
    /**
     * 点击监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnClickListener;", "V", "Landroid/view/View;", "", "onClick", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "view", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;Landroid/view/View;)V", "app_debug"})
    public static abstract interface OnClickListener<V extends android.view.View> {
        
        /**
         * 点击事件触发了
         */
        public abstract void onClick(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow, @org.jetbrains.annotations.NotNull
        V view);
    }
    
    /**
     * 创建监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnCreateListener;", "", "onCreate", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    public static abstract interface OnCreateListener {
        
        /**
         * PopupWindow 创建了
         */
        public abstract void onCreate(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow);
    }
    
    /**
     * 显示监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnShowListener;", "", "onShow", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    public static abstract interface OnShowListener {
        
        /**
         * PopupWindow 显示了
         */
        public abstract void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow);
    }
    
    /**
     * 销毁监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$OnDismissListener;", "", "onDismiss", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "app_debug"})
    public static abstract interface OnDismissListener {
        
        /**
         * PopupWindow 销毁了
         */
        public abstract void onDismiss(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow);
    }
}