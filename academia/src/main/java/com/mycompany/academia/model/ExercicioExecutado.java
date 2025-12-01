package com.mycompany.academia.model;

import java.math.BigDecimal;

public class ExercicioExecutado {
    private Long id;
    private Exercicio exercicio;
    private BigDecimal cargaUtilizada;
    private boolean concluido;

    public ExercicioExecutado() {
    }

    public ExercicioExecutado(Long id, Exercicio exercicio, BigDecimal cargaUtilizada, boolean concluido) {
        this.id = id;
        this.exercicio = exercicio;
        this.cargaUtilizada = cargaUtilizada;
        this.concluido = concluido;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Exercicio getExercicio() {
        return exercicio;
    }

    public void setExercicio(Exercicio exercicio) {
        this.exercicio = exercicio;
    }

    public BigDecimal getCargaUtilizada() {
        return cargaUtilizada;
    }

    public void setCargaUtilizada(BigDecimal cargaUtilizada) {
        this.cargaUtilizada = cargaUtilizada;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
