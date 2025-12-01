package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusPlano;

class ValidadorAcessoTest {

    private ValidadorAcesso validador;
    private Aluno aluno;
    private QRCode qrCode;
    private Plano plano;

    @BeforeEach
    void setUp() {
        validador = new ValidadorAcesso();
        
        aluno = new Aluno();
        aluno.setId(1L);
        
        plano = new Plano(1L, "Plano Gold", null, 12, StatusPlano.ATIVO);
        aluno.setPlanoAtivo(plano);
        
        qrCode = new QRCode(1L, aluno, "QR123", LocalDate.now(), LocalDate.now().plusDays(30));
        aluno.setQrCode(qrCode);
    }

    @Test
    void testValidarQRCodeValido() {
        boolean resultado = validador.validarQRCode(qrCode);
        assertTrue(resultado);
    }

    @Test
    void testValidarQRCodeExpirado() {
        QRCode qrCodeExpirado = new QRCode(2L, aluno, "QR456", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5));
        boolean resultado = validador.validarQRCode(qrCodeExpirado);
        assertFalse(resultado);
    }

    @Test
    void testValidarQRCodeNull() {
        boolean resultado = validador.validarQRCode(null);
        assertFalse(resultado);
    }

    @Test
    void testVerificarPlanoAtivo() {
        boolean resultado = validador.verificarPlanoAtivo(aluno);
        assertTrue(resultado);
    }

    @Test
    void testVerificarPlanoInativo() {
        Plano planoInativo = new Plano(2L, "Plano Silver", null, 6, StatusPlano.INATIVO);
        aluno.setPlanoAtivo(planoInativo);
        
        boolean resultado = validador.verificarPlanoAtivo(aluno);
        assertFalse(resultado);
    }

    @Test
    void testVerificarPlanoNull() {
        aluno.setPlanoAtivo(null);
        
        boolean resultado = validador.verificarPlanoAtivo(aluno);
        assertFalse(resultado);
    }
}
