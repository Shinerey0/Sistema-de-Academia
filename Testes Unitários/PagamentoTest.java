package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.mycompany.academia.strategy.PagamentoBoleto;

class PagamentoTest {

    private Pagamento pagamento;
    private Mensalidade mensalidade;
    private PagamentoBoleto estrategia;

    @BeforeEach
    void setUp() {
        mensalidade = new Mensalidade();
        mensalidade.setId(1L);
        
        estrategia = new PagamentoBoleto();
        
        pagamento = new Pagamento(1L, mensalidade, LocalDate.now(), new BigDecimal("150.00"), estrategia);
    }

    @Test
    void testPagamentoCreation() {
        assertNotNull(pagamento);
        assertEquals(new BigDecimal("150.00"), pagamento.getValor());
        assertEquals(1L, pagamento.getId());
    }

    @Test
    void testProcessarPagamento() {
        boolean resultado = pagamento.processar();
        assertNotNull(resultado);
    }

    @Test
    void testProcessarSemEstrategia() {
        Pagamento pagamentoSemEstrategia = new Pagamento(2L, mensalidade, LocalDate.now(), new BigDecimal("100.00"), null);
        
        boolean resultado = pagamentoSemEstrategia.processar();
        
        assertFalse(resultado);
    }

    @Test
    void testMensalidadeAssociada() {
        assertEquals(mensalidade, pagamento.getMensalidade());
    }
}
