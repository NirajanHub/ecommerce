package com.ncodes.ecommerce.landing.domain.usecases

import com.ncodes.ecommerce.landing.domain.Product
import com.ncodes.ecommerce.landing.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow

class GetAllProducts(private val productRepository: ProductRepository) {
    operator fun  invoke() : Flow<List<Product>> {
        return productRepository.getAllProducts()
    }
}