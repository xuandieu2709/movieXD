package vn.xdeuhug.luckyMoney.ui.activity;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0017J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/CrashActivity;", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "()V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/CrashActivityBinding;", "stackTrace", "", "createStatusBarConfig", "Lcom/gyf/immersionbar/ImmersionBar;", "getLayoutView", "Landroid/view/View;", "initData", "", "initView", "isTablet", "", "onBackPressed", "onClick", "view", "onHttpFail", "e", "Ljava/lang/Exception;", "onHttpSuccess", "result", "", "Companion", "app_debug"})
public final class CrashActivity extends vn.xdeuhug.luckyMoney.app.AppActivity {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.ui.activity.CrashActivity.Companion Companion = null;
    private static final java.lang.String INTENT_KEY_IN_THROWABLE = "throwable";
    private static final java.lang.String[] SYSTEM_PACKAGE_PREFIX_LIST = {"android", "com.vn.xdeuhug.luckyMoney", "androidx", "com.google.vn.xdeuhug.luckyMoney", "java", "javax", "dalvik", "kotlin"};
    private static final java.util.regex.Pattern CODE_REGEX = null;
    private vn.xdeuhug.luckyMoney.databinding.CrashActivityBinding binding;
    private java.lang.String stackTrace;
    
    public CrashActivity() {
        super();
    }
    
    @java.lang.Override
    protected void initView() {
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    public void onHttpSuccess(@org.jetbrains.annotations.NotNull
    java.lang.Object result) {
    }
    
    @java.lang.Override
    public void onHttpFail(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onBackPressed() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.gyf.immersionbar.ImmersionBar createStatusBarConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    /**
     * 判断当前设备是否是平板
     */
    public final boolean isTablet() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/CrashActivity$Companion;", "", "()V", "CODE_REGEX", "Ljava/util/regex/Pattern;", "INTENT_KEY_IN_THROWABLE", "", "SYSTEM_PACKAGE_PREFIX_LIST", "", "[Ljava/lang/String;", "start", "", "application", "Landroid/app/Application;", "throwable", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        android.app.Application application, @org.jetbrains.annotations.Nullable
        java.lang.Throwable throwable) {
        }
    }
}