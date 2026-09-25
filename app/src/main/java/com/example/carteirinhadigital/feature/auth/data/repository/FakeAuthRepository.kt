package com.example.carteirinhadigital.feature.auth.data.repository

import com.example.carteirinhadigital.feature.auth.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeAuthRepository : AuthRepository {
    override suspend fun login(usuario: String, senha: String): UsuarioLogado? {
        delay(1500)
        return if (usuario == "aluno" && senha == "aluno1234") {
            UsuarioLogado(
                id = "001",
                nome = "Laura Giovanaz",
                token = "fake-token-senai-2024"
            )
        } else {
            null
        }
    }
}
