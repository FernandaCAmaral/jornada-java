# 🏦 Sistema Bancário Via Terminal

Primeiro projeto prático desenvolvido durante a formação Java da Alura. O objetivo foi aplicar os conceitos fundamentais da linguagem em um cenário real de simulação bancária.

## 🎯 Conceitos Aplicados
*   **Sintaxe Java & Tipos de Dados:** Uso correto de variáveis para armazenar dados do cliente (`String`, `double`).
*   **Interação via Terminal:** Implementação do `Scanner` para leitura de dados digitados pelo usuário.
*   **Controle de Fluxo:** Estruturas condicionais (`if/else` e `switch-case`) para processar as opções do menu.
*   **Laços de Repetição:** Uso do `while` para manter o programa rodando até que a opção "Sair" seja escolhida.

## 💻 Funcionalidades
1.  **Inicialização:** Exibe os dados iniciais do cliente (Nome, Tipo de Conta, Saldo Inicial).
2.  **Consultar Saldo:** Mostra o saldo atualizado em tempo real.
3.  **Receber Valor:** Permite somar uma quantia ao saldo atual.
4.  **Transferir Valor:** Permite sacar/transferir uma quantia, validando se o cliente possui saldo suficiente.
5.  **Sair:** Encerra a aplicação com uma mensagem de despedida.

## 🛠️ Como Executar
Com o Java instalado na sua máquina, navegue até a pasta `src` via terminal e execute:
```bash
javac ContaBancaria.java
java ContaBancaria