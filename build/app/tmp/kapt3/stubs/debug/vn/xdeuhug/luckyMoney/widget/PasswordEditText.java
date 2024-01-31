package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 27/09/2022
 */
@kotlin.Suppress(names = {"ClickableViewAccessibility"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J*\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u001a\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J*\u0010 \u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0013H\u0002J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\u001fH\u0002J\u0012\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010*\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/PasswordEditText;", "Lvn/xdeuhug/widget/view/RegexEditText;", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentDrawable", "Landroid/graphics/drawable/Drawable;", "focusChangeListener", "invisibleDrawable", "touchListener", "visibleDrawable", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "onFocusChange", "view", "Landroid/view/View;", "hasFocus", "", "onTextChanged", "before", "onTouch", "event", "Landroid/view/MotionEvent;", "refreshDrawableStatus", "setDrawableVisible", "visible", "setOnFocusChangeListener", "onFocusChangeListener", "setOnTouchListener", "onTouchListener", "app_debug"})
public final class PasswordEditText extends vn.xdeuhug.widget.view.RegexEditText implements android.view.View.OnTouchListener, android.view.View.OnFocusChangeListener, android.text.TextWatcher {
    private android.graphics.drawable.Drawable currentDrawable;
    private final android.graphics.drawable.Drawable visibleDrawable = null;
    private final android.graphics.drawable.Drawable invisibleDrawable = null;
    private android.view.View.OnTouchListener touchListener;
    private android.view.View.OnFocusChangeListener focusChangeListener;
    
    @kotlin.jvm.JvmOverloads
    public PasswordEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PasswordEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public PasswordEditText(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0);
    }
    
    private final void setDrawableVisible(boolean visible) {
    }
    
    private final void refreshDrawableStatus() {
    }
    
    @java.lang.Override
    public void setOnFocusChangeListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnFocusChangeListener onFocusChangeListener) {
    }
    
    @java.lang.Override
    public void setOnTouchListener(@org.jetbrains.annotations.Nullable
    android.view.View.OnTouchListener onTouchListener) {
    }
    
    /**
     * [OnFocusChangeListener]
     */
    @java.lang.Override
    public void onFocusChange(@org.jetbrains.annotations.Nullable
    android.view.View view, boolean hasFocus) {
    }
    
    /**
     * [OnTouchListener]
     */
    @java.lang.Override
    public boolean onTouch(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * [TextWatcher]
     */
    @java.lang.Override
    public void onTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override
    public void afterTextChanged(@org.jetbrains.annotations.Nullable
    android.text.Editable s) {
    }
}