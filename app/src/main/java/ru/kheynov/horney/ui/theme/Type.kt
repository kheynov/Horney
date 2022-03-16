package ru.kheynov.horney.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import ru.kheynov.horney.R

private val fredokaOneFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.fredoka_one_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
    )
)

private val openSansFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.opensans_regular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
    )
)
private val ralewayFontFamily = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.raleway_reqular,
            weight = FontWeight.Normal,
            style = FontStyle.Normal,
        ),
        Font(
            resId = R.font.raleway_semibold,
            weight = FontWeight.SemiBold,
            style = FontStyle.Normal,
        ),
    )
)

// Set of Material typography styles to start with
private val defaultTypography = Typography()

val Typography = Typography(
    body1 = defaultTypography.body1.copy(fontFamily = openSansFontFamily),
    h1 = defaultTypography.h1.copy(fontFamily = fredokaOneFontFamily),
    h2 = defaultTypography.h2.copy(fontFamily = ralewayFontFamily),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)