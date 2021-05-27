package io.agora.rtc.screenshare.utils.retrofit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'Jp\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\'J&\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\'J\u001a\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J2\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0017"}, d2 = {"Lio/agora/rtc/screenshare/utils/retrofit/APIInterface;", "", "endCall", "Lretrofit2/Call;", "Lio/agora/rtc/screenshare/model/ResponseCommon;", "Authorization", "", "room_id", "getAuthToken", "enterprise_api_key", "enterprise_key", "enterprise_secret", "customer_id", "customer_first_name", "customer_last_name", "customer_email", "customer_phone", "getConnectioRoom", "agent_id", "getSalesAgents", "saveAppToken", "token", "device_type", "lib-screensharing_debug"})
public abstract interface APIInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/auth/get-auth-token?")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<io.agora.rtc.screenshare.model.ResponseCommon> getAuthToken(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "enterprise_api_key")
    java.lang.String enterprise_api_key, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "enterprise_key")
    java.lang.String enterprise_key, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "enterprise_secret")
    java.lang.String enterprise_secret, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "customer_id")
    java.lang.String customer_id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "customer_first_name")
    java.lang.String customer_first_name, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "customer_last_name")
    java.lang.String customer_last_name, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "customer_email")
    java.lang.String customer_email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "customer_phone")
    java.lang.String customer_phone);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "customer/agent/get-sales-agents")
    public abstract retrofit2.Call<io.agora.rtc.screenshare.model.ResponseCommon> getSalesAgents(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/agent/get-connection-room")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<io.agora.rtc.screenshare.model.ResponseCommon> getConnectioRoom(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "agent_id")
    java.lang.String agent_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/site/save-token")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<io.agora.rtc.screenshare.model.ResponseCommon> saveAppToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String device_type);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "customer/agent/end-call")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<io.agora.rtc.screenshare.model.ResponseCommon> endCall(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "room_id")
    java.lang.String room_id);
}