package br.com.alura.buscacep;

import br.com.alura.buscacep.modelos.Endereco;
import br.com.alura.buscacep.servicos.ConsultaCep;
import br.com.alura.buscacep.servicos.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        String busca = "";

        System.out.println("\n --- SISTEMA BUSCADOR DE CEP --- ");
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.print("\nDigite um CEP para buscar (apenas números, sem traços ou espaços) ou 'sair': ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                System.out.println("Buscando dados para o CEP: " + busca + "...");
                Endereco novoEndereco = consultaCep.buscaEndereco(busca);

                System.out.println("\n✅ Endereço encontrado com sucesso:");
                System.out.println("------------------------------------------");
                System.out.println(" CEP: " + novoEndereco.cep());
                System.out.println(" Rua: " + novoEndereco.logradouro());
                System.out.println(" Bairro: " + novoEndereco.bairro());
                System.out.println(" Cidade: " + novoEndereco.localidade());
                System.out.println(" Estado(UF): " + novoEndereco.uf());
                System.out.println("------------------------------------------");

                // Grava o arquivo JSON
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvaJson(novoEndereco);
                System.out.println("Arquivo '" + novoEndereco.cep() + ".json' gerado com sucesso!");

            } catch (RuntimeException e) {
                // Captura o erro customizado na classe ConsultaCep
                System.out.println("❌ Erro na busca: " + e.getMessage());
            } catch (IOException e) {
                // Captura falhas de escrita/leitura de arquivos
                System.out.println("❌ Erro ao gerar o arquivo JSON: " + e.getMessage());
            }
        }

        System.out.println("\n --- Programa encerrado! --- ");
        leitura.close();
    }
}
