package ru.kheynov.horney.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import ru.kheynov.horney.components.common.Header

@Composable
fun ProfileScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(Modifier.fillMaxSize()) {
            Header()

            Column(
                Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "PROFILE WOULD BE HERE",
                    fontSize = 36.sp,
                    style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center)
            }
        }
    }
}