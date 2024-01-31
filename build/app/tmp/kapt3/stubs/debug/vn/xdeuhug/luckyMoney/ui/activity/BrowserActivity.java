package vn.xdeuhug.luckyMoney.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u0003123B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\n\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0014J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020/H\u0016J\b\u00100\u001a\u00020 H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00064"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity;", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "Lvn/xdeuhug/luckyMoney/action/StatusAction;", "Lcom/scwang/smart/refresh/layout/listener/OnRefreshListener;", "()V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/ActivityBrowserBinding;", "browserView", "Lvn/xdeuhug/luckyMoney/widget/BrowserView;", "getBrowserView", "()Lvn/xdeuhug/luckyMoney/widget/BrowserView;", "browserView$delegate", "Lkotlin/Lazy;", "hintLayout", "Lvn/xdeuhug/luckyMoney/widget/StatusLayout;", "getHintLayout", "()Lvn/xdeuhug/luckyMoney/widget/StatusLayout;", "hintLayout$delegate", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "refreshLayout", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "getRefreshLayout", "()Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "refreshLayout$delegate", "getLayoutView", "Landroid/view/View;", "getStatusLayout", "initData", "", "initView", "onHttpFail", "e", "Ljava/lang/Exception;", "onHttpSuccess", "result", "", "onKeyDown", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onRefresh", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "reload", "AppBrowserChromeClient", "AppBrowserViewClient", "Companion", "app_debug"})
public final class BrowserActivity extends vn.xdeuhug.luckyMoney.app.AppActivity implements vn.xdeuhug.luckyMoney.action.StatusAction, com.scwang.smart.refresh.layout.listener.OnRefreshListener {
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.ui.activity.BrowserActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_KEY_IN_URL = "url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TITLE = "";
    private final kotlin.Lazy hintLayout$delegate = null;
    private final kotlin.Lazy progressBar$delegate = null;
    private final kotlin.Lazy refreshLayout$delegate = null;
    private final kotlin.Lazy browserView$delegate = null;
    private vn.xdeuhug.luckyMoney.databinding.ActivityBrowserBinding binding;
    
    public BrowserActivity() {
        super();
    }
    
    private final vn.xdeuhug.luckyMoney.widget.StatusLayout getHintLayout() {
        return null;
    }
    
    private final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    private final com.scwang.smart.refresh.layout.SmartRefreshLayout getRefreshLayout() {
        return null;
    }
    
    private final vn.xdeuhug.luckyMoney.widget.BrowserView getBrowserView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    @java.lang.Override
    protected void initView() {
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public vn.xdeuhug.luckyMoney.widget.StatusLayout getStatusLayout() {
        return null;
    }
    
    @java.lang.Override
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.Nullable
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override
    public void onHttpSuccess(@org.jetbrains.annotations.NotNull
    java.lang.Object result) {
    }
    
    @java.lang.Override
    public void onHttpFail(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
    }
    
    private final void reload() {
    }
    
    /**
     * [OnRefreshListener]
     */
    @java.lang.Override
    public void onRefresh(@org.jetbrains.annotations.NotNull
    com.scwang.smart.refresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    /**
     * 显示加载完成
     */
    public void showComplete() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public void showError(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
    }
    
    /**
     * 显示自定义提示
     */
    public void showLayout(@androidx.annotation.DrawableRes
    int drawableId, @androidx.annotation.StringRes
    int stringId, @org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
    }
    
    public void showLayout(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable drawable, @org.jetbrains.annotations.Nullable
    java.lang.CharSequence hint, @org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.widget.StatusLayout.OnRetryListener listener) {
    }
    
    /**
     * 显示加载中
     */
    public void showLoading(@androidx.annotation.RawRes
    int id) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J(\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016\u00a8\u0006\u0011"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity$AppBrowserViewClient;", "Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserViewClient;", "(Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity;)V", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "errorCode", "", "description", "failingUrl", "app_debug"})
    final class AppBrowserViewClient extends vn.xdeuhug.luckyMoney.widget.BrowserView.BrowserViewClient {
        
        public AppBrowserViewClient() {
            super();
        }
        
        /**
         * 网页加载错误时回调，这个方法会在 onPageFinished 之前调用
         */
        @java.lang.Override
        public void onReceivedError(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, int errorCode, @org.jetbrains.annotations.NotNull
        java.lang.String description, @org.jetbrains.annotations.NotNull
        java.lang.String failingUrl) {
        }
        
        /**
         * 开始加载网页
         */
        @java.lang.Override
        public void onPageStarted(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.Nullable
        android.graphics.Bitmap favicon) {
        }
        
        /**
         * 完成加载网页
         */
        @java.lang.Override
        public void onPageFinished(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.NotNull
        java.lang.String url) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016\u00a8\u0006\u0010"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity$AppBrowserChromeClient;", "Lvn/xdeuhug/luckyMoney/widget/BrowserView$BrowserChromeClient;", "view", "Lvn/xdeuhug/luckyMoney/widget/BrowserView;", "(Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity;Lvn/xdeuhug/luckyMoney/widget/BrowserView;)V", "onProgressChanged", "", "Landroid/webkit/WebView;", "newProgress", "", "onReceivedIcon", "icon", "Landroid/graphics/Bitmap;", "onReceivedTitle", "title", "", "app_debug"})
    final class AppBrowserChromeClient extends vn.xdeuhug.luckyMoney.widget.BrowserView.BrowserChromeClient {
        
        public AppBrowserChromeClient(@org.jetbrains.annotations.NotNull
        vn.xdeuhug.luckyMoney.widget.BrowserView view) {
            super(null);
        }
        
        /**
         * 收到网页标题
         */
        @java.lang.Override
        public void onReceivedTitle(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable
        java.lang.String title) {
        }
        
        @java.lang.Override
        public void onReceivedIcon(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable
        android.graphics.Bitmap icon) {
        }
        
        /**
         * 收到加载进度变化
         */
        @java.lang.Override
        public void onProgressChanged(@org.jetbrains.annotations.NotNull
        android.webkit.WebView view, int newProgress) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/BrowserActivity$Companion;", "", "()V", "INTENT_KEY_IN_URL", "", "TITLE", "start", "", "context", "Landroid/content/Context;", "url", "title", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
        }
    }
}