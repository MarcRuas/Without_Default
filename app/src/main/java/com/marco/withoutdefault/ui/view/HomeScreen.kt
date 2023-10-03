package com.marco.withoutdefault.ui.view

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.marco.withoutdefault.data.model.Valores
import com.marco.withoutdefault.data.repository.listCol
import com.marco.withoutdefault.ui.components.ListDados
import com.marco.withoutdefault.ui.components.TopBar
import com.marco.withoutdefault.ui.theme.DarkContainer
import com.marco.withoutdefault.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val isDark = isSystemInDarkTheme()

    Scaffold(
        topBar = {
            TopBar()
        },
        containerColor = if (isDark) DarkContainer else White
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            ValoresLista(listar = listCol)
        }
    }
}


fun LazyListScope.ValoresLista(listar: List<Valores>){
    itemsIndexed(listar){_, item ->
        ListDados(lista = item)
    }
}