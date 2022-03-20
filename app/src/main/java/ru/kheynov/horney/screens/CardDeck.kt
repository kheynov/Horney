package ru.kheynov.horney.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import entities.ProfileCard
import ru.kheynov.horney.components.card_deck.ProfileCardsDeck
import ru.kheynov.horney.components.common.Header
import ru.kheynov.horney.ui.theme.HorneyTheme


@Composable
fun CardDeck() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 55.dp),
        color = MaterialTheme.colors.background
    ) {
        Column(Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Header()
            val items = mutableListOf(
                ProfileCard(
                    images = listOf("https://picsum.photos/800/1000"),
                    name = "Anna",
                    age = 21,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/850/1000"),
                    name = "Maria",
                    age = 24,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/800/1200"),
                    name = "Viktoria",
                    age = 19,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/800/900"),
                    name = "Vitaliy",
                    age = 20,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/810/1000"),
                    name = "Igor'",
                    age = 21,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/830/1000"),
                    name = "Samuel",
                    age = 50,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/870/1200"),
                    name = "Kyle",
                    age = 18,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
                ProfileCard(
                    images = listOf("https://picsum.photos/890/900"),
                    name = "Smith",
                    age = 29,
                    aboutText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                ),
            )
            ProfileCardsDeck(
                items = items,
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 26.dp)
                    .weight(14f),
            )
            Spacer(modifier = Modifier.weight(1.5f))
        }
    }
}

@Preview(showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "light")
@Preview(showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "dark")
@Composable
fun CardDeckPreview() {
    HorneyTheme {
        CardDeck()
    }
}