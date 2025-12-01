package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusUsuario;

public class Aluno extends Usuario {
    private QRCode qrCode;
    private Plano planoAtivo;
    private FichaTreino fichaAtiva;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String cpf, String email, String telefone, String foto, String senha, StatusUsuario status, LocalDate dataCadastro) {
        super(id, nome, cpf, email, telefone, foto, senha, status, dataCadastro);
    }

    public void realizarCheckIn() {
    }

    public FichaTreino visualizarTreino() {
        return fichaAtiva;
    }

    public void marcarExercicioConcluido() {
    }

    public void reservarAula() {
    }

    public QRCode getQrCode() {
        return qrCode;
    }

    public void setQrCode(QRCode qrCode) {
        this.qrCode = qrCode;
    }

    public Plano getPlanoAtivo() {
        return planoAtivo;
    }

    public void setPlanoAtivo(Plano planoAtivo) {
        this.planoAtivo = planoAtivo;
    }

    public FichaTreino getFichaAtiva() {
        return fichaAtiva;
    }

    public void setFichaAtiva(FichaTreino fichaAtiva) {
        this.fichaAtiva = fichaAtiva;
    }
}
