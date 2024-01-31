package vn.xdeuhug.luckyMoney.app;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001HB\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\fH\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001e\u001a\u00020\fH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0014J\b\u0010%\u001a\u00020\u001cH\u0014J\u0012\u0010&\u001a\u00020\u001c2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\u001c2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u0005H\u0016J\u0012\u0010/\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u00101\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u00102\u001a\u00020\u001c2\b\u00100\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u000205H\u0007J&\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u000eJ\u0016\u00106\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u000eJ\u0012\u0010;\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010;\u001a\u00020\u001c2\b\b\u0001\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\u001cH\u0016J\"\u0010@\u001a\u00020\u001c*\u00020\u00102\b\b\u0002\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0DJ\n\u0010E\u001a\u00020\u001c*\u00020\u0010J\n\u0010F\u001a\u00020\u001c*\u00020\u0010J\n\u0010G\u001a\u00020\u001c*\u00020\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006I"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/AppActivity;", "Lvn/xdeuhug/base/BaseActivity;", "Lvn/xdeuhug/base/action/ToastAction;", "Lvn/xdeuhug/luckyMoney/action/TitleBarAction;", "Lcom/hjq/http/listener/OnHttpListener;", "", "()V", "dialog", "Lvn/xdeuhug/base/BaseDialog;", "dialogCount", "", "immersionBar", "Lcom/gyf/immersionbar/ImmersionBar;", "mOnTouchOutsideViewListener", "Lvn/xdeuhug/luckyMoney/app/AppActivity$OnTouchOutsideViewListener;", "mTouchOutsideView", "Landroid/view/View;", "mTouchOutsideView1", "mTouchOutsideView2", "mTouchOutsideView3", "titleBar", "Lcom/hjq/bar/TitleBar;", "createStatusBarConfig", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "finish", "", "getOnTouchOutsideViewListener", "getStatusBarConfig", "getTitleBar", "hideDialog", "initLayout", "isShowDialog", "isStatusBarDarkFont", "isStatusBarEnabled", "onDestroy", "onHttpEnd", "call", "Lokhttp3/Call;", "onHttpFail", "e", "Ljava/lang/Exception;", "onHttpStart", "onHttpSuccess", "result", "onLeftClick", "view", "onRightClick", "onTitleClick", "returnLogin", "event", "Lvn/xdeuhug/luckyMoney/model/eventbus/EventBusTokenExpired;", "setOnTouchOutsideViewListener", "view1", "view2", "view3", "onTouchOutsideViewListener", "setTitle", "title", "", "id", "showDialog", "clickWithDebounce", "debounceTime", "", "action", "Lkotlin/Function0;", "hide", "invisible", "show", "OnTouchOutsideViewListener", "app_debug"})
public abstract class AppActivity extends vn.xdeuhug.base.BaseActivity implements vn.xdeuhug.base.action.ToastAction, vn.xdeuhug.luckyMoney.action.TitleBarAction, com.hjq.http.listener.OnHttpListener<java.lang.Object> {
    
    /**
     * 标题栏对象
     */
    private com.hjq.bar.TitleBar titleBar;
    
    /**
     * 状态栏沉浸
     */
    private com.gyf.immersionbar.ImmersionBar immersionBar;
    
    /**
     * 加载对话框
     */
    private vn.xdeuhug.base.BaseDialog dialog;
    
    /**
     * 对话框数量
     */
    private int dialogCount = 0;
    private android.view.View mTouchOutsideView;
    private vn.xdeuhug.luckyMoney.app.AppActivity.OnTouchOutsideViewListener mOnTouchOutsideViewListener;
    private android.view.View mTouchOutsideView1;
    private android.view.View mTouchOutsideView2;
    private android.view.View mTouchOutsideView3;
    
    public AppActivity() {
        super();
    }
    
    /**
     * 当前加载对话框是否在显示中
     */
    public boolean isShowDialog() {
        return false;
    }
    
    /**
     * 显示加载对话框
     */
    public void showDialog() {
    }
    
    /**
     * 隐藏加载对话框
     */
    public void hideDialog() {
    }
    
    @java.lang.Override
    protected void initLayout() {
    }
    
    /**
     * 是否使用沉浸式状态栏
     */
    protected boolean isStatusBarEnabled() {
        return false;
    }
    
    /**
     * 状态栏字体深色模式
     */
    public boolean isStatusBarDarkFont() {
        return false;
    }
    
