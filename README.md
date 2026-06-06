# Product Inventory Management System

Sistema de gerenciamento de inventário desenvolvido em Java, focado em Programação Orientada a Objetos (POO), validação de dados, encapsulamento e controle de estoque.

O projeto simula um sistema real de inventário capaz de:

* cadastrar produtos;
* controlar estoque;
* buscar produtos;
* calcular valor total do inventário;
* validar códigos únicos;
* listar produtos indisponíveis.

A aplicação foi construída utilizando conceitos sólidos de arquitetura orientada a objetos, tornando o sistema escalável e preparado para futuras evoluções.

---

# 📌 Funcionalidades

## 📦 Gerenciamento de Produtos

* Cadastro de produtos;
* Remoção de produtos;
* Busca por ID;
* Busca por código de barras;
* Listagem completa do inventário.

---

## 📊 Controle de Estoque

* Adição de estoque;
* Remoção de estoque;
* Verificação de disponibilidade;
* Identificação de produtos indisponíveis.

---

## 💰 Controle Financeiro

* Atualização de preços;
* Cálculo automático do valor total do inventário.

---

## 🔒 Validações de Segurança

O sistema impede:

* preços negativos;
* estoque negativo;
* IDs duplicados;
* códigos de barras duplicados;
* produtos nulos;
* remoções inválidas.

---

# 🛠 Tecnologias Utilizadas

| Tecnologia         | Finalidade                                |
| ------------------ | ----------------------------------------- |
| Java               | Linguagem principal                       |
| ArrayList          | Estrutura dinâmica de armazenamento       |
| POO                | Modelagem do sistema                      |
| Exception Handling | Validação e proteção de regras de negócio |
| CLI                | Interface via terminal                    |

---

# 📂 Estrutura do Projeto

```bash id="0q3x8m"
ProductInventoryManagement/
 └── src/
      ├── Product.java
      ├── Inventory.java
      └── Main.java
```

---

# 🏗 Arquitetura do Sistema

O projeto foi dividido em responsabilidades específicas.

| Classe      | Responsabilidade              |
| ----------- | ----------------------------- |
| `Product`   | Representa a entidade produto |
| `Inventory` | Gerencia o inventário         |
| `Main`      | Inicializa e testa o sistema  |

---

# 📦 Classe Product

A classe `Product` representa os produtos do sistema.

## Atributos

```java id="p8z69z"
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

## Funcionalidades da Classe

| Método                | Função                          |
| --------------------- | ------------------------------- |
| `addStock()`          | Adiciona estoque                |
| `removeStock()`       | Remove estoque                  |
| `updatePrice()`       | Atualiza preço                  |
| `checkAvailability()` | Verifica disponibilidade        |
| `toString()`          | Exibe dados formatados          |
| Getters               | Acesso seguro aos atributos     |
| Setters               | Atualização controlada de dados |

---

# 📦 Classe Inventory

Responsável pelo gerenciamento do inventário.

---

## Funcionalidades

| Método                         | Função                         |
| ------------------------------ | ------------------------------ |
| `addProduct()`                 | Adiciona produtos              |
| `removeProduct()`              | Remove produtos                |
| `findProductById()`            | Busca produto por ID           |
| `findProductByBarcode()`       | Busca por código de barras     |
| `listProducts()`               | Retorna lista de produtos      |
| `displayInventory()`           | Exibe inventário               |
| `displayUnavailableProducts()` | Exibe produtos sem estoque     |
| `getInventoryValue()`          | Calcula valor total            |
| `getTotalProducts()`           | Retorna quantidade de produtos |

---

# 🚀 Como Executar o Projeto

## Pré-requisitos

* Java JDK 17+;
* IDE Java ou terminal configurado.

Sugestões:

* Eclipse;
* IntelliJ IDEA;
* VS Code.

---

## Compilar o Projeto

```bash id="wb2qme"
javac Main.java
```

---

## Executar o Projeto

```bash id="lx7lxa"
java Main
```

---

# 💻 Exemplo de Saída

```text id="t9wmga"
=========== PRODUCT ===========
Product: Notebook
Price: $3500.00
Quantity: 10
Category: Electronics
Supplier: Dell
==============================
```

---

## Busca de Produto

```text id="7db16g"
Found product:
=========== PRODUCT ===========
Product: Mouse
Price: $120.00
Quantity: 50
Category: Accessories
Supplier: Logitech
==============================
```

---

## Estatísticas do Inventário

```text id="b9v7gi"
Total products: 3
Inventory value: $53000.00
```

---

# 🧠 Decisões Técnicas

---

## ✔ Uso de `toString()`

O método:

```java id="w6stsh"
@Override
public String toString()
```

foi utilizado para melhorar:

* legibilidade;
* reutilização;
* integração com `System.out.println()`.

Isso elimina necessidade de métodos extras de exibição.

---

## ✔ Encapsulamento

Todos os atributos são privados:

```java id="78dh1v"
private String name;
private double price;
```

O acesso ocorre via:

* getters;
* setters.

---

## ✔ Validações Centralizadas

As regras de negócio ficam dentro da própria entidade.

Exemplo:

```java id="ofc5i7"
if(price <= 0)
```

---

## ✔ Controle de Integridade

O sistema impede:

* duplicação de IDs;
* duplicação de código de barras.

---

## ✔ Programação Defensiva

Uso de exceptions para proteger o sistema:

```java id="hn91s5"
IllegalArgumentException
IllegalStateException
```

---

# ✅ Boas Práticas Aplicadas

## ✔ Programação Orientada a Objetos

* encapsulamento;
* abstração;
* responsabilidade única;
* modularização.

---

## ✔ Código Escalável

Separação clara entre:

* entidade;
* gerenciamento;
* execução.

---

## ✔ Legibilidade

* nomes descritivos;
* métodos objetivos;
* código limpo.

---

## ✔ Reutilização

A classe `Inventory` pode ser reutilizada em:

* APIs REST;
* sistemas web;
* aplicações desktop;
* microsserviços.

---

## ✔ Segurança de Dados

Validações evitam inconsistências no inventário.

---

# 📚 Conceitos Aprendidos

Este projeto ajuda a praticar:

* Programação Orientada a Objetos;
* encapsulamento;
* collections (`ArrayList`);
* validações;
* exceptions;
* modelagem de entidades;
* regras de negócio;
* arquitetura de sistemas;
* organização de código;
* boas práticas em Java.

---

# 🔮 Melhorias Futuras

Possíveis evoluções do projeto:

* Persistência com MySQL/PostgreSQL;
* API REST com Spring Boot;
* Interface gráfica com JavaFX;
* Integração com banco de dados;
* Sistema de autenticação;
* Relatórios PDF/Excel;
* Busca avançada;
* Filtros por categoria;
* Ordenação de produtos;
* Testes unitários com JUnit;
* Camadas Service e Repository;
* Uso de interfaces;
* Persistência em JSON/XML;
* Dockerização do sistema.

---

# 🏗 Possível Evolução Arquitetural

Estrutura futura recomendada:

```bash id="8v3u0n"
src/
 ├── model/
 │    └── Product.java
 │
 ├── service/
 │    └── InventoryService.java
 │
 ├── repository/
 │    └── ProductRepository.java
 │
 ├── exception/
 │    ├── ProductNotFoundException.java
 │    └── DuplicateProductException.java
 │
 ├── dto/
 │
 ├── util/
 │
 └── Main.java
```

---

# 👨‍💻 Autor

Rafael Correa de Lima 

@correa.pwb

---
