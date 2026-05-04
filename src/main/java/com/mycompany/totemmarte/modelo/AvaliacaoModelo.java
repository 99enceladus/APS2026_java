package com.mycompany.totemmarte.modelo;

public class AvaliacaoModelo {

    private final String obraId;
    private final String obraTitulo;
    private final String faixaEtaria;
    private final String motivo;
    private final int estrelas;

    public AvaliacaoModelo(String obraId, String obraTitulo, String faixaEtaria, String motivo, int estrelas) {
        this.obraId = obraId;
        this.obraTitulo = obraTitulo;
        this.faixaEtaria = faixaEtaria;
        this.motivo = motivo;
        this.estrelas = estrelas;
    }

    public String getObraId() {
        return obraId;
    }

    public String getObraTitulo() {
        return obraTitulo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getEstrelas() {
        return estrelas;
    }
}
