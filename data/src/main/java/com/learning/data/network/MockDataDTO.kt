package com.learning.data.network

import com.google.gson.annotations.SerializedName
import com.learning.domain.usecases.MockData

data class MockDataDTO (
    @SerializedName("id")
    val mockId : Int,
    @SerializedName("title")
    val mockTitle : String,
    @SerializedName("text")
    val mockText : String,
    @SerializedName("price")
    val mockPrice : Int,
    @SerializedName("rate")
    val mockRate : String,
    @SerializedName("startDate")
    val mockStartDate : String,
    @SerializedName("hasLike")
    val mockHasLike : Boolean,
    @SerializedName("publishDate")
    val mockPublishDate : String,

){
    fun toMockDataDomain() : MockData{
        return MockData(
            mockId = mockId,
            mockTitle = mockTitle,
            mockText = mockText,
            mockPrice = mockPrice,
            mockRate = mockRate,
            mockStartDate = mockStartDate,
            mockHasLike = mockHasLike,
            mockPublishDate = mockPublishDate,
            )
    }
}