    /**
     * 获取状态栏沉浸的配置对象
     */
    @org.jetbrains.annotations.NotNull
    public com.gyf.immersionbar.ImmersionBar getStatusBarConfig() {
        return null;
    }
    
    /**
     * 初始化沉浸式状态栏
     */
    @org.jetbrains.annotations.NotNull
    protected com.gyf.immersionbar.ImmersionBar createStatusBarConfig() {
        return null;
    }
    
    /**
     * 设置标题栏的标题
     */
    @java.lang.Override
    public void setTitle(@androidx.annotation.StringRes
    int id) {
    }
    
    /**
     * 设置标题栏的标题
     */
    @java.lang.Override
    public void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence title) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.hjq.bar.TitleBar getTitleBar() {
        return null;
    }
    
    @java.lang.Override
    public void finish() {
    }
    
    /**
     * [OnHttpListener]
     */
    @java.lang.Override
    public void onHttpStart(@org.jetbrains.annotations.Nullable
    okhttp3.Call call) {
    }
    
    @java.lang.Override
    public void onHttpSuccess(@org.jetbrains.annotations.NotNull
    java.lang.Object result) {
    }
    
    @java.lang.Override
    public void onHttpFail(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
    }
    
    @java.lang.Override
    public void onHttpEnd(@org.jetbrains.annotations.Nullable
    okhttp3.Call call) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    public void onLeftClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onTitleClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onRightClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    public final void clickWithDebounce(@org.jetbrains.annotations.NotNull
    android.view.View $this$clickWithDebounce, long debounceTime, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void returnLogin(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.model.eventbus.EventBusTokenExpired event) {
    }
    
    public final void show(@org.jetbrains.annotations.NotNull
    android.view.View $this$show) {
    }
    
    public final void hide(@org.jetbrains.annotations.NotNull
    android.view.View $this$hide) {
    }
    
    public final void invisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$invisible) {
    }
    
    /**
     * Sets a listener that is being notified when the user has tapped outside a given view. To remove the listener,
     * call [removeOnTouchOutsideViewListener].
     *
     * This is useful in scenarios where a view is in edit mode and when the user taps outside the edit mode shall be
     * stopped.
     *
     * @param view
     * @param onTouchOutsideViewListener
     */
    public final void setOnTouchOutsideViewListener(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.app.AppActivity.OnTouchOutsideViewListener onTouchOutsideViewListener) {
    }
    
    public final void setOnTouchOutsideViewListener(@org.jetbrains.annotations.NotNull
    android.view.View view1, @org.jetbrains.annotations.NotNull
    android.view.View view2, @org.jetbrains.annotations.NotNull
    android.view.View view3, @org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.app.AppActivity.OnTouchOutsideViewListener onTouchOutsideViewListener) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final vn.xdeuhug.luckyMoney.app.AppActivity.OnTouchOutsideViewListener getOnTouchOutsideViewListener() {
        return null;
    }
    
    @java.lang.Override
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent ev) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public android.graphics.drawable.Drawable getLeftIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.CharSequence getLeftTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public android.graphics.drawable.Drawable getRightIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.CharSequence getRightTitle() {
        return null;
    }
    
    /**
     * 递归获取 ViewGroup 中的 TitleBar 对象
     */
    @org.jetbrains.annotations.Nullable
    public com.hjq.bar.TitleBar obtainTitleBar(@org.jetbrains.annotations.Nullable
    android.view.ViewGroup group) {
        return null;
    }
    
    /**
     * 设置标题栏的左图标
     */
    public void setLeftIcon(int id) {
    }
    
    public void setLeftIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * 设置标题栏的左标题
     */
    public void setLeftTitle(int id) {
    }
    
    public void setLeftTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
    }
    
    /**
     * 设置标题栏的右图标
     */
    public void setRightIcon(int id) {
    }
    
    public void setRightIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * 设置标题栏的右标题
     */
    public void setRightTitle(int id) {
    }
    
    public void setRightTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
    }
    
    /**
     * Interface definition for a callback to be invoked when a touch event has occurred outside a formerly specified
     * view. See [setOnTouchOutsideViewListener].
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/AppActivity$OnTouchOutsideViewListener;", "", "onTouchOutside", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "app_debug"})
    public static abstract interface OnTouchOutsideViewListener {
        
        /**
         * Called when a touch event has occurred outside a given view.
         *
         * @param view  The view that has not been touched.
         * @param event The MotionEvent object containing full information about the event.
         */
        public abstract void onTouchOutside(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.NotNull
        android.view.MotionEvent event);
    }
}