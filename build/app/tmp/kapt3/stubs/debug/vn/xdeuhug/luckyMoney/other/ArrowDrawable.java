package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : 王浩 & Android 轮子哥
 * github : https://github.com/bingoogolapple/BGATransformersTip-Android
 * time   : 2019/08/19
 * desc   : 带箭头背景的 Drawable
 */
@kotlin.Suppress(names = {"RtlHardcoded"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ArrowDrawable;", "Landroid/graphics/drawable/Drawable;", "builder", "Lvn/xdeuhug/luckyMoney/other/ArrowDrawable$Builder;", "(Lvn/xdeuhug/luckyMoney/other/ArrowDrawable$Builder;)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getOpacity", "", "onBoundsChange", "viewRect", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "Builder", "app_debug"})
public final class ArrowDrawable extends android.graphics.drawable.Drawable {
    private final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder builder = null;
    private final android.graphics.Paint paint = null;
    private android.graphics.Path path;
    
    private ArrowDrawable(vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder builder) {
        super();
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    public void setAlpha(int alpha) {
    }
    
    @java.lang.Override
    public void setColorFilter(@org.jetbrains.annotations.Nullable
    android.graphics.ColorFilter colorFilter) {
    }
    
    @java.lang.Override
    public int getOpacity() {
        return 0;
    }
    
    @java.lang.Override
    protected void onBoundsChange(@org.jetbrains.annotations.NotNull
    android.graphics.Rect viewRect) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010\'\u001a\u00020(J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010.\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010.\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\u00a8\u00060"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ArrowDrawable$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "arrowGravity", "", "getArrowGravity", "()I", "setArrowGravity", "(I)V", "arrowHeight", "getArrowHeight", "setArrowHeight", "arrowOffsetX", "getArrowOffsetX", "setArrowOffsetX", "arrowOffsetY", "getArrowOffsetY", "setArrowOffsetY", "arrowOrientation", "getArrowOrientation", "setArrowOrientation", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "radius", "getRadius", "setRadius", "shadowColor", "getShadowColor", "setShadowColor", "shadowSize", "getShadowSize", "setShadowSize", "apply", "", "view", "Landroid/view/View;", "build", "Landroid/graphics/drawable/Drawable;", "gravity", "height", "offsetX", "offsetY", "orientation", "color", "size", "app_debug"})
    public static final class Builder {
        private final android.content.Context context = null;
        
        /**
         * 箭头高度
         */
        private int arrowHeight;
        
        /**
         * 背景圆角大小
         */
        private int radius;
        
        /**
         * 箭头方向
         */
        private int arrowOrientation;
        
        /**
         * 箭头重心
         */
        private int arrowGravity;
        
        /**
         * 箭头水平方向偏移
         */
        private int arrowOffsetX;
        
        /**
         * 箭头垂直方向偏移
         */
        private int arrowOffsetY;
        
        /**
         * 阴影大小
         */
        private int shadowSize;
        
        /**
         * 背景颜色
         */
        private int backgroundColor;
        
        /**
         * 阴影颜色
         */
        private int shadowColor;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        public final int getArrowHeight() {
            return 0;
        }
        
        public final void setArrowHeight(int p0) {
        }
        
        public final int getRadius() {
            return 0;
        }
        
        public final void setRadius(int p0) {
        }
        
        public final int getArrowOrientation() {
            return 0;
        }
        
        public final void setArrowOrientation(int p0) {
        }
        
        public final int getArrowGravity() {
            return 0;
        }
        
        public final void setArrowGravity(int p0) {
        }
        
        public final int getArrowOffsetX() {
            return 0;
        }
        
        public final void setArrowOffsetX(int p0) {
        }
        
        public final int getArrowOffsetY() {
            return 0;
        }
        
        public final void setArrowOffsetY(int p0) {
        }
        
        public final int getShadowSize() {
            return 0;
        }
        
        public final void setShadowSize(int p0) {
        }
        
        public final int getBackgroundColor() {
            return 0;
        }
        
        public final void setBackgroundColor(int p0) {
        }
        
        public final int getShadowColor() {
            return 0;
        }
        
        public final void setShadowColor(int p0) {
        }
        
        /**
         * 设置背景色
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setBackgroundColor(@androidx.annotation.ColorInt
        int color) {
            return null;
        }
        
        /**
         * 设置阴影色
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setShadowColor(@androidx.annotation.ColorInt
        int color) {
            return null;
        }
        
        /**
         * 设置箭头高度
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setArrowHeight(int height) {
            return null;
        }
        
        /**
         * 设置浮窗圆角半径
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setRadius(int radius) {
            return null;
        }
        
        /**
         * 设置箭头方向（左上右下）
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setArrowOrientation(int orientation) {
            return null;
        }
        
        /**
         * 设置箭头布局重心
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setArrowGravity(int gravity) {
            return null;
        }
        
        /**
         * 设置箭头在 x 轴的偏移量
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setArrowOffsetX(int offsetX) {
            return null;
        }
        
        /**
         * 设置箭头在 y 轴的偏移量
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setArrowOffsetY(int offsetY) {
            return null;
        }
        
        /**
         * 设置阴影宽度
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ArrowDrawable.Builder setShadowSize(int size) {
            return null;
        }
        
        /**
         * 构建 Drawable
         */
        @org.jetbrains.annotations.NotNull
        public final android.graphics.drawable.Drawable build() {
            return null;
        }
        
        /**
         * 应用到 View
         */
        public final void apply(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
    }
}