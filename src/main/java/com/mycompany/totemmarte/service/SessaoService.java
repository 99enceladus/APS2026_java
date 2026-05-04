package com.mycompany.totemmarte.service;

import com.mycompany.totemmarte.modelo.AvaliacaoModelo;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import com.mycompany.totemmarte.modelo.SessaoRepositorio;
import java.util.List;

public class SessaoService {

    private final SessaoRepositorio repositorio;

    public SessaoService() {
        this(new SessaoRepositorio());
    }

    public SessaoService(SessaoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<SessaoModelo> listarSessoes() {
        return repositorio.listarSessoes();
    }

    public void salvarAvaliacao(AvaliacaoModelo avaliacao) {
        if (avaliacao.getObraId() == null || avaliacao.getObraId().isBlank()) {
            throw new IllegalArgumentException("Selecione uma obra.");
        }

        if (avaliacao.getFaixaEtaria() == null || avaliacao.getFaixaEtaria().isBlank()) {
            throw new IllegalArgumentException("Selecione a faixa etária.");
        }

        if (avaliacao.getEstrelas() < 1 || avaliacao.getEstrelas() > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }

        repositorio.salvarAvaliacao(avaliacao);
    }

    public List<AvaliacaoModelo> listarAvaliacoes() {
        return repositorio.listarAvaliacoes();
    }
}
