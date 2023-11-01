package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ncodes.ecommerce.common.CustomText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeSearchBar(text: String = "") {
    Box(
        modifier = Modifier.background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        TextField(
            value = text,
            onValueChange = {},
            leadingIcon = { Icons.Filled.Search },
            placeholder = { CustomText(text = "Search everything at Walmart") },
            trailingIcon = { Icons.Filled.Menu }

        )
    }
}


@Composable
@Preview
fun SearchPreview() {
    HomeSearchBar()
}