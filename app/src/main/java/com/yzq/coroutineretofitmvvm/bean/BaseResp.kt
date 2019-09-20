package com.yzq.coroutineretofitmvvm.bean


data class BaseResp<T>(
    var code: Int = 0,
    var msg: String = "",
    var `data`: T
)