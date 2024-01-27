package com.ncodes.ecommerce.common

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.ncodes.ecommerce.R

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    text: String,
    resId: Int = R.font.aeonik_regular,
    style : TextStyle = TextStyle(fontSize = 14.sp, color = Color.White)
) {
    Text(
        text = text,
        fontFamily = FontFamily(
            Font(resId)
        ),
        modifier = modifier,
        style = style
    )
}

@Preview
@Composable
fun PreviewText() {
    Text("Test")
}

