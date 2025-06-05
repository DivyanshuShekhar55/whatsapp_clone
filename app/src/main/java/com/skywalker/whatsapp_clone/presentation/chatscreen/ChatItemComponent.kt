package com.skywalker.whatsapp_clone.presentation.chatscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChatItem(){

    var isReceived = true

    val received_color = Color.Black
    val sent_color = Color(0xFF25D366)
    val MAX_LINES = 3
    val revceived_bgcol = Color(0xffb3c9fc)
    val sent_bgcol = Color(0xFF25D366)

    var color:Color
    val bgcol:Color

    if(isReceived){
        color = received_color
        bgcol = revceived_bgcol
    }else{
        color = sent_color
        bgcol = sent_bgcol
    }

    Text(
        "Hey there !!",
        maxLines = MAX_LINES,
        color = color,
        modifier = Modifier
            .background(bgcol)
            .padding(16.dp)
            .clip(
                shape = ChatBubbleShape
            )
    )
}