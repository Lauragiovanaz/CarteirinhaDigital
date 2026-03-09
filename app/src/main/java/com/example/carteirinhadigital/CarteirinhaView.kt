package com.example.carteirinhadigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rafaelcosta.myapplication.QrCode

@Preview(showBackground = true)
@Composable
fun CarteirinhaView(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.papelparede),
            contentDescription = "Papel de Parede",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),

            colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                androidx.compose.ui.graphics.Color.Black.copy(alpha = 0.5f), // 0.5f é 50% de escuridão
                androidx.compose.ui.graphics.BlendMode.Darken
            )
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.logosenai),
                contentDescription = "Logo SENAI",
                modifier = Modifier.size(250.dp)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Image(
                    painter = painterResource(R.drawable.perfil),
                    contentDescription = "Foto de Perfil",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(100.dp))
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row {
                    Text(
                        text = "Nome: ",
                        style = MaterialTheme.typography.titleLarge,
                        color = androidx.compose.ui.graphics.Color.White

                    )
                    Text(
                        text = "Kianthe Reyna",
                        style = MaterialTheme.typography.titleLarge,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                }

                Row {
                    Text(
                        text = "Curso: ",
                        style = MaterialTheme.typography.titleLarge,
                        color = androidx.compose.ui.graphics.Color.White

                    )
                    Text(
                        text = "Magia de Combate",
                        style = MaterialTheme.typography.titleLarge,
                        color = androidx.compose.ui.graphics.Color.White
                    )
                }
            }

            QrCode(
                "Valor do QR Code",
                modifier = Modifier.size(170.dp),
            )
        }
    }
}
