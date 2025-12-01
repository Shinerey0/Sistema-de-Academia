package com.mycompany.academia.strategy;

public class AutenticacaoEmail implements AutenticacaoStrategy {
    @Override
    public boolean autenticar(String credencial) {
        return false;
    }
}
