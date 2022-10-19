package com.example.formsample.nav

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.core.graphics.toColor
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.formsample.R

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf<BottomNavItem>(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Likes,
        BottomNavItem.Chats,
        BottomNavItem.Profile
    )

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black
    ) {
        val navigationBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navigationBackStackEntry?.destination?.route;

        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painter = painterResource(id = item.icon), contentDescription = item.screenRoute)},
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.Black,
                selected = currentRoute == item.screenRoute,
                onClick = {
                    navController.navigate(item.screenRoute) {
                        navController.graph.startDestinationRoute?.let { screenRoute ->
                            popUpTo(screenRoute) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })
        }
    }
}