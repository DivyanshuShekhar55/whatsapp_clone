package com.skywalker.whatsapp_clone.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import com.skywalker.whatsapp_clone.R

@Composable
@Preview
fun HomeScreen() {
    val chat_list = listOf<ChatListModel>(
        ChatListModel(
            image = R.drawable.pfp_1,
            name = "Sakamoto taro",
            time = "10:30AM",
            message = "Wanna come to Japan ??"
        ),
        ChatListModel(
            image = R.drawable.pfp_2,
            name = "Hana",
            time = "10:30PM",
            message = "Wow Divyansh u so smart \uD83D\uDE0D"
        ),
        ChatListModel(
            image = R.drawable.pfp_3,
            name = "Yui",
            time = "11:00AM",
            message = "Lmao \uD83D\uDE02"
        )
    )
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
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
                        .size(28.dp)
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
            LazyColumn {
                items(chat_list) {

                    ChatComponent(chat_item = it)
                }
            }
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

