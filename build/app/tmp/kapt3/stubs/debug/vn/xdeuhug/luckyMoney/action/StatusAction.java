package vn.xdeuhug.luckyMoney.action;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/12/08
 * desc   : 状态布局意图
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017J&\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00052\b\b\u0003\u0010\u0012\u001a\u00020\u000fH\u0016\u00a8\u0006\u0013"}, d2 = {"Lvn/xdeuhug/luckyMoney/action/StatusAction;", "", "getStatusLayout", "Lvn/xdeuhug/luckyMoney/widget/StatusLayout;", "showComplete", "", "showError", "listener", "Lvn/xdeuhug/luckyMoney/widget/StatusLayout$OnRetryListener;", "showLayout", "drawable", "Landroid/graphics/drawable/Drawable;", "hint", "", "drawableId", "", "stringId", "showLoading", "id", "app_debug"})
public abstract interface StatusAction {
    
    @org.jetbrains.annotations.Nullable
    public abstract vn.xdeuhug.luckyMoney.widget.StatusLayout getStatusLayout();
    
    /**
     * 显示加载中
     */
    public abstract void showLoading(@androidx.annotation.RawRes
    int id);
    
    /**
     * 显示加载完成
     */
    public abstract void showComplete();
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public abstract void showError(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener);
    
    /**
     * 显示自定义提示
     */
    public abstract void showLayout(@androidx.annotation.DrawableRes
    int drawableId, @androidx.annotation.StringRes
    int stringId, @org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener);
    
    public abstract void showLayout(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.Nullable
    java.lang.CharSequence hint, @org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener);
    
    /**
     * author : Android 轮子哥
     * github : https://github.com/getActivity/AndroidProject-Kotlin
     * time   : 2019/12/08
     * desc   : 状态布局意图
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * 显示加载中
         */
        public static void showLoading(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.StatusAction $this, @androidx.annotation.RawRes
        int id) {
        }
        
        /**
         * 显示加载完成
         */
        public static void showComplete(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.StatusAction $this) {
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public static void showError(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.StatusAction $this, @org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
        }
        
        /**
         * 显示自定义提示
         */
        public static void showLayout(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.StatusAction $this, @androidx.annotation.DrawableRes
        int drawableId, @androidx.annotation.StringRes
        int stringId, @org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
        }
        
        public static void showLayout(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.StatusAction $this, @org.jetbrains.annotations.Nullable
        android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence hint, @org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
        }
    }
}