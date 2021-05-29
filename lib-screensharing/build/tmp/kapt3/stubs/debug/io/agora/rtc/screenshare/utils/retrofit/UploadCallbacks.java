package io.agora.rtc.screenshare.utils.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/UploadCallbacks;", "", "onError", "", "onFinish", "onProgressUpdate", "percentage", "", "request", "", "lib-screensharing_debug"})
public abstract interface UploadCallbacks {
    
    public abstract void onProgressUpdate(int percentage, @org.jetbrains.annotations.NotNull()
    java.lang.String request);
    
    public abstract void onError();
    
    public abstract void onFinish();
}