package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.ncodes.ecommerce.R

@Composable
fun HomeGridLayout() {
    Column {
        LazyRow(
            modifier = Modifier
                .padding(start = 10.dp, bottom = 10.dp, top = 10.dp)
        ) {
            items(10) {
                Card(
                    shape = RoundedCornerShape(20f),
                    modifier = Modifier
                        .background(Color.Transparent)
                        .padding(end = 10.dp, start = 10.dp)
                ) {
                    Column(
                        Modifier
                            .fillMaxSize()
                            .height(290.dp)
                            .width(320.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(10f)
                            )
                    ) {
                        AsyncImage(
                            model = "https://img.freepik.com/free-photo/side-view-kids-with-magnifying-glass_23-2149668696.jpg?w=1800&t=st=1698787004~exp=1698787604~hmac=a44d9dade0650a831cecf51947aa47fa13f2c56e2a2720fcce3cdd6e79cefa00",
                            contentDescription = "Test_Image",
                            modifier = Modifier.background(
                                color = Color.Transparent,
                            ),
                            contentScale = ContentScale.Fit,
                        )
                        ///Start of Text Part
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier

                                .padding(
                                    top = 10.dp,
                                    start = 10.dp
                                )
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = stringResource(R.string.free_assembly),
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                )
                                Text(text = stringResource(R.string.a_new_brand_that_looks_good))
                            }
                            IconButton(
                                onClick = {
                                }) {
                                Icon(
                                    Icons.Rounded.KeyboardArrowRight,
                                    contentDescription = "Favorite",
                                    tint = Color.Black
                                )
                            }
                        }
                    }
                }
            }
        }

    }
}