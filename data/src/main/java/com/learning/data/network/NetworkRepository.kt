package com.learning.data.network

import dagger.Module
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

@Module
class NetworkRepository @Inject constructor(val req : Request) {

    fun parseData() : Flow<List<MockData>> {
        return flow{
            req.getListData()
        }
    }

}