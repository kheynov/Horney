package ru.kheynov.horney.components.likes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.skydoves.landscapist.ShimmerParams
import com.skydoves.landscapist.glide.GlideImage
import entities.ProfileCard


@Composable
fun LikeInfo(
    modifier: Modifier = Modifier,
    profileCard: ProfileCard,
) {
    Card(
        modifier = modifier,
        border = BorderStroke(1.dp, color = MaterialTheme.colors.secondary),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row {
            GlideImage(
                modifier = Modifier
                    .size(80.dp)
                    .padding(8.dp)
                    .clip(CircleShape),
                imageModel = profileCard.images[0],
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

            Column(
                modifier = Modifier
                    .padding(start = 10.dp, top = 5.dp),
            ) {
                Text(
                    text = "${profileCard.name}, ${profileCard.age}",
                    style = MaterialTheme.typography.h2,
                    fontSize = 24.sp,
                    color = MaterialTheme.colors.onBackground
                )

                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = "Match from ${profileCard.matchTime}",
                    style = MaterialTheme.typography.body1,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    color = MaterialTheme.colors.onBackground
                )
            }
        }

    }
}
