package ru.kheynov.horney.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Violet400,
    primaryVariant = Violet500,
    secondary = Violet500,
    background = DarkBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurface,
    onBackground = Color.White,
)

private val LightColorPalette = lightColors(
    primary = Violet400,
    primaryVariant = Violet500,
    secondary = Violet500,
    background = LightBackground,
    surface = LightSurface,
    onSurface = LightOnSurface,
)

@Composable
fun HorneyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}