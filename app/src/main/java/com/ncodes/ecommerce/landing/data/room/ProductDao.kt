package com.ncodes.ecommerce.landing.data.room

import androidx.room.Dao
import androidx.room.Query
import com.ncodes.ecommerce.landing.domain.Product
import kotlinx.coroutines.flow.Flow
@Dao
interface ProductDao {
    @Query("Select * from Product")
    fun getProduct(): Flow<List<Product>>
}