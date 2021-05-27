package io.agora.rtc.screenshare.utils.retrofit

interface UploadCallbacks {
    fun onProgressUpdate(percentage: Int, request: String)
    fun onError()
    fun onFinish()
}