package com.learning.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.learning.domain.usecases.MockData

@Entity
data class Element(
    @PrimaryKey
    val id : Int,
    val title : String,
    val text : String,
    val price : Int,
    val rate : String,
    val startDate : String,
    val hasLike : Boolean,
    val publishDate : String,
    val name : String,
){
    fun toData() : MockData {
        return MockData(
            mockId = this.id,
            mockTitle = this.title,
            mockText = this.text,
            mockPrice = this.price,
            mockRate = this.rate,
            mockStartDate = this.startDate,
            mockHasLike = this.hasLike,
            mockPublishDate = this.publishDate,
        )
    }
}

