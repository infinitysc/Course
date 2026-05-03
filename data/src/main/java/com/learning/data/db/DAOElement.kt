package com.learning.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface DAOElement {

    @Insert
    suspend fun insertListToDb(list : List<Element>)

    @Query("SELECT * FROM ELEMENT")
    fun getListFromDb() : Flow<List<Element>>


}