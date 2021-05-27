package io.agora.rtc.screenshare.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CommonData (
    val errorMsg: String?,
    val msg: String?,
    val customer: Customer?,
    val users: ArrayList<Customer>?,
    val token: String?,
    val agoraConfig: AgoraConfig?,
    val customerToken: CustomerToken?,
    val room: Room?,
    val agent: Customer?,
) : Parcelable {
    @Parcelize
    data class Customer (
        val id: String?,
        val enterprise_id: String?,
        val uuid: String?,
        val customer_id: String?,
        val username: String?,
        val first_name: String?,
        val last_name: String?,
        val email: String?,
        val phone: String?,
        val device_type: String?,
        val profile_pic: Image?,
        val status: String?,
        val is_online: String?,
        val is_available: String?,
        val country_name: String?,
        val onlineStatus: String?,
        val availableStatus: String?,
    ): Parcelable

    @Parcelize
    data class Image (
        val original: String?,
        val size_29x29: String?,
        val size_160x160: String?,
        val size_200x200: String?
    ): Parcelable

    @Parcelize
    data class AgoraConfig (
        val appId: String?,
        val appCertificate: String?,
        val defaultChannelName: String?,
        val tokenExpireMins: String?,
        val defaultVideoCallLimit: String?,
        val defaultAudioCallLimit: String?,
        val defaultChatCallLimit: String?,
        val defaultVideoChatUserLimit: String?,
        val defaultAudioChatUserLimit: String?,
        val defaultTextChatUserLimit: String?,
        val defaultChatUserLimit: String?,
        val defaultLiveUserLimit: String?,
        val customerKey: String?,
        val customerSecret: String?,
        val recordingBaseUrl: String?
    ): Parcelable

    @Parcelize
    data class CustomerToken (
        val id: String?,
        val uuid: String?,
        val enterprise_id: String?,
        val room_id: String?,
        val user_type: String?,
        val user_name: String?,
        val stream_user_name: String?,
        val rtc_token: String?,
        val rtm_token: String?,
        val screenshare_rtc_token: String?,
        val user_uid: Int?
    ): Parcelable

    @Parcelize
    data class Room (
        val id: String?,
        val uuid: String?,
        val channel_name: String?,
        val chatLink: String?,
        val videoLink: String?,
        val audioLink: String?
    ): Parcelable

}