package com.example.carteirinhadigital.feature.unidadecurricular.data.repository

import com.example.carteirinhadigital.feature.unidadecurricular.domain.model.UnidadeCurricular
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepository : UnidadeCurricularRepository {
    override suspend fun getUnidades(): List<UnidadeCurricular> {
        delay(1000)
        return listOf(
            UnidadeCurricular("1", "Programação Mobile", 80, "Prof. Rafael Costa", "Em andamento"),
            UnidadeCurricular("2", "Banco de Dados", 60, "Prof. Roger", "Concluída"),
            UnidadeCurricular("3", "Desenvolvimento Web", 80, "Prof. Orrico", "Em andamento"),
            UnidadeCurricular("4", "Lógica de Programação", 40, "Prof. Rafael Oliveira", "Concluída"),
            UnidadeCurricular("5", "Redes de Computadores", 60, "Prof. Lucas Felfoid", "Em andamento")
        )
    }
}