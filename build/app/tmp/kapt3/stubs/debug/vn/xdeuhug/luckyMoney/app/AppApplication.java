package vn.xdeuhug.luckyMoney.app;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/AppApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class AppApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.app.AppApplication.Companion Companion = null;
    public static com.tencent.mmkv.MMKV kv;
    @org.jetbrains.annotations.Nullable
    private static vn.xdeuhug.luckyMoney.app.AppApplication instance;
    private static int widthView = 0;
    private static int heightView = 0;
    
    public AppApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/AppApplication$Companion;", "", "()V", "heightView", "", "getHeightView", "()I", "setHeightView", "(I)V", "instance", "Lvn/xdeuhug/luckyMoney/app/AppApplication;", "getInstance", "()Lvn/xdeuhug/luckyMoney/app/AppApplication;", "setInstance", "(Lvn/xdeuhug/luckyMoney/app/AppApplication;)V", "kv", "Lcom/tencent/mmkv/MMKV;", "getKv", "()Lcom/tencent/mmkv/MMKV;", "setKv", "(Lcom/tencent/mmkv/MMKV;)V", "widthView", "getWidthView", "setWidthView", "initSdk", "", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.tencent.mmkv.MMKV getKv() {
            return null;
        }
        
        public final void setKv(@org.jetbrains.annotations.NotNull
        com.tencent.mmkv.MMKV p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final vn.xdeuhug.luckyMoney.app.AppApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.app.AppApplication p0) {
        }
        
        public final int getWidthView() {
            return 0;
        }
        
        public final void setWidthView(int p0) {
        }
        
        public final int getHeightView() {
            return 0;
        }
        
        public final void setHeightView(int p0) {
        }
        
        public final void initSdk(@org.jetbrains.annotations.NotNull
        android.app.Application application) {
        }
    }
}