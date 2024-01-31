package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 11 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog;", "", "()V", "Builder", "app_debug"})
public final class LuckyBoxDialog {
    
    public LuckyBoxDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/DialogLuckyBoxBinding;", "countClick", "", "onCompleted", "Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder$OnCompleted;", "getOnCompleted", "()Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder$OnCompleted;", "setOnCompleted", "(Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder$OnCompleted;)V", "OnCompleted", "app_debug"})
    public static final class Builder extends vn.xdeuhug.base.BaseDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder> {
        private vn.xdeuhug.luckyMoney.databinding.DialogLuckyBoxBinding binding;
        public vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder.OnCompleted onCompleted;
        private int countClick = 0;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder.OnCompleted getOnCompleted() {
            return null;
        }
        
        public final void setOnCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder.OnCompleted p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder onCompleted(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.LuckyBoxDialog.Builder.OnCompleted onCompleted) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/LuckyBoxDialog$Builder$OnCompleted;", "", "onOpen", "", "app_debug"})
        public static abstract interface OnCompleted {
            
            public abstract void onOpen();
        }
    }
}