package com.mycompany.academia.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoFisica {
    private Long id;
    private Aluno aluno;
    private Professor avaliador;
    private LocalDate data;
    private BigDecimal peso;
    private BigDecimal altura;
    private BigDecimal imc;
    private MedidasCorporais medidasCorporais;
    private ComposicaoCorporal composicaoCorporal;
    private List<FotoAvaliacao> fotos = new ArrayList<>();

    public AvaliacaoFisica() {
    }

    public AvaliacaoFisica(Long id, Aluno aluno, Professor avaliador, LocalDate data, BigDecimal peso, BigDecimal altura) {
        this.id = id;
        this.aluno = aluno;
        this.avaliador = avaliador;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
    }

    public BigDecimal calcularIMC() {
        if (peso != null && altura != null && altura.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal alturaM = altura.divide(new BigDecimal(100), 2, java.math.RoundingMode.HALF_UP);
            BigDecimal alturaAoQuadrado = alturaM.multiply(alturaM);
            return peso.divide(alturaAoQuadrado, 2, java.math.RoundingMode.HALF_UP);
        }
        return BigDecimal.ZERO;
    }

    public BigDecimal calcularTMB() {
        return BigDecimal.ZERO;
    }

    public RelatorioComparativo compararCom(AvaliacaoFisica outra) {
        return null;
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

    public Professor getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Professor avaliador) {
        this.avaliador = avaliador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getImc() {
        return imc;
    }

    public void setImc(BigDecimal imc) {
        this.imc = imc;
    }

    public MedidasCorporais getMedidasCorporais() {
        return medidasCorporais;
    }

    public void setMedidasCorporais(MedidasCorporais medidasCorporais) {
        this.medidasCorporais = medidasCorporais;
    }

    public ComposicaoCorporal getComposicaoCorporal() {
        return composicaoCorporal;
    }

    public void setComposicaoCorporal(ComposicaoCorporal composicaoCorporal) {
        this.composicaoCorporal = composicaoCorporal;
    }

    public List<FotoAvaliacao> getFotos() {
        return fotos;
    }

    public void setFotos(List<FotoAvaliacao> fotos) {
        this.fotos = fotos;
    }
}
