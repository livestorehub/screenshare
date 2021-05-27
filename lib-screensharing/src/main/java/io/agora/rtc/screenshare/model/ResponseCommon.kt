package io.agora.rtc.screenshare.model

import android.os.Parcelable

import kotlinx.parcelize.Parcelize


@Parcelize
data class ResponseCommon(
    val status: Status,
    val data: CommonData?
) : Parcelable
