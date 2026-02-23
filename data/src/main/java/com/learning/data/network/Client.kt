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

    private const val BaseUrl = "http://localhost:3000/"
    private val client = OkHttpClient.Builder()
        .build()

    private val retroClient = Retrofit.Builder()
        .client(client)
        .baseUrl(BaseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun createRequest(): Request = retroClient.create<Request>(Request::class.java)

}