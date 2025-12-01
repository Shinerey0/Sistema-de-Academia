package com.mycompany.academia.observer;

public class Evento {
    private String tipo;

    public Evento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
