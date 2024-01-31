package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000b\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/AppConfig;", "", "()V", "getBuildType", "", "getHostUrl", "getPackageName", "getVersionCode", "", "getVersionName", "isDebug", "", "isLogEnable", "app_debug"})
public final class AppConfig {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.other.AppConfig INSTANCE = null;
    
    private AppConfig() {
        super();
    }
    
    /**
     * 当前是否为调试模式
     */
    public final boolean isDebug() {
        return false;
    }
    
    /**
     * 获取当前构建的模式
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBuildType() {
        return null;
    }
    
    /**
     * 当前是否要开启日志打印功能
     */
    public final boolean isLogEnable() {
        return false;
    }
    
    /**
     * 获取当前应用的包名
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPackageName() {
        return null;
    }
    
    /**
     * 获取当前应用的版本名
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersionName() {
        return null;
    }
    
    /**
     * 获取当前应用的版本码
     */
    public final int getVersionCode() {
        return 0;
    }
    
    /**
     * 获取服务器主机地址
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHostUrl() {
        return null;
    }
}