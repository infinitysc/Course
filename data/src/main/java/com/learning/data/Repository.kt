package com.learning.data

import com.learning.data.db.Database
import com.learning.data.network.NetworkRepository
import kotlinx.coroutines.runBlocking
import org.jetbrains.annotations.TestOnly
import javax.inject.Inject


class Repository @Inject constructor(val networkRepository: NetworkRepository,database: Database? = null)  {

    @TestOnly
    suspend fun checkFlow() {

    }


}