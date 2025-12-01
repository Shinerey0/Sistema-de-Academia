package com.mycompany.academia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.mycompany.academia.strategy.PagamentoStrategy;

public class Pagamento {
    private Long id;
    private Mensalidade mensalidade;
    private LocalDate data;
    private BigDecimal valor;
    private PagamentoStrategy formaPagamento;
    private String comprovante;

    public Pagamento() {
    }

    public Pagamento(Long id, Mensalidade mensalidade, LocalDate data, BigDecimal valor, PagamentoStrategy formaPagamento) {
        this.id = id;
        this.mensalidade = mensalidade;
        this.data = data;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public boolean processar() {
        if (formaPagamento != null) {
            return formaPagamento.processar(valor);
        }
        return false;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mensalidade getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Mensalidade mensalidade) {
        this.mensalidade = mensalidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public PagamentoStrategy getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(PagamentoStrategy formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getComprovante() {
        return comprovante;
    }

    public void setComprovante(String comprovante) {
        this.comprovante = comprovante;
    }
}
