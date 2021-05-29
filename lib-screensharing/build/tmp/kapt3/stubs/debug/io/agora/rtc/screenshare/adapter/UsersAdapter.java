package io.agora.rtc.screenshare.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010&\u001a\u00020!H\u0016J\u0018\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020!H\u0017J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020!H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00060"}, d2 = {"Lio/agora/rtc/screenshare/adapter/UsersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "screen", "", "itemClick", "Lio/agora/rtc/screenshare/callback/OnItemClick;", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/String;Lio/agora/rtc/screenshare/callback/OnItemClick;)V", "builder", "Landroidx/appcompat/app/AlertDialog$Builder;", "getBuilder", "()Landroidx/appcompat/app/AlertDialog$Builder;", "setBuilder", "(Landroidx/appcompat/app/AlertDialog$Builder;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getScreen", "()Ljava/lang/String;", "setScreen", "(Ljava/lang/String;)V", "selected", "", "getSelected", "()I", "setSelected", "(I)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "lib-screensharing_debug"})
public final class UsersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog.Builder builder;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<java.lang.Object> list;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private io.agora.rtc.screenshare.callback.OnItemClick itemClick;
    private int selected = -1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String screen;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog.Builder getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog.Builder p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Object> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    public final int getSelected() {
        return 0;
    }
    
    public final void setSelected(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreen() {
        return null;
    }
    
    public final void setScreen(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public UsersAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Object> list, @org.jetbrains.annotations.NotNull()
    java.lang.String screen, @org.jetbrains.annotations.NotNull()
    io.agora.rtc.screenshare.callback.OnItemClick itemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/agora/rtc/screenshare/adapter/UsersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dataBinding", "Lio/agora/rtc/ss/databinding/RowUserViewBinding;", "(Lio/agora/rtc/screenshare/adapter/UsersAdapter;Lio/agora/rtc/ss/databinding/RowUserViewBinding;)V", "getDataBinding", "()Lio/agora/rtc/ss/databinding/RowUserViewBinding;", "setDataBinding", "(Lio/agora/rtc/ss/databinding/RowUserViewBinding;)V", "lib-screensharing_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private io.agora.rtc.ss.databinding.RowUserViewBinding dataBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.ss.databinding.RowUserViewBinding getDataBinding() {
            return null;
        }
        
        public final void setDataBinding(@org.jetbrains.annotations.NotNull()
        io.agora.rtc.ss.databinding.RowUserViewBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        io.agora.rtc.ss.databinding.RowUserViewBinding dataBinding) {
            super(null);
        }
    }
}