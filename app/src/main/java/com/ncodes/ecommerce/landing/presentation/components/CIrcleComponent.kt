package com.ncodes.ecommerce.landing.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.ncodes.ecommerce.common.components.CustomShapes

@Composable
fun CircleComponent(color: Color, showRadius: Boolean){
    if(showRadius){
        Column {
            CustomShapes.Circle(color = color, radius1 = 50f, radius2 = 40f, radius3 = 30f)
        }
    }else{
        Column {
            CustomShapes.Circle(color = color, radius1 = 10f, radius2 = 20f, radius3 = 30f)
        }
    }

}