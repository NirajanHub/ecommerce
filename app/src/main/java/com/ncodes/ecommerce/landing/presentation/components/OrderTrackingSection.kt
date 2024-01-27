package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.CustomText
import com.ncodes.ecommerce.common.components.CustomShapes

@Composable
fun OrderTrackingSection() {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth(),

        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start
    ) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Column(Modifier.weight(1f)) {
                Text(
                    stringResource(id = R.string.order_ontheway),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                )
                Text(
                    text = stringResource(
                        id = R.string.arrival,
                        "3am",
                        "4am"
                    ),//dynamically provide time
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                )
            }
            Button(
                onClick = { /*TODO*/ },
                contentPadding = PaddingValues(start = 10.dp, end = 10.dp),
            ) {
                Icon(Icons.Outlined.Place, contentDescription = "Place", tint = Color.White)
                CustomText(
                    text = stringResource(id = R.string.track),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }


}


@Preview
@Composable
fun Preview() {
    OrderTrackingSection()
}