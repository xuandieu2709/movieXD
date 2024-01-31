package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 16 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog;", "", "()V", "Builder", "app_debug"})
public final class SettingMoneyDialog {
    
    public SettingMoneyDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010\u0015\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$Builder;", "Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter$OnClickItem;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/DialogSettingMoneyBinding;", "listMoney", "Ljava/util/ArrayList;", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "mediaPlayer", "Landroid/media/MediaPlayer;", "moneyAdapter", "Lvn/xdeuhug/luckyMoney/ui/adapter/MoneyAdapter;", "music", "Lvn/xdeuhug/luckyMoney/model/eventbus/Music;", "onCompleted", "Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog$Builder$OnCompleted;", "getOnCompleted", "()Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog$Builder$OnCompleted;", "setOnCompleted", "(Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog$Builder$OnCompleted;)V", "addOnCancelListener", "listener", "Lvn/xdeuhug/base/BaseDialog$OnCancelListener;", "addOnDismissListener", "Lvn/xdeuhug/base/BaseDialog$OnDismissListener;", "initListMoney", "", "onMinus", "position", "", "item", "onPlus", "playAudioPlayer", "setUpMoney", "OnCompleted", "app_debug"})
    public static final class Builder extends vn.xdeuhug.base.BaseDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder> implements vn.xdeuhug.luckyMoney.ui.adapter.MoneyAdapter.OnClickItem {
        private vn.xdeuhug.luckyMoney.databinding.DialogSettingMoneyBinding binding;
        public vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder.OnCompleted onCompleted;
        private android.media.MediaPlayer mediaPlayer;
        private vn.xdeuhug.luckyMoney.model.eventbus.Music music;
        private vn.xdeuhug.luckyMoney.ui.adapter.MoneyAdapter moneyAdapter;
        private java.util.ArrayList<vn.xdeuhug.luckyMoney.model.eventbus.Money> listMoney;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder.OnCompleted getOnCompleted() {
            return null;
        }
        
        public final void setOnCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder.OnCompleted p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder onCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder.OnCompleted onCompleted) {
            return null;
        }
        
        private final void setOnCompleted() {
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder addOnDismissListener(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.base.BaseDialog.OnDismissListener listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.xdeuhug.luckyMoney.ui.dialog.SettingMoneyDialog.Builder addOnCancelListener(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.base.BaseDialog.OnCancelListener listener) {
            return null;
        }
        
        private final void playAudioPlayer() {
        }
        
        @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
        private final void setUpMoney() {
        }
        
        private final void initListMoney() {
        }
        
        @java.lang.Override
        public void onMinus(int position, @org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.model.eventbus.Money item) {
        }
        
        @java.lang.Override
        public void onPlus(int position, @org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.model.eventbus.Money item) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/SettingMoneyDialog$Builder$OnCompleted;", "", "onClose", "", "onSave", "listMoneyNew", "Ljava/util/ArrayList;", "Lvn/xdeuhug/luckyMoney/model/eventbus/Money;", "Lkotlin/collections/ArrayList;", "app_debug"})
        public static abstract interface OnCompleted {
            
            public abstract void onClose();
            
            public abstract void onSave(@org.jetbrains.annotations.NotNull
            java.util.ArrayList<vn.xdeuhug.luckyMoney.model.eventbus.Money> listMoneyNew);
        }
    }
}