package com.mycompany.academia.model;

import java.math.BigDecimal;

public class MedidasCorporais {
    private BigDecimal pescoco;
    private BigDecimal peitoral;
    private BigDecimal cintura;
    private BigDecimal quadril;
    private BigDecimal coxa;
    private BigDecimal panturrilha;
    private BigDecimal braco;

    public MedidasCorporais() {
    }

    // Getters and Setters
    public BigDecimal getPescoco() {
        return pescoco;
    }

    public void setPescoco(BigDecimal pescoco) {
        this.pescoco = pescoco;
    }

    public BigDecimal getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(BigDecimal peitoral) {
        this.peitoral = peitoral;
    }

    public BigDecimal getCintura() {
        return cintura;
    }

    public void setCintura(BigDecimal cintura) {
        this.cintura = cintura;
    }

    public BigDecimal getQuadril() {
        return quadril;
    }

    public void setQuadril(BigDecimal quadril) {
        this.quadril = quadril;
    }

    public BigDecimal getCoxa() {
        return coxa;
    }

    public void setCoxa(BigDecimal coxa) {
        this.coxa = coxa;
    }

    public BigDecimal getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(BigDecimal panturrilha) {
        this.panturrilha = panturrilha;
    }

    public BigDecimal getBraco() {
        return braco;
    }

    public void setBraco(BigDecimal braco) {
        this.braco = braco;
    }
}
