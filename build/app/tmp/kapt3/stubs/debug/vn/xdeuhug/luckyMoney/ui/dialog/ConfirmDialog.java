package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * @Author: Trần Tuấn Vũ
 * @Date: 11/01/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog;", "", "()V", "Builder", "app_debug"})
public final class ConfirmDialog {
    
    public ConfirmDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "headerText", "", "messageText", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/DialogConfirmBinding;", "onActionDone", "Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog$Builder$OnActionDone;", "getOnActionDone", "()Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog$Builder$OnActionDone;", "setOnActionDone", "(Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog$Builder$OnActionDone;)V", "OnActionDone", "app_debug"})
    public static final class Builder extends vn.xdeuhug.base.BaseDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder> {
        private vn.xdeuhug.luckyMoney.databinding.DialogConfirmBinding binding;
        public vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder.OnActionDone onActionDone;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String headerText, @org.jetbrains.annotations.NotNull
        java.lang.String messageText) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder.OnActionDone getOnActionDone() {
            return null;
        }
        
        public final void setOnActionDone(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder.OnActionDone p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder onActionDone(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.ConfirmDialog.Builder.OnActionDone onActionDone) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/ConfirmDialog$Builder$OnActionDone;", "", "onActionDone", "", "isConfirm", "", "app_debug"})
        public static abstract interface OnActionDone {
            
            public abstract void onActionDone(boolean isConfirm);
        }
    }
}