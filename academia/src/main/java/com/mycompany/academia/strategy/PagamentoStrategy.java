package com.mycompany.academia.strategy;

public interface PagamentoStrategy {
    boolean processar(java.math.BigDecimal valor);
    String gerarComprovante();
}
