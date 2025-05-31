package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Text("hello", modifier = Modifier.padding(paddingValue))
    }
}

@Composable
fun TopBar(){


}