package com.mycompany.totemmarte.modelo;

import java.util.ArrayList;
import java.util.List;

public class FakeSessaoDatabase {

    public List<SessaoModelo> listarSessoes() {
        List<SessaoModelo> lista = new ArrayList<>();

        lista.add(new SessaoModelo(
                "marte-planeta",
                SessaoModelo.Grupo.MARTE,
                "Planeta Marte",
                SessaoModelo.alinhar.ESQUERDA,
                "Marte e o quarto planeta do Sistema Solar e um dos alvos mais estudados pela exploracao espacial.",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgMarte.png",
                "/1_home/marte.png",
                "Visao geral do planeta Marte."
        ));

        lista.add(new SessaoModelo(
                "marte-objetivos",
                SessaoModelo.Grupo.MARTE,
                "Objetivos da exploracao",
                SessaoModelo.alinhar.DIREITA,
                "As missoes em Marte investigam clima, geologia e sinais de que o planeta ja teve condicoes para vida.",
                SessaoModelo.posicionar.ESQUERDA,
                "/1_home/imgSolo.jpg",
                "/1_home/Solo.jpg",
                "Detalhe do solo marciano."
        ));

        lista.add(new SessaoModelo(
                "marte-rovers",
                SessaoModelo.Grupo.MARTE,
                "Rovers em Marte",
                SessaoModelo.alinhar.ESQUERDA,
                "Os rovers sao laboratorios moveis que analisam rochas, poeira e a atmosfera diretamente na superficie.",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgRover.jpg",
                "/1_home/Rover.jpg",
                "Robo explorador em operacao."
        ));

        lista.add(new SessaoModelo(
                "gemeos-rovers",
                SessaoModelo.Grupo.GEMEOS,
                "Rovers gemeos",
                SessaoModelo.alinhar.ESQUERDA,
                "Spirit e Opportunity foram enviados para estudar areas diferentes de Marte e ampliar o conhecimento do planeta.",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgOpportunity.jpeg",
                "/2_spirit_opportunity/Opportunity.jpeg",
                "Rover Opportunity em Marte."
        ));

        lista.add(new SessaoModelo(
                "gemeos-pouso",
                SessaoModelo.Grupo.GEMEOS,
                "Local de pouso",
                SessaoModelo.alinhar.DIREITA,
                "Os locais de pouso foram escolhidos por indicios geologicos importantes para a busca de agua no passado.",
                SessaoModelo.posicionar.ESQUERDA,
                "/2_spirit_opportunity/imgSunset.jpg",
                "/2_spirit_opportunity/Sunset.jpg",
                "Paisagem marciana ao entardecer."
        ));

        lista.add(new SessaoModelo(
                "gemeos-objetivos",
                SessaoModelo.Grupo.GEMEOS,
                "Objetivos da missao",
                SessaoModelo.alinhar.ESQUERDA,
                "A missao dos rovers gemeos focou em evidencias de agua e no estudo da composicao das rochas marcianas.",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgDustDevil.jpg",
                "/2_spirit_opportunity/DustDevil.jpg",
                "Fenomeno atmosferico em Marte."
        ));

        lista.add(new SessaoModelo(
                "curiosity-rover",
                SessaoModelo.Grupo.CURIOSITY,
                "Rover Curiosity",
                SessaoModelo.alinhar.ESQUERDA,
                "O Curiosity e um rover de grande porte projetado para investigar habitabilidade e quimica do solo.",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgCuriosity.jpg",
                "/3_curiosity/Curiosity.jpg",
                "Rover Curiosity em atividade."
        ));

        lista.add(new SessaoModelo(
                "curiosity-pouso",
                SessaoModelo.Grupo.CURIOSITY,
                "Local de pouso",
                SessaoModelo.alinhar.DIREITA,
                "O Curiosity pousou na Cratera Gale, uma regiao com formacoes que ajudam a reconstruir o passado de Marte.",
                SessaoModelo.posicionar.ESQUERDA,
                "/3_curiosity/imgCartaoPostal.jpg",
                "/3_curiosity/CartaoPostal.jpg",
                "Registro da area de pouso."
        ));

        lista.add(new SessaoModelo(
                "curiosity-estrutura",
                SessaoModelo.Grupo.CURIOSITY,
                "Objetivos e estrutura",
                SessaoModelo.alinhar.ESQUERDA,
                "A estrutura do Curiosity permite carregar varios instrumentos cientificos para analises detalhadas.",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgMeteorito.jpg",
                "/3_curiosity/Meteorito.jpg",
                "Exemplo de rocha analisada."
        ));

        lista.add(new SessaoModelo(
                "perseverance-rover",
                SessaoModelo.Grupo.PERSEVERANCE,
                "Rover Perseverance",
                SessaoModelo.alinhar.ESQUERDA,
                "O Perseverance procura sinais de vida antiga e coleta amostras para futuras missoes de retorno.",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgPerseverance.jpg",
                "/4_perseverance/Perseverance.jpg",
                "Rover Perseverance em deslocamento."
        ));

        lista.add(new SessaoModelo(
                "perseverance-pouso",
                SessaoModelo.Grupo.PERSEVERANCE,
                "Local de pouso",
                SessaoModelo.alinhar.DIREITA,
                "A cratera Jezero foi escolhida por ter indicios de um antigo delta de rio e potencial cientifico elevado.",
                SessaoModelo.posicionar.ESQUERDA,
                "/4_perseverance/imgCratera.png",
                "/4_perseverance/Cratera.png",
                "Mapa da regiao de pouso."
        ));

        lista.add(new SessaoModelo(
                "perseverance-estrutura",
                SessaoModelo.Grupo.PERSEVERANCE,
                "Objetivos e estrutura",
                SessaoModelo.alinhar.ESQUERDA,
                "Seu conjunto de cameras e sensores permite estudar o ambiente e preparar os proximos passos da exploracao.",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgSoloP.jpg",
                "/4_perseverance/SoloP.jpg",
                "Detalhe do terreno marciano."
        ));

        return lista;
    }
}
