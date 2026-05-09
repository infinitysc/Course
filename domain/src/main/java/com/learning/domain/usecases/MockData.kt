package com.learning.domain.usecases

data class MockData(
    val mockId : Int,
    val mockTitle : String,
    val mockText : String,
    val mockPrice : Int,
    val mockRate : String,
    val mockStartDate : String,
    val mockHasLike : Boolean,
    val mockPublishDate : String,
    val name : String = ""
)
