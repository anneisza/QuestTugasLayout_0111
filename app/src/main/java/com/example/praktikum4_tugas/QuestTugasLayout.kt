package com.example.praktikum4_tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardLayoutReUsable(
    nama: String,
    noTelp: String?,
    alamat: String,
    warnaCard: Color,
    warnaNama: Color,
    warnaNoTelp: Color,
    warnaAlamat: Color,
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
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    nama,
                    fontSize = 30.sp,
                    fontFamily = fontNama,
                    fontWeight = FontWeight.Bold,
                    color = warnaNama
                )
                if (noTelp != null){
                    Text(
                        noTelp,
                        fontSize = 14.sp,
                        color = warnaNoTelp
                    )
                }
                Text(
                    alamat,
                    fontSize = 16.sp,
                    color = warnaAlamat
                )
            }
            Image(
                painter = painterResource(R.drawable.logo_ti_bgputih),
                contentDescription = null,
                modifier = Modifier.size(100.dp).padding(all = 5.dp)
            )
        }
    }
}

@Composable
fun AktivitasPertama(modifier: Modifier){
    Column(
        modifier = Modifier.padding(top = 100.dp).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )

        Spacer(modifier = Modifier.height(25.dp))

        CardLayoutReUsable(
            nama = stringResource(R.string.nama),
            noTelp = null,
            alamat = stringResource(R.string.alamat),
            warnaCard = colorResource(R.color.maroon_tua),
            warnaNama = colorResource(R.color.font_putih_pink),
            warnaAlamat = colorResource(R.color.font_pink_abu),
            fontNama = FontFamily.Cursive
        )
        CardLayoutReUsable()


    }
}