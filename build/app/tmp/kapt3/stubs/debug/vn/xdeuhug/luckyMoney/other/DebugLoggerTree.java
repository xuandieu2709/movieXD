package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2020/08/12
 * desc   : 自定义日志打印规则
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/DebugLoggerTree;", "Ltimber/log/Timber$DebugTree;", "()V", "createStackElementTag", "", "element", "Ljava/lang/StackTraceElement;", "Companion", "app_debug"})
public final class DebugLoggerTree extends timber.log.Timber.DebugTree {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.other.DebugLoggerTree.Companion Companion = null;
    private static final int MAX_TAG_LENGTH = 23;
    
    public DebugLoggerTree() {
        super();
    }
    
    /**
     * 创建日志堆栈 TAG
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.lang.String createStackElementTag(@org.jetbrains.annotations.NotNull
    java.lang.StackTraceElement element) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/DebugLoggerTree$Companion;", "", "()V", "MAX_TAG_LENGTH", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}