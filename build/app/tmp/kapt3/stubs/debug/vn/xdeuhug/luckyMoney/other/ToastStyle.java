package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2021/02/27
 * desc   : Toast 样式配置
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ToastStyle;", "Lcom/hjq/toast/style/BlackToastStyle;", "()V", "getBackgroundDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "getGravity", "", "getHorizontalPadding", "getTextSize", "", "getVerticalPadding", "app_debug"})
public final class ToastStyle extends com.hjq.toast.style.BlackToastStyle {
    
    public ToastStyle() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.graphics.drawable.Drawable getBackgroundDrawable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @java.lang.Override
    protected float getTextSize(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0.0F;
    }
    
    @java.lang.Override
    protected int getHorizontalPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override
    protected int getVerticalPadding(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0;
    }
    
    @java.lang.Override
    public int getGravity() {
        return 0;
    }
}