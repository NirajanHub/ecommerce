package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.CustomText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeSearchBar(text: String = "") {
    Row(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .padding(bottom = 10.dp, top = 10.dp)
    ) {
        Box(modifier = Modifier
            .padding(10.dp)
            .weight(1f))
        TextField(
            value = text,
            onValueChange = {},
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search"
                )
            },
            placeholder = { CustomText(text = "Search everything at Walmart", style = TextStyle(color = Color.Gray)) },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.barcode),
                    contentDescription = "Barcode"
                )
            },
            singleLine = true,
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxWidth()
                .clip(CircleShape)
                .weight(20f)
                .background(color = Color.White)
        )
        Box(modifier = Modifier.weight(1f))
    }
}


@Composable
@Preview
fun SearchPreview() {
    HomeSearchBar()
}