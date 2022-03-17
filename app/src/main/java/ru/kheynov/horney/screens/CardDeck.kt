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
import ru.kheynov.horney.components.card_deck.Header
import ru.kheynov.horney.components.card_deck.UserCard
import ru.kheynov.horney.ui.theme.HorneyTheme


@Composable
fun CardDeck() {
    Surface(
        modifier = Modifier.fillMaxSize()
            .padding(bottom = 55.dp),
        color = MaterialTheme.colors.background
    ) {
        Column(
            Modifier.fillMaxSize(),

            ) {
            Column(Modifier
                .weight(20f)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Header(Modifier
                    .padding(top = 32.dp)
                    .weight(2f))
                UserCard(
                    Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 26.dp)
                        .weight(14f)
                )
                Spacer(modifier = Modifier.weight(1.2f))
            }
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