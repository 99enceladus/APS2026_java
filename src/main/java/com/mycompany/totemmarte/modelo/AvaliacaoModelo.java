package com.mycompany.totemmarte.modelo;

public class AvaliacaoModelo {

    private final String obraId;
    private final String obraTitulo;
    private final String faixaEtaria;
    private final String apresentacaoFavorita;
    private final String motivo;
    private final int estrelas;

    public AvaliacaoModelo(String obraId, String obraTitulo, String faixaEtaria, String apresentacaoFavorita, String motivo, int estrelas) {
        this.obraId = obraId;
        this.obraTitulo = obraTitulo;
        this.faixaEtaria = faixaEtaria;
        this.apresentacaoFavorita = apresentacaoFavorita;
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

    public String getApresentacaoFavorita() {
        return apresentacaoFavorita;
    }

    public String getMotivo() {
        return motivo;
    }

    public int getEstrelas() {
        return estrelas;
    }
}
