package vn.xdeuhug.luckyMoney.cache;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 05/08/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/cache/HttpLoggerCache;", "", "()V", "logEnable", "", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getHttpLogEnable", "saveHttpLogEnable", "", "enable", "app_debug"})
public final class HttpLoggerCache {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.cache.HttpLoggerCache INSTANCE = null;
    private static boolean logEnable = false;
    private static final com.tencent.mmkv.MMKV mmkv = null;
    
    private HttpLoggerCache() {
        super();
    }
    
    public final boolean getHttpLogEnable() {
        return false;
    }
    
    public final void saveHttpLogEnable(boolean enable) {
    }
}