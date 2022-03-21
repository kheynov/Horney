package ru.kheynov.horney.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.kheynov.data.repository.CardsRepositoryImpl
import ru.kheynov.horney.components.common.Header
import ru.kheynov.horney.components.likes.LikeInfo
import use_cases.GetCardsUseCase

@Composable
fun LikesScreen() {
    val cardsRepository = CardsRepositoryImpl()
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column {
            Header()
            Column(Modifier
                .padding(horizontal = 12.dp)
                .padding(bottom = 70.dp)) {
                val items = GetCardsUseCase(cardsRepository = cardsRepository).invoke()
                LazyColumn {
                    items(items.size) { idx ->
                        LikeInfo(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 12.dp),
                            profileCard = items[idx]
                        )
                    }
                }
            }
        }
    }
}
