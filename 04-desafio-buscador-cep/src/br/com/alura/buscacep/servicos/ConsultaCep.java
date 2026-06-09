package br.com.alura.buscacep.servicos;

import br.com.alura.buscacep.modelos.Endereco;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep) {

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        // Cria o HttpRequest configurada com a URL
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {

            HttpClient client = HttpClient.newHttpClient();

            // Dispara a requisição e pega a resposta em formato de String
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Endereco.class);

        } catch (Exception e) {
            // Previne caso a internet caia ou o CEP falhe
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP: " + e.getMessage());
        }
    }
}
