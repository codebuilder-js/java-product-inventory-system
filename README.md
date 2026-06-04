# Java Product Inventory System

Sistema simples de gerenciamento de produtos desenvolvido em Java, focado em conceitos fundamentais de Programação Orientada a Objetos (POO), encapsulamento, validação de dados e controle de estoque.

O projeto simula um pequeno sistema de inventário capaz de:

* cadastrar produtos;
* validar dados;
* controlar estoque;
* atualizar preços;
* verificar disponibilidade de itens.

Ideal para estudo de:

* Java;
* POO;
* regras de negócio;
* modelagem de entidades;
* manipulação de coleções.

---

# 📌 Funcionalidades

## Gerenciamento de Produtos

* Cadastro de produtos;
* Armazenamento em lista dinâmica (`ArrayList`);
* Exibição formatada de informações.

---

## Controle de Estoque

* Adição de estoque;
* Remoção de estoque;
* Validação de quantidade disponível.

---

## Regras de Negócio

* Impede preços negativos;
* Impede estoque negativo;
* Valida remoções inválidas;
* Verifica disponibilidade do produto.

---

## Organização Orientada a Objetos

* Encapsulamento;
* Métodos específicos para operações;
* Separação entre entidade e execução.

---

# 🛠 Tecnologias Utilizadas

| Tecnologia                      | Finalidade                      |
| ------------------------------- | ------------------------------- |
| Java                            | Linguagem principal             |
| ArrayList                       | Armazenamento dinâmico          |
| Programação Orientada a Objetos | Estrutura do sistema            |
| Exception Handling              | Validação e tratamento de erros |
| CLI                             | Interface via terminal          |

---

# 📂 Estrutura do Projeto

```bash id="okbq1x"
ProductInventorySystem/
 └── src/
      ├── Product.java
      └── Main.java
```

---

# 🏗 Estrutura da Classe Product

A classe `Product` representa a entidade principal do sistema.

## Atributos

```java id="7d7r4t"
private int id;
private String name;
private String description;
private double price;
private int quantity;
private String category;
private String barcode;
private String supplier;
```

---

## Responsabilidades da Classe

| Método                | Responsabilidade          |
| --------------------- | ------------------------- |
| `getFormattedInfo()`  | Exibir dados formatados   |
| `addStock()`          | Adicionar estoque         |
| `removeStock()`       | Remover estoque           |
| `updatePrice()`       | Atualizar preço           |
| `checkAvailability()` | Verificar disponibilidade |

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

* Java JDK 17+;
* IDE Java ou terminal.

Sugestões:

* Eclipse;
* IntelliJ IDEA;
* VS Code.

---

## Compilar o Projeto

```bash id="nqqqna"
javac Main.java
```

---

## Executar o Projeto

```bash id="0m2qrz"
java Main
```

---

# 💻 Exemplo de Saída

```text id="31np6e"
=========== PRODUCT ===========
Product: Notebook
Price: $3500.00
Quantity: 10
Category: Electronics
Supplier: Dell
==============================
```

---

# 🧠 Arquitetura e Decisões Técnicas

O projeto segue uma arquitetura simples baseada em Programação Orientada a Objetos.

---

## Separação de Responsabilidades

### Classe `Product`

Responsável por:

* representar o produto;
* aplicar regras de negócio;
* controlar estoque;
* validar dados.

---

### Classe `Main`

Responsável por:

* iniciar a aplicação;
* criar produtos;
* testar funcionalidades;
* exibir resultados.

---

# ✅ Conceitos de POO Aplicados

## ✔ Encapsulamento

Os atributos da classe são privados:

```java id="x5b8an"
private String name;
private double price;
```

Isso protege o estado interno do objeto.

---

## ✔ Responsabilidade Única

Cada método possui apenas uma responsabilidade específica.

Exemplo:

```java id="1oj2k8"
addStock()
removeStock()
updatePrice()
```

---

## ✔ Regras de Negócio Centralizadas

As validações estão diretamente na entidade.

Exemplo:

```java id="nrd7pw"
if(price <= 0)
```

---

## ✔ Reutilização

A classe `Product` pode ser reutilizada em:

* APIs;
* sistemas web;
* banco de dados;
* aplicações desktop.

---

# ⚠ Problemas Identificados no Código

O código possui um pequeno erro de implementação.

Foi utilizado:

```java id="g07i4f"
displayInfo()
```

Mas o método criado foi:

```java id="s8e5d0"
getFormattedInfo()
```

---

## ✅ Correção

Substituir:

```java id="jlwmrb"
product.displayInfo()
```

por:

```java id="lf8fhr"
product.getFormattedInfo()
```

---

# ✅ Boas Práticas Aplicadas

## ✔ Validação de Dados

O sistema impede:

* preços inválidos;
* estoque negativo;
* remoções inconsistentes.

---

## ✔ Uso de Exceptions

Utilização de:

```java id="4ek99g"
IllegalArgumentException
IllegalStateException
```

para proteger regras de negócio.

---

## ✔ Código Modular

A lógica está dividida em métodos específicos.

---

## ✔ Legibilidade

* nomes claros;
* estrutura limpa;
* fácil manutenção.

---

## ✔ Organização Escalável

A arquitetura permite futura evolução.

---

# 🔮 Melhorias Futuras

Possíveis evoluções do projeto:

* CRUD completo;
* Busca por produto;
* Persistência em banco de dados;
* Interface gráfica;
* API REST com Spring Boot;
* Integração com MySQL/PostgreSQL;
* Sistema de vendas;
* Controle de usuários;
* Relatórios;
* Exportação CSV/PDF;
* Testes unitários com JUnit;
* Uso de Collections avançadas;
* Implementação de camada Service e Repository.

---

# 📚 Conceitos Aprendidos

Este projeto ajuda a praticar:

* Programação Orientada a Objetos;
* encapsulamento;
* métodos;
* construtores;
* validações;
* exceptions;
* ArrayList;
* regras de negócio;
* organização de sistemas;
* modelagem de entidades.

---

# 🏗 Possível Evolução Arquitetural

O sistema pode evoluir para:

```bash id="1k39pd"
src/
 ├── model/
 │    └── Product.java
 │
 ├── service/
 │    └── ProductService.java
 │
 ├── repository/
 │    └── ProductRepository.java
 │
 ├── exception/
 │    └── ProductException.java
 │
 └── Main.java
```

---

# 👨‍💻 Autor

Rafael Correa de Lima 

@correa.pwb

---
