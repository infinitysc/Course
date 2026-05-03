package com.learning.navigation

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem (
    @StringRes val titleRes : Int,
    val icon : ImageVector,
    val route : String
)