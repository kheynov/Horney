package ru.kheynov.kardswyper

import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.consumePositionChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.kheynov.kardswyper.utility.SwipeDirection

@Composable
inline fun <reified T> KardSwyper(
    items: List<T>,
    onItemRemoved: (T, SwipeDirection) -> Unit,
    onEmpty: () -> Unit = {},
    kardSwyperController: KardSwyperController = rememberKardSwyperController(),
    stackCount: Int = 8,
    elevation: Dp = 5.dp,
    cornerRadius: Dp = 10.dp,
    modifier: Modifier = Modifier,
    cardModifier: Modifier = Modifier,
    crossinline renderItem: @Composable (T) -> Unit,
) {
    Box(modifier = modifier) {
        val list = items.take(stackCount).reversed()
        list.forEachIndexed { index, item ->
            key(item) {
                val cardController = rememberCardController()
                if (index == list.lastIndex) {
                    kardSwyperController.currentCardController = cardController
                }
                if (!cardController.isCardOut()) {
                    Card(
                        elevation = elevation,
                        shape = RoundedCornerShape(cornerRadius * 1.4f),
                        modifier = cardModifier
                            .pointerInput(Unit) {
                                detectDragGestures(
                                    onDragEnd = {
                                        cardController.onDragEnd()
                                    },
                                    onDragCancel = {
                                        cardController.onDragCancel()
                                    },
                                    onDrag = { change, dragAmount ->
                                        change.consumePositionChange()
                                        cardController.onDrag(dragAmount)
                                    }
                                )
                            }
                            .graphicsLayer(
                                translationX = cardController.cardX,
                                rotationZ = cardController.rotation,
                            )
                    ) {
                        renderItem(item)
                    }
                } else {
                    cardController.swipeDirection?.let { swipeDirection ->
                        onItemRemoved(item, swipeDirection)
                        if (items.isEmpty()) {
                            onEmpty()
                        }
                    }
                }
            }
        }
    }
}