package vn.xdeuhug.luckyMoney.ui.adapter;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 16 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\"\u0010\f\u001a\f0\rR\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter;", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onClickItem", "Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$OnClickItem;", "getOnClickItem", "()Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$OnClickItem;", "setOnClickItem", "(Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$OnClickItem;)V", "onCreateViewHolder", "Lvn/xdeuhug/luckyMoney/app/AppAdapter$AppViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "OnClickItem", "ViewHolder", "app_debug"})
public final class MoneyAdapter extends vn.xdeuhug.luckyMoney.app.AppAdapter<vn.xdeuhug.luckyMoney.model.eventbus.Money> {
    @org.jetbrains.annotations.Nullable
    private vn.xdeuhug.luckyMoney.ui.adapter.MoneyAdapter.OnClickItem onClickItem;
    
    public MoneyAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final vn.xdeuhug.luckyMoney.ui.adapter.MoneyAdapter.OnClickItem getOnClickItem() {
        return null;
    }
    
    public final void setOnClickItem(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.ui.adapter.MoneyAdapter.OnClickItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public vn.xdeuhug.luckyMoney.app.AppAdapter<vn.xdeuhug.luckyMoney.model.eventbus.Money>.AppViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$ViewHolder;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter$AppViewHolder;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter;", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "binding", "Lvn/xdeuhug/luckyMoney/databinding/ItemMoneyBinding;", "(Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter;Lvn/xdeuhug/luckyMoney/databinding/ItemMoneyBinding;)V", "onBindView", "", "position", "", "app_debug"})
    public final class ViewHolder extends vn.xdeuhug.luckyMoney.app.AppAdapter<vn.xdeuhug.luckyMoney.model.eventbus.Money>.AppViewHolder {
        private final vn.xdeuhug.luckyMoney.databinding.ItemMoneyBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.databinding.ItemMoneyBinding binding) {
            super(0);
        }
        
        @android.annotation.SuppressLint(value = {"DiscouragedApi"})
        @java.lang.Override
        public void onBindView(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$OnClickItem;", "", "onMinus", "", "position", "", "item", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "onPlus", "app_debug"})
    public static abstract interface OnClickItem {
        
        public abstract void onMinus(int position, @org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.model.eventbus.Money item);
        
        public abstract void onPlus(int position, @org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.model.eventbus.Money item);
    }
}