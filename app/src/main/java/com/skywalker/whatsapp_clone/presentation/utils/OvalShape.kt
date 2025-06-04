package com.skywalker.whatsapp_clone.presentation.utils

import androidx.compose.foundation.shape.GenericShape
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.graphics.Shape
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


val OvalShape: Shape = GenericShape { size: Size, _: LayoutDirection ->
    addOval(androidx.compose.ui.geometry.Rect(0f, 0f, size.width, size.height))
}

val TallOvalShape: Shape = GenericShape { size: Size, _: LayoutDirection ->
    val ovalWidth = size.width * 0.8f
    val leftOffset = (size.width - ovalWidth) / 2f
    addOval(androidx.compose.ui.geometry.Rect(leftOffset, 0f, leftOffset + ovalWidth, size.height))
}
val CookieShape: Shape = GenericShape { size: Size, _: LayoutDirection ->
    val centerX = size.width / 2f
    val centerY = size.height / 2f
    val radius = minOf(centerX, centerY)
    val sides = 12
    val scallop = 0.15f // Scallop depth

    for (i in 0 until sides) {
        val angle = (i * 2 * PI / sides).toFloat()
        val nextAngle = ((i + 1) * 2 * PI / sides).toFloat()

        // Outer point
        val x1 = centerX + radius * cos(angle)
        val y1 = centerY + radius * sin(angle)

        // Inner scallop point (midpoint between angles)
        val midAngle = (angle + nextAngle) / 2f
        val innerRadius = radius * (1f - scallop)
        val x2 = centerX + innerRadius * cos(midAngle)
        val y2 = centerY + innerRadius * sin(midAngle)

        if (i == 0) {
            moveTo(x1, y1)
        } else {
            lineTo(x1, y1)
        }

        // Create scalloped edge
        quadraticBezierTo(x2, y2,
            centerX + radius * cos(nextAngle),
            centerY + radius * sin(nextAngle)
        )
    }
    close()
}


