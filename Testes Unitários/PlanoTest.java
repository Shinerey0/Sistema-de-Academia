package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import com.mycompany.academia.enumeracao.StatusPlano;

class PlanoTest {

    private Plano plano;

    @BeforeEach
    void setUp() {
        plano = new Plano(1L, "Plano Gold", new BigDecimal("150.00"), 12, StatusPlano.ATIVO);
    }

    @Test
    void testPlanoCreation() {
        assertNotNull(plano);
        assertEquals("Plano Gold", plano.getNome());
        assertEquals(new BigDecimal("150.00"), plano.getValor());
        assertEquals(12, plano.getDuracao());
    }

    @Test
    void testCalcularValorTotal() {
        BigDecimal total = plano.calcularValorTotal();
        assertEquals(new BigDecimal("1800.00"), total);
    }

    @Test
    void testIsAtivo() {
        assertTrue(plano.isAtivo());
        
        Plano planoInativo = new Plano(2L, "Plano Silver", new BigDecimal("100.00"), 6, StatusPlano.INATIVO);
        assertFalse(planoInativo.isAtivo());
    }

    @Test
    void testCalcularValorTotalComValorNull() {
        Plano planoNull = new Plano(3L, "Plano Test", null, 12, StatusPlano.ATIVO);
        BigDecimal total = planoNull.calcularValorTotal();
        assertEquals(BigDecimal.ZERO, total);
    }
}
