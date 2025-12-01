package com.mycompany.academia.model;

import java.time.LocalDate;
import com.mycompany.academia.enumeracao.StatusUsuario;

public abstract class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String foto;
    private String senha;
    private StatusUsuario status;
    private LocalDate dataCadastro;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String cpf, String email, String telefone, String foto, String senha, StatusUsuario status, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.foto = foto;
        this.senha = senha;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    public boolean autenticar() {
        return false;
    }

    public void recuperarSenha() {
    }

    public void atualizarDados() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public StatusUsuario getStatus() {
        return status;
    }

    public void setStatus(StatusUsuario status) {
        this.status = status;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
