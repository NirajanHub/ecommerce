@file:OptIn(ExperimentalMaterial3Api::class)

package com.ncodes.ecommerce.landing.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.BottomNavItems
import com.ncodes.ecommerce.common.CustomText
import com.ncodes.ecommerce.common.Screens
import com.ncodes.ecommerce.common.components.BottomNavigationBar
import com.ncodes.ecommerce.landing.presentation.components.HomeGridLayout
import com.ncodes.ecommerce.landing.presentation.components.HomeSearchBar
import com.ncodes.ecommerce.landing.presentation.components.HomeTop

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingScreen(
    navController: NavController?
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp),
        bottomBar = {
            BottomNavigationBar(
                items = arrayListOf(
                    BottomNavItems(
                        "home",
                        route = Screens.LoginNav.route,
                        icon = Icons.Sharp.AccountBox,
                        badgeCount = 0
                    ),
                    BottomNavItems(
                        "home",
                        route = Screens.LoginNav.route,
                        icon = Icons.Sharp.AccountBox,
                        badgeCount = 12222
                    ),
                    BottomNavItems(
                        "home",
                        route = Screens.LoginNav.route,
                        icon = Icons.Sharp.AccountBox,
                        badgeCount = 1
                    ),
                    BottomNavItems(
                        "home",
                        route = Screens.LoginNav.route,
                        icon = Icons.Sharp.AccountBox,
                        badgeCount = 1222222222
                    )
                ),
                navController = navController!!,
                modifier = Modifier.padding(0.dp),
                onItemClick = {
                    navController.navigate(it.route)
                },
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                HomeTop()
                HomeSearchBar()
                HomeGridLayout()
            }
        }
    }
}




@Preview
@Composable
fun LandingPreview() {
    LandingScreen(navController = null)
}