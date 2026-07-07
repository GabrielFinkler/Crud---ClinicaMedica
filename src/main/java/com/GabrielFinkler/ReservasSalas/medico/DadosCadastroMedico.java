package com.GabrielFinkler.ReservasSalas.medico;

import com.GabrielFinkler.ReservasSalas.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
