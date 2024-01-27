package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.CustomText
import com.ncodes.ecommerce.common.components.CustomShapes

@Composable
fun DeliveryTimeline() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(start = 15.dp, end = 20.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .zIndex(1f)
        ) {
            CircleComponent(color = Color.Blue, showRadius = false)
        }
        Box(
            modifier = Modifier
                .weight(14f)
                .zIndex(0f)
        ) {
            CustomShapes.HorizontalLine(
                modifier = Modifier.fillMaxWidth(),
                color = Color.Blue,
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .zIndex(1f)
        ) {
            CircleComponent(color = Color.Blue, showRadius = false)
        }

        Box(
            modifier = Modifier
                .weight(14f)
                .zIndex(0f)
        ) {
            CustomShapes.HorizontalLine(
                modifier = Modifier.fillMaxWidth(),
                color = Color.Blue,
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .zIndex(1f)
        ) {
            CircleComponent(color = Color.Blue, showRadius = true)
        }

        Box(modifier = Modifier.weight(14f)) {
            CustomShapes.HorizontalLine(
                modifier = Modifier.fillMaxWidth(),
                color = Color.Gray,
            )
        }

        Box {
            CircleComponent(color = Color.Gray, showRadius = false)
        }
    }

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 5.dp, end = 15.dp)
    ) {
        CustomText(
            text = stringResource(R.string.placed),
            modifier = Modifier.weight(2f),
            style = TextStyle(
                color = Color.Gray,
                textAlign = TextAlign.Start
            )
        )

        CustomText(
            text = stringResource(R.string.preparing),
            modifier = Modifier.weight(2f),
            style = TextStyle(
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        )

        CustomText(
            text = stringResource(R.string.on_the_way),
            modifier = Modifier.weight(2f),
            style = TextStyle(
                color = Color.Blue,
                textAlign = TextAlign.End
            )
        )
        CustomText(
            text = stringResource(R.string.delivered),
            modifier = Modifier.weight(2f),
            style = TextStyle(color = Color.Gray, textAlign = TextAlign.End)
        )
    }
}