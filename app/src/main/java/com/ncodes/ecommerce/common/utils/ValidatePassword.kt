package com.ncodes.ecommerce.common.utils

fun validatePassword(password: String): Boolean{
    val regex = Regex(".{3,50}$")
    return regex.containsMatchIn(password)
}