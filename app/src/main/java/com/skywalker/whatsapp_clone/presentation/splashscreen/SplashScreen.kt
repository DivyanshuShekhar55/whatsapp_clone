package com.skywalker.whatsapp_clone.presentation.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R


@Composable
@Preview
fun SplashScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.whatsapp_logo),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)

        )

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Text("From", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,

            ){
                Image(
                    painter = painterResource(R.drawable.meta_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 6.dp)

                )
                Text("Meta", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            }
        }
    }

}