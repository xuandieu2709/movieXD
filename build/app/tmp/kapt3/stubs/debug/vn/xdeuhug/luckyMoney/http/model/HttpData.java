package vn.xdeuhug.luckyMoney.http.model;

import java.lang.System;

/**
 * @Author: Bùi Hửu Thắng
 * @Date: 03/10/2022
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\tJ\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0011\u001a\u00020\u000fR\u0012\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lvn/xdeuhug/luckyMoney/http/model/HttpData;", "T", "", "()V", "data", "Ljava/lang/Object;", "message", "", "status", "", "getCode", "getData", "()Ljava/lang/Object;", "getMessage", "isRequestSucceed", "", "isRequestUnauthorized", "isTokenFailure", "app_debug"})
public class HttpData<T extends java.lang.Object> {
    private final int status = 0;
    private final java.lang.String message = null;
    private final T data = null;
    
    public HttpData() {
        super();
    }
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final T getData() {
        return null;
    }
    
    public final boolean isRequestSucceed() {
        return false;
    }
    
    public final boolean isRequestUnauthorized() {
        return false;
    }
    
    public final boolean isTokenFailure() {
        return false;
    }
}