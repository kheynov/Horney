package ru.kheynov.horney.utility

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.kheynov.horney.screens.CardDeck
import ru.kheynov.horney.screens.LikesScreen
import ru.kheynov.horney.screens.ProfileScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.CardDeck.route) {
        composable(
            NavigationItem.CardDeck.route
        ) {
            CardDeck()
        }
        composable(NavigationItem.Likes.route) {
            LikesScreen()
        }
        composable(NavigationItem.Profile.route) {
            ProfileScreen()
        }
    }
}
