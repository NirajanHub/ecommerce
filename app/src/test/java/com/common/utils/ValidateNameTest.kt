package com.common.utils

import com.common.TestStrings
import com.ncodes.ecommerce.common.utils.validateName
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ValidateNameTest{
    @Test
    fun `wrong  name of user`(){
        //Arrange
        //Act
        val bool = validateName(TestStrings.wrongUserName)
        //Assert
        assertEquals(bool,false)
    }
    @Test
    fun `right  name of user`(){
        //Arrange
        //Act
        val bool = validateName(TestStrings.rightUserName)
        //Assert
        assertEquals(bool,true)
    }
}

