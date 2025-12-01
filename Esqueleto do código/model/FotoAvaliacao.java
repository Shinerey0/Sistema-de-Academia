package com.mycompany.academia.model;

import com.mycompany.academia.enumeracao.TipoFoto;

public class FotoAvaliacao {
    private Long id;
    private TipoFoto tipo;
    private String url;

    public FotoAvaliacao() {
    }

    public FotoAvaliacao(Long id, TipoFoto tipo, String url) {
        this.id = id;
        this.tipo = tipo;
        this.url = url;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoFoto getTipo() {
        return tipo;
    }

    public void setTipo(TipoFoto tipo) {
        this.tipo = tipo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
