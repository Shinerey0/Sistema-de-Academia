package com.mycompany.academia.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

class QRCodeTest {

    private QRCode qrCode;
    private Aluno aluno;

    @BeforeEach
    void setUp() {
        aluno = new Aluno();
        aluno.setId(1L);
        
        qrCode = new QRCode(1L, aluno, "QR12345", LocalDate.now(), LocalDate.now().plusDays(30));
    }

    @Test
    void testQRCodeCreation() {
        assertNotNull(qrCode);
        assertEquals("QR12345", qrCode.getCodigo());
        assertEquals(aluno, qrCode.getAluno());
    }

    @Test
    void testQRCodeValido() {
        assertTrue(qrCode.isValido());
    }

    @Test
    void testQRCodeExpirado() {
        QRCode qrCodeExpirado = new QRCode(2L, aluno, "QR54321", 
                                          LocalDate.now().minusDays(10), 
                                          LocalDate.now().minusDays(5));
        assertFalse(qrCodeExpirado.isValido());
    }
}
