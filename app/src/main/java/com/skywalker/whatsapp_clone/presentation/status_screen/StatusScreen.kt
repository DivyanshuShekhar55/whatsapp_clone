package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R

@Composable
@Preview
fun StatusScreen(){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick={},
                containerColor = colorResource(R.color.light_green),
                contentColor = colorResource(R.color.white),
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 8.dp,
                    pressedElevation = 12.dp
                )

            ){
                Icon(
                    Icons.Default.CameraAlt,
                    "send",
                    modifier = Modifier
                        .size(28.dp)
                )
            }
        }
    ) {
            paddingValue ->
        Text("", modifier = Modifier.padding(paddingValue))
        Column {
            Spacer(modifier = Modifier.height(18.dp))
            TopBar()
        }

    }
}

@Composable
fun TopBar(){
    Box(modifier= Modifier
        .fillMaxWidth()){
        Text("Updates",
            fontWeight = FontWeight.Medium,
            fontSize = 32.sp,
            modifier= Modifier
                .align(Alignment.CenterStart)
                .padding(start = 18.dp),

        )

        Row (modifier=Modifier.align(Alignment.CenterEnd)  ){
            IconButton(
                onClick={/*ToDo*/}
            ) {
                Icon(
                    Icons.Default.QrCode,
                    contentDescription = null,
                    modifier=Modifier.size(32.dp)
                )
            }

            IconButton(
                onClick={/*ToDo*/}
            ) {
                Icon(
                    Icons.Default.Search,
                    contentDescription = null,
                    modifier=Modifier.size(32.dp)
                )
            }

            IconButton(
                onClick={/*ToDo*/}
            ) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = null,
                    modifier=Modifier.size(32.dp)
                )
            }
        }
    }
}