package ru.kheynov.horney.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Violet400,
    primaryVariant = Violet500,
    secondary = Violet500,
    background = DarkBackground,
    surface = DarkSurface,
    onSurface = DarkOnSurface,
)

private val LightColorPalette = lightColors(
    primary = Violet500,
    primaryVariant = Violet500,
    secondary = Violet500,
    background = LightBackground,
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