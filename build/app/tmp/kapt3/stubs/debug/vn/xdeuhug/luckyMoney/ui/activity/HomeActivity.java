package vn.xdeuhug.luckyMoney.ui.activity;

import java.lang.System;

/**
 * @Author: Nguyễn Xuân Diệu
 * @Date: 12/01/2023
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0015J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lvn/xdeuhug/luckyMoney/ui/activity/HomeActivity;", "Lvn/xdeuhug/luckyMoney/app/AppActivity;", "()V", "binding", "Lvn/xdeuhug/luckyMoney/databinding/HomeActivityBinding;", "getBinding", "()Lvn/xdeuhug/luckyMoney/databinding/HomeActivityBinding;", "setBinding", "(Lvn/xdeuhug/luckyMoney/databinding/HomeActivityBinding;)V", "countResume", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "music", "Lvn/xdeuhug/luckyMoney/model/eventbus/Music;", "twice", "", "getLayoutView", "Landroid/view/View;", "initData", "", "initView", "onDestroy", "onResume", "playAudioPlayer", "setClickButton", "app_debug"})
public final class HomeActivity extends vn.xdeuhug.luckyMoney.app.AppActivity {
    public vn.xdeuhug.luckyMoney.databinding.HomeActivityBinding binding;
    private boolean twice = false;
    private vn.xdeuhug.luckyMoney.model.eventbus.Music music;
    private android.media.MediaPlayer mediaPlayer;
    private int countResume = 0;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.xdeuhug.luckyMoney.databinding.HomeActivityBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    vn.xdeuhug.luckyMoney.databinding.HomeActivityBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected android.view.View getLayoutView() {
        return null;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    private final void playAudioPlayer() {
    }
    
    @androidx.annotation.RequiresApi(value = 33)
    @java.lang.Override
    protected void initView() {
    }
    
    private final void setClickButton() {
    }
    
    @java.lang.Override
    protected void initData() {
    }
}