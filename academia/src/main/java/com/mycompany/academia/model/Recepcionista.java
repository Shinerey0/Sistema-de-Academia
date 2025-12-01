package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusUsuario;

public class Recepcionista extends Usuario {
    public Recepcionista() {
    }

    public Recepcionista(Long id, String nome, String cpf, String email, String telefone, String foto, String senha, StatusUsuario status, LocalDate dataCadastro) {
        super(id, nome, cpf, email, telefone, foto, senha, status, dataCadastro);
    }

    public boolean validarAcesso() {
        return false;
    }

    public void registrarPagamento() {
    }

    public void cadastrarAluno() {
    }
}
