package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusUsuario;

public class Administrador extends Usuario {
    public Administrador() {
    }

    public Administrador(Long id, String nome, String cpf, String email, String telefone, String foto, String senha, StatusUsuario status, LocalDate dataCadastro) {
        super(id, nome, cpf, email, telefone, foto, senha, status, dataCadastro);
    }

    public void gerenciarUsuarios() {
    }

    public void configurarPermissoes() {
    }

    public void visualizarRelatorios() {
    }
}
