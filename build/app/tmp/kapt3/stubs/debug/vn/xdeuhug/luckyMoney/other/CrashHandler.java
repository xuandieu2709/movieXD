package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2020/02/03
 * desc   : Crash 处理类
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "nextHandler", "uncaughtException", "", "thread", "Ljava/lang/Thread;", "throwable", "", "Companion", "app_debug"})
public final class CrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private final android.app.Application application = null;
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.other.CrashHandler.Companion Companion = null;
    
    /**
     * Crash 文件名
     */
    private static final java.lang.String CRASH_FILE_NAME = "crash_file";
    
    /**
     * Crash 时间记录
     */
    private static final java.lang.String KEY_CRASH_TIME = "key_crash_time";
    private final java.lang.Thread.UncaughtExceptionHandler nextHandler = null;
    
    private CrashHandler(android.app.Application application) {
        super();
    }
    
    @kotlin.Suppress(names = {"ApplySharedPref"})
    @java.lang.Override
    public void uncaughtException(@org.jetbrains.annotations.NotNull
    java.lang.Thread thread, @org.jetbrains.annotations.NotNull
    java.lang.Throwable throwable) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/CrashHandler$Companion;", "", "()V", "CRASH_FILE_NAME", "", "KEY_CRASH_TIME", "register", "", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * 注册 Crash 监听
         */
        public final void register(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
        }
    }
}