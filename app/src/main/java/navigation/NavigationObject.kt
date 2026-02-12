package navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.learning.course.R

object NavigationObject {
    val navigationItems = listOf(
        NavigationItem(
            title = "mainScreen",
            icon = Icons.Default.Home,
            route = Screen.MainScreen.route
        ),
        NavigationItem(
            title = "favoritesScreen",
            icon = Icons.Default.Favorite,
            route = Screen.FavoriteScreen.route
        ),
        NavigationItem(
            title = "profileScreen",
            icon = Icons.Default.AccountBox,
            route = Screen.ProfileScreen.route
        )
    )
}

