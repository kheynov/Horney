package ru.kheynov.horney.components

import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.kheynov.horney.utility.NavigationItem

@Composable
fun BottomNavigationBar(navController: NavController) {
    val navItems = listOf(
        NavigationItem.Likes,
        NavigationItem.CardDeck,
        NavigationItem.Profile,
    )
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier.height(80.dp)
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        navItems.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(painter = if (currentRoute == item.route) painterResource(item.selectedIconId)
                    else painterResource(item.iconId),
                        contentDescription = item.title)
                },
                label = { Text(text = item.title) },
                selectedContentColor = MaterialTheme.colors.onSurface,
                unselectedContentColor = MaterialTheme.colors.onSurface.copy(alpha = 0.6f),
                selected = currentRoute == item.route,
                alwaysShowLabel = true,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route)
                    }
                },
            )

        }
    }
}
