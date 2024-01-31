package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/02/27
 * desc   : 输入对话框
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/InputDialog;", "", "()V", "Builder", "OnListener", "app_debug"})
public final class InputDialog {
    
    public InputDialog() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0018J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u0018J\u0010\u0010#\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/InputDialog$Builder;", "Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "Lvn/xdeuhug/base/BaseDialog$OnShowListener;", "Landroid/widget/TextView$OnEditorActionListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "inputView", "Lvn/xdeuhug/widget/view/RegexEditText;", "getInputView", "()Lvn/xdeuhug/widget/view/RegexEditText;", "inputView$delegate", "Lkotlin/Lazy;", "listener", "Lvn/xdeuhug/luckyMoney/ui/dialog/InputDialog$OnListener;", "onClick", "", "view", "Landroid/view/View;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "onShow", "dialog", "Lvn/xdeuhug/base/BaseDialog;", "setContent", "text", "", "id", "setHint", "setInputRegex", "regex", "", "setListener", "app_debug"})
    public static final class Builder extends vn.xdeuhug.luckyMoney.ui.dialog.CommonDialog.Builder<vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder> implements vn.xdeuhug.base.BaseDialog.OnShowListener, android.widget.TextView.OnEditorActionListener {
        private final kotlin.Lazy inputView$delegate = null;
        private vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.OnListener listener;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final vn.xdeuhug.widget.view.RegexEditText getInputView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setHint(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setHint(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setContent(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setContent(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setInputRegex(@org.jetbrains.annotations.Nullable
        java.lang.String regex) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.Builder setListener(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.OnListener listener) {
            return null;
        }
        
        /**
         * [BaseDialog.OnShowListener]
         */
        @java.lang.Override
        public void onShow(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.base.BaseDialog dialog) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view) {
        }
        
        /**
         * [TextView.OnEditorActionListener]
         */
        @java.lang.Override
        public boolean onEditorAction(@org.jetbrains.annotations.Nullable
        android.widget.TextView v, int actionId, @org.jetbrains.annotations.Nullable
        android.view.KeyEvent event) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/InputDialog$OnListener;", "", "onCancel", "", "dialog", "Lvn/xdeuhug/base/BaseDialog;", "onConfirm", "content", "", "app_debug"})
    public static abstract interface OnListener {
        
        /**
         * 点击确定时回调
         */
        public abstract void onConfirm(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.base.BaseDialog dialog, @org.jetbrains.annotations.NotNull
        java.lang.String content);
        
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
            vn.xdeuhug.luckyMoney.ui.dialog.InputDialog.OnListener $this, @org.jetbrains.annotations.Nullable
            vn.xdeuhug.base.BaseDialog dialog) {
            }
        }
    }
}