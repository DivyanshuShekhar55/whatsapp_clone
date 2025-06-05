package com.skywalker.whatsapp_clone.presentation.chatscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChatScreen() {
    Column {
        Spacer(modifier = Modifier.height(18.dp))
        ChatScreenTopBar()

        LazyColumn {
            items(20) {
                ChatItem()
                Spacer(modifier=Modifier.height(4.dp))
            }
        }
    }

}