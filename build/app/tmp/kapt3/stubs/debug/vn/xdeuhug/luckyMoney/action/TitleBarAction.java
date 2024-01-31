package vn.xdeuhug.luckyMoney.action;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/12/08
 * desc   : 标题栏意图
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0018"}, d2 = {"Lvn/xdeuhug/luckyMoney/action/TitleBarAction;", "Lcom/hjq/bar/OnTitleBarListener;", "getLeftIcon", "Landroid/graphics/drawable/Drawable;", "getLeftTitle", "", "getRightIcon", "getRightTitle", "getTitleBar", "Lcom/hjq/bar/TitleBar;", "obtainTitleBar", "group", "Landroid/view/ViewGroup;", "setLeftIcon", "", "drawable", "id", "", "setLeftTitle", "text", "setRightIcon", "setRightTitle", "setTitle", "title", "app_debug"})
public abstract interface TitleBarAction extends com.hjq.bar.OnTitleBarListener {
    
    /**
     * 获取标题栏对象
     */
    @org.jetbrains.annotations.Nullable
    public abstract com.hjq.bar.TitleBar getTitleBar();
    
    /**
     * 设置标题栏的标题
     */
    public abstract void setTitle(@androidx.annotation.StringRes
    int id);
    
    /**
     * 设置标题栏的标题
     */
    public abstract void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence title);
    
    /**
     * 设置标题栏的左标题
     */
    public abstract void setLeftTitle(int id);
    
    public abstract void setLeftTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.CharSequence getLeftTitle();
    
    /**
     * 设置标题栏的右标题
     */
    public abstract void setRightTitle(int id);
    
    public abstract void setRightTitle(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.CharSequence getRightTitle();
    
    /**
     * 设置标题栏的左图标
     */
    public abstract void setLeftIcon(int id);
    
    public abstract void setLeftIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable);
    
    @org.jetbrains.annotations.Nullable
    public abstract android.graphics.drawable.Drawable getLeftIcon();
    
    /**
     * 设置标题栏的右图标
     */
    public abstract void setRightIcon(int id);
    
    public abstract void setRightIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable);
    
    @org.jetbrains.annotations.Nullable
    public abstract android.graphics.drawable.Drawable getRightIcon();
    
    /**
     * 递归获取 ViewGroup 中的 TitleBar 对象
     */
    @org.jetbrains.annotations.Nullable
    public abstract com.hjq.bar.TitleBar obtainTitleBar(@org.jetbrains.annotations.Nullable
    android.view.ViewGroup group);
    
    /**
     * author : Android 轮子哥
     * github : https://github.com/getActivity/AndroidProject-Kotlin
     * time   : 2019/12/08
     * desc   : 标题栏意图
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        /**
         * 设置标题栏的标题
         */
        public static void setTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @androidx.annotation.StringRes
        int id) {
        }
        
        /**
         * 设置标题栏的标题
         */
        public static void setTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence title) {
        }
        
        /**
         * 设置标题栏的左标题
         */
        public static void setLeftTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, int id) {
        }
        
        public static void setLeftTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.CharSequence getLeftTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this) {
            return null;
        }
        
        /**
         * 设置标题栏的右标题
         */
        public static void setRightTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, int id) {
        }
        
        public static void setRightTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
        }
        
        @org.jetbrains.annotations.Nullable
        public static java.lang.CharSequence getRightTitle(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this) {
            return null;
        }
        
        /**
         * 设置标题栏的左图标
         */
        public static void setLeftIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, int id) {
        }
        
        public static void setLeftIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        android.graphics.drawable.Drawable drawable) {
        }
        
        @org.jetbrains.annotations.Nullable
        public static android.graphics.drawable.Drawable getLeftIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this) {
            return null;
        }
        
        /**
         * 设置标题栏的右图标
         */
        public static void setRightIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, int id) {
        }
        
        public static void setRightIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        android.graphics.drawable.Drawable drawable) {
        }
        
        @org.jetbrains.annotations.Nullable
        public static android.graphics.drawable.Drawable getRightIcon(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this) {
            return null;
        }
        
        /**
         * 递归获取 ViewGroup 中的 TitleBar 对象
         */
        @org.jetbrains.annotations.Nullable
        public static com.hjq.bar.TitleBar obtainTitleBar(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.TitleBarAction $this, @org.jetbrains.annotations.Nullable
        android.view.ViewGroup group) {
            return null;
        }
    }
}