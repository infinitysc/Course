package com.learning.data

import com.learning.data.db.Database
import com.learning.data.network.NetworkRepository
import javax.inject.Inject


class Repository @Inject constructor(val networkRepository: NetworkRepository,database: Database)  {

    fun t() {
        print("hello world")
    }


}