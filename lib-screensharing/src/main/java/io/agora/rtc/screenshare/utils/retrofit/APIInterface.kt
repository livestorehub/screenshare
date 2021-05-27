package io.agora.rtc.screenshare.utils.retrofit

import io.agora.rtc.screenshare.model.ResponseCommon
import retrofit2.Call
import retrofit2.http.*


interface APIInterface {

    @FormUrlEncoded
    @POST("customer/auth/get-auth-token?")
    fun getAuthToken(@Field("enterprise_api_key") enterprise_api_key: String?,
                       @Field("enterprise_key") enterprise_key: String?,
                       @Field("enterprise_secret") enterprise_secret: String?,
                       @Field("customer_id") customer_id: String?,
                       @Field("customer_first_name") customer_first_name: String?,
                       @Field("customer_last_name") customer_last_name: String?,
                       @Field("customer_email") customer_email: String?,
                       @Field("customer_phone") customer_phone: String?,
    ): Call<ResponseCommon?>


    @GET("customer/agent/get-sales-agents")
    fun getSalesAgents(
        @Header("Authorization") Authorization: String
    ): Call<ResponseCommon?>

    @FormUrlEncoded
    @POST("customer/agent/get-connection-room")
    fun getConnectioRoom(
        @Header("Authorization") Authorization: String,
        @Field("agent_id") agent_id: String?,
    ): Call<ResponseCommon?>

    @FormUrlEncoded
    @POST("customer/site/save-token")
    fun saveAppToken(
        @Header("Authorization") Authorization: String,
        @Field("token") token: String?,
        @Field("device_type") device_type: String?
    ): Call<ResponseCommon?>


    @FormUrlEncoded
    @POST("customer/agent/end-call")
    fun endCall(
        @Header("Authorization") Authorization: String,
        @Field("room_id") room_id: String?,
    ): Call<ResponseCommon?>
}