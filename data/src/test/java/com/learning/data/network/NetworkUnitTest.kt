package com.learning.data.network

import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class NetworkUnitTest {
    @Test
    fun request_is_work() {
        runBlocking<Unit> {
            assertEquals(Client.createRequest().getCheck()[0],MockData(
                mockId = 100,
                mockTitle = "Java-разработчик с нуля",
                mockText = "Освойте backend-разработку и программирование на Java, фреймворки Spring и Maven, работу с базами данных и API. Создайте свой собственный проект, собрав портфолио и став востребованным специалистом для любой IT компании.",
                mockPrice = 999,
                mockRate = "4.9",
                mockStartDate = "2024-05-22",
                mockHasLike = false,
                mockPublishDate = "2024-02-02"
            ))
        }
    }
}