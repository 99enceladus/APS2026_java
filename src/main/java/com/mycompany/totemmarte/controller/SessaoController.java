package com.mycompany.totemmarte.controller;

import com.mycompany.totemmarte.modelo.SessaoModelo;
import com.mycompany.totemmarte.modelo.SessaoRepositorio;

import java.util.List;

public class SessaoController {

    private SessaoRepositorio repositorio;

    public SessaoController() {
        this.repositorio = new SessaoRepositorio();
    }

    public List<SessaoModelo> listarSessoes() {
        return repositorio.listarSessoes();
    }
}