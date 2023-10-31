package com.ncodes.ecommerce.common

sealed class Screens (val route: String) {

    //Login
    object LoginNav: Screens("login_nav")
    object LoginScreen: Screens("login_screen")

    //Landing
    object LandingContainer: Screens("landing_container")
    object LandingScreen: Screens("landing_screen")
}