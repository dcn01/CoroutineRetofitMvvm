package com.yzq.coroutineretofitmvvm

import com.yzq.coroutineretofitmvvm.bean.BaseResp
import com.yzq.coroutineretofitmvvm.bean.Fiction
import retrofit2.http.GET

interface ApiService {


    @GET("https://www.apiopen.top/novelApi")
    suspend fun getFictions(): BaseResp<List<Fiction>>


}