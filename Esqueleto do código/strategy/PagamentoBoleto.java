package com.mycompany.academia.strategy;

import java.math.BigDecimal;

public class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public boolean processar(BigDecimal valor) {
        return false;
    }

    @Override
    public String gerarComprovante() {
        return null;
    }

    public String gerarBoleto() {
        return null;
    }
}
