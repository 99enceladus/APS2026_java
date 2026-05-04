package com.mycompany.totemmarte.modelo;

import java.util.ArrayList;
import java.util.List;

public class FakeSessaoDatabase {

    public List<SessaoModelo> listarSessoes() {
        List<SessaoModelo> lista = new ArrayList<>();

        lista.add(new SessaoModelo(
                "marte-planeta",
                SessaoModelo.Grupo.MARTE,
                " PLANETA MARTE",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgMarte.png",
                "/1_home/marte.png",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "marte-objetivos",
                SessaoModelo.Grupo.MARTE,
                "OBJETIVOS ",
                SessaoModelo.alinhar.DIREITA,
                "Texto 1",
                SessaoModelo.posicionar.ESQUERDA,
                "/1_home/imgSolo.jpg",
                "/1_home/Solo.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "marte-rovers",
                SessaoModelo.Grupo.MARTE,
                " ROVERS",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgRover.jpg",
                "/1_home/Rover.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "gemeos-rovers",
                SessaoModelo.Grupo.GEMEOS,
                " ROVERS GEMEOS",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgOpportunity.jpeg",
                "/2_spirit_opportunity/Opportunity.jpeg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "gemeos-pouso",
                SessaoModelo.Grupo.GEMEOS,
                "LOCAL DE POUSO ",
                SessaoModelo.alinhar.DIREITA,
                "Texto 1",
                SessaoModelo.posicionar.ESQUERDA,
                "/2_spirit_opportunity/imgSunset.jpg",
                "/2_spirit_opportunity/Sunset.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "gemeos-objetivos",
                SessaoModelo.Grupo.GEMEOS,
                " OBJETIVOS",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgDustDevil.jpg",
                "/2_spirit_opportunity/DustDevil.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "curiosity-rover",
                SessaoModelo.Grupo.CURIOSITY,
                " ROVER CURIOSITY",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgCuriosity.jpg",
                "/3_curiosity/Curiosity.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "curiosity-pouso",
                SessaoModelo.Grupo.CURIOSITY,
                "LOCAL DE POUSO ",
                SessaoModelo.alinhar.DIREITA,
                "Texto 1",
                SessaoModelo.posicionar.ESQUERDA,
                "/3_curiosity/imgCartaoPostal.jpg",
                "/3_curiosity/CartaoPostal.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "curiosity-estrutura",
                SessaoModelo.Grupo.CURIOSITY,
                " OBJETIVOS E ESTRUTURA ",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgMeteorito.jpg",
                "/3_curiosity/Meteorito.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "perseverance-rover",
                SessaoModelo.Grupo.PERSEVERANCE,
                " ROVER PERSEVERANCE",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgPerseverance.jpg",
                "/4_perseverance/Perseverance.jpg",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "perseverance-pouso",
                SessaoModelo.Grupo.PERSEVERANCE,
                "LOCAL DE POUSO ",
                SessaoModelo.alinhar.DIREITA,
                "Texto 1",
                SessaoModelo.posicionar.ESQUERDA,
                "/4_perseverance/imgCratera.png",
                "/4_perseverance/Cratera.png",
                "texto legenda"
        ));

        lista.add(new SessaoModelo(
                "perseverance-estrutura",
                SessaoModelo.Grupo.PERSEVERANCE,
                " OBJETIVOS E ESTRUTURA",
                SessaoModelo.alinhar.ESQUERDA,
                "Texto 1",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgSoloP.jpg",
                "/4_perseverance/SoloP.jpg",
                "texto legenda"
        ));

        return lista;
    }
}
