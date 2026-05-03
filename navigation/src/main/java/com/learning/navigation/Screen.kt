package com.learning.navigation

sealed class Screen (val route : String){
    data object MainScreen : Screen("mainScreen")
    data object FavoriteScreen : Screen("favoritesScreen")
    data object ProfileScreen : Screen("profileScreen")
    data object Login : Screen("login")
    data object Registration : Screen("registration")
    data object Onboarding : Screen("onboarding")
}
