package io.agora.rtc.screenshare.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u00059:;<=Bq\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u001d\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0087\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020-H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-H\u00d6\u0001R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006>"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData;", "Landroid/os/Parcelable;", "errorMsg", "", "msg", "customer", "Lio/agora/rtc/screenshare/model/CommonData$Customer;", "users", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "token", "agoraConfig", "Lio/agora/rtc/screenshare/model/CommonData$AgoraConfig;", "customerToken", "Lio/agora/rtc/screenshare/model/CommonData$CustomerToken;", "room", "Lio/agora/rtc/screenshare/model/CommonData$Room;", "agent", "(Ljava/lang/String;Ljava/lang/String;Lio/agora/rtc/screenshare/model/CommonData$Customer;Ljava/util/ArrayList;Ljava/lang/String;Lio/agora/rtc/screenshare/model/CommonData$AgoraConfig;Lio/agora/rtc/screenshare/model/CommonData$CustomerToken;Lio/agora/rtc/screenshare/model/CommonData$Room;Lio/agora/rtc/screenshare/model/CommonData$Customer;)V", "getAgent", "()Lio/agora/rtc/screenshare/model/CommonData$Customer;", "getAgoraConfig", "()Lio/agora/rtc/screenshare/model/CommonData$AgoraConfig;", "getCustomer", "getCustomerToken", "()Lio/agora/rtc/screenshare/model/CommonData$CustomerToken;", "getErrorMsg", "()Ljava/lang/String;", "getMsg", "getRoom", "()Lio/agora/rtc/screenshare/model/CommonData$Room;", "getToken", "getUsers", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "AgoraConfig", "Customer", "CustomerToken", "Image", "Room", "lib-screensharing_debug"})
public final class CommonData implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorMsg = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.Nullable()
    private final io.agora.rtc.screenshare.model.CommonData.Customer customer = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<io.agora.rtc.screenshare.model.CommonData.Customer> users = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String token = null;
    @org.jetbrains.annotations.Nullable()
    private final io.agora.rtc.screenshare.model.CommonData.AgoraConfig agoraConfig = null;
    @org.jetbrains.annotations.Nullable()
    private final io.agora.rtc.screenshare.model.CommonData.CustomerToken customerToken = null;
    @org.jetbrains.annotations.Nullable()
    private final io.agora.rtc.screenshare.model.CommonData.Room room = null;
    @org.jetbrains.annotations.Nullable()
    private final io.agora.rtc.screenshare.model.CommonData.Customer agent = null;
    public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.agora.rtc.screenshare.model.CommonData copy(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Customer customer, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<io.agora.rtc.screenshare.model.CommonData.Customer> users, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.AgoraConfig agoraConfig, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.CustomerToken customerToken, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Room room, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Customer agent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CommonData(@org.jetbrains.annotations.Nullable()
    java.lang.String errorMsg, @org.jetbrains.annotations.Nullable()
    java.lang.String msg, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Customer customer, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<io.agora.rtc.screenshare.model.CommonData.Customer> users, @org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.AgoraConfig agoraConfig, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.CustomerToken customerToken, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Room room, @org.jetbrains.annotations.Nullable()
    io.agora.rtc.screenshare.model.CommonData.Customer agent) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Customer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Customer getCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<io.agora.rtc.screenshare.model.CommonData.Customer> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<io.agora.rtc.screenshare.model.CommonData.Customer> getUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.AgoraConfig component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.AgoraConfig getAgoraConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.CustomerToken component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.CustomerToken getCustomerToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Room component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Room getRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Customer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.agora.rtc.screenshare.model.CommonData.Customer getAgent() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.agora.rtc.screenshare.model.CommonData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final io.agora.rtc.screenshare.model.CommonData[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d5\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\t\u0010?\u001a\u00020:H\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020:H\u00d6\u0001R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017\u00a8\u0006F"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData$Customer;", "Landroid/os/Parcelable;", "id", "", "enterprise_id", "uuid", "customer_id", "username", "first_name", "last_name", "email", "phone", "device_type", "profile_pic", "Lio/agora/rtc/screenshare/model/CommonData$Image;", "status", "is_online", "is_available", "country_name", "onlineStatus", "availableStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/agora/rtc/screenshare/model/CommonData$Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvailableStatus", "()Ljava/lang/String;", "getCountry_name", "getCustomer_id", "getDevice_type", "getEmail", "getEnterprise_id", "getFirst_name", "getId", "getLast_name", "getOnlineStatus", "getPhone", "getProfile_pic", "()Lio/agora/rtc/screenshare/model/CommonData$Image;", "getStatus", "getUsername", "getUuid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "lib-screensharing_debug"})
    public static final class Customer implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String enterprise_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String uuid = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String customer_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String username = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String first_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String last_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String email = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String device_type = null;
        @org.jetbrains.annotations.Nullable()
        private final io.agora.rtc.screenshare.model.CommonData.Image profile_pic = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String is_online = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String is_available = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String country_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String onlineStatus = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String availableStatus = null;
        public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Customer> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.screenshare.model.CommonData.Customer copy(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String enterprise_id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String customer_id, @org.jetbrains.annotations.Nullable()
        java.lang.String username, @org.jetbrains.annotations.Nullable()
        java.lang.String first_name, @org.jetbrains.annotations.Nullable()
        java.lang.String last_name, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String device_type, @org.jetbrains.annotations.Nullable()
        io.agora.rtc.screenshare.model.CommonData.Image profile_pic, @org.jetbrains.annotations.Nullable()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.lang.String is_online, @org.jetbrains.annotations.Nullable()
        java.lang.String is_available, @org.jetbrains.annotations.Nullable()
        java.lang.String country_name, @org.jetbrains.annotations.Nullable()
        java.lang.String onlineStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String availableStatus) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Customer(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String enterprise_id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String customer_id, @org.jetbrains.annotations.Nullable()
        java.lang.String username, @org.jetbrains.annotations.Nullable()
        java.lang.String first_name, @org.jetbrains.annotations.Nullable()
        java.lang.String last_name, @org.jetbrains.annotations.Nullable()
        java.lang.String email, @org.jetbrains.annotations.Nullable()
        java.lang.String phone, @org.jetbrains.annotations.Nullable()
        java.lang.String device_type, @org.jetbrains.annotations.Nullable()
        io.agora.rtc.screenshare.model.CommonData.Image profile_pic, @org.jetbrains.annotations.Nullable()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.lang.String is_online, @org.jetbrains.annotations.Nullable()
        java.lang.String is_available, @org.jetbrains.annotations.Nullable()
        java.lang.String country_name, @org.jetbrains.annotations.Nullable()
        java.lang.String onlineStatus, @org.jetbrains.annotations.Nullable()
        java.lang.String availableStatus) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnterprise_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomer_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUsername() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFirst_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPhone() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDevice_type() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.agora.rtc.screenshare.model.CommonData.Image component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.agora.rtc.screenshare.model.CommonData.Image getProfile_pic() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String is_online() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String is_available() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOnlineStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAvailableStatus() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Customer> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Customer createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Customer[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u001f"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData$Image;", "Landroid/os/Parcelable;", "original", "", "size_29x29", "size_160x160", "size_200x200", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOriginal", "()Ljava/lang/String;", "getSize_160x160", "getSize_200x200", "getSize_29x29", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "lib-screensharing_debug"})
    public static final class Image implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String original = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String size_29x29 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String size_160x160 = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String size_200x200 = null;
        public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Image> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.screenshare.model.CommonData.Image copy(@org.jetbrains.annotations.Nullable()
        java.lang.String original, @org.jetbrains.annotations.Nullable()
        java.lang.String size_29x29, @org.jetbrains.annotations.Nullable()
        java.lang.String size_160x160, @org.jetbrains.annotations.Nullable()
        java.lang.String size_200x200) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Image(@org.jetbrains.annotations.Nullable()
        java.lang.String original, @org.jetbrains.annotations.Nullable()
        java.lang.String size_29x29, @org.jetbrains.annotations.Nullable()
        java.lang.String size_160x160, @org.jetbrains.annotations.Nullable()
        java.lang.String size_200x200) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getOriginal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSize_29x29() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSize_160x160() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSize_200x200() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Image> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Image createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Image[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00bd\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u00103\u001a\u000204H\u00d6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u000204H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u0006@"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData$AgoraConfig;", "Landroid/os/Parcelable;", "appId", "", "appCertificate", "defaultChannelName", "tokenExpireMins", "defaultVideoCallLimit", "defaultAudioCallLimit", "defaultChatCallLimit", "defaultVideoChatUserLimit", "defaultAudioChatUserLimit", "defaultTextChatUserLimit", "defaultChatUserLimit", "defaultLiveUserLimit", "customerKey", "customerSecret", "recordingBaseUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppCertificate", "()Ljava/lang/String;", "getAppId", "getCustomerKey", "getCustomerSecret", "getDefaultAudioCallLimit", "getDefaultAudioChatUserLimit", "getDefaultChannelName", "getDefaultChatCallLimit", "getDefaultChatUserLimit", "getDefaultLiveUserLimit", "getDefaultTextChatUserLimit", "getDefaultVideoCallLimit", "getDefaultVideoChatUserLimit", "getRecordingBaseUrl", "getTokenExpireMins", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "lib-screensharing_debug"})
    public static final class AgoraConfig implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String appId = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String appCertificate = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultChannelName = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String tokenExpireMins = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultVideoCallLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultAudioCallLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultChatCallLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultVideoChatUserLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultAudioChatUserLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultTextChatUserLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultChatUserLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String defaultLiveUserLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String customerKey = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String customerSecret = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String recordingBaseUrl = null;
        public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.AgoraConfig> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.screenshare.model.CommonData.AgoraConfig copy(@org.jetbrains.annotations.Nullable()
        java.lang.String appId, @org.jetbrains.annotations.Nullable()
        java.lang.String appCertificate, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChannelName, @org.jetbrains.annotations.Nullable()
        java.lang.String tokenExpireMins, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultVideoCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultAudioCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChatCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultVideoChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultAudioChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultTextChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultLiveUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String customerKey, @org.jetbrains.annotations.Nullable()
        java.lang.String customerSecret, @org.jetbrains.annotations.Nullable()
        java.lang.String recordingBaseUrl) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public AgoraConfig(@org.jetbrains.annotations.Nullable()
        java.lang.String appId, @org.jetbrains.annotations.Nullable()
        java.lang.String appCertificate, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChannelName, @org.jetbrains.annotations.Nullable()
        java.lang.String tokenExpireMins, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultVideoCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultAudioCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChatCallLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultVideoChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultAudioChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultTextChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultChatUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String defaultLiveUserLimit, @org.jetbrains.annotations.Nullable()
        java.lang.String customerKey, @org.jetbrains.annotations.Nullable()
        java.lang.String customerSecret, @org.jetbrains.annotations.Nullable()
        java.lang.String recordingBaseUrl) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppCertificate() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultChannelName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTokenExpireMins() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultVideoCallLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultAudioCallLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultChatCallLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultVideoChatUserLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultAudioChatUserLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultTextChatUserLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultChatUserLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDefaultLiveUserLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomerKey() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCustomerSecret() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRecordingBaseUrl() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.AgoraConfig> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.AgoraConfig createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.AgoraConfig[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0092\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\t\u00100\u001a\u00020\u000eH\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011\u00a8\u00067"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData$CustomerToken;", "Landroid/os/Parcelable;", "id", "", "uuid", "enterprise_id", "room_id", "user_type", "user_name", "stream_user_name", "rtc_token", "rtm_token", "screenshare_rtc_token", "user_uid", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getEnterprise_id", "()Ljava/lang/String;", "getId", "getRoom_id", "getRtc_token", "getRtm_token", "getScreenshare_rtc_token", "getStream_user_name", "getUser_name", "getUser_type", "getUser_uid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUuid", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/agora/rtc/screenshare/model/CommonData$CustomerToken;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "lib-screensharing_debug"})
    public static final class CustomerToken implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String uuid = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String enterprise_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String room_id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String user_type = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String user_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String stream_user_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rtc_token = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String rtm_token = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String screenshare_rtc_token = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer user_uid = null;
        public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.CustomerToken> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.screenshare.model.CommonData.CustomerToken copy(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String enterprise_id, @org.jetbrains.annotations.Nullable()
        java.lang.String room_id, @org.jetbrains.annotations.Nullable()
        java.lang.String user_type, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name, @org.jetbrains.annotations.Nullable()
        java.lang.String stream_user_name, @org.jetbrains.annotations.Nullable()
        java.lang.String rtc_token, @org.jetbrains.annotations.Nullable()
        java.lang.String rtm_token, @org.jetbrains.annotations.Nullable()
        java.lang.String screenshare_rtc_token, @org.jetbrains.annotations.Nullable()
        java.lang.Integer user_uid) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CustomerToken(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String enterprise_id, @org.jetbrains.annotations.Nullable()
        java.lang.String room_id, @org.jetbrains.annotations.Nullable()
        java.lang.String user_type, @org.jetbrains.annotations.Nullable()
        java.lang.String user_name, @org.jetbrains.annotations.Nullable()
        java.lang.String stream_user_name, @org.jetbrains.annotations.Nullable()
        java.lang.String rtc_token, @org.jetbrains.annotations.Nullable()
        java.lang.String rtm_token, @org.jetbrains.annotations.Nullable()
        java.lang.String screenshare_rtc_token, @org.jetbrains.annotations.Nullable()
        java.lang.Integer user_uid) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnterprise_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRoom_id() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUser_type() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUser_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStream_user_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRtc_token() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRtm_token() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getScreenshare_rtc_token() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUser_uid() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.CustomerToken> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.CustomerToken createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.CustomerToken[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006%"}, d2 = {"Lio/agora/rtc/screenshare/model/CommonData$Room;", "Landroid/os/Parcelable;", "id", "", "uuid", "channel_name", "chatLink", "videoLink", "audioLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioLink", "()Ljava/lang/String;", "getChannel_name", "getChatLink", "getId", "getUuid", "getVideoLink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "lib-screensharing_debug"})
    public static final class Room implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String id = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String uuid = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String channel_name = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String chatLink = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String videoLink = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String audioLink = null;
        public static final android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Room> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.agora.rtc.screenshare.model.CommonData.Room copy(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String channel_name, @org.jetbrains.annotations.Nullable()
        java.lang.String chatLink, @org.jetbrains.annotations.Nullable()
        java.lang.String videoLink, @org.jetbrains.annotations.Nullable()
        java.lang.String audioLink) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Room(@org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.Nullable()
        java.lang.String uuid, @org.jetbrains.annotations.Nullable()
        java.lang.String channel_name, @org.jetbrains.annotations.Nullable()
        java.lang.String chatLink, @org.jetbrains.annotations.Nullable()
        java.lang.String videoLink, @org.jetbrains.annotations.Nullable()
        java.lang.String audioLink) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getChannel_name() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getChatLink() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getVideoLink() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAudioLink() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<io.agora.rtc.screenshare.model.CommonData.Room> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Room createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final io.agora.rtc.screenshare.model.CommonData.Room[] newArray(int size) {
                return null;
            }
        }
    }
}