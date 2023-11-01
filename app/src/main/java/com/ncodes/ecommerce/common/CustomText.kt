package com.ncodes.ecommerce.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ncodes.ecommerce.R

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit = 14.sp,
    color: Color = Color.White,
    resId: Int = R.font.aeonik_regular,
    modifier: Modifier = Modifier.padding(0.dp)
) {
    Text(
        fontSize = fontSize,
        text = text,
        fontFamily = FontFamily(
            Font(resId)
        ),
        modifier = modifier,
        color = color,
    )
}

@Preview
@Composable
fun PreviewText() {
    Text("Test")
}

