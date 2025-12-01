package com.mycompany.academia.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.academia.enumeracao.StatusFicha;

public class FichaTreino {
    private Long id;
    private Aluno aluno;
    private Professor professor;
    private LocalDate dataCriacao;
    private LocalDate dataValidade;
    private StatusFicha status;
    private List<ExercicioFicha> exercicios = new ArrayList<>();

    public FichaTreino() {
    }

    public FichaTreino(Long id, Aluno aluno, Professor professor, LocalDate dataCriacao, LocalDate dataValidade, StatusFicha status) {
        this.id = id;
        this.aluno = aluno;
        this.professor = professor;
        this.dataCriacao = dataCriacao;
        this.dataValidade = dataValidade;
        this.status = status;
    }

    public FichaTreino clonar() {
        return null;
    }

    public void ativar() {
        this.status = StatusFicha.ATIVA;
    }

    public void inativar() {
        this.status = StatusFicha.INATIVA;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public StatusFicha getStatus() {
        return status;
    }

    public void setStatus(StatusFicha status) {
        this.status = status;
    }

    public List<ExercicioFicha> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<ExercicioFicha> exercicios) {
        this.exercicios = exercicios;
    }
}
