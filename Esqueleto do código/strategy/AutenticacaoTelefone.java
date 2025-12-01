package com.mycompany.academia.strategy;

public class AutenticacaoTelefone implements AutenticacaoStrategy {
    @Override
    public boolean autenticar(String credencial) {
        return false;
    }
}
