package com.mycompany.academia.model;

import java.math.BigDecimal;

public class ComposicaoCorporal {
    private BigDecimal percentualGordura;
    private BigDecimal massaMagra;
    private BigDecimal massaGorda;

    public ComposicaoCorporal() {
    }

    // Getters and Setters
    public BigDecimal getPercentualGordura() {
        return percentualGordura;
    }

    public void setPercentualGordura(BigDecimal percentualGordura) {
        this.percentualGordura = percentualGordura;
    }

    public BigDecimal getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(BigDecimal massaMagra) {
        this.massaMagra = massaMagra;
    }

    public BigDecimal getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(BigDecimal massaGorda) {
        this.massaGorda = massaGorda;
    }
}
