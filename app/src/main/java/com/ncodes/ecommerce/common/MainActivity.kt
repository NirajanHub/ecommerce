package com.ncodes.ecommerce.common

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.ncodes.ecommerce.landing.presentation.LandingScreen
import com.ncodes.ecommerce.login.presentation.login.LoginScreen
import com.ncodes.ecommerce.ui.theme.PractiseTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PractiseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screens.LoginNav.route
                    ) {
                        navigation(
                            startDestination = Screens.LoginScreen.route,
                            route = Screens.LoginNav.route,
                        ){
                            composable(route = Screens.LoginScreen.route) {
                                LoginScreen(navController = navController)
                            }
                        }
                        navigation(
                            startDestination = Screens.LandingScreen.route,
                            route = Screens.LandingContainer.route,
                        ){
                            composable(route = Screens.LandingScreen.route) {
                                LandingScreen(navController)
                            }
                        }

                    }
                }
            }
        }
    }
}
