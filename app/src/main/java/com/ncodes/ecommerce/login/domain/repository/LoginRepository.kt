package com.ncodes.ecommerce.login.domain.repository

interface LoginRepository {
    suspend fun isValidUser()
}