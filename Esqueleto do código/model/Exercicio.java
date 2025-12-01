package com.mycompany.academia.model;

public class Exercicio {
    private Long id;
    private String nome;
    private String grupoMuscular;
    private String equipamento;
    private String descricao;
    private String videoUrl;

    public Exercicio() {
    }

    public Exercicio(Long id, String nome, String grupoMuscular, String equipamento, String descricao, String videoUrl) {
        this.id = id;
        this.nome = nome;
        this.grupoMuscular = grupoMuscular;
        this.equipamento = equipamento;
        this.descricao = descricao;
        this.videoUrl = videoUrl;
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

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
