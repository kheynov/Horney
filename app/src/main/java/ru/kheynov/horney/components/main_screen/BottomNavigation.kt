package ru.kheynov.horney.components.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.kheynov.domain.utility.BottomNavigationState
import ru.kheynov.horney.R

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    elevation: Dp = 10.dp,
    navState: BottomNavigationState = BottomNavigationState.MainScreen,
    onStateChanged: (BottomNavigationState) -> Unit = {},
) {
    Surface(
        modifier = modifier
            .fillMaxSize(),
        elevation = elevation,
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_collection_icon),
                contentDescription = "",
            )
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_like_icon),
                contentDescription = "",
            )
            Image(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_user_icon),
                contentDescription = "",
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavigationPreview() {
    BottomNavigation()
}