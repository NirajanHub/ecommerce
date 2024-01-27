package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.ncodes.ecommerce.common.CustomText

@Composable
fun Brands(title: String, sideTitle: String) {

    Column {
        Row(
            modifier = Modifier.padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomText(
                text = title,
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(end = 10.dp)
            )
            CustomText(
                text = sideTitle,
                style = TextStyle(
                    color = Color.LightGray,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        LazyRow {
            items(10) {
                BrandsComponent()
            }
        }

    }

}

@Composable
fun BrandsComponent() {
    AsyncImage(
        model = "https://cdn.sanity.io/images/kts928pd/production/254e805fc27df499af428dfa9fa9cdf9c119a7a3-1280x720.png",
        contentDescription = "brand image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(10.dp)
            .clip(CircleShape)
            .size(100.dp)// Adjust the corner radius as needed
    )
}


