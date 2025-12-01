package com.mycompany.academia.model;

import java.time.LocalDateTime;

public class HistoricoAcesso {
    private Long id;
    private Aluno aluno;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
    private String catracaId;

    public HistoricoAcesso() {
    }

    public void registrarEntrada() {
    }

    public void registrarSaida() {
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

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getCatracaId() {
        return catracaId;
    }

    public void setCatracaId(String catracaId) {
        this.catracaId = catracaId;
    }
}
