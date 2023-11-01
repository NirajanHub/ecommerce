package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.CustomText

@Composable
fun HomeTop() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, bottom = 10.dp,start = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    model = "https://img.freepik.com/free-photo/close-up-young-attractive-charismatic-woman-isolated_273609-35349.jpg?w=1800&t=st=1698791075~exp=1698791675~hmac=c44ea2d9835ffd7f0ffa502fa5b43e41fba226ad10e58e97a8a34386d91a0120",
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .width(30.dp)
                        .height(30.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                CustomText(
                    text = "Hi, User",
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
            Icon(
                painter = painterResource(id = R.drawable.ic_walmart),
                contentDescription = stringResource(
                    id = R.string.logo
                ),
                tint = Color.Yellow
            )
            Row(
                modifier = Modifier
                    .align(Alignment.CenterVertically),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(end = 10.dp)
                ) {
                    CustomText(
                        resId = R.font.aeonik_light,
                        text = "$499.60")
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy((-35).dp),
                    modifier = Modifier.padding(top = 0.dp),
                    verticalAlignment = Alignment.Top,
                ) {
                    Box()
                    {
                        Image(
                            painter = painterResource(id = R.drawable.ic_shopping_cart__outline),
                            contentDescription = "",
                            modifier = Modifier
                                .width(80.dp)
                                .height(40.dp)
                        )

                    }
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.defaultMinSize(20.dp,20.dp)
                            .clip(CircleShape)
                            .background(Color.Yellow)
                    ){
                        CustomText(
                            fontSize = 12.sp,
                            color = Color.Black,
                            text = "4",
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
fun HomeTopPreview() {
    HomeTop()
}