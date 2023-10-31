package com.ncodes.ecommerce.common

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ncodes.ecommerce.landing.domain.Product
import com.ncodes.ecommerce.landing.data.room.ProductDao

@Database(entities= [Product::class],version = 1, exportSchema = false)
abstract class EcommerceDatabase: RoomDatabase() {
    abstract val productDao: ProductDao

    companion object{
        const val DATABASE_NAME = "ecommerce_db"
    }
}