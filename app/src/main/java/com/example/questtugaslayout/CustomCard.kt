package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomCard(
    nama: String,
    alamat: String,
    containerColor: Color,
    logoRes: Int,
    noTelp: String? = null,
    fontFamily: FontFamily? = null,
    namaColor: Color = Color.White,
    alamatColor: Color = Color.White,
    noTelpColor: Color = Color.White
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val gambar = painterResource(logoRes)
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp)
            ) {
                Text(
                    text = nama,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = fontFamily,
                    color = namaColor
                )
                if (noTelp != null) {
                    Text(
                        text = noTelp,
                        fontSize = 12.sp,
                        color = noTelpColor
                    )
                }
                Text(
                    text = alamat,
                    fontSize = 12.sp,
                    color = alamatColor
                )
            }

            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}