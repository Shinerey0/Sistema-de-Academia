package com.mycompany.academia.model;

import java.math.BigDecimal;

public class ExercicioFicha {
    private Long id;
    private Exercicio exercicio;
    private Integer ordem;
    private Integer series;
    private String repeticoes;
    private BigDecimal carga;
    private String observacoes;

    public ExercicioFicha() {
    }

    public ExercicioFicha(Long id, Exercicio exercicio, Integer ordem, Integer series, String repeticoes, BigDecimal carga, String observacoes) {
        this.id = id;
        this.exercicio = exercicio;
        this.ordem = ordem;
        this.series = series;
        this.repeticoes = repeticoes;
        this.carga = carga;
        this.observacoes = observacoes;
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

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }

    public BigDecimal getCarga() {
        return carga;
    }

    public void setCarga(BigDecimal carga) {
        this.carga = carga;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
