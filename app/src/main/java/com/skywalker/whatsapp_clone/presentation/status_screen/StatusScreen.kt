package com.skywalker.whatsapp_clone.presentation.status_screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.QrCode
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Cancel
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skywalker.whatsapp_clone.R
import com.skywalker.whatsapp_clone.presentation.utils.DashedLine

val statusItemList : List<StatusItemModel> = listOf(
    StatusItemModel(
        image = R.drawable.pfp_1,
        name="Sakamoto taro",
        uploadTime = "10:29AM"
    ),
    StatusItemModel(
        image = R.drawable.pfp_3,
        name="Yui",
        uploadTime = "Just Now"
    )
)

@Composable
@Preview
fun StatusScreen() {
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
                    Icons.Default.CameraAlt,
                    "send",
                    modifier = Modifier
                        .size(28.dp)
                )
            }
        }
    ) { paddingValue ->
        Text("", modifier = Modifier.padding(paddingValue))
        Column {
            Spacer(modifier = Modifier.height(18.dp))
            TopBar()
            Spacer(modifier = Modifier.height(24.dp))
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(
                    "Status",
                    fontWeight = FontWeight.Medium,
                    fontSize = 24.sp,
                )

                Spacer(modifier = Modifier.height(18.dp))
                PersonalStatusComponent()
                DashedLine(paddingTop = 24.dp, paddingHorizontal = 0.dp)
                Spacer(modifier = Modifier.height(24.dp))
                Text("Recent Updates", fontWeight = FontWeight.Medium, fontSize = 18.sp)
                Spacer(modifier = Modifier.height(14.dp))

                LazyColumn {
                    items(statusItemList) {
                        StatusItem(it.image, it.name, it.uploadTime)
                    }
                }

            }

        }

    }
}

@Composable
fun TopBar() {
    var isSearching by remember { mutableStateOf(false) }
    var searchText by remember { mutableStateOf("") }
    var isTextFieldFocused by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        if (isSearching) {
            Box(
                modifier = Modifier
                    .padding(start = 18.dp, end = 18.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .fillMaxWidth()
                        .clip(CircleShape)
                        .background(
                            if (isTextFieldFocused) Color.LightGray
                            else colorResource(R.color.smokey_white)
                        )

                ) {


                    TextField(
                        value = searchText,
                        onValueChange = { searchText = it },
                        placeholder = { Text("Search") },
                        modifier = Modifier
                            .weight(1f)
                            .onFocusChanged { focusState ->
                                isTextFieldFocused = focusState.isFocused
                            },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.LightGray,
                            unfocusedContainerColor = colorResource(R.color.smokey_white),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black
                        ),
                        singleLine = true,

                        )
                    IconButton(onClick = { isSearching = !isSearching }) {
                        Icon(
                            Icons.Outlined.Close,
                            contentDescription = null,
                            modifier = Modifier
                                .size(32.dp)
                                .padding(end = 8.dp)
                        )
                    }
                }
            }


        } else {
            Text(
                "Updates",
                fontWeight = FontWeight.Medium,
                fontSize = 32.sp,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 18.dp),

                )

            Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                IconButton(
                    onClick = {/*ToDo*/ }
                ) {
                    Icon(
                        Icons.Default.QrCode,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                }

                IconButton(
                    onClick = { isSearching = !isSearching }
                ) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                }

                IconButton(
                    onClick = {/*ToDo*/ }
                ) {
                    Icon(
                        Icons.Default.MoreVert,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }


    }
    HorizontalDivider(
        thickness = 1.dp,
        modifier = Modifier
            .padding(top = 4.dp)
    )
}

