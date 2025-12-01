package com.mycompany.academia.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.academia.enumeracao.StatusUsuario;

public class Professor extends Usuario {
    private List<String> especialidades = new ArrayList<>();

    public Professor() {
    }

    public Professor(Long id, String nome, String cpf, String email, String telefone, String foto, String senha, StatusUsuario status, LocalDate dataCadastro) {
        super(id, nome, cpf, email, telefone, foto, senha, status, dataCadastro);
    }

    public FichaTreino criarFichaTreino() {
        return null;
    }

    public AvaliacaoFisica registrarAvaliacao() {
        return null;
    }

    public List<Aluno> visualizarAlunos() {
        return null;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
}
