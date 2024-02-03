@file:OptIn(ExperimentalMaterial3Api::class)

package com.ncodes.ecommerce.landing.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ncodes.ecommerce.R
import com.ncodes.ecommerce.common.BottomNavItems
import com.ncodes.ecommerce.common.Screens
import com.ncodes.ecommerce.common.components.BottomNavigationBar
import com.ncodes.ecommerce.landing.presentation.components.Brands
import com.ncodes.ecommerce.landing.presentation.components.DeliveryTimeline
import com.ncodes.ecommerce.landing.presentation.components.HomeGridLayout
import com.ncodes.ecommerce.landing.presentation.components.HomeScrollingTopBar
import com.ncodes.ecommerce.landing.presentation.components.HomeSearchBar
import com.ncodes.ecommerce.landing.presentation.components.HomeTop
import com.ncodes.ecommerce.landing.presentation.components.OrderTrackingSection
import com.ncodes.ecommerce.landing.presentation.components.ProductsSection

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingScreen(
    navController: NavController?,
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
                        badgeCount = 1
                    ),
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
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.off_white))
                    .verticalScroll(state = rememberScrollState())
            ) {

                //Headings
                HomeTop()
                HomeSearchBar()
                HomeScrollingTopBar()


                //Body
                HomeGridLayout()

                Column(
                    Modifier
                        .padding(start = 15.dp, top = 0.dp, end = 15.dp, bottom = 20.dp)
                ) {
                    OrderTrackingSection()
                    DeliveryTimeline()
                    ProductsSection("Groceries","(12.1k)")
                    Brands(title = "Brands", sideTitle = "")
                    ProductsSection("Groceries","(12.1k)")
                }

            }
        }
    }
}


@Preview
@Composable
fun LandingPreview() {
    LandingScreen(navController = null)
}