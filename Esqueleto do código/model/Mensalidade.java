package com.mycompany.academia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusMensalidade;

public class Mensalidade {
    private Long id;
    private Aluno aluno;
    private Plano plano;
    private LocalDate vencimento;
    private BigDecimal valor;
    private StatusMensalidade status;

    public Mensalidade() {
    }

    public Mensalidade(Long id, Aluno aluno, Plano plano, LocalDate vencimento, BigDecimal valor, StatusMensalidade status) {
        this.id = id;
        this.aluno = aluno;
        this.plano = plano;
        this.vencimento = vencimento;
        this.valor = valor;
        this.status = status;
    }

    public BigDecimal calcularMultaJuros() {
        return BigDecimal.ZERO;
    }

    public boolean isVencida() {
        return LocalDate.now().isAfter(vencimento);
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

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusMensalidade getStatus() {
        return status;
    }

    public void setStatus(StatusMensalidade status) {
        this.status = status;
    }
}
