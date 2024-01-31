package vn.xdeuhug.luckyMoney.action;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/12/08
 * desc   : 吐司意图
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/action/ToastAction;", "", "toast", "", "object", "text", "", "id", "", "app_debug"})
public abstract interface ToastAction {
    
    public abstract void toast(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text);
    
    public abstract void toast(@androidx.annotation.StringRes
    int id);
    
    public abstract void toast(@org.jetbrains.annotations.Nullable
    java.lang.Object object);
    
    /**
     * author : Android 轮子哥
     * github : https://github.com/getActivity/AndroidProject-Kotlin
     * time   : 2019/12/08
     * desc   : 吐司意图
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void toast(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.ToastAction $this, @org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
        }
        
        public static void toast(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.ToastAction $this, @androidx.annotation.StringRes
        int id) {
        }
        
        public static void toast(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.action.ToastAction $this, @org.jetbrains.annotations.Nullable
        java.lang.Object object) {
        }
    }
}