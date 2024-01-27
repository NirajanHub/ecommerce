package com.ncodes.ecommerce.common.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

class CustomShapes {
    companion object {

        @Composable
        fun Circle(size: Dp =12.dp, color: Color= Color.Blue,radius1 : Float = 28f,radius2 :Float , radius3: Float) {
            Canvas(modifier = Modifier.size(size).zIndex(2f), onDraw = {
                drawCircle(color = color, radius = radius1)
                drawCircle(color = Color.White, radius = radius2)
                drawCircle(color = color,radius = radius3)
            })
        }

        @Composable
        fun HorizontalLine(modifier: Modifier,
                           color: Color = Color.Blue,
                           ) {
            Canvas(modifier = modifier, onDraw = {
                drawLine(
                    start = Offset(0f,0f) ,
                    end = Offset((size.width - 2),0f) ,
                    strokeWidth = 5f ,
                    color = color,
                )
            })
        }
    }
}