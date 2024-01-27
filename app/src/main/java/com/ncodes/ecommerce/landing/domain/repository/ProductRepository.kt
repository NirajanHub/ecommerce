package com.ncodes.ecommerce.landing.domain.repository

import com.ncodes.ecommerce.landing.domain.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getAllProducts() : Flow<List<Product>>
//
//    suspend fun getProductById(id: Int): Product?
//
//    suspend fun insertProduct(product: Product)
//
//    suspend fun deleteProduct(product: Product)

}