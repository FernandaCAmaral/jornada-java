package br.com.alura.audioplayer.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    //Regra de Classificacao para Podcasts (Curtidas)
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 100) {
            return 5;
        } else {
            return 3;
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
