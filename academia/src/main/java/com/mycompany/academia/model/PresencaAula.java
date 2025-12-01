package com.mycompany.academia.model;

import java.time.LocalDateTime;

public class PresencaAula {
    private Long id;
    private boolean presente;
    private LocalDateTime dataCheckin;

    public PresencaAula() {
    }

    public void registrarPresenca() {
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public LocalDateTime getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(LocalDateTime dataCheckin) {
        this.dataCheckin = dataCheckin;
    }
}
