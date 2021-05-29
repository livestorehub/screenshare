package io.agora.rtc.screenshare;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\u0006\u0010\'\u001a\u00020\u001bJ\u000e\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*J\u0012\u0010+\u001a\u00020\u001b2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J \u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lio/agora/rtc/screenshare/AgentListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lio/agora/rtc/screenshare/callback/OnItemClick;", "()V", "SPLASH_DELAY", "", "binding", "Lio/agora/rtc/ss/databinding/ActivityAgentListBinding;", "dialog", "Landroidx/appcompat/app/AlertDialog;", "getDialog", "()Landroidx/appcompat/app/AlertDialog;", "setDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "mDelayHandler", "Landroid/os/Handler;", "mRunnable", "Ljava/lang/Runnable;", "callProgressDailog", "", "activity", "Landroid/app/Activity;", "msg", "", "encode", "text", "getAgentList", "getAuthToken", "getConnectionRoom", "agent_id", "getToken", "hideProgressDialog", "onBack", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClickCallBack", "data", "screen", "pos", "", "saveAppToken", "token", "lib-screensharing_debug"})
public final class AgentListActivity extends androidx.appcompat.app.AppCompatActivity implements io.agora.rtc.screenshare.callback.OnItemClick {
    private io.agora.rtc.ss.databinding.ActivityAgentListBinding binding;
    private android.os.Handler mDelayHandler;
    private final long SPLASH_DELAY = 1000L;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Object> list;
    public androidx.appcompat.app.AlertDialog dialog;
    private final java.lang.Runnable mRunnable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Object> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAuthToken() {
    }
    
    private final void getToken() {
    }
    
    private final void saveAppToken(java.lang.String token) {
    }
    
    private final void getAgentList() {
    }
    
    private final java.lang.String encode(java.lang.String text) {
        return null;
    }
    
    public final void onBack(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onItemClickCallBack(@org.jetbrains.annotations.NotNull()
    java.lang.Object data, @org.jetbrains.annotations.NotNull()
    java.lang.String screen, int pos) {
    }
    
    private final void getConnectionRoom(java.lang.String agent_id) {
    }
    
    private final void callProgressDailog(android.app.Activity activity, java.lang.String msg) {
    }
    
    public final void hideProgressDialog() {
    }
    
    public AgentListActivity() {
        super();
    }
}