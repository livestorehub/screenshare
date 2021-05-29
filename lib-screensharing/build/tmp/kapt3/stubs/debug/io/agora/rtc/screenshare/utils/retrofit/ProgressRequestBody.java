package io.agora.rtc.screenshare.utils.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/ProgressRequestBody;", "Lokhttp3/RequestBody;", "mFile", "Ljava/io/File;", "content_type", "", "mListener", "Lio/agora/rtc/screenshare/utils/retrofit/UploadCallbacks;", "request_id", "(Ljava/io/File;Ljava/lang/String;Lio/agora/rtc/screenshare/utils/retrofit/UploadCallbacks;Ljava/lang/String;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "ProgressUpdater", "lib-screensharing_debug"})
public final class ProgressRequestBody extends okhttp3.RequestBody {
    private final java.io.File mFile = null;
    private final java.lang.String content_type = null;
    private final io.agora.rtc.screenshare.utils.retrofit.UploadCallbacks mListener = null;
    private final java.lang.String request_id = null;
    private static final int DEFAULT_BUFFER_SIZE = 2048;
    @org.jetbrains.annotations.NotNull()
    public static final io.agora.rtc.screenshare.utils.retrofit.ProgressRequestBody.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public long contentLength() throws java.io.IOException {
        return 0L;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) throws java.io.IOException {
    }
    
    public ProgressRequestBody(@org.jetbrains.annotations.NotNull()
    java.io.File mFile, @org.jetbrains.annotations.NotNull()
    java.lang.String content_type, @org.jetbrains.annotations.NotNull()
    io.agora.rtc.screenshare.utils.retrofit.UploadCallbacks mListener, @org.jetbrains.annotations.NotNull()
    java.lang.String request_id) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/ProgressRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "mUploaded", "", "mTotal", "(Lio/agora/rtc/screenshare/utils/retrofit/ProgressRequestBody;JJ)V", "run", "", "lib-screensharing_debug"})
    final class ProgressUpdater implements java.lang.Runnable {
        private final long mUploaded = 0L;
        private final long mTotal = 0L;
        
        @java.lang.Override()
        public void run() {
        }
        
        public ProgressUpdater(long mUploaded, long mTotal) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/ProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "lib-screensharing_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}