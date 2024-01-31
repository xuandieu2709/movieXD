package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2021/02/27
 * desc   : 标题栏初始器
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0017"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/TitleBarStyle;", "Lcom/hjq/bar/style/LightBarStyle;", "()V", "getBackButtonDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "getChildVerticalPadding", "", "getLeftIconPadding", "getLeftTitleBackground", "getLeftTitleSize", "", "getRightIconPadding", "getRightTitleBackground", "getRightTitleSize", "getTitleBarBackground", "getTitleIconPadding", "getTitleSize", "newLeftView", "Landroid/widget/TextView;", "newRightView", "newTitleView", "app_debug"})
public final class TitleBarStyle extends com.hjq.bar.style.LightBarStyle {
    
    public TitleBarStyle() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.TextView newTitleView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.TextView newLeftView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.widget.TextView newRightView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.graphics.drawable.Drawable getTitleBarBackground(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.graphics.drawable.Drawable getBackButtonDrawable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.graphics.drawable.Drawable getLeftTitleBackground(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.graphics.drawable.Drawable getRightTitleBackground(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    public int getChildVerticalPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override
    public float getTitleSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getLeftTitleSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0.0F;
    }
    
    @java.lang.Override
    public float getRightTitleSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0.0F;
    }
    
    @java.lang.Override
    public int getTitleIconPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override
    public int getLeftIconPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override
    public int getRightIconPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
}