package ru.kheynov.horney.components.likes

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.kheynov.horney.ui.theme.HorneyTheme

@Composable
fun LikesInfo() {
    
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LikesInfoPreview() {
    HorneyTheme {
        LikesInfo()
    }
}