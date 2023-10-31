package com.ncodes.ecommerce.login.presentation.login

import com.ncodes.ecommerce.landing.domain.Product

data class LoginStates(
    val productList: List<Product> = emptyList()
)