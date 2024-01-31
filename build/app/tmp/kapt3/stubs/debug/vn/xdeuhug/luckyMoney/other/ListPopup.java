package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject-Kotlin
 * time   : 2019/10/18
 * desc   : 列表弹窗
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0007"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup;", "", "()V", "Builder", "DividerItemDecoration", "MenuAdapter", "OnListener", "app_debug"})
public final class ListPopup {
    
    public ListPopup() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J$\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0006H\u0016J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bJ\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u001f\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c\"\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\u0012\u0010\u001a\u001a\u00020\u00002\n\u0010\u001f\u001a\u00020 \"\u00020\u0006J\u0016\u0010\u001a\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0002J\u0018\u0010\"\u001a\u00020\u00002\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup$Builder;", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow$Builder;", "Lvn/xdeuhug/base/BaseAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "positionChoose", "", "(Landroid/content/Context;I)V", "adapter", "Lvn/xdeuhug/luckyMoney/other/ListPopup$MenuAdapter;", "autoDismiss", "", "listener", "Lvn/xdeuhug/luckyMoney/other/ListPopup$OnListener;", "", "onItemClick", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "itemView", "Landroid/view/View;", "position", "setAutoDismiss", "dismiss", "setGravity", "gravity", "setList", "data", "", "", "([Ljava/lang/String;)Lvn/xdeuhug/luckyMoney/other/ListPopup$Builder;", "ids", "", "", "setListener", "app_debug"})
    public static final class Builder extends vn.xdeuhug.luckyMoney.other.BasePopupWindow.Builder<vn.xdeuhug.luckyMoney.other.ListPopup.Builder> implements vn.xdeuhug.base.BaseAdapter.OnItemClickListener {
        private vn.xdeuhug.luckyMoney.other.ListPopup.OnListener<java.lang.Object> listener;
        private boolean autoDismiss = true;
        private final vn.xdeuhug.luckyMoney.other.ListPopup.MenuAdapter adapter = null;
        
        public Builder(@org.jetbrains.annotations.NotNull
        android.content.Context context, int positionChoose) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.xdeuhug.luckyMoney.other.ListPopup.Builder setGravity(int gravity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ListPopup.Builder setList(@org.jetbrains.annotations.NotNull
        int... ids) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ListPopup.Builder setList(@org.jetbrains.annotations.NotNull
        java.lang.String... data) {
            return null;
        }
        
        private final vn.xdeuhug.luckyMoney.other.ListPopup.Builder setList(java.util.List<java.lang.Object> data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.xdeuhug.luckyMoney.other.ListPopup.Builder setAutoDismiss(boolean dismiss) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @kotlin.Suppress(names = {"UNCHECKED_CAST"})
        public final vn.xdeuhug.luckyMoney.other.ListPopup.Builder setListener(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.ListPopup.OnListener<? extends java.lang.Object> listener) {
            return null;
        }
        
        /**
         * [BaseAdapter.OnItemClickListener]
         */
        @java.lang.Override
        public void onItemClick(@org.jetbrains.annotations.Nullable
        androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable
        android.view.View itemView, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00060\rR\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup$MenuAdapter;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter;", "", "context", "Landroid/content/Context;", "positionChoose", "", "(Landroid/content/Context;I)V", "getPositionChoose", "()I", "setPositionChoose", "(I)V", "onCreateViewHolder", "Lvn/xdeuhug/luckyMoney/other/ListPopup$MenuAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
    static final class MenuAdapter extends vn.xdeuhug.luckyMoney.app.AppAdapter<java.lang.Object> {
        private int positionChoose;
        
        public MenuAdapter(@org.jetbrains.annotations.NotNull
        android.content.Context context, int positionChoose) {
            super(null);
        }
        
        public final int getPositionChoose() {
            return 0;
        }
        
        public final void setPositionChoose(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.xdeuhug.luckyMoney.other.ListPopup.MenuAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup$MenuAdapter$ViewHolder;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter$AppViewHolder;", "Lvn/xdeuhug/luckyMoney/app/AppAdapter;", "", "(Lvn/xdeuhug/luckyMoney/other/ListPopup$MenuAdapter;)V", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView$delegate", "Lkotlin/Lazy;", "onBindView", "", "position", "", "app_debug"})
        final class ViewHolder extends vn.xdeuhug.luckyMoney.app.AppAdapter<java.lang.Object>.AppViewHolder {
            private final kotlin.Lazy textView$delegate = null;
            
            public ViewHolder() {
                super(0);
            }
            
            private final android.widget.TextView getTextView() {
                return null;
            }
            
            @java.lang.Override
            public void onBindView(int position) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup$DividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "divider", "Landroid/graphics/drawable/Drawable;", "dividerHeight", "", "dividerColor", "padding", "(Landroid/graphics/drawable/Drawable;III)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_debug"})
    public static final class DividerItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private final android.graphics.drawable.Drawable divider = null;
        private final int dividerHeight = 0;
        private final int padding = 0;
        private final android.graphics.Paint paint = null;
        
        public DividerItemDecoration(@org.jetbrains.annotations.NotNull
        android.graphics.drawable.Drawable divider, int dividerHeight, int dividerColor, int padding) {
            super();
        }
        
        @java.lang.Override
        public void onDraw(@org.jetbrains.annotations.NotNull
        android.graphics.Canvas c, @org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.State state) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\'\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/ListPopup$OnListener;", "T", "", "onSelected", "", "popupWindow", "Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;", "position", "", "data", "(Lvn/xdeuhug/luckyMoney/other/BasePopupWindow;ILjava/lang/Object;)V", "app_debug"})
    public static abstract interface OnListener<T extends java.lang.Object> {
        
        /**
         * 选择条目时回调
         */
        public abstract void onSelected(@org.jetbrains.annotations.Nullable
        vn.xdeuhug.luckyMoney.other.BasePopupWindow popupWindow, int position, T data);
    }
}