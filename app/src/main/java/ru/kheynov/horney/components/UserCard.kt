package ru.kheynov.horney.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.kheynov.horney.ui.theme.Violet500

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
                Text(
                    //TODO: Create content in card
                    text = "Horny again...",
                    color = Violet500,
                    style = MaterialTheme.typography.h2,
                    fontSize = 48.sp,
                )
            }
        }
    }
}