package com.mycompany.academia.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.academia.enumeracao.DiaSemana;

public class HorarioAula {
    private Long id;
    private TipoAula tipoAula;
    private Professor professor;
    private DiaSemana diaSemana;
    private LocalTime horario;
    private Integer capacidade;
    private String sala;
    private List<Agendamento> agendamentos = new ArrayList<>();

    public HorarioAula() {
    }

    public boolean temVaga() {
        return agendamentos.size() < capacidade;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAula getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(TipoAula tipoAula) {
        this.tipoAula = tipoAula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
