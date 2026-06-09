package br.com.alura.buscacep;

import br.com.alura.buscacep.modelos.Endereco;
import br.com.alura.buscacep.servicos.ConsultaCep;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();

        Endereco novoEndereco = consultaCep.buscaEndereco("93334290");
        System.out.println(novoEndereco);
    }
}
