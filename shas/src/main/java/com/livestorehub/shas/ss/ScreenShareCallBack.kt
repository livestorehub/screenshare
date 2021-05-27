package com.livestorehub.shas.ss

import java.io.Serializable

interface ScreenShareCallBack : Serializable {
    fun callBack(result : Boolean);
}