package com.skywalker.whatsapp_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.skywalker.whatsapp_clone.presentation.callscreen.CallScreen
import com.skywalker.whatsapp_clone.presentation.chatscreen.ChatScreen
import com.skywalker.whatsapp_clone.presentation.communityscreen.CommunityScreen
import com.skywalker.whatsapp_clone.presentation.homescreen.HomeScreen
import com.skywalker.whatsapp_clone.presentation.splashscreen.SplashScreen
import com.skywalker.whatsapp_clone.presentation.status_screen.StatusScreen
import com.skywalker.whatsapp_clone.ui.theme.Whatsapp_cloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Whatsapp_cloneTheme {
                // SplashScreen()
                // HomeScreen()
                // StatusScreen()
                // CommunityScreen()
                // CallScreen()
                ChatScreen()
            }
        }
    }
}


