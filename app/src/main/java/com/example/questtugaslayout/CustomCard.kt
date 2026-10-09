package com.example.questtugaslayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

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

            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}