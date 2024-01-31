package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 11 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog;", "", "()V", "Builder", "app_debug"})
public final class LuckyMoneyDialog {
    
    public LuckyMoneyDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$Builder;", "Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder;", "context", "Landroid/content/Context;", "typeMoney", "", "(Landroid/content/Context;I)V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/DialogLuckyMoneyBinding;", "onCompleted", "Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder$OnCompleted;", "getOnCompleted", "()Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder$OnCompleted;", "setOnCompleted", "(Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder$OnCompleted;)V", "getTypeMoney", "()I", "setTypeMoney", "(I)V", "setImageView", "", "Companion", "OnCompleted", "app_debug"})
    public static final class Builder extends vn.xdeuhug.base.BaseDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder> {
        private int typeMoney;
        private vn.xdeuhug.luckyMoney.databinding.DialogLuckyMoneyBinding binding;
        public vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder.OnCompleted onCompleted;
        @org.jetbrains.annotations.NotNull
        public static final vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder.Companion Companion = null;
        public static final int D_1000 = 1000;
        public static final int D_2000 = 2000;
        public static final int D_5000 = 5000;
        public static final int D_10000 = 10000;
        public static final int D_20000 = 20000;
        public static final int D_50000 = 50000;
        public static final int D_100000 = 100000;
        public static final int D_200000 = 200000;
        public static final int D_500000 = 500000;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, int typeMoney) {
            super(null);
        }
        
        public final int getTypeMoney() {
            return 0;
        }
        
        public final void setTypeMoney(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder.OnCompleted getOnCompleted() {
            return null;
        }
        
        public final void setOnCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder.OnCompleted p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder onCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.LuckyMoneyDialog.Builder.OnCompleted onCompleted) {
            return null;
        }
        
        private final void setImageView() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder$OnCompleted;", "", "onOpen", "", "app_debug"})
        public static abstract interface OnCompleted {
            
            public abstract void onOpen();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyMoneyDialog$Builder$Companion;", "", "()V", "D_1000", "", "D_10000", "D_100000", "D_2000", "D_20000", "D_200000", "D_5000", "D_50000", "D_500000", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}