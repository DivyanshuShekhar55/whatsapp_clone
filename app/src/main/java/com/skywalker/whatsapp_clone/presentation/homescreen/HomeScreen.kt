package com.skywalker.whatsapp_clone.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.QrCode
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R

@Composable
@Preview
fun HomeScreen() {
    Scaffold(
        floatingActionButton = {
            LargeFloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = colorResource(R.color.white),
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 8.dp,
                    pressedElevation = 12.dp
                )
            ) {
                Icon(
                    Icons.Default.AddComment,
                    "send",
                    modifier = Modifier
                        .size(36.dp)
                )
            }
        }
    ) { paddingValues ->
        Text("", modifier = Modifier.padding(paddingValues))
        Column {
            Spacer(modifier = Modifier.height(18.dp))
            TopBar()
            HorizontalDivider(
                modifier = Modifier
                    .clip(CircleShape)
                    .fillMaxWidth(),
                thickness = 1.dp
            )
            ChatComponent()
        }
    }
}

@Composable
@Preview
fun TopBar() {
    Box(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = "WhatsApp",
            fontSize = 32.sp,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 18.dp),
            color = colorResource(R.color.light_green),
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = Modifier.align(Alignment.CenterEnd)
        )
        {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.QrCode,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
                )
            }

            IconButton(onClick = {/* ToDo */ }) {
                Icon(
                    Icons.Outlined.CameraAlt,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)

                )
            }

            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.MoreVert,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
                )
            }

        }
    }
}

