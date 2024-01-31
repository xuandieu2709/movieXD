package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J,\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016J2\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010.\u001a\u00020\tH\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020\u000eH\u0016J(\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u000eH\u0016J \u00105\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J(\u00106\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0018H\u0016J0\u00107\u001a\u00020,2\u0006\u00103\u001a\u0002042\u0006\u0010\'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\tH\u0016J \u00108\u001a\u00020,2\u0006\u00109\u001a\u0002042\u0006\u00103\u001a\u0002042\u0006\u0010:\u001a\u00020\tH\u0016J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J \u0010>\u001a\u00020\u000e2\u0006\u00109\u001a\u0002042\u0006\u00103\u001a\u0002042\u0006\u0010:\u001a\u00020\tH\u0016J\u0010\u0010?\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0016J\u0010\u0010@\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010A\u001a\u00020,H\u0002J\u0010\u0010B\u001a\u00020,2\u0006\u0010C\u001a\u00020\u000eH\u0016J\u0010\u0010D\u001a\u00020,2\u0006\u0010E\u001a\u00020\u000eH\u0016J\u0010\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\tH\u0016J\b\u0010H\u001a\u00020,H\u0016R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/NestedLinearLayout;", "Landroid/widget/LinearLayout;", "Landroidx/core/view/NestedScrollingChild;", "Landroidx/core/view/NestedScrollingParent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "activePointerId", "beingDragged", "", "childHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "lastMotionY", "maximumVelocity", "", "minimumVelocity", "parentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "scrollConsumed", "", "scrollOffset", "touchSlop", "velocityTracker", "Landroid/view/VelocityTracker;", "dispatchNestedFling", "velocityX", "velocityY", "consumed", "dispatchNestedPreFling", "dispatchNestedPreScroll", "dx", "dy", "offsetInWindow", "dispatchNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "endDrag", "", "flingWithNestedDispatch", "getNestedScrollAxes", "hasNestedScrollingParent", "initVelocityTrackerIfNotExists", "isNestedScrollingEnabled", "onNestedFling", "target", "Landroid/view/View;", "onNestedPreFling", "onNestedPreScroll", "onNestedScroll", "onNestedScrollAccepted", "child", "nestedScrollAxes", "onSecondaryPointerUp", "ev", "Landroid/view/MotionEvent;", "onStartNestedScroll", "onStopNestedScroll", "onTouchEvent", "recycleVelocityTracker", "requestDisallowInterceptTouchEvent", "disallowIntercept", "setNestedScrollingEnabled", "enabled", "startNestedScroll", "axes", "stopNestedScroll", "Companion", "app_debug"})
public final class NestedLinearLayout extends android.widget.LinearLayout implements androidx.core.view.NestedScrollingChild, androidx.core.view.NestedScrollingParent {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.widget.NestedLinearLayout.Companion Companion = null;
    private static final int INVALID_POINTER = -1;
    private final androidx.core.view.NestedScrollingChildHelper childHelper = null;
    private final androidx.core.view.NestedScrollingParentHelper parentHelper = null;
    private final int[] scrollConsumed = null;
    private final int[] scrollOffset = null;
    private final float touchSlop = 0.0F;
    private final float maximumVelocity = 0.0F;
    private final float minimumVelocity = 0.0F;
    private int lastMotionY = 0;
    private int activePointerId = 0;
    private android.view.VelocityTracker velocityTracker;
    private boolean beingDragged = false;
    
    @kotlin.jvm.JvmOverloads
    public NestedLinearLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public NestedLinearLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public NestedLinearLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public NestedLinearLayout(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null);
    }
    
    @kotlin.Suppress(names = {"ClickableViewAccessibility"})
    @java.lang.Override
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull
    android.view.MotionEvent ev) {
        return false;
    }
    
    private final void onSecondaryPointerUp(android.view.MotionEvent ev) {
    }
    
    private final void endDrag() {
    }
    
    private final void flingWithNestedDispatch(int velocityY) {
    }
    
    private final void initVelocityTrackerIfNotExists() {
    }
    
    private final void recycleVelocityTracker() {
    }
    
    @java.lang.Override
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
    
    @java.lang.Override
    public void setNestedScrollingEnabled(boolean enabled) {
    }
    
    @java.lang.Override
    public boolean isNestedScrollingEnabled() {
        return false;
    }
    
    @java.lang.Override
    public boolean startNestedScroll(int axes) {
        return false;
    }
    
    @java.lang.Override
    public void stopNestedScroll() {
    }
    
    @java.lang.Override
    public boolean hasNestedScrollingParent() {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @org.jetbrains.annotations.Nullable
    int[] offsetInWindow) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchNestedPreScroll(int dx, int dy, @org.jetbrains.annotations.Nullable
    int[] consumed, @org.jetbrains.annotations.Nullable
    int[] offsetInWindow) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return false;
    }
    
    @java.lang.Override
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return false;
    }
    
    @java.lang.Override
    public boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull
    android.view.View child, @org.jetbrains.annotations.NotNull
    android.view.View target, int nestedScrollAxes) {
        return false;
    }
    
    @java.lang.Override
    public void onNestedScrollAccepted(@org.jetbrains.annotations.NotNull
    android.view.View child, @org.jetbrains.annotations.NotNull
    android.view.View target, int nestedScrollAxes) {
    }
    
    @java.lang.Override
    public void onStopNestedScroll(@org.jetbrains.annotations.NotNull
    android.view.View target) {
    }
    
    @java.lang.Override
    public void onNestedScroll(@org.jetbrains.annotations.NotNull
    android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
    }
    
    @java.lang.Override
    public void onNestedPreScroll(@org.jetbrains.annotations.NotNull
    android.view.View target, int dx, int dy, @org.jetbrains.annotations.NotNull
    int[] consumed) {
    }
    
    @java.lang.Override
    public boolean onNestedFling(@org.jetbrains.annotations.NotNull
    android.view.View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }
    
    @java.lang.Override
    public boolean onNestedPreFling(@org.jetbrains.annotations.NotNull
    android.view.View target, float velocityX, float velocityY) {
        return false;
    }
    
    @java.lang.Override
    public int getNestedScrollAxes() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/NestedLinearLayout$Companion;", "", "()V", "INVALID_POINTER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}