package com.marco.withoutdefault.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.marco.withoutdefault.ui.theme.TopBarTitleDarl
import com.marco.withoutdefault.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {

    val isDark = isSystemInDarkTheme()

    TopAppBar(
        title = { Text(text = "Sap", color = if (isDark) TopBarTitleDarl else White)},
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    )
}