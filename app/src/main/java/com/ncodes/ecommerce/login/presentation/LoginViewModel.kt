package com.ncodes.ecommerce.login.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ncodes.ecommerce.common.utils.validateName
import com.ncodes.ecommerce.common.utils.validatePassword
import com.ncodes.ecommerce.landing.domain.repository.ProductRepository
import com.ncodes.ecommerce.login.domain.repository.LoginRepository
import com.ncodes.ecommerce.login.presentation.login.LoginStates
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginRepository: LoginRepository): ViewModel(){
    private var _validInput = MutableStateFlow(false)
    var validInput = _validInput
    private val viewModelJob = SupervisorJob()
    private val uiScope = CoroutineScope(Dispatchers.IO + viewModelJob)

    fun validateInput(userName: String, password: String):Boolean {
        val isUserNameValid = validateName(userName)
        val isPasswordValid = validatePassword(password)
        return isPasswordValid && isUserNameValid
    }
    fun login(userName: String,password: String){
        if(validateInput(userName,password)){
            uiScope.launch {
                loginRepository.isValidUser()
            }

        }else{

        }
    }

    override fun onCleared() {
        uiScope.cancel()
        super.onCleared()
    }

    private val _state = mutableStateOf(LoginStates())
    val state : State<LoginStates> = _state
    private var getProductsJob: Job? = null

}