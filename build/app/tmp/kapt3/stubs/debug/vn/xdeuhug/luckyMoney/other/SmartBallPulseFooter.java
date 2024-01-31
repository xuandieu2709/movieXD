package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : 树朾 & Android 轮子哥
 * github : https://github.com/scwang90/SmartRefreshLayout/tree/master/refresh-footer-ball
 * time   : 2020/08/01
 * desc   : 球脉冲底部加载组件
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000fH\u0016J \u0010\"\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00002\b\b\u0001\u0010&\u001a\u00020\u0013J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\u00002\b\b\u0001\u0010&\u001a\u00020\u0013J\u0016\u0010)\u001a\u00020\u001b2\f\b\u0001\u0010*\u001a\u00020\t\"\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/SmartBallPulseFooter;", "Lcom/scwang/smart/refresh/layout/simple/SimpleComponent;", "Lcom/scwang/smart/refresh/layout/api/RefreshFooter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animatingColor", "", "circleSpacing", "", "interpolator", "Landroid/animation/TimeInterpolator;", "manualAnimationColor", "", "manualNormalColor", "noMoreData", "normalColor", "", "paint", "Landroid/graphics/Paint;", "startTime", "", "started", "textWidth", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "onFinish", "layout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "success", "onStartAnimator", "height", "maxDragHeight", "setAnimatingColor", "color", "setNoMoreData", "setNormalColor", "setPrimaryColors", "colors", "app_debug"})
public final class SmartBallPulseFooter extends com.scwang.smart.refresh.layout.simple.SimpleComponent implements com.scwang.smart.refresh.layout.api.RefreshFooter {
    private final android.animation.TimeInterpolator interpolator = null;
    private boolean noMoreData = false;
    private boolean manualNormalColor = false;
    private boolean manualAnimationColor = false;
    private final android.graphics.Paint paint = null;
    private int normalColor;
    private int[] animatingColor;
    private final float circleSpacing = 0.0F;
    private long startTime = 0L;
    private boolean started = false;
    private final float textWidth = 0.0F;
    
    @kotlin.jvm.JvmOverloads
    public SmartBallPulseFooter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public SmartBallPulseFooter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override
    protected void dispatchDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    public void onStartAnimator(@org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.api.RefreshLayout layout, int height, int maxDragHeight) {
    }
    
    @java.lang.Override
    public int onFinish(@org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.api.RefreshLayout layout, boolean success) {
        return 0;
    }
    
    @java.lang.Override
    public void setPrimaryColors(@org.jetbrains.annotations.NotNull
    @androidx.annotation.ColorInt
    int... colors) {
    }
    
    @java.lang.Override
    public boolean setNoMoreData(boolean noMoreData) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.other.SmartBallPulseFooter setNormalColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.other.SmartBallPulseFooter setAnimatingColor(@androidx.annotation.ColorInt
    int color) {
        return null;
    }
}