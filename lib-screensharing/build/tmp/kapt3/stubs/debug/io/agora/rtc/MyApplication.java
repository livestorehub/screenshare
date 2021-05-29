package io.agora.rtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lio/agora/rtc/MyApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "lib-screensharing_debug"})
public final class MyApplication extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static io.agora.rtc.screenshare.utils.retrofit.APIInterface apiInterface;
    @org.jetbrains.annotations.NotNull()
    public static final io.agora.rtc.MyApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/agora/rtc/MyApplication$Companion;", "", "()V", "apiInterface", "Lio/agora/rtc/screenshare/utils/retrofit/APIInterface;", "getApiInterface", "()Lio/agora/rtc/screenshare/utils/retrofit/APIInterface;", "setApiInterface", "(Lio/agora/rtc/screenshare/utils/retrofit/APIInterface;)V", "lib-screensharing_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final io.agora.rtc.screenshare.utils.retrofit.APIInterface getApiInterface() {
            return null;
        }
        
        public final void setApiInterface(@org.jetbrains.annotations.Nullable()
        io.agora.rtc.screenshare.utils.retrofit.APIInterface p0) {
        }
        
        private Companion() {
            super();
        }
    }
}