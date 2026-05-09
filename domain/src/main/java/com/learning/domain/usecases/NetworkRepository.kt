package com.learning.domain.usecases

import kotlinx.coroutines.flow.Flow

interface NetworkRepository {
    fun parseData() : Flow<List<MockData>>
}