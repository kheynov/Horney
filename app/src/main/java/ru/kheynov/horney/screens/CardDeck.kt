package ru.kheynov.horney.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.glide.GlideImage
import entities.ProfileCard
import ru.kheynov.horney.components.card_deck.Header
import ru.kheynov.horney.ui.theme.HorneyTheme
import ru.kheynov.kardswyper.KardSwyper
import ru.kheynov.kardswyper.rememberKardSwyperController


@Composable
fun CardDeck() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
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
                    .weight(1.9f))

                val items = mutableListOf(
                    ProfileCard(listOf("https://picsum.photos/800/1000")),
                    ProfileCard(listOf("https://picsum.photos/850/1000")),
                    ProfileCard(listOf("https://picsum.photos/800/1200")),
                    ProfileCard(listOf("https://picsum.photos/800/900")),
                    ProfileCard(listOf("https://picsum.photos/800/1000")),
                    ProfileCard(listOf("https://picsum.photos/850/1000")),
                    ProfileCard(listOf("https://picsum.photos/800/1200")),
                    ProfileCard(listOf("https://picsum.photos/800/900")),
                )

                val kardSwyperController = rememberKardSwyperController()

                KardSwyper(
                    items = items,
                    kardSwyperController = kardSwyperController,
                    onItemRemoved = { item, _ -> items.remove(item) },
                    onEmpty = { println("Looking for new cards...") },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 26.dp)
                        .weight(14f),
                    cornerRadius = 10.dp
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            GlideImage(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .clip(shape = RoundedCornerShape(10.dp)),
                                imageModel = it.images[0],
                                shimmerParams = ShimmerParams(
                                    baseColor = MaterialTheme.colors.surface,
                                    highlightColor = Color.White,
                                    durationMillis = 500,
                                    dropOff = 0.65f,
                                    tilt = 20f,
                                ),
                                requestOptions = {
                                    RequestOptions()
                                        .diskCacheStrategy(DiskCacheStrategy.NONE)
                                        .centerCrop()
                                },
                                contentScale = ContentScale.FillBounds,

                                )
                        }
                    }
                }
                Spacer(modifier = Modifier.weight(1.5f))
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