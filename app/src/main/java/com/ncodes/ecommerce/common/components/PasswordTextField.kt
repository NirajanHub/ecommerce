package com.ncodes.ecommerce.common.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.ncodes.ecommerce.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(
    text: String,
    resource: Int,
    enabled: Boolean = true,
    maxLines: Int = 1,
    modifier: Modifier,
    onValueChanged: (String) -> Unit,
) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    Text(
        text = stringResource(id = resource),
        modifier = modifier
    )
    TextField(
        value = text,
        enabled = enabled,
        maxLines = maxLines,
        onValueChange = onValueChanged,
        textStyle = TextStyle(),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            TrailingIcon {
                passwordVisible = !passwordVisible
            }
        }
    )
}

@Composable
fun TrailingIcon(onClick: () -> Unit) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )
    }
}