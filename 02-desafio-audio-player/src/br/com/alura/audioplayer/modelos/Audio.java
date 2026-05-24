package br.com.alura.audioplayer.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curtir() {
        this.totalCurtidas++;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    //getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }


}
