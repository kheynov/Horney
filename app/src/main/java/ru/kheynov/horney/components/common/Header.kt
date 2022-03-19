package ru.kheynov.horney.components.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun Header(
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 38.sp,
) {
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "Horney",
            style = MaterialTheme.typography.h1,
            fontSize = fontSize,
            color = MaterialTheme.colors.secondary,
        )
    }
}