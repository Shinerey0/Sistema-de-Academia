package com.mycompany.academia.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TreinoRealizado {
    private Long id;
    private Aluno aluno;
    private FichaTreino ficha;
    private LocalDate data;
    private String observacoes;
    private List<ExercicioExecutado> exerciciosExecutados = new ArrayList<>();

    public TreinoRealizado() {
    }

    public TreinoRealizado(Long id, Aluno aluno, FichaTreino ficha, LocalDate data, String observacoes) {
        this.id = id;
        this.aluno = aluno;
        this.ficha = ficha;
        this.data = data;
        this.observacoes = observacoes;
    }

    public void registrarExercicio() {
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

    public FichaTreino getFicha() {
        return ficha;
    }

    public void setFicha(FichaTreino ficha) {
        this.ficha = ficha;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public List<ExercicioExecutado> getExerciciosExecutados() {
        return exerciciosExecutados;
    }

    public void setExerciciosExecutados(List<ExercicioExecutado> exerciciosExecutados) {
        this.exerciciosExecutados = exerciciosExecutados;
    }
}
