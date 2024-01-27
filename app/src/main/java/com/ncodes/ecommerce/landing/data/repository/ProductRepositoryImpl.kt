package com.ncodes.ecommerce.landing.data.repository

import com.ncodes.ecommerce.landing.data.room.ProductDao
import com.ncodes.ecommerce.landing.domain.Product
import com.ncodes.ecommerce.landing.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow


class ProductRepositoryImpl(private val dao: ProductDao): ProductRepository {

    override fun getAllProducts(): Flow<List<Product>> {
        return dao.getProduct()
    }
}