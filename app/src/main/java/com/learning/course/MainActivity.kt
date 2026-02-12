package com.learning.course

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.learning.course.ui.theme.CourseTheme
import navigation.NavBar


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CourseTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = {
                    NavBar(
                        navController = navController
                    )
                }) { paddingValues ->
                    NavHost(
                        navController = navController,
                        startDestination = "mainScreen",
                        modifier = Modifier.padding(paddingValues = paddingValues)
                    ){
                        composable("mainScreen") {MainScreen()}
                        composable("favoritesScreen") { FavoritesScreen() }
                        composable("profileScreen"){ ProfileScreen() }
                    }

                }

            }
        }
    }
}


