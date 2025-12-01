package com.mycompany.academia.strategy;

import java.math.BigDecimal;

public class PagamentoPix implements PagamentoStrategy {
    @Override
    public boolean processar(BigDecimal valor) {
        return false;
    }

    @Override
    public String gerarComprovante() {
        return null;
    }

    public String gerarQRCode() {
        return null;
    }
}
