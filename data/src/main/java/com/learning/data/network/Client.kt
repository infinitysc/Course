package com.learning.data.network

import dagger.Module
import dagger.Provides
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object Client {

    private val baseUrl = "https://api.getpostman.com/"
    private val client = OkHttpClient.Builder()
        .build()

    private val retroClient = Retrofit.Builder()
        .client(client)
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun createRequest() = retroClient.create<Request>(Request::class.java)

}