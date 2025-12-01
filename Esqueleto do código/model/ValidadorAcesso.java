package com.mycompany.academia.model;

public class ValidadorAcesso {
    public boolean validarQRCode(QRCode qrCode) {
        return qrCode != null && qrCode.isValido();
    }

    public boolean verificarAdimplencia(Aluno aluno) {
        return false;
    }

    public boolean verificarPlanoAtivo(Aluno aluno) {
        return aluno.getPlanoAtivo() != null && aluno.getPlanoAtivo().isAtivo();
    }

    public void liberarCatraca() {
    }
}
