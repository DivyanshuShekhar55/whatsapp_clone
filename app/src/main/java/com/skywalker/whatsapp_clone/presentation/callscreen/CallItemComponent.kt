package com.skywalker.whatsapp_clone.presentation.callscreen

import android.graphics.drawable.Icon
import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CallMissed
import androidx.compose.material.icons.filled.CallReceived
import androidx.compose.material.icons.sharp.CallMissed
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R
import com.skywalker.whatsapp_clone.presentation.utils.CookieShape
import com.skywalker.whatsapp_clone.presentation.utils.TallOvalShape


@Composable
fun CallItem(callItem: CallItemModel) {
    val tintColor: Color
    val callIcon : ImageVector

    if (callItem.isMissedCall){
        tintColor= Color.Red
        callIcon = Icons.Default.CallMissed
    }else{
        tintColor = colorResource(R.color.light_green)
        callIcon = Icons.Default.CallReceived
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 16.dp)
    ) {
        Image(
            painter = painterResource(callItem.image),
            null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(callItem.name, fontSize = 18.sp, fontWeight = FontWeight.Medium)

            Row {
                Icon(
                    callIcon,
                    null,
                    tint = tintColor
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(callItem.lastCalledTime, fontSize = 18.sp)
            }

        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            Icons.Default.Call,
            null,
            modifier = Modifier
                .padding(end = 16.dp),
            tint = colorResource(R.color.light_green)
        )

    }

    Spacer(modifier = Modifier.height(12.dp))
}