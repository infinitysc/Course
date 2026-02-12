package navigation

sealed class Screen (val route : String){
    object MainScreen : Screen("mainScreen")
    object FavoriteScreen : Screen("favoritesScreen")
    object ProfileScreen : Screen("profileScreen")
}