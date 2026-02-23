package com.learning.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAOElement {

    @Insert
    fun insertListToDb(list : List<Element>)

    @Query("SELECT * FROM ELEMENT")
    fun getListFromDb() : List<Element>


}