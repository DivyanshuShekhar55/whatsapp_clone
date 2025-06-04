package com.skywalker.whatsapp_clone.presentation.communityscreen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
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
fun CommunityItem(image: Int, name: String, unreadMsg: Int) {
    val ringColor = colorResource(R.color.light_green)
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {


        Image(
            painter = painterResource(image),
            "null",
            modifier = Modifier
                .size(55.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )


        Spacer(modifier = Modifier.width(16.dp))

        Text(name, fontWeight = FontWeight.SemiBold, fontSize = 24.sp)

        Spacer(modifier = Modifier.weight(1f))

        BadgedBox(
            badge = {
                if (unreadMsg > 0 && unreadMsg <= 4) {
                    Badge(
                        containerColor = ringColor,
                        contentColor = Color.White,
                        modifier = Modifier.offset(x = (-5).dp, y = (0.5).dp)
                            .size(18.dp)
                    ) {
                        Text(unreadMsg.toString(), fontSize = 14.sp)
                    }

                } else if (unreadMsg > 4) {

                    Badge(
                        containerColor = ringColor,
                        contentColor = Color.White
                    ) {
                        Text("4+")
                    }
                }
            },
        ) {

            Icon(
                Icons.Default.ChevronRight,
                null,
                modifier = Modifier.size(32.dp)
            )
        }

    }

    Spacer(modifier = Modifier.height(16.dp))
}