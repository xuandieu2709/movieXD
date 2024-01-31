package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2020/11/04
 * desc   : 自定义 Toast 拦截器（用于追踪 Toast 调用的位置）
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ToastLogInterceptor;", "Lcom/hjq/toast/config/IToastInterceptor;", "()V", "intercept", "", "text", "", "app_debug"})
public final class ToastLogInterceptor implements com.hjq.toast.config.IToastInterceptor {
    
    public ToastLogInterceptor() {
        super();
    }
    
    @java.lang.Override
    public boolean intercept(@org.jetbrains.annotations.NotNull
    java.lang.CharSequence text) {
        return false;
    }
}