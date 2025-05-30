package com.skywalker.whatsapp_clone.presentation.homescreen

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skywalker.whatsapp_clone.R

@Composable
@Preview
fun ChatComponent(){
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(R.drawable.pfp_1),
            contentDescription = null,
            modifier= Modifier
                .size(70.dp)
                .clip(shape= CircleShape)
        )
    }
}