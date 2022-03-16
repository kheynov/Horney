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
import ru.kheynov.horney.components.BottomNavigation
import ru.kheynov.horney.components.Header
import ru.kheynov.horney.components.UserCard
import ru.kheynov.horney.ui.theme.HorneyTheme


@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(
            Modifier.fillMaxSize(),

            ) {
            Column(Modifier
                .weight(14f)
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Header(Modifier
                    .padding(top = 18.dp)
                    .weight(1.5f))
                UserCard(
                    Modifier
                        .fillMaxWidth(0.9f)
                        .padding(top = 20.dp)
                        .weight(14f)
                )
                Spacer(modifier = Modifier.weight(0.7f))
            }
            BottomNavigation(modifier = Modifier
                .weight(2f),
                elevation = 10.dp
            )
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
fun MainScreenPreview() {
    HorneyTheme {
        MainScreen()
    }
}