package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun HomeGridLayout() {
    Row {
        AsyncImage(
            model = "https://img.freepik.com/free-photo/side-view-kids-with-magnifying-glass_23-2149668696.jpg?w=1800&t=st=1698787004~exp=1698787604~hmac=a44d9dade0650a831cecf51947aa47fa13f2c56e2a2720fcce3cdd6e79cefa00",
            contentDescription = "Test_Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
        )
    }
}