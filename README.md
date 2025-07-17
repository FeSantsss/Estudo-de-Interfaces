# 📦 Projeto Java - Aluguel de Carros & Contrato de Serviços

Este repositório contém dois projetos desenvolvidos em Java como prática de Programação Orientada a Objetos (POO), aplicando boas práticas como separação por camadas (`entities`, `services`), uso da API de datas, cálculo de impostos e lógica de fatura. Ambos os projetos foram feitos como parte do processo de aprendizado e evolução contínua com foco em back-end.

---

## 🚗 Projeto 1: Aluguel de Carros

Este programa simula o aluguel de um carro, calculando o valor a ser pago com base nas horas/dias de uso, e aplica imposto com base nas regras fiscais brasileiras.

### ✨ Funcionalidades
- Leitura de dados do veículo, datas de retirada e devolução
- Cálculo do pagamento baseado em horas e diárias
- Aplicação de imposto via classe `BrazilTaxService`
- Geração e exibição de fatura detalhada

### 🔍 Tecnologias utilizadas
- Java 17+
- `java.time` API (`LocalDateTime`, `Duration`, `DateTimeFormatter`)
- Orientação a Objetos (encapsulamento, composição)
- Separação em camadas (`model.entities`, `model.service`)

---

## 📃 Projeto 2: Contrato de Prestação de Serviços

Este programa lida com a geração de parcelas mensais de pagamento a partir de um contrato, simulando serviços como PayPal para cobrança, com lógica de juros e taxas.

### ✨ Funcionalidades
- Entrada de dados de contrato (número, data, valor total, número de parcelas)
- Cálculo do valor de cada parcela com juros mensais e taxa de pagamento
- Interface `OnlinePaymentService` para aplicar o princípio da Inversão de Dependência
- Implementação concreta com `PaypalService`

## Commit "Estudo de interface Comparable": 

Fiz um programa que pega nomes e salarios de um arquivo e ordena por nome em ordem alfabetica com a interface Comparable.

## Commit "estudo de interfaces com default methods"

Fiz um programa que calcula a taxa de pagamemto a partir de uma taxa mensal do Brasil e dos USA com Default Methods

### 🔍 Tecnologias utilizadas
- Java 17+
- Padrões de projeto com **interfaces** e **injeção de dependência**
- Manipulação de datas com `LocalDate` e `DateTimeFormatter`
- Separação de responsabilidades com entidades e serviços

---

## 👨‍💻 Autor

Desenvolvido por **Felipy Santos**, com base nos estudos guiados pelo curso de Java do professor Nélio Alves (Udemy), aplicando práticas reais do desenvolvimento back-end moderno.

---
