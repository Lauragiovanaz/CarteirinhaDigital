package com.example.carteirinhadigital.feature.carteirinha.data.repository

import com.example.carteirinhadigital.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun getCarteirinha(usuarioId: String): Carteirinha? {
        delay(1000)
        return Carteirinha(
            nome = "Kauanne Oliveira",
            curso = "Desenvolvimento de Sistemas",
            turma = "4DEVM",
            matricula = "20260001",
            unidade = "SENAI Anchieta",
            status = "Ativo",
            qrCodeContent = "SENAI:20260001:Aluno SENAI:Desenvolvimento de Sistemas"
        )
    }
}
