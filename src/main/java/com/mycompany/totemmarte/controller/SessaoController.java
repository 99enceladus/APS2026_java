package com.mycompany.totemmarte.controller;

import com.mycompany.totemmarte.modelo.AvaliacaoModelo;
import com.mycompany.totemmarte.modelo.SessaoModelo;
import com.mycompany.totemmarte.service.SessaoService;
import java.util.List;

public class SessaoController {

    private final SessaoService service;

    public SessaoController() {
        this(new SessaoService());
    }

    public SessaoController(SessaoService service) {
        this.service = service;
    }

    public List<SessaoModelo> listarSessoes() {
        return service.listarSessoes();
    }

    public void salvarAvaliacao(AvaliacaoModelo avaliacao) {
        service.salvarAvaliacao(avaliacao);
    }

    public List<AvaliacaoModelo> listarAvaliacoes() {
        return service.listarAvaliacoes();
    }
}