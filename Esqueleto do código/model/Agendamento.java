package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusAgendamento;

public class Agendamento {
    private Long id;
    private Aluno aluno;
    private HorarioAula horarioAula;
    private LocalDate data;
    private StatusAgendamento status;
    private PresencaAula presenca;

    public Agendamento() {
    }

    public void confirmar() {
        this.status = StatusAgendamento.CONFIRMADO;
    }

    public void cancelar() {
        this.status = StatusAgendamento.CANCELADO;
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

    public HorarioAula getHorarioAula() {
        return horarioAula;
    }

    public void setHorarioAula(HorarioAula horarioAula) {
        this.horarioAula = horarioAula;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }

    public PresencaAula getPresenca() {
        return presenca;
    }

    public void setPresenca(PresencaAula presenca) {
        this.presenca = presenca;
    }
}
