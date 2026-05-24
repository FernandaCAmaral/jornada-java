# 🎵 AudioPlayer - Desafio de Orientação a Objetos (POO)

Segundo projeto prático desenvolvido durante a formação Java da Alura. O objetivo principal foi aplicar na prática os pilares da Programação Orientada a Objetos (POO), estruturando uma aplicação de reprodução de áudio (músicas e podcasts) escalável e bem protegida.

---

## 🏗️ Conceitos de POO Aplicados

* **Encapsulamento:** Todos os atributos da classe base foram definidos como `private`. O acesso e a modificação de dados sensíveis (como contadores de curtidas e reproduções) foram blindados através de métodos públicos de regras de negócio (`curtir()` e `reproduzir()`), eliminando métodos `set` desnecessários e prevenindo manipulações indevidas.
* **Herança:** Criação de uma classe mãe (`Audio`) contendo as características comuns, a qual foi estendida pelas classes filhas (`Musica` e `Podcast`) para reaproveitamento de código e especialização de comportamento.
* **Polimorfismo:** Implementação do conceito de sobrescrita de método (`@Override`). O método `getClassificacao()` calcula a relevância do áudio de forma distinta para músicas (focado em reproduções) e para podcasts (focado em curtidas).

---

## 🔍 Estrutura Organizacional (Pacotes)

O projeto foi arquitetado seguindo padrões de mercado para a divisão de responsabilidades:
* `br.com.alura.audioplayer` — Contém a classe `Main`, responsável pela execução do sistema e simulação dos cenários.
* `br.com.alura.audioplayer.modelos` — Concentra as classes de domínio e lógica de negócio (`Audio`, `Musica`, `Podcast`).

---

## 🧪 Abordagem de Engenharia de Qualidade (Pensamento de QA)

Durante o desenvolvimento do código, foram desenhados cenários lógicos para garantir que o sistema se comporte exatamente como esperado pelas regras de negócio:

* **Validação de Limite de Classificação (Podcast):** Teste do comportamento polimórfico onde um podcast deve pontuar com `3` estrelas caso possua menos de 100 curtidas, e chavear automaticamente para `5` estrelas ao atingir o limite estipulado.
* **Validação de Volume de Acessos (Música):** Teste de consistência onde a classificação da música só deve atingir a nota máxima se ultrapassar a marca de 200 reproduções.
* **Teste de Integridade de Dados:** Garantia de que nenhuma classe externa consegue forçar valores inválidos nos contadores (ex: valores negativos), centralizando o incremento unitário nas regras internas do objeto.

---

## 🛠️ Como Executar o Projeto

1. Certifique-se de ter o Java JDK instalado em sua máquina.
2. Navegue até o diretório `src/` e compile as classes:
   ```bash
   javac br/com/alura/audioplayer/Main.java
   ```
3. Execute a aplicação
   ```bash
   java br.com.alura.audioplayer.Main
   
