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
import ru.kheynov.data.repository.CardsRepositoryImpl
import ru.kheynov.horney.components.card_deck.ProfileCardsDeck
import ru.kheynov.horney.components.common.Header
import ru.kheynov.horney.ui.theme.HorneyTheme
import use_cases.GetCardsUseCase


@Composable
fun CardDeck() {
    val cardsRepository = CardsRepositoryImpl()

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
            val items = GetCardsUseCase(cardsRepository).invoke()
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