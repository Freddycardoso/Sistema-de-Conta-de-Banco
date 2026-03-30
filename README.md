# Sistema Bancário - POO em Java
---------------------------------------------------------------------------------
Este repositório contém a resolução de um desafio prático de Orientação a Objetos em Java, desenvolvido como parte dos meus estudos em programação.

## Sobre o Projeto
O projeto simula o funcionamento básico de uma conta bancária. Ele permite a criação de uma conta com ou sem depósito inicial, e realiza operações de saque (com cobrança de taxa) e depósito, sempre atualizando e exibindo os dados da conta de forma segura.

## Conceitos Aplicados

* **Classes e Objetos:** Separação da lógica de negócio (`SistemaBanco.java`) da interface de interação com o usuário (`Banco.java`).
* **Encapsulamento:** Uso do modificador `private` nos atributos (nome, saldo, número da conta) para proteger os dados, permitindo o acesso apenas através de métodos Getters e Setters.
* **Construtores e Sobrecarga:** Implementação de múltiplos construtores para permitir a criação de contas de forma flexível (com ou sem o depósito inicial).
* **Escopo de Variáveis:** Gerenciamento correto do ciclo de vida dos objetos em memória, instanciando a conta fora das estruturas de controle (`if/else`) para garantir sua persistência durante a execução.
* **Regras de Negócio:** Delegação da lógica matemática (como o desconto da taxa de R$ 5,00 no saque) diretamente para os métodos da Entidade, tirando essa responsabilidade da classe principal.
---------------------------------------------------------------------------------
##  Tecnologias Utilizadas
* **Java:** Linguagem principal do projeto.
* **Scanner:** Para leitura de dados de entrada do usuário no terminal.
* **Locale (US):** Para padronização da formatação de números decimais com ponto.
---------------------------------------------------------------------------------
## 📋 Como executar
1. Clone este repositório.
2. Abra a pasta do projeto na sua IDE preferida (VS Code, Eclipse, IntelliJ).
3. Execute o arquivo `Banco.java` localizado no pacote `aplicacao`.
4. Siga as instruções no terminal para criar sua conta e realizar as transações.

---------------------------------------------------------------------------------
Desenvolvido com dedicação para aprimorar minhas habilidades em Java.
