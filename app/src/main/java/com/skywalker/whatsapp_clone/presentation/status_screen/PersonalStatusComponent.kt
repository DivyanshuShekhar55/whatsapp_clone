package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skywalker.whatsapp_clone.R

@Composable
fun PersonalStatusComponent(){
    Row {
        Box(){
            Image(
                painter = painterResource(R.drawable.pfp_2),
                "null",
                modifier= Modifier
                    .size(60.dp)
                    .clip(CircleShape),
            )
        }
    }
}