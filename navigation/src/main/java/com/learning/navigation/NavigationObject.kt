package com.learning.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home

object NavigationObject {
    val navigationItems = listOf(
        NavigationItem(
            titleRes = R.string.nav_main,
            icon = Icons.Default.Home,
            route = Screen.MainScreen.route
        ),
        NavigationItem(
            titleRes = R.string.nav_favorites,
            icon = Icons.Default.Favorite,
            route = Screen.FavoriteScreen.route
        ),
        NavigationItem(
            titleRes = R.string.nav_profile,
            icon = Icons.Default.AccountBox,
            route = Screen.ProfileScreen.route
        )
    )
}
