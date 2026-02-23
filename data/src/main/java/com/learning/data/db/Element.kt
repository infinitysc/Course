package com.learning.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

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
)

