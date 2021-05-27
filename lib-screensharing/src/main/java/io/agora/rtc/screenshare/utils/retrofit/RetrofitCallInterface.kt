package io.agora.rtc.screenshare.utils.retrofit

import io.agora.rtc.screenshare.model.ResponseCommon
import retrofit2.Response

interface RetrofitCallInterface {
    fun onSuccess(response: Response<ResponseCommon?>?)
    fun onFailure(response: Response<*>?)
    fun onError(error: String?)
}