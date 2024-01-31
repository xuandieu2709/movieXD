package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/XCollapsingToolbarLayout;", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "listener", "Lvn/xdeuhug/luckyMoney/widget/XCollapsingToolbarLayout$OnScrimsListener;", "scrimsShownStatus", "", "isScrimsShown", "setOnScrimsListener", "", "setScrimsShown", "shown", "animate", "OnScrimsListener", "app_debug"})
public final class XCollapsingToolbarLayout extends com.google.android.material.appbar.CollapsingToolbarLayout {
    
    /**
     * 渐变监听
     */
    private vn.xdeuhug.luckyMoney.widget.XCollapsingToolbarLayout.OnScrimsListener listener;
    
    /**
     * 当前渐变状态
     */
    private boolean scrimsShownStatus = false;
    
    @kotlin.jvm.JvmOverloads
    public XCollapsingToolbarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public XCollapsingToolbarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public XCollapsingToolbarLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override
    public void setScrimsShown(boolean shown, boolean animate) {
    }
    
    /**
     * 获取当前的渐变状态
     */
    public final boolean isScrimsShown() {
        return false;
    }
    
    /**
     * 设置CollapsingToolbarLayout渐变监听
     */
    public final void setOnScrimsListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.XCollapsingToolbarLayout.OnScrimsListener listener) {
    }
    
    /**
     * CollapsingToolbarLayout渐变监听器
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/XCollapsingToolbarLayout$OnScrimsListener;", "", "onScrimsStateChange", "", "layout", "Lvn/xdeuhug/luckyMoney/widget/XCollapsingToolbarLayout;", "shown", "", "app_debug"})
    public static abstract interface OnScrimsListener {
        
        /**
         * 渐变状态变化
         *
         * @param shown         渐变开关
         */
        public abstract void onScrimsStateChange(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.widget.XCollapsingToolbarLayout layout, boolean shown);
    }
}