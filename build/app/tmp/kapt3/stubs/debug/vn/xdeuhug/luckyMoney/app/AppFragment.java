package vn.xdeuhug.luckyMoney.app;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016\u00a8\u0006\u0017"}, d2 = {"Lvn/xdeuhug/luckyMoney/app/AppFragment;", "A", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "Lvn/xdeuhug/base/BaseFragment;", "Lvn/xdeuhug/base/action/ToastAction;", "Lcom/hjq/http/listener/OnHttpListener;", "", "()V", "hideDialog", "", "initView", "isShowDialog", "", "onHttpEnd", "call", "Lokhttp3/Call;", "onHttpFail", "e", "Ljava/lang/Exception;", "onHttpStart", "onHttpSuccess", "result", "showDialog", "app_debug"})
public abstract class AppFragment<A extends vn.xdeuhug.luckyMoney.app.AppActivity> extends vn.xdeuhug.base.BaseFragment<A> implements vn.xdeuhug.base.action.ToastAction, com.hjq.http.listener.OnHttpListener<java.lang.Object> {
    
    public AppFragment() {
        super();
    }
    
    /**
     * 当前加载对话框是否在显示中
     */
    public boolean isShowDialog() {
        return false;
    }
    
    @java.lang.Override
    protected void initView() {
    }
    
    /**
     * 显示加载对话框
     */
    public void showDialog() {
    }
    
    /**
     * 隐藏加载对话框
     */
    public void hideDialog() {
    }
    
    /**
     * [OnHttpListener]
     */
    @java.lang.Override
    public void onHttpStart(@org.jetbrains.annotations.Nullable
    okhttp3.Call call) {
    }
    
    @java.lang.Override
    public void onHttpSuccess(@org.jetbrains.annotations.NotNull
    java.lang.Object result) {
    }
    
    @java.lang.Override
    public void onHttpFail(@org.jetbrains.annotations.NotNull
    java.lang.Exception e) {
    }
    
    @java.lang.Override
    public void onHttpEnd(@org.jetbrains.annotations.NotNull
    okhttp3.Call call) {
    }
    
    public void toast(@androidx.annotation.StringRes
    int id) {
    }
    
    public void toast(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence text) {
    }
    
    public void toast(@org.jetbrains.annotations.Nullable
    java.lang.Object object) {
    }
}