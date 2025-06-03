package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R

@Composable
fun PersonalStatusComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
    ) {
        Box() {
            Image(
                painter = painterResource(R.drawable.pfp_2),
                null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
            )


            Icon(
                Icons.Default.Add,
                null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .background(
                        colorResource(R.color.light_green),
                        shape = RoundedCornerShape(12.dp)
                    ),
                tint = colorResource(R.color.white)

            )

        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("My Status", fontWeight = FontWeight.SemiBold, fontSize = 18.sp)
            Text("Tap To Add Status", color = Color.Gray)
        }
    }
}