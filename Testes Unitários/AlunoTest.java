package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusUsuario;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno(1L, "João Silva", "12345678901", "joao@example.com", 
                         "11987654321", "foto.jpg", "senha123", StatusUsuario.ATIVO, LocalDate.now());
    }

    @Test
    void testAlunoCreation() {
        assertNotNull(aluno);
        assertEquals("João Silva", aluno.getNome());
        assertEquals("12345678901", aluno.getCpf());
        assertEquals(StatusUsuario.ATIVO, aluno.getStatus());
    }

    @Test
    void testVisualizarTreino() {
        FichaTreino ficha = new FichaTreino();
        aluno.setFichaAtiva(ficha);
        assertEquals(ficha, aluno.visualizarTreino());
    }

    @Test
    void testPlanoAtivo() {
        Plano plano = new Plano();
        aluno.setPlanoAtivo(plano);
        assertNotNull(aluno.getPlanoAtivo());
        assertEquals(plano, aluno.getPlanoAtivo());
    }

    @Test
    void testQRCode() {
        QRCode qrCode = new QRCode();
        aluno.setQrCode(qrCode);
        assertNotNull(aluno.getQrCode());
    }
}
