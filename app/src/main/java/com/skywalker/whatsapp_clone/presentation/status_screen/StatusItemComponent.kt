package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R

@Composable
fun StatusItem() {
    val ringColor = colorResource(R.color.light_green)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(60.dp), contentAlignment = (Alignment.Center)
        ) {
            Image(
                painter = painterResource(R.drawable.pfp_2),
                "null",
                modifier = Modifier
                    .size(55.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Canvas(modifier = Modifier.fillMaxSize()) {
                drawCircle(
                    color = ringColor,
                    style = Stroke(width = 4.dp.toPx())
                )
            }
        }


        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Sakamoto", fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
            Text("Just Now", color = Color.Gray)
        }

    }
}