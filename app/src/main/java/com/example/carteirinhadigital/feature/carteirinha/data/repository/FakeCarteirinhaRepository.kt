package com.example.carteirinhadigital.feature.carteirinha.data.repository

import com.example.carteirinhadigital.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun getCarteirinha(usuarioId: String): Carteirinha? {
        delay(1000)
        return Carteirinha(
            nome = "Aluno SENAI",
            curso = "Desenvolvimento de Sistemas",
            turma = "4DS-VM-T1",
            matricula = "20240001",
            unidade = "SENAI Suíço",
            status = "Ativo",
            qrCodeContent = "SENAI:20240001:Aluno SENAI:Desenvolvimento de Sistemas"
        )
    }
}
