package io.agora.rtc.screenshare.utils.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH&J\u001a\u0010\t\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bH&\u00a8\u0006\u000b"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/RetrofitCallInterface;", "", "onError", "", "error", "", "onFailure", "response", "Lretrofit2/Response;", "onSuccess", "Lio/agora/rtc/screenshare/model/ResponseCommon;", "lib-screensharing_debug"})
public abstract interface RetrofitCallInterface {
    
    public abstract void onSuccess(@org.jetbrains.annotations.Nullable()
    retrofit2.Response<io.agora.rtc.screenshare.model.ResponseCommon> response);
    
    public abstract void onFailure(@org.jetbrains.annotations.Nullable()
    retrofit2.Response<?> response);
    
    public abstract void onError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
}