package com.learning.data

import com.learning.data.network.Client
import com.learning.data.network.NetworkRepository
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        runBlocking<Unit> {
            println(Client.createRequest().getCheck())
        }
    }
}