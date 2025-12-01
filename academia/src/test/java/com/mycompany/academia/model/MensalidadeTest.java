package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusMensalidade;

class MensalidadeTest {

    private Mensalidade mensalidade;
    private Aluno aluno;
    private Plano plano;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
        aluno.setId(1L);
        
        plano = new Plano();
        plano.setId(1L);
        
        mensalidade = new Mensalidade(1L, aluno, plano, LocalDate.now().plusDays(10), 
                                     new java.math.BigDecimal("150.00"), StatusMensalidade.PENDENTE);
    }

    @Test
    void testMensalidadeCreation() {
        assertNotNull(mensalidade);
        assertEquals(1L, mensalidade.getId());
        assertEquals(StatusMensalidade.PENDENTE, mensalidade.getStatus());
    }

    @Test
    void testMensalidadeNaoVencida() {
        assertFalse(mensalidade.isVencida());
    }

    @Test
    void testMensalidadeVencida() {
        Mensalidade mensalidadeVencida = new Mensalidade(2L, aluno, plano, 
                                                         LocalDate.now().minusDays(5), 
                                                         new java.math.BigDecimal("150.00"), 
                                                         StatusMensalidade.ATRASADA);
        assertTrue(mensalidadeVencida.isVencida());
    }
}
