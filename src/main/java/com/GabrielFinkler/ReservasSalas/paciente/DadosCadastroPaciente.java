package com.GabrielFinkler.ReservasSalas.paciente;

import com.GabrielFinkler.ReservasSalas.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
