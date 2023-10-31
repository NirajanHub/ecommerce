package com.ncodes.ecommerce.common

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItems(
    val name:String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0,
)
