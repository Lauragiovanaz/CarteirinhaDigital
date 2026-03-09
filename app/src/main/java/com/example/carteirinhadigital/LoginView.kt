package com.example.carteirinhadigital

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.CarteirinhaDigitalTheme

@Composable
fun LoginView(
    modifier: Modifier = Modifier
) {
    Column() {
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Login")
            },
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text("Login")
            },
        )
        Button(
            onClick = {}
        ) {
            Text("Entrar")
        }

        OutlinedButton(
            onClick = {}
        ) {
            Text("Entrar")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLoginClaro(){
    CarteirinhaDigitalTheme(darkTheme = false){
        LoginView()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewLoginEscuro(){
    CarteirinhaDigitalTheme(darkTheme = true){
        LoginView()
    }
}