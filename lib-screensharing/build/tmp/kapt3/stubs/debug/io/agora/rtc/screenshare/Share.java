package io.agora.rtc.screenshare;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\bJ\u0006\u0010\'\u001a\u00020\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lio/agora/rtc/screenshare/Share;", "", "context", "Landroid/content/Context;", "data", "Lio/agora/rtc/screenshare/model/CommonData;", "(Landroid/content/Context;Lio/agora/rtc/screenshare/model/CommonData;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "accessToken", "getAccessToken", "setAccessToken", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Lio/agora/rtc/screenshare/model/CommonData;", "setData", "(Lio/agora/rtc/screenshare/model/CommonData;)V", "handler", "Landroid/os/Handler;", "iRtcEngineEventHandler", "Lio/agora/rtc/IRtcEngineEventHandler;", "mListener", "Lio/agora/rtc/ss/ScreenSharingClient$IStateListener;", "endCall", "", "room_id", "getScreenDimensions", "Lio/agora/rtc/video/VideoEncoderConfiguration$VideoDimensions;", "joinChannel", "channelId", "showAlert", "message", "startShare", "Companion", "lib-screensharing_debug"})
public final class Share {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TAG = "Screenshare";
    private android.os.Handler handler;
    @org.jetbrains.annotations.NotNull()
    public static final io.agora.rtc.screenshare.Share.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static io.agora.rtc.ss.ScreenSharingClient mSSClient;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String accessToken = "";
    @org.jetbrains.annotations.Nullable()
    private io.agora.rtc.screenshare.model.CommonData data;
    private final io.agora.rtc.ss.ScreenSharingClient.IStateListener mListener = null;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private final io.agora.rtc.IRtcEngineEventHandler iRtcEngineEventHandler = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setTAG(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    public Share(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData data) {
        super();
    }
    
    public final void startShare() {
    }
    
    private final void joinChannel(java.lang.String channelId) {
    }
    
    private final io.agora.rtc.video.VideoEncoderConfiguration.VideoDimensions getScreenDimensions() {
        return null;
    }
    
    public final void showAlert(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    private final void endCall(java.lang.String room_id) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/agora/rtc/screenshare/Share$Companion;", "", "()V", "mSSClient", "Lio/agora/rtc/ss/ScreenSharingClient;", "getMSSClient", "()Lio/agora/rtc/ss/ScreenSharingClient;", "setMSSClient", "(Lio/agora/rtc/ss/ScreenSharingClient;)V", "lib-screensharing_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.agora.rtc.ss.ScreenSharingClient getMSSClient() {
            return null;
        }
        
        public final void setMSSClient(@org.jetbrains.annotations.Nullable()
        io.agora.rtc.ss.ScreenSharingClient p0) {
        }
    }
}