package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2018/12/2
 * desc   : 消息对话框
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/MessageDialog;", "", "()V", "Builder", "OnListener", "app_debug"})
public final class MessageDialog {
    
    public MessageDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/MessageDialog$Builder;", "Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listener", "Lvn/xdeuhug/luckyMoney/ui/dialog/MessageDialog$OnListener;", "messageView", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView$delegate", "Lkotlin/Lazy;", "create", "Lvn/xdeuhug/base/BaseDialog;", "onClick", "", "view", "Landroid/view/View;", "setListener", "setMessage", "text", "", "id", "", "app_debug"})
    public static final class Builder extends vn.xdeuhug.luckyMoney.ui.dialog.CommonDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.Builder> {
        private final kotlin.Lazy messageView$delegate = null;
        private vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.OnListener listener;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final android.widget.TextView getMessageView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.Builder setMessage(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.Builder setMessage(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.Builder setListener(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.OnListener listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.xdeuhug.base.BaseDialog create() {
            return null;
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/MessageDialog$OnListener;", "", "onCancel", "", "dialog", "Lvn/xdeuhug/base/BaseDialog;", "onConfirm", "app_debug"})
    public static abstract interface OnListener {
        
        /**
         * 点击确定时回调
         */
        public abstract void onConfirm(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.base.BaseDialog dialog);
        
        /**
         * 点击取消时回调
         */
        public abstract void onCancel(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.base.BaseDialog dialog);
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * 点击取消时回调
             */
            public static void onCancel(@org.jetbrains.annotations.NotNull
            vn.xdeuhug.luckyMoney.ui.dialog.MessageDialog.OnListener $this, @org.jetbrains.annotations.Nullable
            vn.xdeuhug.base.BaseDialog dialog) {
            }
        }
    }
}