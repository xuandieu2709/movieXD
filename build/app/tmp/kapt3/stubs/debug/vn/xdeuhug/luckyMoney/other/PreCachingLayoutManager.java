package vn.xdeuhug.luckyMoney.other;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0015J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010R\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/PreCachingLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "extraLayoutSpace", "getExtraLayoutSpace", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "smoothScrollToPosition", "recyclerView", "position", "supportsPredictiveItemAnimations", "Companion", "app_debug"})
public final class PreCachingLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private int extraLayoutSpace = -1;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    public static final vn.xdeuhug.luckyMoney.other.PreCachingLayoutManager.Companion Companion = null;
    private static final int DEFAULT_EXTRA_LAYOUT_SPACE = 600;
    
    public PreCachingLayoutManager(@org.jetbrains.annotations.NotNull
    android.content.Context context, int orientation, boolean reverseLayout) {
        super(null);
    }
    
    @java.lang.Override
    public void onLayoutChildren(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Recycler recycler, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    protected int getExtraLayoutSpace(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
        return 0;
    }
    
    @java.lang.Override
    public void smoothScrollToPosition(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state, int position) {
    }
    
    @java.lang.Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lvn/xdeuhug/luckyMoney/other/PreCachingLayoutManager$Companion;", "", "()V", "DEFAULT_EXTRA_LAYOUT_SPACE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}