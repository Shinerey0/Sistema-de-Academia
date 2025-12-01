package com.mycompany.academia.model;

public class GeradorRelatorios {
    private static GeradorRelatorios instancia;

    private GeradorRelatorios() {
    }

    public static synchronized GeradorRelatorios getInstance() {
        if (instancia == null) {
            instancia = new GeradorRelatorios();
        }
        return instancia;
    }

    public Relatorio gerarRelatorioInadimplencia() {
        return null;
    }

    public Relatorio gerarRelatorioFrequencia() {
        return null;
    }

    public Relatorio gerarRelatorioReceita() {
        return null;
    }

    public Dashboard gerarDashboard() {
        return null;
    }
}
