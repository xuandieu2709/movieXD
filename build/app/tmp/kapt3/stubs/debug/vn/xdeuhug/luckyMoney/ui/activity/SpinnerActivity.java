package vn.xdeuhug.luckyMoney.ui.activity;

import java.lang.System;

/**
 * @Author: NGUYEN XUAN DIEU
 * @Date: 11 / 01 / 2024
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0015J\b\u0010&\u001a\u00020#H\u0014J\b\u0010\'\u001a\u00020#H\u0014J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020#H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/SpinnerActivity;", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "()V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/ActivitySpinnerBinding;", "getBinding", "()Lvn/xdeuhug/luckyMoney/databinding/ActivitySpinnerBinding;", "setBinding", "(Lvn/xdeuhug/luckyMoney/databinding/ActivitySpinnerBinding;)V", "data", "Ljava/util/ArrayList;", "Lrubikstudio/library/model/LuckyItem;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "dialog", "Lvn/xdeuhug/luckyMoney/ui/dialog/NotHaveMoneyDialog$Builder;", "lengthMP3", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "twice", "", "create", "context", "Landroid/content/Context;", "musicID", "getLayoutView", "Landroid/view/View;", "getPosition1000Dong", "getRandomIndex", "getRandomMoneyInCache", "getRandomRound", "initData", "", "initDataList", "initView", "onDestroy", "onPause", "onResume", "playAudioPlayer", "setDataMoney", "app_debug"})
public final class SpinnerActivity extends vn.xdeuhug.luckyMoney.app.AppActivity {
    public vn.xdeuhug.luckyMoney.databinding.ActivitySpinnerBinding binding;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<rubikstudio.library.model.LuckyItem> data;
    private boolean twice = false;
    private android.media.MediaPlayer mediaPlayer;
    private vn.xdeuhug.luckyMoney.ui.dialog.NotHaveMoneyDialog.Builder dialog;
    private int lengthMP3 = 0;
    
    public SpinnerActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.databinding.ActivitySpinnerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.databinding.ActivitySpinnerBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<rubikstudio.library.model.LuckyItem> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<rubikstudio.library.model.LuckyItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = 33)
    @java.lang.Override
    protected void initView() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void playAudioPlayer() {
    }
    
    private final android.media.MediaPlayer create(android.content.Context context, int musicID) {
        return null;
    }
    
    @java.lang.Override
    protected void initData() {
    }
    
    private final void initDataList() {
    }
    
    private final void setDataMoney() {
    }
    
    private final int getRandomIndex() {
        return 0;
    }
    
    private final int getRandomRound() {
        return 0;
    }
    
    private final int getPosition1000Dong() {
        return 0;
    }
    
    private final int getRandomMoneyInCache() {
        return 0;
    }
}