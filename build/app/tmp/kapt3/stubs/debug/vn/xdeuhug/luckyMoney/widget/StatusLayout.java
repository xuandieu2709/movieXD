package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001c\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u00162\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\u001f\u001a\u00020\u00162\b\b\u0001\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\"\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010#\u001a\u00020\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/StatusLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "clickWrapper", "Landroid/view/View$OnClickListener;", "listener", "Lvn/xdeuhug/luckyMoney/widget/StatusLayout$OnRetryListener;", "lottieView", "Lcom/airbnb/lottie/LottieAnimationView;", "mainLayout", "Landroid/view/ViewGroup;", "retryView", "Landroid/widget/TextView;", "textView", "hide", "", "initLayout", "isShow", "", "setAnimResource", "id", "setHint", "text", "", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "setOnRetryListener", "show", "OnRetryListener", "app_debug"})
public final class StatusLayout extends android.widget.FrameLayout {
    
    /**
     * 主布局
     */
    private android.view.ViewGroup mainLayout;
    
    /**
     * 提示图标
     */
    private com.airbnb.lottie.LottieAnimationView lottieView;
    
    /**
     * 提示文本
     */
    private android.widget.TextView textView;
    
    /**
     * 重试按钮
     */
    private android.widget.TextView retryView;
    
    /**
     * 重试监听
     */
    private vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener;
    
    /**
     * 点击事件包装类
     */
    private final android.view.View.OnClickListener clickWrapper = null;
    
    @kotlin.jvm.JvmOverloads
    public StatusLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public StatusLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public StatusLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public StatusLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    /**
     * 显示
     */
    public final void show() {
    }
    
    /**
     * 隐藏
     */
    public final void hide() {
    }
    
    /**
     * 是否显示了
     */
    public final boolean isShow() {
        return false;
    }
    
    /**
     * 设置提示图标，请在show方法之后调用
     */
    public final void setIcon(@androidx.annotation.DrawableRes
    int id) {
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
    }
    
    /**
     * 设置提示动画
     */
    public final void setAnimResource(@androidx.annotation.RawRes
    int id) {
    }
    
    /**
     * 设置提示文本，请在show方法之后调用
     */
    public final void setHint(@androidx.annotation.StringRes
    int id) {
    }
    
    public final void setHint(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
    }
    
    /**
     * 初始化提示的布局
     */
    private final void initLayout() {
    }
    
    /**
     * 设置重试监听器
     */
    public final void setOnRetryListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
    }
    
    /**
     * 重试监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/StatusLayout$OnRetryListener;", "", "onRetry", "", "layout", "Lvn/xdeuhug/luckyMoney/widget/StatusLayout;", "app_debug"})
    public static abstract interface OnRetryListener {
        
        /**
         * 点击了重试
         */
        public abstract void onRetry(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.widget.StatusLayout layout);
    }
}