package com.marco.withoutdefault

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.marco.withoutdefault.ui.theme.WithoutDefaultTheme
import com.marco.withoutdefault.ui.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WithoutDefaultTheme {
                HomeScreen()
            }
        }
    }
}
