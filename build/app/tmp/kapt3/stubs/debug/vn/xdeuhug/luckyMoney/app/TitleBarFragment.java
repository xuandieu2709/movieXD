package vn.xdeuhug.luckyMoney.app;

import java.lang.System;

/**
 * @Author: Phạm Văn Nhân
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/TitleBarFragment;", "A", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "Lvn/xdeuhug/luckyMoney/app/AppFragment;", "Lvn/xdeuhug/luckyMoney/action/TitleBarAction;", "()V", "immersionBar", "Lcom/gyf/immersionbar/ImmersionBar;", "titleBar", "Lcom/hjq/bar/TitleBar;", "createStatusBarConfig", "getStatusBarConfig", "getTitleBar", "isStatusBarDarkFont", "", "isStatusBarEnabled", "onResume", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class TitleBarFragment<A extends vn.xdeuhug.luckyMoney.app.AppActivity> extends vn.xdeuhug.luckyMoney.app.AppFragment<A> implements vn.xdeuhug.luckyMoney.action.TitleBarAction {
    
    /**
     * Thanh tiêu đề
     */
    private com.hjq.bar.TitleBar titleBar;
    
    /**
     * Thanh trạng thái
     */
    private com.gyf.immersionbar.ImmersionBar immersionBar;
    
    public TitleBarFragment() {
        super();
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    /**
     * Có sử dụng nhập vai trong Fragment không
     */
    public boolean isStatusBarEnabled() {
        return false;
    }
    
    /**
     * Nhận đối tượng cấu hình để ngâm thanh trạng thái
     */
    private final com.gyf.immersionbar.ImmersionBar getStatusBarConfig() {
        return null;
    }
    
    /**
     * Khởi tạo đắm chìm
     */
    private final com.gyf.immersionbar.ImmersionBar createStatusBarConfig() {
        return null;
    }
    
    /**
     * Nhận màu phông chữ trên thanh trạng thái
     */
    protected boolean isStatusBarDarkFont() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.hjq.bar.TitleBar getTitleBar() {
        return null;
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
     * 设置标题栏的标题
     */
    public void setTitle(@androidx.annotation.StringRes
    int id) {
    }
    
    /**
     * 设置标题栏的标题
     */
    public void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence title) {
    }
}