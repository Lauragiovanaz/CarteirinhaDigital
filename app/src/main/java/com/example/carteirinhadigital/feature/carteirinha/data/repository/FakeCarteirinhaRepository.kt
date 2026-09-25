package com.example.carteirinhadigital.feature.carteirinha.data.repository

import com.example.carteirinhadigital.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun getCarteirinha(usuarioId: String): Carteirinha? {
        delay(1000)
        return Carteirinha(
            nome = "Laura Giovanaz",
            curso = "Desenvolvimento de Sistemas",
            turma = "3DEVEST",
            matricula = "00001116684792",
            unidade = "SENAI Anchieta",
            status = "Ativo",
            qrCodeContent = "SENAI:00001116684792:Aluno SENAI:Desenvolvimento de Sistemas"
        )
    }
}
