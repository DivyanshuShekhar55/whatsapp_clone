package com.skywalker.whatsapp_clone.presentation.chatscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.CameraAlt
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.QrCode
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R
import com.skywalker.whatsapp_clone.presentation.utils.CookieShape


@Composable
@Preview
fun ChatScreenTopBar() {
    Box(modifier = Modifier.fillMaxWidth()
        .padding(top = 8.dp)) {

        Row(modifier = Modifier
            .align(Alignment.CenterStart),
            verticalAlignment = Alignment.CenterVertically
            ) {
            Icon(
                Icons.Default.ArrowBack,
                "Go Back"
            )

            Spacer(modifier = Modifier.width(24.dp))

            Image(
                painter = painterResource(R.drawable.pfp_3),
                "PFP",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CookieShape)
                    .align(Alignment.CenterVertically)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "Yui",
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(start = 18.dp),
                fontWeight = FontWeight.SemiBold
            )
        }


        Row(
            modifier = Modifier.align(Alignment.CenterEnd)
        )
        {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Outlined.Videocam,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
                )
            }

            IconButton(onClick = {/* ToDo */ }) {
                Icon(
                    Icons.Outlined.Call,
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

    Spacer(modifier = Modifier.height(8.dp))
    HorizontalDivider(thickness = 1.dp)
}

