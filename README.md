![Java](https://img.shields.io/badge/Java-25-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen)
![Build](https://img.shields.io/badge/build-passing-success)

# Workshop Spring Boot API

API Rest de um Sistema Web com pedidos, usuários, produtos e categorias. O projeto foi desenvolvido na linguagem Java utilizando o framework
Spring Boot, JPA/Hibernate e bancos de dados relacional, seguindo princípios como separação de camadas, armazenamento de dados em memória 
para ambientes de teste e testes unitários na camada de serviços com JUnit e Mockito.

<br>

## 🛠️ Tecnologias utilizadas

* Java 25
* Spring Boot
* Spring Web 
* Spring Data JPA
* H2 Database (ambiente de teste)
* PostgreSQL (ambiente de produção)
* Maven
* JUnit 5
* Mockito

<br>

## 📂 Estrutura do projeto

```text
src
├── main
│   ├── java
│   │   └── com.educandoweb.workshop
│   │       ├── config
|   |       ├── controllers
│   │       ├── entities
│   │       ├── repositories
│   │       ├── services  
│   └── resources
│       ├── application.properties
|       ├── application-dev.properties
│       ├── application-test.properties
│       └── application-prod.properties
└── test
    └── java
        └── com.educandoweb.workshop
            ├── services
```
<br>

## 🗄️ Banco de dados

Por padrão, o projeto utiliza o banco **H2 em memória**, permitindo que qualquer pessoa execute a aplicação sem configurações adicionais.

Para ambiente de produção, o banco utilizado é o **PostgreSQL**, configurado através do profile `prod`.

### Profiles disponíveis
- `default` → H2
- `dev` → H2
- `test` → H2
- `prod` → PostgreSQL

---

<br>

## ▶️ Como executar o projeto

### Pré-requisitos

* Java 25+
* SpringBoot 4+
* Maven

### Passos

```bash
# Clonar o repositório
git clone https://github.com/liedsonlm7/workshop-springboot.git

# Entrar no projeto
cd workshop-springboot

# Substititua as seguintes configurações:

# application.properties
spring.profiles.active=prod

# application-prod.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/workshop
spring.datasource.username=${DB_USER} 
spring.datasource.password=${DB_PASSWORD}

# Defina as variáveis de ambiente:
DB_USER=seu_usuario
DB_PASSWORD=sua_senha

# Executar a aplicação
mvn spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```
---
<br>

## 🧪 Executando os testes

```bash
mvn test
```

Os testes cobrem:

* Camada de serviço (unitários)

<br>

## 📌 Exemplos de endpoints

### 🔹 Listar usuários

```http
GET /users
```

### 🔹 Buscar usuário por ID

```http
GET /users/{id}
```

### 🔹 Criar usuário

```http
POST /users
```

### 🔹 Listar pedidos

```http
GET /orders
```

### 🔹 Buscar pedido por ID

```http
GET /orders/{id}
```

---
<br>

## 🧠 Boas práticas aplicadas

* Arquitetura em camadas
* Injeção de dependências
* Testes unitários com Mockito
* Testes de controller com MockMvc
* Armazenamento de dados em memória com H2 database
* Separação de ambientes (test / prod)
* Padrão REST
* Conventional Commits

---
<br>

## 📄 Licença

Este projeto é apenas para fins de estudo.
