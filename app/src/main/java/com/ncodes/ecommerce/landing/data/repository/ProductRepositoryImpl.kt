package com.ncodes.ecommerce.landing.data.repository

import com.ncodes.ecommerce.landing.data.room.ProductDao
import com.ncodes.ecommerce.landing.domain.Product
import com.ncodes.ecommerce.landing.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow


class ProductRepositoryImpl(private val dao: ProductDao): ProductRepository {

        override fun getAllProducts(): Flow<List<Product>> {
        return dao.getProduct()
    }

//    override suspend fun insertProduct(product: Product) {
//        dao.insertProduct(product)
//    }
//
//    override suspend fun deleteProduct(product: Product) {
//        dao.deleteProduct(product = product)
//    }
//    override fun getAllProducts(): Flow<List<Product>> {
//        return dao.getProduct()
//    }
}