package com.learning.domain.usecases

import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun refreshElements()
    fun getLocalData() : Flow<List<MockData>>
}