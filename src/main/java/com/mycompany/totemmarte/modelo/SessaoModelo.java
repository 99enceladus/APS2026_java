/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.totemmarte.modelo;

/**
 *
 * @author nana
 */
public class SessaoModelo {
    private final String titulo;
    private final alinhar alinhamentoTitulo;
    private final String descricao;
    private final posicionar posicaoImagem;
    private final String caminhoImagem;
    private final String caminhoImagemGrande;
    private final String legenda;

    public SessaoModelo(String titulo, alinhar alinhamentoTitulo, String descricao, posicionar posicaoImagem, String caminhoImagem, String imagemGrande, String legenda) {
        this.titulo = titulo;
        this.alinhamentoTitulo = alinhamentoTitulo;
        this.descricao = descricao;
        this.posicaoImagem = posicaoImagem;
        this.caminhoImagem = caminhoImagem;
        //configuracoes do Jdialog
        this.caminhoImagemGrande= imagemGrande;
        this.legenda = legenda;
    }

    public String getTitulo() {
        return titulo;
    }

    public alinhar getAlinhamentoTitulo() {
        return alinhamentoTitulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public posicionar getPosicaoImagem() {
        return posicaoImagem;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public String getCaminhoImagemGrande() {
        return caminhoImagemGrande;
    }

    public String getLegenda() {
        return legenda;
    }
    
    public enum alinhar {DIREITA, ESQUERDA}
    
    public enum posicionar {DIREITA, ESQUERDA}

}
