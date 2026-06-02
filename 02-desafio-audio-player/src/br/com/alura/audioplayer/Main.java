package br.com.alura.audioplayer;

import br.com.alura.audioplayer.modelos.Podcast;
import br.com.alura.audioplayer.modelos.Musica;

public class Main {
    public static void main(String[] args) {

        // --- INSTANCIA PODCAST ---
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Casefile True Crime");
        meuPodcast.setHost("Casey");
        meuPodcast.setDescricao("Um podcast sobre crimes reais que se aprofunda nas histórias \nde casos solucionados, e também arquivados, ao redor do mundo.");

        // Simulando interações
        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 120; i ++) {
            meuPodcast.curtir();
        }

        // Exibindo dados
        System.out.println("--- DETALHES DO PODCAST ---");
        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Apresentado por: " + meuPodcast.getHost());
        System.out.println("Descrição: " + meuPodcast.getDescricao());
        System.out.println("Total de Reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de Curtidas: " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação: " + meuPodcast.getClassificacao() + " Estrelas!");

        System.out.println("\n----------------------------------------------\n");

        // --- INSTANCIA MUSICA ---
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Dust In The Wind");
        minhaMusica.setArtista("Kansas");
        minhaMusica.setAlbum("Point of Know Return");
        minhaMusica.setGenero("Soft rock");

        // Simulando Interações
        for (int i = 0; i < 250; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 150; i ++) {
            minhaMusica.curtir();
        }

        System.out.println("--- DETALHES DA MÚSICA ---");
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Álbum: " + minhaMusica.getAlbum());
        System.out.println("Total de Reproduções: " + minhaMusica.getTotalReproducoes());
        System.out.println("Total de Curtidas: " + minhaMusica.getTotalCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao() + " Estrelas!");

    }

}
