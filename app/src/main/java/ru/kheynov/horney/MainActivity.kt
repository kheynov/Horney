package ru.kheynov.horney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.kheynov.horney.screens.CardDeck
import ru.kheynov.horney.ui.theme.HorneyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HorneyTheme {
                CardDeck()
            }
        }
    }
}



