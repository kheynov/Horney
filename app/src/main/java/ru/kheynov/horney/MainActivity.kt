package ru.kheynov.horney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import ru.kheynov.horney.components.BottomNavigationBar
import ru.kheynov.horney.components.card_deck.Header
import ru.kheynov.horney.screens.CardDeck
import ru.kheynov.horney.ui.theme.HorneyTheme
import ru.kheynov.horney.utility.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HorneyTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController)}
    ) {
        Navigation(navController)
    }
}


