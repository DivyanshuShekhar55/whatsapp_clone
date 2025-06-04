package com.skywalker.whatsapp_clone.presentation.utils

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DashedLine(modifier: Modifier = Modifier, paddingTop: Dp, paddingHorizontal:Dp) {

    val density = LocalDensity.current
    with(density) {
        val dashOnInterval = 8.dp.toPx()
        val dashOffInterval = 8.dp.toPx()

        val pathEffect = PathEffect.dashPathEffect(
            intervals = floatArrayOf(dashOnInterval, dashOffInterval),
            phase = 0f
        )
        Canvas(
            Modifier
                .fillMaxWidth()
                .padding(top = paddingTop,
                    start = paddingHorizontal,
                    end =  paddingHorizontal)
        ) {
            drawLine(
                color = Color.Gray,
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f),
                strokeWidth = 4.dp.toPx(),
                cap = StrokeCap.Butt,
                pathEffect = pathEffect

            )
        }
    }


}