package vn.xdeuhug.luckyMoney.manager;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ5\u0010\u0012\u001a\u00020\u000f2&\u0010\u0013\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u00110\u0014\"\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0011H\u0007\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\bJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u000e\u0010\'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000bJ\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000bR\u001e\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/ActivityManager;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "activitySet", "Landroidx/collection/ArrayMap;", "", "Landroid/app/Activity;", "application", "Landroid/app/Application;", "lifecycleCallbacks", "Ljava/util/ArrayList;", "Lvn/xdeuhug/luckyMoney/manager/ActivityManager$ApplicationLifecycleCallback;", "resumedActivity", "topActivity", "finishActivity", "", "clazz", "Ljava/lang/Class;", "finishAllActivities", "classArray", "", "([Ljava/lang/Class;)V", "getApplication", "getResumedActivity", "getTopActivity", "init", "isForeground", "", "onActivityCreated", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "registerApplicationLifecycleCallback", "callback", "unregisterApplicationLifecycleCallback", "ApplicationLifecycleCallback", "Companion", "app_debug"})
public final class ActivityManager implements android.app.Application.ActivityLifecycleCallbacks {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.manager.ActivityManager.Companion Companion = null;
    private static final kotlin.Lazy activityManager$delegate = null;
    
    /**
     * Activity 存放集合
     */
    private final androidx.collection.ArrayMap<java.lang.String, android.app.Activity> activitySet = null;
    
    /**
     * 应用生命周期回调
     */
    private final java.util.ArrayList<vn.xdeuhug.luckyMoney.manager.ActivityManager.ApplicationLifecycleCallback> lifecycleCallbacks = null;
    
    /**
     * 当前应用上下文对象
     */
    private android.app.Application application;
    
    /**
     * 栈顶的 Activity 对象
     */
    private android.app.Activity topActivity;
    
    /**
     * 前台并且可见的 Activity 对象
     */
    private android.app.Activity resumedActivity;
    
    private ActivityManager() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
    }
    
    /**
     * 获取 Application 对象
     */
    @org.jetbrains.annotations.NotNull
    public final android.app.Application getApplication() {
        return null;
    }
    
    /**
     * 获取栈顶的 Activity
     */
    @org.jetbrains.annotations.Nullable
    public final android.app.Activity getTopActivity() {
        return null;
    }
    
    /**
     * 获取前台并且可见的 Activity
     */
    @org.jetbrains.annotations.Nullable
    public final android.app.Activity getResumedActivity() {
        return null;
    }
    
    /**
     * 判断当前应用是否处于前台状态
     */
    public final boolean isForeground() {
        return false;
    }
    
    /**
     * 注册应用生命周期回调
     */
    public final void registerApplicationLifecycleCallback(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.manager.ActivityManager.ApplicationLifecycleCallback callback) {
    }
    
    /**
     * 取消注册应用生命周期回调
     */
    public final void unregisterApplicationLifecycleCallback(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.manager.ActivityManager.ApplicationLifecycleCallback callback) {
    }
    
    /**
     * 销毁指定的 Activity
     */
    public final void finishActivity(@org.jetbrains.annotations.Nullable
    java.lang.Class<? extends android.app.Activity> clazz) {
    }
    
    /**
     * 销毁所有的 Activity
     */
    public final void finishAllActivities() {
    }
    
    /**
     * 销毁所有的 Activity
     *
     * @param classArray            白名单 Activity
     */
    @java.lang.SafeVarargs
    public final void finishAllActivities(@org.jetbrains.annotations.NotNull
    java.lang.Class<? extends android.app.Activity>... classArray) {
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onActivityStarted(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void onActivityResumed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void onActivityPaused(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void onActivityStopped(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onActivityDestroyed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    /**
     * 应用生命周期回调
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/ActivityManager$ApplicationLifecycleCallback;", "", "onApplicationBackground", "", "activity", "Landroid/app/Activity;", "onApplicationCreate", "onApplicationDestroy", "onApplicationForeground", "app_debug"})
    public static abstract interface ApplicationLifecycleCallback {
        
        /**
         * 第一个 Activity 创建了
         */
        public abstract void onApplicationCreate(@org.jetbrains.annotations.NotNull
        android.app.Activity activity);
        
        /**
         * 最后一个 Activity 销毁了
         */
        public abstract void onApplicationDestroy(@org.jetbrains.annotations.NotNull
        android.app.Activity activity);
        
        /**
         * 应用从前台进入到后台
         */
        public abstract void onApplicationBackground(@org.jetbrains.annotations.NotNull
        android.app.Activity activity);
        
        /**
         * 应用从后台进入到前台
         */
        public abstract void onApplicationForeground(@org.jetbrains.annotations.NotNull
        android.app.Activity activity);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0002R!\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/ActivityManager$Companion;", "", "()V", "activityManager", "Lvn/xdeuhug/luckyMoney/manager/ActivityManager;", "getActivityManager$annotations", "getActivityManager", "()Lvn/xdeuhug/luckyMoney/manager/ActivityManager;", "activityManager$delegate", "Lkotlin/Lazy;", "getInstance", "getObjectTag", "", "object", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final vn.xdeuhug.luckyMoney.manager.ActivityManager getActivityManager() {
            return null;
        }
        
        @kotlin.Suppress(names = {"StaticFieldLeak"})
        @java.lang.Deprecated
        private static void getActivityManager$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.ActivityManager getInstance() {
            return null;
        }
        
        /**
         * 获取一个对象的独立无二的标记
         */
        private final java.lang.String getObjectTag(java.lang.Object object) {
            return null;
        }
    }
}