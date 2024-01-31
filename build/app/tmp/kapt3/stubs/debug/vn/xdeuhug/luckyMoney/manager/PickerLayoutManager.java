package vn.xdeuhug.luckyMoney.manager;

import java.lang.System;

/**
 * author : 钉某人 & Android 轮子哥
 * github : https://github.com/DingMouRen/LayoutManagerGroup
 * time   : 2019/09/11
 * desc   : 选择器布局管理器
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002()B7\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u0012H\u0016J\u001c\u0010\u001a\u001a\u00020\u00162\n\u0010\u0018\u001a\u00060\u0019R\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J,\u0010\u001d\u001a\u00020\u00162\n\u0010\u0018\u001a\u00060\u0019R\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J(\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J(\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0018\u00010\u0019R\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\'\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "maxItem", "scale", "", "alpha", "(Landroid/content/Context;IZIFZ)V", "linearSnapHelper", "Landroidx/recyclerview/widget/LinearSnapHelper;", "listener", "Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager$OnPickerListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getPickedPosition", "isAutoMeasureEnabled", "onAttachedToWindow", "", "onDetachedFromWindow", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "onLayoutChildren", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onMeasure", "widthSpec", "heightSpec", "onScrollStateChanged", "scaleHorizontalChildView", "scaleVerticalChildView", "scrollHorizontallyBy", "dx", "scrollVerticallyBy", "dy", "setOnPickerListener", "Builder", "OnPickerListener", "app_debug"})
public final class PickerLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private final androidx.recyclerview.widget.LinearSnapHelper linearSnapHelper = null;
    private final int maxItem = 0;
    private final float scale = 0.0F;
    private final boolean alpha = false;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.OnPickerListener listener;
    
    private PickerLayoutManager(android.content.Context context, int orientation, boolean reverseLayout, int maxItem, float scale, boolean alpha) {
        super(null);
    }
    
    @java.lang.Override
    public void onAttachedToWindow(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    @java.lang.Override
    public void onDetachedFromWindow(@org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Recycler recycler) {
    }
    
    @java.lang.Override
    public boolean isAutoMeasureEnabled() {
        return false;
    }
    
    @java.lang.Override
    public void onMeasure(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state, int widthSpec, int heightSpec) {
    }
    
    @java.lang.Override
    public void onScrollStateChanged(int state) {
    }
    
    @java.lang.Override
    public void onLayoutChildren(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override
    public int scrollHorizontallyBy(int dx, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    @java.lang.Override
    public int scrollVerticallyBy(int dy, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.Nullable
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    /**
     * 横向情况下的缩放
     */
    private final void scaleHorizontalChildView() {
    }
    
    /**
     * 竖向方向上的缩放
     */
    private final void scaleVerticalChildView() {
    }
    
    /**
     * 获取选中的位置
     */
    public final int getPickedPosition() {
        return 0;
    }
    
    /**
     * 设置监听器
     */
    public final void setOnPickerListener(@org.jetbrains.annotations.Nullable
    vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.OnPickerListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager$OnPickerListener;", "", "onPicked", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "position", "", "app_debug"})
    public static abstract interface OnPickerListener {
        
        /**
         * 滚动停止时触发的监听
         *
         * @param recyclerView              RecyclerView 对象
         * @param position                  当前滚动的位置
         */
        public abstract void onPicked(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView recyclerView, int position);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alpha", "", "listener", "Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager$OnPickerListener;", "maxItem", "", "orientation", "reverseLayout", "scale", "", "build", "Lvn/xdeuhug/luckyMoney/manager/PickerLayoutManager;", "into", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "setAlpha", "setMaxItem", "setOnPickerListener", "setOrientation", "setReverseLayout", "setScale", "app_debug"})
    public static final class Builder {
        private final android.content.Context context = null;
        private int orientation = androidx.recyclerview.widget.LinearLayoutManager.VERTICAL;
        private boolean reverseLayout = false;
        private vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.OnPickerListener listener;
        private int maxItem = 3;
        private float scale = 0.6F;
        private boolean alpha = true;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super();
        }
        
        /**
         * 设置布局摆放器方向
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setOrientation(@androidx.recyclerview.widget.RecyclerView.Orientation
        int orientation) {
            return null;
        }
        
        /**
         * 设置是否反向显示
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setReverseLayout(boolean reverseLayout) {
            return null;
        }
        
        /**
         * 设置最大显示条目数
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setMaxItem(int maxItem) {
            return null;
        }
        
        /**
         * 设置缩放比例
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setScale(float scale) {
            return null;
        }
        
        /**
         * 设置透明开关
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setAlpha(boolean alpha) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.Builder setOnPickerListener(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.manager.PickerLayoutManager.OnPickerListener listener) {
            return null;
        }
        
        /**
         * 构建布局管理器
         */
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.manager.PickerLayoutManager build() {
            return null;
        }
        
        /**
         * 应用到 RecyclerView
         */
        public final void into(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView recyclerView) {
        }
    }
}