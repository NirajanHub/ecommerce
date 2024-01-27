package com.login.presentation

sealed class LoginUiState<out Int> {
    data class Success<T>(val data: T) : LoginUiState<T>()
    data class Error<T>(val data: T) : LoginUiState<T>()
    object Loading:LoginUiState<Nothing>()
}