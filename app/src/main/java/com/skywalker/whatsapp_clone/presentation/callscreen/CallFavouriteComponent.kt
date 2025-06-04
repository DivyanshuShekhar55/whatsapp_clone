package com.skywalker.whatsapp_clone.presentation.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R
import com.skywalker.whatsapp_clone.presentation.utils.CookieShape

@Composable
fun CallFavItem(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 16.dp)
    ){
        Image(
            painter = painterResource(R.drawable.pfp_2),
            null,
            modifier = Modifier
                .size(70.dp)
                .clip(CookieShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Yui", fontSize = 18.sp, fontWeight = FontWeight.Medium)
    }
}