package io.agora.rtc.screenshare.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Status(
    val code: String?,
    val error: String?,
    val message: String?,
    val msg: String?
) : Parcelable