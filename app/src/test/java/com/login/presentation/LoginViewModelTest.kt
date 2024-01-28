package com.login.presentation

import com.common.TestStrings
import com.ncodes.ecommerce.login.data.repository.LoginRepositoryImpl
import com.ncodes.ecommerce.login.domain.repository.LoginRepository
import com.ncodes.ecommerce.login.presentation.LoginViewModel
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

//thingUnderTest_TriggerOfTest_ResultOfTest
class LoginViewModelTest  {
    private lateinit var loginViewModel: LoginViewModel

    private lateinit var loginRepository : LoginRepository
    @Before
    fun setUp(){
        loginRepository = LoginRepositoryImpl()
        loginViewModel = LoginViewModel(loginRepository)
    }
    @Test
    fun `validating user credential data with wrong input`(){
        //Arrange
        //Act
        val bool = loginViewModel.validateInput(TestStrings.wrongUserName,TestStrings.wrongPass)
        //Assert
        assertEquals(false, bool)
    }
    @Test
    fun `validating user credential data with right input`(){
        //Arrange
        //Act
        val bool = loginViewModel.validateInput(TestStrings.rightUserName,TestStrings.rightPass)
        //Assert
        assertEquals(true, bool)

    }

    @Test
    fun `login with wrong data`(){
        //loginViewModel.login("","")
    }

}