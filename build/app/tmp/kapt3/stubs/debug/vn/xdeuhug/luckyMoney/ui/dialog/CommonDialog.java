package vn.xdeuhug.luckyMoney.ui.dialog;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/09/21
 * desc   : 项目通用 Dialog 布局封装
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog;", "", "()V", "Builder", "app_debug"})
public final class CommonDialog {
    
    public CommonDialog() {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST", "LeakingThis"})
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020&J\u0013\u0010\'\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\r\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\r\u00a2\u0006\u0002\u0010)J\u0013\u0010,\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\r\u00a2\u0006\u0002\u0010)J\u0015\u0010-\u001a\u00028\u00002\b\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0002\u00100J\u0015\u0010-\u001a\u00028\u00002\b\b\u0001\u00101\u001a\u000202\u00a2\u0006\u0002\u00103J\u0015\u00104\u001a\u00028\u00002\b\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0002\u00100J\u0015\u00104\u001a\u00028\u00002\b\b\u0001\u00101\u001a\u000202\u00a2\u0006\u0002\u00103J\u0015\u00105\u001a\u00028\u00002\b\u00106\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u00107J\u0015\u00105\u001a\u00028\u00002\b\b\u0001\u00101\u001a\u000202\u00a2\u0006\u0002\u00103J\u0015\u00108\u001a\u00028\u00002\b\u0010.\u001a\u0004\u0018\u00010/\u00a2\u0006\u0002\u00100J\u0015\u00108\u001a\u00028\u00002\b\b\u0001\u00101\u001a\u000202\u00a2\u0006\u0002\u00103J\u0013\u00109\u001a\u00028\u00002\u0006\u0010(\u001a\u00020\r\u00a2\u0006\u0002\u0010)R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b!\u0010\u0011R\u001d\u0010#\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b$\u0010\u001e\u00a8\u0006:"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "B", "Lvn/xdeuhug/base/BaseDialog$Builder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionView", "Landroid/widget/LinearLayout;", "getActionView", "()Landroid/widget/LinearLayout;", "actionView$delegate", "Lkotlin/Lazy;", "autoDismiss", "", "cancelView", "Landroid/widget/TextView;", "getCancelView", "()Landroid/widget/TextView;", "cancelView$delegate", "confirmView", "getConfirmView", "confirmView$delegate", "containerLayout", "Landroid/view/ViewGroup;", "getContainerLayout", "()Landroid/view/ViewGroup;", "containerLayout$delegate", "lineView", "Landroid/view/View;", "getLineView", "()Landroid/view/View;", "lineView$delegate", "titleView", "getTitleView", "titleView$delegate", "viewTitle", "getViewTitle", "viewTitle$delegate", "", "setActionView", "boolean", "(Z)Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "setAutoDismiss", "dismiss", "setButtonView", "setCancel", "text", "", "(Ljava/lang/CharSequence;)Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "id", "", "(I)Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "setConfirm", "setCustomView", "view", "(Landroid/view/View;)Lvn/xdeuhug/luckyMoney/ui/dialog/CommonDialog$Builder;", "setTitle", "setTitleView", "app_debug"})
    public static class Builder<B extends vn.xdeuhug.luckyMoney.ui.dialog.CommonDialog.Builder<B>> extends vn.xdeuhug.base.BaseDialog.Builder<B> {
        private boolean autoDismiss = true;
        private final kotlin.Lazy containerLayout$delegate = null;
        private final kotlin.Lazy titleView$delegate = null;
        private final kotlin.Lazy cancelView$delegate = null;
        private final kotlin.Lazy lineView$delegate = null;
        private final kotlin.Lazy confirmView$delegate = null;
        private final kotlin.Lazy actionView$delegate = null;
        private final kotlin.Lazy viewTitle$delegate = null;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
        
        private final android.view.ViewGroup getContainerLayout() {
            return null;
        }
        
        private final android.widget.TextView getTitleView() {
            return null;
        }
        
        private final android.widget.TextView getCancelView() {
            return null;
        }
        
        private final android.view.View getLineView() {
            return null;
        }
        
        private final android.widget.TextView getConfirmView() {
            return null;
        }
        
        private final android.widget.LinearLayout getActionView() {
            return null;
        }
        
        private final android.view.View getViewTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setCustomView(@androidx.annotation.LayoutRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setCustomView(@org.jetbrains.annotations.Nullable
        android.view.View view) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setActionView(boolean p0_32355860) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setTitleView(boolean p0_32355860) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setButtonView(boolean p0_32355860) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setTitle(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setTitle(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setCancel(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setCancel(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setConfirm(@androidx.annotation.StringRes
        int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setConfirm(@org.jetbrains.annotations.Nullable
        java.lang.CharSequence text) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final B setAutoDismiss(boolean dismiss) {
            return null;
        }
        
        public final void autoDismiss() {
        }
    }
}