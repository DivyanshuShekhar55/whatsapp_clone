package com.skywalker.whatsapp_clone.presentation.communityscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateServerComponent() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Create Your Community",
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            "Your community is where you and your friends hang out. Make yours and start talking.",
            fontSize = 16.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )

    }
}