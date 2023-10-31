package com.ncodes.ecommerce.landing.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey
    val id: Int,
    val name:String,
    val price: Int,
    val category: String
)
