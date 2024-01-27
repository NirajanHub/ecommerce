package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.CustomText


@Composable
fun HomeScrollingTopBar() {
    val size = stringArrayResource(id = R.array.home_top).size
    LazyRow(
        modifier = Modifier
            .background(color = Color.Blue)
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        item {
            Row(Modifier.padding(end = 5.dp)) {
                CustomText(text = stringResource(id = R.string.department))
                Icon(
                    painter = painterResource(id = R.drawable.ic_vertical),
                    tint = Color.White,
                    modifier = Modifier.height(20.dp),
                    contentDescription = "Separator"
                )
            }
        }
        items(size) {
            CustomText(
                resId = R.font.aeonik_light,
                text = stringArrayResource(id = R.array.home_top)[it],
                modifier = Modifier.padding(end = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewScrollingBar() {
    HomeScrollingTopBar()
}