package vn.xdeuhug.luckyMoney.widget;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 28/09/2022
 */
@kotlin.Suppress(names = {"SetJavaScriptEnabled"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003 !\"B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0012J\u0012\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001dH\u0017J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u001fH\u0017\u00a8\u0006#"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/BrowserView;", "Lvn/xdeuhug/widget/layout/NestedScrollWebView;", "Landroidx/lifecycle/LifecycleEventObserver;", "Lvn/xdeuhug/base/action/ActivityAction;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getUrl", "", "onDestroy", "", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "setBrowserChromeClient", "client", "Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserChromeClient;", "setBrowserViewClient", "Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserViewClient;", "setLifecycleOwner", "owner", "setWebChromeClient", "Landroid/webkit/WebChromeClient;", "setWebViewClient", "Landroid/webkit/WebViewClient;", "BrowserChromeClient", "BrowserViewClient", "Companion", "app_debug"})
public final class BrowserView extends vn.xdeuhug.widget.layout.NestedScrollWebView implements androidx.lifecycle.LifecycleEventObserver, vn.xdeuhug.base.action.ActivityAction {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.widget.BrowserView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public BrowserView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BrowserView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BrowserView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public BrowserView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(null, null, 0, 0);
    }
    
    /**
     * 获取当前的 url
     *
     * @return      返回原始的 url，因为有些url是被WebView解码过的
     */
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getUrl() {
        return null;
    }
    
    /**
     * 设置 WebView 生命管控（自动回调生命周期方法）
     */
    public final void setLifecycleOwner(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    /**
     * [LifecycleEventObserver]
     */
    @java.lang.Override
    public void onStateChanged(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner source, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle.Event event) {
    }
    
    /**
     * 销毁 WebView
     */
    public final void onDestroy() {
    }
    
    /**
     * 已过时
     */
    @java.lang.Override
    @java.lang.Deprecated
    public void setWebViewClient(@org.jetbrains.annotations.NotNull
    android.webkit.WebViewClient client) {
    }
    
    public final void setBrowserViewClient(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.BrowserView.BrowserViewClient client) {
    }
    
    /**
     * 已过时
     */
    @java.lang.Override
    @java.lang.Deprecated
    public void setWebChromeClient(@org.jetbrains.annotations.Nullable
    android.webkit.WebChromeClient client) {
    }
    
    public final void setBrowserChromeClient(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.BrowserView.BrowserChromeClient client) {
    }
    
    @org.jetbrains.annotations.Nullable
    public android.app.Activity getActivity() {
        return null;
    }
    
    public void startActivity(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    public void startActivity(@org.jetbrains.annotations.NotNull
    java.lang.Class<? extends android.app.Activity> clazz) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0017J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\u0018"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserViewClient;", "Landroid/webkit/WebViewClient;", "()V", "dialing", "", "view", "Landroid/webkit/WebView;", "url", "", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "shouldOverrideUrlLoading", "", "app_debug"})
    public static class BrowserViewClient extends android.webkit.WebViewClient {
        
        public BrowserViewClient() {
            super();
        }
        
        /**
         * 网站证书校验错误
         */
        @java.lang.Override
        public void onReceivedSslError(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        android.webkit.SslErrorHandler handler, @org.jetbrains.annotations.NotNull
        android.net.http.SslError error) {
        }
        
        /**
         * 同名 API 兼容
         */
        @java.lang.Override
        public void onReceivedError(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        android.webkit.WebResourceRequest request, @org.jetbrains.annotations.NotNull
        android.webkit.WebResourceError error) {
        }
        
        /**
         * 加载错误
         */
        @java.lang.Override
        @java.lang.Deprecated
        public void onReceivedError(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, int errorCode, @org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String failingUrl) {
        }
        
        /**
         * 同名 API 兼容
         */
        @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
        @java.lang.Override
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        android.webkit.WebResourceRequest request) {
            return false;
        }
        
        /**
         * 跳转到其他链接
         */
        @java.lang.Override
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
            return false;
        }
        
        /**
         * 跳转到拨号界面
         */
        private final void dialing(android.webkit.WebView view, java.lang.String url) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserChromeClient;", "Landroid/webkit/WebChromeClient;", "webView", "Lvn/xdeuhug/luckyMoney/widget/BrowserView;", "(Lvn/xdeuhug/luckyMoney/widget/BrowserView;)V", "onJsAlert", "", "view", "Landroid/webkit/WebView;", "url", "", "message", "result", "Landroid/webkit/JsResult;", "onJsConfirm", "onJsPrompt", "defaultValue", "Landroid/webkit/JsPromptResult;", "app_debug"})
    public static class BrowserChromeClient extends android.webkit.WebChromeClient {
        private final vn.xdeuhug.luckyMoney.widget.BrowserView webView = null;
        
        public BrowserChromeClient(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.widget.BrowserView webView) {
            super();
        }
        
        /**
         * 网页弹出警告框
         */
        @java.lang.Override
        public boolean onJsAlert(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.NotNull
        android.webkit.JsResult result) {
            return false;
        }
        
        /**
         * 网页弹出确定取消框
         */
        @java.lang.Override
        public boolean onJsConfirm(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.NotNull
        android.webkit.JsResult result) {
            return false;
        }
        
        /**
         * 网页弹出输入框
         */
        @java.lang.Override
        public boolean onJsPrompt(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String message, @org.jetbrains.annotations.NotNull
        java.lang.String defaultValue, @org.jetbrains.annotations.NotNull
        android.webkit.JsPromptResult result) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lvn/xdeuhug/luckyMoney/widget/BrowserView$Companion;", "", "()V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}