package br.com.alura.audioplayer.modelos;

public class Musica extends Audio {
    private String artista;
    private String album;
    private String genero;

    //Regra de Classificacao para Musicas (Reproduções)
    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 200) {
            return 5;
        } else {
            return 2;
        }
    }

    //getters e setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
