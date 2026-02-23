package com.learning.data.network

import com.google.gson.annotations.SerializedName

data class MockData (
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
    /*@SerializedName("id")
    val mockFullName : String*/
)