package com.ncodes.ecommerce.login.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncodes.ecommerce.landing.domain.usecases.ProductUseCases
import com.ncodes.ecommerce.login.presentation.login.LoginStates
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val useCases: ProductUseCases): ViewModel(){

    private val _state = mutableStateOf(LoginStates())
    val state : State<LoginStates> = _state
    private var getProductsJob: Job? = null
    fun getAllProduct(){
        getProductsJob?.cancel()
        getProductsJob = useCases.getAllProducts().onEach { products ->
            _state.value = state.value.copy(
                productList = products
            )
        }.launchIn(viewModelScope)
    }
}