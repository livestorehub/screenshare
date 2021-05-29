package io.agora.rtc.screenshare.callback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lio/agora/rtc/screenshare/callback/OnItemClick;", "", "onItemClickCallBack", "", "data", "screen", "", "pos", "", "lib-screensharing_debug"})
public abstract interface OnItemClick {
    
    public abstract void onItemClickCallBack(@org.jetbrains.annotations.NotNull()
    java.lang.Object data, @org.jetbrains.annotations.NotNull()
    java.lang.String screen, int pos);
}