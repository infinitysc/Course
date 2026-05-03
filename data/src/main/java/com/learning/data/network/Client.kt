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

    private const val BASE_URL = "https://10.0.2.2:3000/"

    @Provides
    @Singleton
    fun provideOkhttpClient() : OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitClient(client: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .client(client)
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun createRequest(retrofitClient : Retrofit): Request {
        return retrofitClient.create<Request>(Request::class.java)
    }

}