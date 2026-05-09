package com.learning.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.learning.app.theme.CourseTheme
import com.learning.core_ui.FavoritesScreen
import com.learning.core_ui.MainScreen
import com.learning.core_ui.NavBar
import com.learning.core_ui.profile.ProfileScreen
import com.learning.navigation.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CourseTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                val showBottomBar = currentRoute in listOf(
                    Screen.MainScreen.route,
                    Screen.FavoriteScreen.route,
                    Screen.ProfileScreen.route
                )

                Scaffold(
                    bottomBar = {
                        if (showBottomBar) {
                            NavBar(navController = navController)
                        }
                    }
                ) { paddingValues ->
                    NavHost(
                        navController = navController,
                        startDestination = Screen.MainScreen.route,
                        modifier = Modifier.padding(paddingValues = paddingValues)
                    ) {
                        composable(route = Screen.MainScreen.route) { MainScreen() }
                        composable(route = Screen.FavoriteScreen.route) { FavoritesScreen() }
                        composable(route = Screen.ProfileScreen.route) { ProfileScreen() }
                        // Добавьте остальные экраны здесь, когда они будут готовы (Login, Registration и т.д.)
                    }
                }
            }
        }
    }
}
