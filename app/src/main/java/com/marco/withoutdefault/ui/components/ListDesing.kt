package com.marco.withoutdefault.ui.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.marco.withoutdefault.data.model.Valores
import com.marco.withoutdefault.data.repository.listCol
import com.marco.withoutdefault.ui.theme.ScreenSkeleton
import com.marco.withoutdefault.ui.theme.WithoutDefaultTheme

@Composable
fun ListDados(lista: Valores) {

    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 14.dp)
            .clickable {
                Toast
                    .makeText(context, "ola", Toast.LENGTH_SHORT)
                    .show()
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = lista.img,
            contentDescription = "",
            placeholder = ScreenSkeleton,
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp)
        ) {
            Column {

                Text(
                    text = lista.nome,
                    textAlign = TextAlign.Start,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = lista.descricao,
                    textAlign = TextAlign.Start,
                    color = Color.Gray,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Text(
                text = lista.horario,
                textAlign = TextAlign.End,
                color = Color.Gray,
                modifier = Modifier
                    .fillMaxWidth()
            )
        }
    }
}




    @Preview(showBackground = true)
    @Composable
    fun ListDadosPreview() {
        ListDados(listCol[0])
    }

    @Preview(showBackground = true)
    @Composable
    fun ListDadosPreviewDark() {
        WithoutDefaultTheme(darkTheme = true) {
            ListDados(listCol[0])
        }
    }