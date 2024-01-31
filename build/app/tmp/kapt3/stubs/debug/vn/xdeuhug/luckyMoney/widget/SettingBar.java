package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 @2\u00020\u0001:\u0001@B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u0011J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016J\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0007J\u0010\u0010(\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0018J\u0010\u0010(\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\'\u001a\u00020\u0007J\u0010\u0010+\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0018J\u0010\u0010+\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010%\u001a\u00020/J\u0010\u00100\u001a\u00020\u00002\b\b\u0001\u0010\'\u001a\u00020\u0007J\u0010\u00101\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0016J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0007J\u000e\u00104\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207J\u0010\u00108\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0016J\u0010\u00108\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u000e\u00109\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020\u0007J\u0010\u0010<\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0018J\u0010\u0010<\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u0010\u0010=\u001a\u00020\u00002\b\b\u0001\u0010\'\u001a\u00020\u0007J\u0010\u0010>\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0018J\u0010\u0010>\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0007J\u0016\u0010?\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u00072\u0006\u0010%\u001a\u00020/R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/SettingBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "leftDrawableSize", "leftDrawableTint", "leftView", "Landroid/widget/TextView;", "lineView", "Landroid/view/View;", "mainLayout", "Landroid/widget/LinearLayout;", "rightDrawableSize", "rightDrawableTint", "rightView", "getLeftDrawable", "Landroid/graphics/drawable/Drawable;", "getLeftText", "", "getLeftView", "getLineView", "getMainLayout", "getRightDrawable", "getRightText", "getRightView", "setLeftDrawable", "drawable", "id", "setLeftDrawablePadding", "padding", "setLeftDrawableSize", "size", "setLeftDrawableTint", "color", "setLeftText", "text", "setLeftTextColor", "setLeftTextHint", "hint", "setLeftTextSize", "unit", "", "setLineColor", "setLineDrawable", "setLineMargin", "margin", "setLineSize", "setLineVisible", "visible", "", "setRightDrawable", "setRightDrawablePadding", "setRightDrawableSize", "setRightDrawableTint", "setRightText", "setRightTextColor", "setRightTextHint", "setRightTextSize", "Companion", "app_debug"})
public final class SettingBar extends android.widget.FrameLayout {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.widget.SettingBar.Companion Companion = null;
    
    /**
     * 无色值
     */
    public static final int NO_COLOR = android.graphics.Color.TRANSPARENT;
    private final android.widget.LinearLayout mainLayout = null;
    private final android.widget.TextView leftView = null;
    private final android.widget.TextView rightView = null;
    private final android.view.View lineView = null;
    
    /**
     * 图标着色器
     */
    private int leftDrawableTint = 0;
    private int rightDrawableTint = 0;
    
    /**
     * 图标显示大小
     */
    private int leftDrawableSize = 0;
    private int rightDrawableSize = 0;
    
    @kotlin.jvm.JvmOverloads
    public SettingBar(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SettingBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SettingBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SettingBar(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    /**
     * 设置左边的文本
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftText(@androidx.annotation.StringRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftText(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getLeftText() {
        return null;
    }
    
    /**
     * 设置左边的提示
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftTextHint(@androidx.annotation.StringRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftTextHint(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence hint) {
        return null;
    }
    
    /**
     * 设置右边的标题
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightText(@androidx.annotation.StringRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightText(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.CharSequence getRightText() {
        return null;
    }
    
    /**
     * 设置右边的提示
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightTextHint(@androidx.annotation.StringRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightTextHint(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence hint) {
        return null;
    }
    
    /**
     * 设置左边的图标
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftDrawable(@androidx.annotation.DrawableRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftDrawable(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLeftDrawable() {
        return null;
    }
    
    /**
     * 设置右边的图标
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightDrawable(@androidx.annotation.DrawableRes
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightDrawable(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getRightDrawable() {
        return null;
    }
    
    /**
     * 设置左边的图标间距
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftDrawablePadding(int padding) {
        return null;
    }
    
    /**
     * 设置右边的图标间距
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightDrawablePadding(int padding) {
        return null;
    }
    
    /**
     * 设置左边的图标大小
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftDrawableSize(int size) {
        return null;
    }
    
    /**
     * 设置右边的图标大小
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightDrawableSize(int size) {
        return null;
    }
    
    /**
     * 设置左边的图标着色器
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftDrawableTint(int color) {
        return null;
    }
    
    /**
     * 设置右边的图标着色器
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightDrawableTint(int color) {
        return null;
    }
    
    /**
     * 设置左边的文本颜色
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * 设置右边的文本颜色
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightTextColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    /**
     * 设置左边的文字大小
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLeftTextSize(int unit, float size) {
        return null;
    }
    
    /**
     * 设置右边的文字大小
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setRightTextSize(int unit, float size) {
        return null;
    }
    
    /**
     * 设置分割线是否显示
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLineVisible(boolean visible) {
        return null;
    }
    
    /**
     * 设置分割线的颜色
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLineColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLineDrawable(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable) {
        return null;
    }
    
    /**
     * 设置分割线的大小
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLineSize(int size) {
        return null;
    }
    
    /**
     * 设置分割线边界
     */
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.widget.SettingBar setLineMargin(int margin) {
        return null;
    }
    
    /**
     * 获取主布局
     */
    @org.jetbrains.annotations.NotNull
    public final android.widget.LinearLayout getMainLayout() {
        return null;
    }
    
    /**
     * 获取左 TextView
     */
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getLeftView() {
        return null;
    }
    
    /**
     * 获取右 TextView
     */
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getRightView() {
        return null;
    }
    
    /**
     * có được đường phân chia
     */
    @org.jetbrains.annotations.NotNull
    public final android.view.View getLineView() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/SettingBar$Companion;", "", "()V", "NO_COLOR", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}