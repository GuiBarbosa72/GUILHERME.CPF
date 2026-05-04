# Validador de CPF em Java

Este projeto contém uma implementação simples de um validador de CPF em Java.

## Descrição

O código verifica se um CPF é válido com base nas seguintes regras:

* Remove caracteres não numéricos
* Verifica se possui 11 dígitos
* Rejeita CPFs com todos os dígitos iguais
* Calcula e valida os dois dígitos verificadores

## Como usar

1. Clone ou copie o código para um arquivo chamado ValidadorCPF.java
2. Compile o arquivo:

bash
javac ValidadorCPF.java


3. Execute o programa:

bash
java ValidadorCPF

## Exemplo

No método main, você pode alterar o CPF testado:

java
String cpf = "123.456.789-09";

O programa irá exibir:

CPF válido

ou

CPF inválido

## Estrutura

* ValidadorCPF: Classe principal com:

  * Método isCPFValido(String cpf) para validação
  * Método main para execução de teste

## Requisitos

* Java 8 ou superior

## Licença

Este projeto é livre para uso educacional e pessoal.
