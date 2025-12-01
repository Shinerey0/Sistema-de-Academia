package com.mycompany.academia.observer;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEventos {
    private List<Observer> observers = new ArrayList<>();

    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(Evento evento) {
        for (Observer observer : observers) {
            observer.atualizar(evento);
        }
    }
}
