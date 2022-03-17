package ru.kheynov.horney.components.card_deck

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun UserCard(
    modifier: Modifier = Modifier,
    elevation: Dp = 10.dp,
    shape: Shape = RoundedCornerShape(10.dp),
) {
    Card(
        elevation = elevation,
        modifier = modifier,
        shape = shape,
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                GlideImage(
                    imageModel = "https://picsum.photos/400/600",
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
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
}