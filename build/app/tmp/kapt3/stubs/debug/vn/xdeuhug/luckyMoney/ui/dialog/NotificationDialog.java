package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * @Author: NGUYEN THE DAT
 * @Date: 4/14/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog;", "", "()V", "Builder", "app_debug"})
public final class NotificationDialog {
    
    public NotificationDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "headerText", "", "messageText", "isCancelable", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/DialogNotificationBinding;", "onActionDone", "Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog$Builder$OnActionDone;", "getOnActionDone", "()Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog$Builder$OnActionDone;", "setOnActionDone", "(Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog$Builder$OnActionDone;)V", "OnActionDone", "app_debug"})
    public static final class Builder extends vn.xdeuhug.base.BaseDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder> {
        private vn.xdeuhug.luckyMoney.databinding.DialogNotificationBinding binding;
        public vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder.OnActionDone onActionDone;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String headerText, @org.jetbrains.annotations.NotNull
        java.lang.String messageText, boolean isCancelable) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder.OnActionDone getOnActionDone() {
            return null;
        }
        
        public final void setOnActionDone(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder.OnActionDone p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder onActionDone(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.ui.dialog.NotificationDialog.Builder.OnActionDone onActionDone) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/NotificationDialog$Builder$OnActionDone;", "", "onActionDone", "", "app_debug"})
        public static abstract interface OnActionDone {
            
            public abstract void onActionDone();
        }
    }
}