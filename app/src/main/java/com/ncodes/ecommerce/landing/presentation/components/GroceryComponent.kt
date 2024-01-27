package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import coil.compose.AsyncImage
import com.ncodes.ecommerce.common.CustomText

@Composable
@Preview
fun GroceryComponent() {
    Column(
        modifier = Modifier
            .padding(top = 10.dp, end = 10.dp)
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black,
                disabledContainerColor = Color.Green,
                disabledContentColor = Color.Blue
            ), shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, Color.LightGray),
            modifier = Modifier.background(Color.White)
        ) {
            Column {
                Box(
                    Modifier
                        .padding(10.dp)
                        .fillMaxSize()
                ) {
                    AsyncImage(
                        modifier = Modifier
                            .height(150.dp)
                            .width(200.dp),
                        model = "https://i5.walmartimages.com/seo/Amazing-Andrea-Apple-Tree-Seeds-20-Seeds-Grow-Fresh-Apples_ff218043-bcd4-4437-8418-6631d8e97bb3.638ac0120ff05c8913e85ebb74f45f6c.jpeg?odnHeight=640&odnWidth=640&odnBg=FFFFFF",
                        contentDescription = "Item Image"
                    )
                    Button(
                        contentPadding = PaddingValues(
                            start = 10.dp,
                            end = 20.dp,
                            top = 10.dp,
                            bottom = 10.dp
                        ),
                        modifier = Modifier.align(Alignment.TopEnd),
                        onClick = {

                        },
                    ) {
                        Icon(
                            Icons.Filled.Add,
                            contentDescription = "Add to cart",
                            tint = Color.White
                        )
                        CustomText(
                            text = "Add",
                            style = androidx.compose.ui.text.TextStyle(
                                Color.White,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }
            CustomText(
                modifier = Modifier
                    .padding(10.dp)
                    .background(Color.White),
                style = androidx.compose.ui.text.TextStyle(color = Color.Gray, fontSize = 18.sp),
                text = "Final Cost by weight"
            )
            CustomText(
                text = "Gala Apples, 3lb Bag",
                modifier = Modifier.padding(start = 10.dp),
                style = androidx.compose.ui.text.TextStyle(
                    Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                ),
            )
            Row(
                modifier = Modifier.padding(start = 10.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomText(
                    text = "$4.67",
                    style = androidx.compose.ui.text.TextStyle(
                        Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    ),
                )
                CustomText(
                    text = "$2.27/lb",
                    modifier = Modifier.padding(start = 10.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        Color.Gray,
                        fontSize = 20.sp
                    )
                )
            }
            Divider(
                color = Color.LightGray,
                thickness = 2.dp,
                modifier = Modifier
                    .width(220.dp)
                    .padding(
                        top = 15.dp,
                        bottom = 10.dp
                    )
            )

            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomText(
                    text = "In stock",
                    style = androidx.compose.ui.text.TextStyle(
                        Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                CustomText(
                    text = "|",
                    modifier = Modifier.padding(start = 10.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Icon(
                    Icons.Outlined.Place,
                    contentDescription = "place",
                    tint = Color.Black,
                    modifier = Modifier.padding(start = 10.dp)
                )
                CustomText(
                    text = "S23",
                    modifier = Modifier.padding(start = 10.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        Color.Black,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }

}