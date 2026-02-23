package com.learning.data.network

import org.jetbrains.annotations.TestOnly
import retrofit2.http.GET


interface Request {

    @TestOnly
    @GET("obj")
    suspend fun getCheck() : List<MockData>

    @GET("obj")
    suspend fun getListData() : List<MockData>
}
