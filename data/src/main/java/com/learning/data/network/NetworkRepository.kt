package com.learning.data.network

import com.learning.domain.usecases.MockData
import com.learning.domain.usecases.NetworkRepository
import dagger.Module
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(val req : Request) : NetworkRepository{

    override fun parseData(): Flow<List<MockData>> {
        return flow {
            try {
                val response = req.getListData().map { it.toMockDataDomain() }
                emit(response)
            }catch (e : Exception) {
                emit(emptyList())
            }
        }.flowOn(Dispatchers.IO)
    }

}