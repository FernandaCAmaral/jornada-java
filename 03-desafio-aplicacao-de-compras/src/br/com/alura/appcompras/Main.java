package br.com.alura.appcompras;

import br.com.alura.appcompras.modelos.CartaoCredito;
import br.com.alura.appcompras.modelos.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("💳 Bem-vindo ao Sistema de Compras! 💳");
        System.out.println("Informe o limite inicial do seu cartão: R$ ");
        double limite = leitura.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nDigite a descrição da compra: ");
            leitura.nextLine(); // limpa o buffer do teclado
            String descricao = leitura.nextLine();

            System.out.println("Digite o valor da compra: R$ ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor);

            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("✅ Compra realizada!\n");

                System.out.println("Deseja realizar outra compra? (S/N):");
                String resposta = leitura.next().toUpperCase();

                while (!resposta.equals("S") && !resposta.equals("N")) {
                    System.out.println("❌ Opção inválida!");
                    System.out.print("Por favor, digite apenas S para Sim ou N para Não: ");
                    resposta = leitura.next().toUpperCase();
                }

                if (resposta.equals("N")) {
                    continuar = false;
                }

            } else {
                System.out.println("❌ Saldo insuficiente para esta compra!");
                continuar = false;
            }
        }

        System.out.println("""
                \n---------------------------------
                COMPRAS REALIZADAS:""");

        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()) {
            System.out.println(c);
        }

        System.out.println("---------------------------------");
        System.out.printf("Saldo Final Disponível: R$ %.2f", cartao.getSaldo());

    }
}