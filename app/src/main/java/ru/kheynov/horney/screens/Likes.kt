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
import entities.ProfileCard
import ru.kheynov.horney.components.common.Header
import ru.kheynov.horney.components.likes.LikeInfo

@Composable
fun LikesScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column {
            Header()

            Column(Modifier.padding(horizontal = 12.dp).padding(bottom = 70.dp)) {
                val items = mutableListOf(
                    ProfileCard(images = listOf("https://picsum.photos/800/1000"),
                        name = "Anna",
                        age = 21),
                    ProfileCard(images = listOf("https://picsum.photos/850/1000"),
                        name = "Maria",
                        age = 24),
                    ProfileCard(images = listOf("https://picsum.photos/800/1200"),
                        name = "Viktoria",
                        age = 19),
                    ProfileCard(images = listOf("https://picsum.photos/800/900"),
                        name = "Vitaliy",
                        age = 20),
                    ProfileCard(images = listOf("https://picsum.photos/810/1000"),
                        name = "Igor'",
                        age = 21),
                    ProfileCard(images = listOf("https://picsum.photos/830/1000"),
                        name = "Samuel",
                        age = 50),
                    ProfileCard(images = listOf("https://picsum.photos/870/1200"),
                        name = "Kyle",
                        age = 18),
                    ProfileCard(images = listOf("https://picsum.photos/890/900"),
                        name = "Smith",
                        age = 29),
                )
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
