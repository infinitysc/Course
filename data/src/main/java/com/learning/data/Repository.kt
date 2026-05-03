package com.learning.data

import androidx.room.Database
import com.learning.data.db.DAOElement
import com.learning.data.db.Element
import com.learning.domain.usecases.MainRepository
import com.learning.domain.usecases.MockData
import com.learning.domain.usecases.NetworkRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class RepositoryImpl @Inject constructor(
    private val networkRepository: NetworkRepository,
    private val dao: DAOElement) : MainRepository {

    override suspend fun refreshElements() {
        try {
            val list = networkRepository.parseData().first()
            if(list.isNotEmpty()) {
                val entities = list.map{it.toElement()}
                dao.insertListToDb(entities)
            }
        }catch (e : Exception) {
            e.printStackTrace()
        }
    }
       override fun getLocalData(): Flow<List<MockData>> {
        return dao.getListFromDb().map { list ->
            list.map { it.toData() }
        }
    }

}

fun MockData.toElement() : Element {
   return Element(
        id = this.mockId,
        title = this.mockTitle,
        text = this.mockText,
        price = this.mockPrice,
        rate = this.mockRate,
        startDate = this.mockStartDate,
        hasLike = this.mockHasLike,
        publishDate = this.mockPublishDate,
        name = this.name)
}