package com.learning.domain.usecases

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetElementsUseCase @Inject constructor(private val rep : MainRepository) {
    operator fun invoke() : Flow<List<MockData>> {
        return rep.getLocalData()
    }
}
