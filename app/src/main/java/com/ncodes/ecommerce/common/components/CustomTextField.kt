package com.ncodes.ecommerce.common.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
                    text: String,
                    resource: Int,
                    enabled: Boolean = true,
                    maxLines: Int = 1,
                    modifier : Modifier,
                    onValueChanged: (String)->Unit
){
    Text(
        text = stringResource(id = resource),
        modifier = modifier
    )
    TextField(
        value = text,
        enabled = enabled,
        maxLines = maxLines,
        onValueChange = onValueChanged,
        singleLine = true,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
        textStyle = TextStyle()
    )
}