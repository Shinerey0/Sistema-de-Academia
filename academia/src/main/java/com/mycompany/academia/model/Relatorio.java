package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.TipoRelatorio;

public class Relatorio {
    private TipoRelatorio tipo;
    private LocalDate dataGeracao;
    private Object dados;

    public Relatorio() {
    }

    public Relatorio(TipoRelatorio tipo, LocalDate dataGeracao, Object dados) {
        this.tipo = tipo;
        this.dataGeracao = dataGeracao;
        this.dados = dados;
    }

    public java.io.File exportarPDF() {
        return null;
    }

    public java.io.File exportarExcel() {
        return null;
    }

    // Getters and Setters
    public TipoRelatorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoRelatorio tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }
}
