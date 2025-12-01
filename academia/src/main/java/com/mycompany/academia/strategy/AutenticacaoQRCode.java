package com.mycompany.academia.strategy;

public class AutenticacaoQRCode implements AutenticacaoStrategy {
    @Override
    public boolean autenticar(String credencial) {
        return false;
    }
}
