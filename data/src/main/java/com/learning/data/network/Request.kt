package com.learning.data.network

import retrofit2.http.GET


interface Request {

    @GET("mocks")
    suspend fun getCheck() : MockData


}
