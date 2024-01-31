package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\b\u00f8\u0001\u0000\u001a?\u0010\f\u001a\u00020\r*\u00020\u000e2\b\b\u0002\u0010\b\u001a\u00020\t2#\b\u0004\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00070\u0010H\u0086\b\u00f8\u0001\u0000\u001a=\u0010\u0015\u001a\u00020\r*\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2#\b\u0004\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00070\u0010H\u0086\b\u00f8\u0001\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0016"}, d2 = {"handlerDelayTimerEdit", "Ljava/util/Timer;", "getHandlerDelayTimerEdit", "()Ljava/util/Timer;", "setHandlerDelayTimerEdit", "(Ljava/util/Timer;)V", "handlerPostDelayedEdit", "", "delay", "", "onSuccess", "Lkotlin/Function0;", "doAfterTextChanged", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "onTextChangedDelayed", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "onTextChangeListener", "app_debug"})
public final class EditTextExtensionsKt {
    @org.jetbrains.annotations.NotNull
    private static java.util.Timer handlerDelayTimerEdit;
    
    /**
     * Add an action which will be invoked when the text is changing.
     *
     * @return the [EditText.onTextChangeListener] added to the [EditText]
     */
    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher doAfterTextChanged(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$doAfterTextChanged, long delay, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChangedDelayed) {
        return null;
    }
    
    /**
     * Add an action which will be invoked after the text changed.
     *
     * @return the [EditText.onTextChangeListener] added to the [EditText]
     */
    @org.jetbrains.annotations.NotNull
    public static final android.text.TextWatcher onTextChangeListener(@org.jetbrains.annotations.NotNull
    android.widget.EditText $this$onTextChangeListener, long delay, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTextChangedDelayed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Timer getHandlerDelayTimerEdit() {
        return null;
    }
    
    public static final void setHandlerDelayTimerEdit(@org.jetbrains.annotations.NotNull
    java.util.Timer p0) {
    }
    
    public static final void handlerPostDelayedEdit(long delay, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
}