package br.com.alura.audioplayer;

import br.com.alura.audioplayer.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Casefile True Crime");
        meuPodcast.setHost("Casey");
        meuPodcast.setDescricao("Um podcast sobre crimes reais que se aprofunda nas histórias \nde casos solucionados, e também arquivados, ao redor do mundo.");

        //Simulando interações
        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 120; i ++) {
            meuPodcast.curtir();
        }

        //Exibindo dados
        System.out.println("--- DETALHES DO PODCAST ---");
        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Apresentado por: " + meuPodcast.getHost());
        System.out.println("Descrição: " + meuPodcast.getDescricao());
        System.out.println("Total de Reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de Curtidas: " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação: " + meuPodcast.getClassificacao() + " Estrelas!");
    }

}
