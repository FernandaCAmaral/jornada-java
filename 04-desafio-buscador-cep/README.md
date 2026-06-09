# 📡 Buscador de CEP — Consumo de API & Manipulação de Arquivos

## 💻 Sobre o Projeto
O **Buscador de CEP** é uma aplicação Java console desenvolvida como o desafio final do módulo de Integração de APIs da Alura. O objetivo principal do projeto é simular o comportamento de formulários web do mundo real: receber um CEP digitado pelo usuário, consultar a API pública do **ViaCEP**, processar o retorno e salvar os dados do endereço formatados em um arquivo físico `.json` no computador.

---

## 🛠️ Tecnologias e Conceitos Utilizados
* **Java Nativo (HTTP Client):** Utilização das classes modernas `HttpClient`, `HttpRequest` e `HttpResponse` para criar o cliente de rede e disparar requisições.
* **Java Records:** Uso da estrutura de dados imutável `record` para modelar o endereço de forma enxuta e segura.
* **Gson (Biblioteca do Google):** Utilizada para converter a String JSON da API em um objeto Java (`fromJson`) e para salvar o objeto Java como um arquivo JSON (`toJson`).
* **Tratamento de Exceções (Olhar de QA):** Implementação de blocos `try-catch` para capturar erros de conexão, falhas de escrita e tratamento de respostas de CEPs inválidos ou inexistentes.
* **Estrutura de Pacotes:** O projeto foi arquitetado seguindo boas práticas de divisão de responsabilidades, facilitando a manutenção e a futura implementação de testes automatizados.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* **Java JDK 21** ou superior instalado na máquina.
* Biblioteca **`gson-2.14.0.jar`** vinculada manualmente às dependências do projeto.

### Passo a Passo
1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que a biblioteca `gson-2.14.0.jar` está vinculada nas propriedades do projeto (*Project Structure -> Libraries*).
3. Execute a classe principal:
    * Abra o arquivo `br.com.alura.buscacep.Main` e clique no botão verde de **Run**.

### Como Utilizar o Sistema no Console
* Assim que o programa iniciar, digite um CEP válido contendo exatamente **8 dígitos** (apenas números, sem pontos, traços ou espaços).
* O sistema buscará as informações na API e imprimirá o endereço formatado na tela, gerando um arquivo `.json` com o número do CEP na raiz do projeto.
* Para realizar novas buscas, basta digitar outro CEP.
* Para encerrar a execução do sistema, digite a palavra **`sair`**.
