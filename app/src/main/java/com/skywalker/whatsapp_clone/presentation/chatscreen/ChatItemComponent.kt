package com.skywalker.whatsapp_clone.presentation.chatscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.presentation.utils.ChatBubbleShapeLeft
import com.skywalker.whatsapp_clone.presentation.utils.ChatBubbleShapeRight
import com.skywalker.whatsapp_clone.R
import com.skywalker.whatsapp_clone.presentation.utils.OvalShape
import com.skywalker.whatsapp_clone.presentation.utils.TallOvalShape

@Composable
fun ChatItem() {

    var isReceived = true

    val received_color = Color.Black
    val sent_color = Color.White
    val MAX_LINES = 3
    val received_bgcol = Color(0xffb3c9fc)
    val sent_bgcol = Color(0xFF25D366)

    val clip_shape: Shape
    var color: Color
    val bgcol: Color

    if (isReceived) {
        color = received_color
        bgcol = received_bgcol
        clip_shape = ChatBubbleShapeLeft
    } else {
        color = sent_color
        bgcol = sent_bgcol
        clip_shape = ChatBubbleShapeRight
    }

    // Wrapped in Row so after wrapping with content-width of msg
    // the box remains at start of screen left side
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isReceived) Arrangement.Start else Arrangement.End
    ) {
        if (isReceived) {
            Image(
                painter = painterResource(R.drawable.pfp_3),
                "PFP",
                modifier = Modifier
                    .size(30.dp)
                    .clip(CircleShape)
                    .align(Alignment.Bottom)
            )

            Spacer(modifier = Modifier.width(6.dp))
        }


        Column(
            modifier = Modifier
                .widthIn(max = 280.dp)
                .clip(clip_shape)
                .background(bgcol)
                .padding(start = 12.dp, end = 12.dp, top = 8.dp)
        ) {
            Text(
                text = "Hey there !!",
                maxLines = MAX_LINES,
                color = color,
                fontSize = 14.sp
            )

            Text(
                text = "03:00PM",
                color = if (isReceived) Color.Gray else Color.White.copy(alpha = 0.7f),
                fontSize = 10.sp,
                modifier = Modifier
                    .align(Alignment.End)
            )
        }
    }
}