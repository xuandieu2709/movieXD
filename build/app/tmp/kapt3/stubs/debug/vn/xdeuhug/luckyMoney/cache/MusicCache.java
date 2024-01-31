package vn.xdeuhug.luckyMoney.cache;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 15 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/cache/MusicCache;", "", "()V", "mMusicInfo", "Lvn/xdeuhug/luckyMoney/model/eventbus/Music;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getMusic", "isSaveCache", "", "saveMusic", "", "musicInfo", "app_debug"})
public final class MusicCache {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.cache.MusicCache INSTANCE = null;
    private static vn.xdeuhug.luckyMoney.model.eventbus.Music mMusicInfo;
    private static final com.tencent.mmkv.MMKV mmkv = null;
    
    private MusicCache() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.model.eventbus.Music getMusic() {
        return null;
    }
    
    public final void saveMusic(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.model.eventbus.Music musicInfo) {
    }
    
    public final boolean isSaveCache() {
        return false;
    }
}