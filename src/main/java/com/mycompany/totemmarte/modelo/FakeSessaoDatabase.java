package com.mycompany.totemmarte.modelo;

import java.util.ArrayList;
import java.util.List;

public class FakeSessaoDatabase {

    public List<SessaoModelo> listarSessoes() {
        List<SessaoModelo> lista = new ArrayList<>();

        lista.add(new SessaoModelo(
                "marte-planeta",
                SessaoModelo.Grupo.MARTE,
                "       Planeta Marte",
                SessaoModelo.alinhar.ESQUERDA,
                "   Marte é o quarto planeta a partir do Sol e um dos corpos celestes mais fascinantes estudados pela ciência moderna! Conhecido popularmente como “Planeta Vermelho”, apelidado assim por sua coloração característica causada pela grande presença de óxidos de ferro em sua superfície. Marte possui uma atmosfera fina, temperaturas extremamente baixas, desertos rochosos, calotas polares e algumas das maiores e mais impressionantes formações geológicas do Sistema Solar.\n" +
"   Portanto, aproximando a humanidade do sonho da exploração interplanetária, O compasso de curiosidade e desenvolvimento aponta a Marte, com missões espaciais protagonizadas por rôbos rovers que percorrem o solo marciano para investigar sua composição, clima e história geológica. Se quiser descobrir mais sobre suas aventuras continue lendo!",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgMarte.png",
                "/1_home/marte.png",
                "   -Marte surge silencioso no vazio do espaço, com vastas planícies avermelhadas e tempestades de poeira revelando sua imponência árida. -Mosaico terminado em 1980 pela NASA"
        ));

        lista.add(new SessaoModelo(
                "marte-objetivos",
                SessaoModelo.Grupo.MARTE,
                "Objetivos da exploracao       ",
                SessaoModelo.alinhar.DIREITA,
                "   As missões de exploração de Marte têm como principal objetivo compreender a história, a composição e as condições ambientais de Marte. Utilizando principalmente rovers robóticos, cientistas investigam aspectos como a atmosfera, a presença de água, a composição do solo e mudanças climáticas ao longo de bilhões de anos. Essas pesquisas ajudam a entender se Marte já apresentou condições favoráveis para a existência de vida microscópica e como o planeta evoluiu até se tornar o ambiente frio e árido como é popularmente conhecido atualmente.\n" +
"   Além da busca por conhecimento científico, as missões marcianas também impulsionam o desenvolvimento tecnológico para futuras explorações espaciais. Os dados coletados contribuem para o planejamento de futuras missões, aproximando a humanidade da possibilidade de explorar Marte diretamente!",
                SessaoModelo.posicionar.ESQUERDA,
                "/1_home/imgSolo.jpg",
                "/1_home/Solo.jpg",
                "   -Silêncio absoluto… exceto pelo som da exploração humana ecoando em outro mundo. -22 de março de 2020 por Curiosity"
        ));

        lista.add(new SessaoModelo(
                "marte-rovers",
                SessaoModelo.Grupo.MARTE,
                "       Rovers em Marte",
                SessaoModelo.alinhar.ESQUERDA,
                "   Os rovers são veículos robóticos desenvolvidos para explorar a superfície de outros planetas e luas de forma autônoma ou semiautônoma. Em Marte, esses equipamentos são utilizado para as mais diversas analises de ambiente. Diferente de sondas estacionárias, os rovers conseguem se deslocar por diferentes regiões, cobrindo um espaço muito maior permitindo uma investigação ampla do ambiente marciano.\n" +
"   Equipados com diversas ferramentas como câmeras, sensores e instrumentos científicos de alta precisão, esses robôs foram projetados para funcionarem como laboratórios móveis, enviando dados para a Terra, assim ampliando o conhecimento humano sobre a geologia e a história de Marte. Missões como Spirit, Opportunity, Curiosity e Perseverance marcaram avanços fundamentais, portanto entraremos em detalhe sobre suas aventuras.",
                SessaoModelo.posicionar.DIREITA,
                "/1_home/imgRover.jpg",
                "/1_home/Rover.jpg",
                "   -Pequenos rastros na poeira marcando o início da presença humana além da Terra. -5 de julho de 1997 por sojourner"
        ));

        lista.add(new SessaoModelo(
                "gêmeos-rovers",
                SessaoModelo.Grupo.GEMEOS,
                "       Rovers gêmeos  ",
                SessaoModelo.alinhar.ESQUERDA,
                "   A missão dos rovers gêmeos Spirit e Opportunity, nomeados assim por uma garota de 8 anos chamada Sofi Collis através de um concurso de redação organizado pela NASA, foi um dos marcos mais importantes da exploração de Marte. Lançados pela NASA em 2003 dentro do programa Mars Exploration Rover (MER), os dois robôs tinham como principal objetivo investigar se o planeta já apresentou condições ambientais capazes de sustentar vida microscópica. \n   Cada rover aterrisou em uma região diferente da superfície, escolhidas com base em indícios altos de interação antiga com água. Equipados com câmeras panorâmicas, espectrômetros e ferramentas de perfuração, analisando rochas e solos marcianos com grande precisão científica. Suas descobertas forneceram fortes evidências de que Marte já teve água líquida em sua superfície há bilhões de anos.",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgOpportunity.jpeg",
                "/2_spirit_opportunity/Opportunity.jpeg",
                "   Um registro técnico de rotina, o rover, seus painéis e a poeira constante de Marte. -24 de março de 2014 por Opportunity"
        ));

        lista.add(new SessaoModelo(
                "gemeos-pouso",
                SessaoModelo.Grupo.GEMEOS,
                "Pouso dos gêmeos       ",
                SessaoModelo.alinhar.DIREITA,
                "   O Spirit pousou em janeiro de 2004 na Cratera Gusev, uma área que cientistas acreditavam ter abrigado um antigo lago. Durante sua missão, Spirit encontrou evidências de atividade vulcânica e minerais formados em presença de água. Já o Opportunity aterrissou no mesmo mês na região de Meridiani Planum, onde identificou rochas sedimentares e minerais ricos em sulfato, fortes indícios de que água líquida existiu em Marte no passado. \n   Os dois pousos foram considerados grandes sucessos tecnológicos, pois demonstraram a eficiência do sistema de entrada, descida e aterrissagem da NASA em Marte, avanços indispensáveis que foram de surpreender. Além disso, ambos superaram a expectativa inicial de operação, prevista para apenas 90 dias marcianos, funcionando por anos e enviando milhares de imagens e dados científicos para a Terra.",
                SessaoModelo.posicionar.ESQUERDA,
                "/2_spirit_opportunity/imgSunset.jpg",
                "/2_spirit_opportunity/Sunset.jpg",
                "   Um pequeno ponto azul no horizonte, um lembrete silencioso de casa em meio à vastidão alienígena. -31 de janeiro de 2014 por Spirit."
        ));

        lista.add(new SessaoModelo(
                "gemeos-objetivos",
                SessaoModelo.Grupo.GEMEOS,
                "       Marcos dos gêmeos",
                SessaoModelo.alinhar.ESQUERDA,
                "   como dito anteriormente, suas missões foram originalmente planejadas para operar por apenas 90 dias marcianos, os dois rovers superaram as expectativas de todos. O Spirit permaneceu ativo até 2010, enquanto o Opportunity funcionou por quase 15 anos, encontrando o fim de suas atividades em 2018 após uma intensa tempestade de poeira bloquear sua fonte de energia solar.\n   juntos, os rovers percorreram dezenas de quilômetros, enviaram milhares de imagens atingindo o objetivo de suas missões de maneira exarcebada, transformaram o entendimento científico sobre a história geológica e climática de Marte de uma forma desigual, comprovando que o planeta já teve ambientes potencialmente habitáveis, um marco gigantesco para humanidade, guiados pelos seus espíritos e sua curiosidade.",
                SessaoModelo.posicionar.DIREITA,
                "/2_spirit_opportunity/imgDustDevil.jpg",
                "/2_spirit_opportunity/DustDevil.jpg",
                "   Marcas de rodas seguem encosta abaixo enquanto um redemoinho cruza o horizonte, levantando poeira fina. -31 de março de 2016 por Opportunity"
        ));

        lista.add(new SessaoModelo(
                "curiosity-rover",
                SessaoModelo.Grupo.CURIOSITY,
                "       Rover Curiosity",
                SessaoModelo.alinhar.ESQUERDA,
                "   O Curiosity, nome que lhe foi dado através de outro concurso de redação onde a vencedora foi uma garota do sexto ano chamada Clara Ma, é um rover que tinha a missão de investigar a habitabilidade de Marte e aprofundar os estudos sobre a geologia e o clima do planeta. Lançado em 2011 e pousando em agosto de 2012, o robô faz parte da missão Mars Science Laboratory (MSL), considerada uma das mais complexas já realizadas.\n   Curiosity, diferente dos rovers anteriores, foi projetado como um verdadeiro laboratório móvel, equipado com instrumentos capazes de analisar amostras de rochas, solo e atmosfera diretamente em Marte. O rover também trouxe avanços importantes em autonomia de navegação e enviou descobertas fundamentais sobre antigos ambientes potencialmente habitáveis no planeta.",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgCuriosity.jpg",
                "/3_curiosity/Curiosity.jpg",
                "   Uma pausa no trajeto, o rover documenta a si mesmo entre rochas e poeira, com o horizonte suavemente encoberto. -15 de junho de 2018 por Curiosity"
        ));

        lista.add(new SessaoModelo(
                "curiosity-pouso",
                SessaoModelo.Grupo.CURIOSITY,
                "Pouso de Curiosity       ",
                SessaoModelo.alinhar.DIREITA,
                "   O pouso do Curiosity ocorreu em 6 de agosto de 2012 em Marte, na Cratera Gale, utilizando o sistema Sky Crane, uma tecnologia inédita que permitiu posicionar o rover com grande precisão na superfície marciana. A cratera é uma enorme estrutura de impacto com cerca de 154 km de diâmetro localizada próxima ao equador marciano.\n   O local foi escolhido pela NASA porque apresenta evidências geológicas de que já existiram rios, lagos e ambientes potencialmente habitáveis no passado do planeta. No centro da cratera está localizado o Monte Sharp (Aeolis Mons), uma montanha formada por camadas sedimentares que funcionam como um “registro histórico” do clima marciano ao longo de bilhões de anos. Durante sua exploração, seu local estratégico de pouso se provou fundamental para suas descobertas de estudo.",
                SessaoModelo.posicionar.ESQUERDA,
                "/3_curiosity/imgCartaoPostal.jpg",
                "/3_curiosity/CartaoPostal.jpg",
                "   Uma mistura de duas fotos mostra o contraste maravilhoso do céu de marte, registrada perto de seu local de pouso. - 18 de novembro de 2025 por Curiosity"
        ));

        lista.add(new SessaoModelo(
                "curiosity-estrutura",
                SessaoModelo.Grupo.CURIOSITY,
                "       Marcos de Curiosity",
                SessaoModelo.alinhar.ESQUERDA,
                "   Seu principal objetivo até os dias de hoje, visto que ainda está em funcionamento, é descobrir se o planeta já apresentou condições favoráveis à vida microbiana. O Curiosity foi desenvolvido com uma arquitetura avançada para suportar longos períodos de operação em condições extremas, utilizando um gerador termoelétrico movido a plutônio como fonte de energia em vez de painéis solares.\n   Seu corpo abriga diferentes módulos científicos integrados, capazes de aquecer, processar e examinar materiais coletados na superfície de Marte com alto nível de precisão. Durante a missão, o rover encontrou evidências de antigos rios, lagos e moléculas orgânicas preservadas em rochas sedimentares, indicando que Marte possuía ambientes habitáveis bilhões de anos atrás. ",
                SessaoModelo.posicionar.DIREITA,
                "/3_curiosity/imgMeteorito.jpg",
                "/3_curiosity/Meteorito.jpg",
                "   Metal exposto e marcado por cavidades, um fragmento de meteorito fascinante. -25 de maio de 2014 por Curiosity"
        ));

        lista.add(new SessaoModelo(
                "perseverance-rover    ",
                SessaoModelo.Grupo.PERSEVERANCE,
                "       Rover Perseverance",
                SessaoModelo.alinhar.ESQUERDA,
                "   O rover Perseverance, seu nome também lhe foi dado por um concurso vencido por Alexander Mather do sétimo ano, foi desenvolvido com o principal objetivo de investigar a habitabilidade antiga de Marte e buscar sinais de vida microscópica preservados em registros geológicos. Ele integra a missão Mars 2020, trazendo o diferencial de fazer parte da geração mais avançada de rovers já enviada ao planeta até agora.\n   O veículo foi projetado com sistemas científicos altamente sofisticados, capazes de realizar análises químicas detalhadas da superfície marciana e coletar amostras de solo e rochas para futuras pesquisas. Sua estrutura também possui maior autonomia de navegação e resistência para operar em ambientes extremos por longos períodos",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgPerseverance.jpg",
                "/4_perseverance/Perseverance.jpg",
                "   Um registro pré voo, o rover e seu pequeno helicóptero dividem o mesmo enquadramento no terreno aberto. -6 de abril de 2021 por Perseverance."
        ));

        lista.add(new SessaoModelo(
                "   perseverance-pouso",
                SessaoModelo.Grupo.PERSEVERANCE,
                "Pouso de Perseverance       ",
                SessaoModelo.alinhar.DIREITA,
                "   O pouso do Perseverance em Marte foi um dos eventos mais sofisticados já realizados na exploração espacial, por mais que tivesse sido denominado como “os 7 minutos do terror” devido sua enorme dificuldade e incapacidade de intervenção externa.\n   Ocorrido em 18 de fevereiro de 2021, na Cratera Jezero, o Perseverance chegou em uma região escolhida porque há fortes evidências de que, no passado, ela abrigou um lago e um antigo delta de rio. Ambientes considerados ideais para preservar possíveis bioassinaturas, vestígios químicos ou minerais associados à vida. Durante a descida, o rover utilizou um avançado sistema automático de navegação e pouso, capaz de identificar perigos no terreno em tempo real para escolher uma área segura. O sucesso da operação representou um importante avanço tecnológico para futuras missões tripuladas ao planeta vermelho.",
                SessaoModelo.posicionar.ESQUERDA,
                "/4_perseverance/imgCratera.png",
                "/4_perseverance/Cratera.png",
                "   Uma elevação isolada interrompe a planície, camadas de sedimento possívelmente indicativas de um delta de rio. -22 de fevereiro de 2023 por Perseverance"
        ));

        lista.add(new SessaoModelo(
                "perseverance-estrutura",
                SessaoModelo.Grupo.PERSEVERANCE,
                "       Marcos de Perseverance",
                SessaoModelo.alinhar.ESQUERDA,
                "   O Perseverance é equipado com instrumentos científicos de alta precisão capazes de analisar rochas e solo em detalhe, além de câmeras de alta resolução para mapear o terreno. Um dos seus principais objetivos é coletar e armazenar amostras que futuramente poderão ser enviadas à Terra em uma missão de retorno de amostras, ainda em desenvolvimento pela NASA e pela ESA.\n   Outro destaque da missão é o helicóptero Ingenuity, que viajou junto com o rover e realizou os primeiros voos controlados em outro planeta, demonstrando novas possibilidades de exploração aérea em Marte, alcançando mais um grande marco da exploração humana sobre o espaço. Com isso, o Perseverance não apenas continua a busca por sinais de vida passada, mas também prepara o caminho para futuras missões humanas ao planeta vermelho.",
                SessaoModelo.posicionar.DIREITA,
                "/4_perseverance/imgSoloP.jpg",
                "/4_perseverance/SoloP.jpg",
                "   Texturas endurecidas no solo, vestígios de processos antigos relacionados com a interação de água, preservados na superfície. -6 de agosto de 2021 por Perseverance"
        ));

        return lista;
    }
    
    public List<SessaoModelo.Grupo> listarGrupos() {
        return List.of(SessaoModelo.Grupo.values());
    }
}
