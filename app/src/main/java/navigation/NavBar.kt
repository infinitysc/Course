package navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun NavBar(navController : NavController) {

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    val navItems = NavigationObject.navigationItems
    NavigationBar(containerColor = Color.White) {
        navItems.forEachIndexed { index, item ->
            val isSelected = currentRoute == item.route

            NavigationBarItem(
                selected = isSelected,
                onClick = {
                   if(currentRoute != item.route){
                       navController.navigate(item.route)
                   }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = {
                    Text(text = item.title)
                }
            )
        }

    }
}