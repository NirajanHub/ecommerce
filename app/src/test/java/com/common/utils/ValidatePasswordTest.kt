package com.common.utils

import com.common.TestStrings
import com.ncodes.ecommerce.common.utils.validatePassword
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ValidatePasswordTest {

    @Test
    fun `validate Password with wrong data`(){
        //Arrange
        //Act
        val validPass = validatePassword(TestStrings.wrongPass)
        //Assert
        assertEquals(false,validPass)
    }
    @Test
    fun `validate Password with right data`(){
        //less than 50 characters
        //Arrange
        //Act
        val validPass = validatePassword(TestStrings.rightPass)
        //Assert
        assertEquals(true,validPass)
    }
}