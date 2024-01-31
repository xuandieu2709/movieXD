package vn.xdeuhug.luckyMoney.cache;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 16 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/cache/ListMoneyCache;", "", "()V", "mListMoney", "Ljava/util/ArrayList;", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "mmkv", "Lcom/tencent/mmkv/MMKV;", "getList", "Lkotlin/collections/ArrayList;", "saveList", "", "moneyList", "app_debug"})
public final class ListMoneyCache {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.cache.ListMoneyCache INSTANCE = null;
    private static java.util.ArrayList<vn.xdeuhug.luckyMoney.model.eventbus.Money> mListMoney;
    private static final com.tencent.mmkv.MMKV mmkv = null;
    
    private ListMoneyCache() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<vn.xdeuhug.luckyMoney.model.eventbus.Money> getList() {
        return null;
    }
    
    public final void saveList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<vn.xdeuhug.luckyMoney.model.eventbus.Money> moneyList) {
    }
}