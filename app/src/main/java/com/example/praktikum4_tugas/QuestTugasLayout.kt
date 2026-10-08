package com.example.praktikum4_tugas

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardLayoutReUsable(
    nama: String,
    noTelp: String?,
    alamat: String,
    warnaCard: Color,
    fontNama: FontFamily?
){
    Card(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(12.dp),
        colors = CardDefaults.cardColors(containerColor = warnaCard)
        ){
        Row(verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(100.dp).padding(all = 5.dp)
            )
        }
    }
    )

}