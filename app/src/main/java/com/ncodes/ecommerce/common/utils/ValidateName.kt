package com.ncodes.ecommerce.common.utils

fun validateName(name: String): Boolean{
    val regex = Regex("[a-zA-Z]\\w{3,100}")
    return name.matches(regex)
}