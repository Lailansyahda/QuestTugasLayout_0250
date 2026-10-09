package com.example.questtugaslayout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = stringResource(R.string.prodi),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(20.dp))
            CustomCard(
                nama = stringResource(R.string.nama_1),
                alamat = stringResource(R.string.alamat_1),
                containerColor = colorResource(R.color.card_1_bg),
                logoRes = R.drawable.logo_umy,
                fontFamily = FontFamily.Cursive,
                alamatColor = colorResource(R.color.text_light_gray)
            )
            CustomCard(
                nama = stringResource(R.string.nama_2),
                noTelp = stringResource(R.string.no_telp_2),
                alamat = stringResource(R.string.alamat_2),
                containerColor = colorResource(R.color.card_2_bg),
                logoRes = R.drawable.logo_umy,
                noTelpColor = colorResource(R.color.text_cyan),
                alamatColor = colorResource(R.color.text_light_gray)
            )
            CustomCard(
                nama = stringResource(R.string.nama_3),
                noTelp = stringResource(R.string.no_telp_3),
                alamat = stringResource(R.string.alamat_3),
                containerColor = colorResource(R.color.card_3_bg),
                logoRes = R.drawable.logo_umy,
                noTelpColor = colorResource(R.color.text_cyan),
                alamatColor = colorResource(R.color.text_light_gray)
            )
            CustomCard(
                nama = stringResource(R.string.nama_4),
                noTelp = stringResource(R.string.no_telp_4),
                alamat = stringResource(R.string.alamat_4),
                containerColor = colorResource(R.color.card_4_bg),
                logoRes = R.drawable.logo_umy,
                noTelpColor = colorResource(R.color.text_cyan),
                alamatColor = colorResource(R.color.text_light_gray)
            )
        }
    }
}