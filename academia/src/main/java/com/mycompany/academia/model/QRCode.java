package com.mycompany.academia.model;

import java.time.LocalDate;

public class QRCode {
    private Long id;
    private Aluno aluno;
    private String codigo;
    private LocalDate dataGeracao;
    private LocalDate dataExpiracao;

    public QRCode() {
    }

    public QRCode(Long id, Aluno aluno, String codigo, LocalDate dataGeracao, LocalDate dataExpiracao) {
        this.id = id;
        this.aluno = aluno;
        this.codigo = codigo;
        this.dataGeracao = dataGeracao;
        this.dataExpiracao = dataExpiracao;
    }

    public boolean isValido() {
        return LocalDate.now().isBefore(dataExpiracao);
    }

    public void renovar() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
