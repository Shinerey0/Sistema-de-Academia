package com.mycompany.academia.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.academia.enumeracao.StatusPlano;

public class Plano {
    private Long id;
    private String nome;
    private BigDecimal valor;
    private Integer duracao;
    private List<Modalidade> modalidades = new ArrayList<>();
    private StatusPlano status;

    public Plano() {
    }

    public Plano(Long id, String nome, BigDecimal valor, Integer duracao, StatusPlano status) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.duracao = duracao;
        this.status = status;
    }

    public BigDecimal calcularValorTotal() {
        if (valor != null) {
            return valor.multiply(new BigDecimal(duracao));
        }
        return BigDecimal.ZERO;
    }

    public boolean isAtivo() {
        return status == StatusPlano.ATIVO;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }

    public StatusPlano getStatus() {
        return status;
    }

    public void setStatus(StatusPlano status) {
        this.status = status;
    }
}
