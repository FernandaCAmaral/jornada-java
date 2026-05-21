import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "Fulano da Silva";
        String tipoConta = "Corrente";
        double saldo = 1000;
        int opcao = 0;

        System.out.printf("""
                    ************************
                    Nome do titular da conta: %s
                    Tipo de conta: %s
                    Saldo: R$ %.2f
                    ************************ %n""", nome, tipoConta, saldo);

        while (opcao != 4) {
            System.out.println("""
                    \n---- ESCOLHA UMA OPERAÇÃO ----
                    1 - Consultar Saldo
                    2 - Adicionar Saldo
                    3 - Transferir Valor
                    4 - Sair""");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f %n %n", saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    double adicionar = scanner.nextDouble();
                    saldo = saldo + adicionar;
                    System.out.printf("Saldo Atualizado! Valor atual em conta: R$ %.2f %n %n", saldo);
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir?");
                    double transferir = scanner.nextDouble();
                    if (saldo < transferir) {
                        System.out.println("ATENÇÃO: SALDO INSUFICIENTE!");
                        break;
                    }
                    saldo = saldo - transferir;
                    System.out.printf("Saldo Atualizado! Valor atual em conta: R$ %.2f %n %n", saldo);
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente \n");
            }
        }
    }
}