# 💳 AppCompras - Controle de Cartão de Crédito e Listas

Terceiro projeto prático desenvolvido durante a formação Java da Alura. A aplicação simula o lançamento de compras em um cartão de crédito, gerenciando o saldo disponível dinamicamente e exibindo um extrato ordenado pelo valor dos produtos.

---

## 🚀 Indo Além da Aula (Diferenciais do Projeto)

Diferente da resolução padrão proposta inicialmente pelo curso, este repositório conta com melhorias estruturais focadas em **Engenharia de Qualidade (QA)** e **Experiência do Usuário (UX)**:

* **Validação Estrita de Menu (S/N):** Tratamento de erro de input na classe `Main`. O sistema não aceita caracteres inválidos ou inputs acidentais para dar continuidade às compras, forçando o usuário a digitar estritamente `S` ou `N`.
* **Blindagem contra Valores Negativos:** Implementação de regras de segurança nos construtores e métodos das classes `Compra` e `CartaoCredito`, impedindo a criação de produtos com valores negativos ou zerados que burlariam a lógica do saldo.
* **Interface de Extrato Amigável:** Formatação visual do terminal utilizando `printf` para exibição de valores monetários corrigidos em duas casas decimais e separadores visuais organizados.

---

## 🏗️ Conceitos de Listas e Ordenação Aplicados

* **Manipulação de Coleções (`List` & `ArrayList`):** O histórico de compras é gerenciado de forma encapsulada pelo próprio objeto `CartaoCredito`, utilizando um `ArrayList` privado.
* **Algoritmos de Ordenação (`Collections.sort`):** Uso da interface `Comparable<Compra>` e sobrescrita do método `compareTo` para ensinar o Java a ordenar a lista automaticamente utilizando o critério de valor (preço) de cada item.

---

## 🔍 Abordagem de Engenharia de Qualidade (Cenários de Teste)

* **Teste de Limite Excedido:** Validação se o método `lancaCompra` altera corretamente o estado do fluxo e bloqueia a transação assim que o valor de um item supera o saldo restante do cartão.
* **Limpando o Teclado (Buffer do Scanner):** Implementação preventiva do método `leitura.nextLine()` para limpar o caractere de quebra de linha (`\n`) deixado por leituras numéricas anteriores, evitando o pulo involuntário de inputs.

---

## 🔮 TODO (Próximos Passos & Melhorias Futuras)

* [ ] **Tratamento Avançado de Erros (Exceptions):** Substituir as validações manuais de console por um bloco estruturado de `try-catch`, criando exceções customizadas (ex: `SaldoInsuficienteException`) para tratar entradas inválidas de texto onde o sistema espera números.
* [ ] **Testes Unitários:** Implementar suites de testes automatizados para validar os limites do cartão isoladamente.

---

## 🛠️ Como Executar a Aplicação

1. Navegue até o diretório `src/` do projeto.
2. Compile a classe principal:
   ```bash
   javac br/com/alura/appcompras/Main.java
3. Execute o programa:
    ```bash
   java br.com.alura.appcompras.Main