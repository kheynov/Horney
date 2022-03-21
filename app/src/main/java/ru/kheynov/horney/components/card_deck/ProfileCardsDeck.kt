package ru.kheynov.horney.components.card_deck

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.glide.GlideImage
import entities.ProfileCard
import ru.kheynov.kardswyper.KardSwyper
import ru.kheynov.kardswyper.rememberKardSwyperController

@Composable
fun ProfileCardsDeck(
    items: List<ProfileCard>,
    modifier: Modifier = Modifier,
) {
    val kardSwyperController = rememberKardSwyperController()
    val mItems: MutableList<ProfileCard> = items.toMutableList()
    KardSwyper(
        items = items,
        kardSwyperController = kardSwyperController,
        onItemRemoved = { item, _ -> mItems.remove(item) },
        onEmpty = { println("Looking for new cards...") },
        modifier = modifier,
        cornerRadius = 10.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(8.dp)) {
                Box {
                    GlideImage(
                        modifier = Modifier
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
                        contentScale = ContentScale.FillHeight,
                    )
                    Box(
                        modifier = Modifier
                            .background(brush = Brush.verticalGradient(colors = listOf(
                                Color.Transparent, Color.Black), startY = 500f),
                                shape = RoundedCornerShape(10.dp))
                            .fillMaxSize(1f)
                            .align(Alignment.BottomStart),//TODO: Draw more beautiful shadow
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 12.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.Bottom,
                    ) {
                        Text(
                            text = "${it.name}, ${it.age}",
                            style = MaterialTheme.typography.h2,
                            color = Color.White,
                            fontSize = 36.sp,
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = it.aboutText,
                            style = MaterialTheme.typography.body1,
                            color = Color.White,
                            fontSize = 16.sp,
                        )
                    }
                }
            }
        }
    }
}