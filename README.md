# Estudo-de-Interfaces

# 🚗 Sistema de Aluguel de Carros em Java

Este projeto é um sistema simples de aluguel de carros desenvolvido em Java, utilizando princípios de Programação Orientada a Objetos (POO), manipulação de datas com `java.time`, e lógica de cálculo com base em valores por hora ou por dia. Ele simula o cálculo de uma fatura com imposto baseado nas regras do Brasil.

## 💻 Tecnologias utilizadas

- Java 17+
- API `java.time` (para datas e horas)
- Padrões de projeto com POO (encapsulamento, composição, separação por camadas)
- IDE utilizada: Eclipse (pode ser adaptado para VSCode)

## 📂 Estrutura do Projeto

- `application.Program`: ponto de entrada da aplicação.
- `model.entities.CarRental`: representa o aluguel do carro, com início, fim, veículo e fatura.
- `model.entities.Vehicle`: representa o veículo alugado.
- `model.entities.Invoice`: representa a fatura com pagamento básico, imposto e total.
- `model.service.RentalService`: realiza o processamento da fatura com base no tempo de aluguel.
- `model.service.BrazilTaxService`: calcula o imposto de acordo com o valor da fatura.

## ⚙️ Como funciona

1. O usuário insere os dados do carro, data/hora de retirada e devolução.
2. Define o valor por hora e por dia.
3. O sistema calcula a duração do aluguel.
4. Com base no tempo, aplica o valor mais vantajoso (hora ou diária).
5. Um imposto é calculado sobre o valor base.
6. O sistema exibe uma fatura formatada no console.

### 🧾 Exemplo de saída

FATURA:
Pagamento basico: 300.00
Imposto: 45.00
Pagamento total: 345.00


## 📈 Evolução futura

Este projeto está sendo desenvolvido de forma incremental. A próxima versão incluirá:

- ✅ Aplicação do princípio da Inversão de Dependência (DIP)
- ✅ Uso de interfaces para cálculo de imposto (ex: `TaxService`)
- ✅ Refatoração para maior flexibilidade e manutenibilidade
- 🚀 Integração futura com banco de dados (JDBC e JPA)

## 👨‍💻 Autor

Projeto de estudo e prática desenvolvido por mim mesmo, com base no conteúdo do curso de Java do Nélio Alves.
