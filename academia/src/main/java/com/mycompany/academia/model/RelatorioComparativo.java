package com.mycompany.academia.model;

public class RelatorioComparativo {
    private AvaliacaoFisica primeira;
    private AvaliacaoFisica segunda;

    public RelatorioComparativo() {
    }

    public RelatorioComparativo(AvaliacaoFisica primeira, AvaliacaoFisica segunda) {
        this.primeira = primeira;
        this.segunda = segunda;
    }

    public AvaliacaoFisica getPrimeira() {
        return primeira;
    }

    public void setPrimeira(AvaliacaoFisica primeira) {
        this.primeira = primeira;
    }

    public AvaliacaoFisica getSegunda() {
        return segunda;
    }

    public void setSegunda(AvaliacaoFisica segunda) {
        this.segunda = segunda;
    }
}
