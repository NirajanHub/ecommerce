package com.ncodes.ecommerce.landing.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AccountBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ncodes.ecommerce.common.BottomNavItems
import com.ncodes.ecommerce.common.Screens
import com.ncodes.ecommerce.common.components.BottomNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingScreen(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigationBar(items = arrayListOf(
                BottomNavItems(
                    "home",
                    route = Screens.LoginNav.route,
                    icon = Icons.Sharp.AccountBox,
                    badgeCount = 1
                )
            ),
                navController = navController,
                modifier =  Modifier.padding(10.dp),
                onItemClick = {
                 navController.navigate(it.route)
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

        }
    }
}