# Livraria
API RESTful - Livraria (Spring Boot + PostgreSQL)

# Trabalho do grupo: 
Arthur Boaventura Riesco.

Gabriel da Silva Coelho.

Frederico Kunert

Este projeto é uma API RESTful desenvolvida em **Java 21** com **Spring Boot**, que permite realizar operações CRUD (Create, Read, Update, Delete) para duas entidades principais: **Usuário** e **Livro**.
Como ide eu usei o STS.

# Funcionalidades

- Cadastro, listagem, atualização e exclusão de **usuários**
- Cadastro, listagem, atualização e exclusão de **livros**
- Dados armazenados em banco de dados PostgreSQL
- Estrutura em camadas (Controller, Service, Repository, Model)
- API acessível via HTTP, retornando dados em **JSON**

# Pré-requisitos

- Java 21 instalado
- PostgreSQL instalado e rodando
- IDE (Spring Tool Suite, IntelliJ ou VS Code com suporte a Spring Boot)

# Configurar banco de dados

Crie o banco no PostgreSQL com o nome:

```sql
CREATE DATABASE livraria;
```
# Atualize o `application.properties` (se necessário)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/livraria
spring.datasource.username=postgres
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jackson.serialization.indent_output=true
```

# Rodar o projeto

- Importe o projeto no Spring Tool Suite como **Existing Maven Project**
- Rode a classe `LivrariaApiApplication.java` com:  
  **Right Click > Run As > Spring Boot App**

# Testes com Postman ou navegador
# Usuários

Método             Endpoint	                  Descrição

GET	http://localhost:8080/api/usuarios	Lista todos os usuários

GET	http://localhost:8080/api/usuarios/1	Busca usuário por ID

POST	http://localhost:8080/api/usuarios	Cria novo usuário

PUT	http://localhost:8080/api/usuarios/1	Atualiza usuário por ID

DELETE	http://localhost:8080/api/usuarios/1	Remove usuário por ID

# Livros

Método	           Endpoint	                 Descrição

GET	http://localhost:8080/api/livros	Lista todos os livros

GET	http://localhost:8080/api/livros/1	Busca livro por ID

POST	http://localhost:8080/api/livros	Cria novo livro

PUT	http://localhost:8080/api/livros/1	Atualiza livro por ID

DELETE	http://localhost:8080/api/livros/1	Remove livro por ID

# Estrutura do Projeto

```
src/
└── main/
    ├── java/
    │   └── com/exemplo/livrariaapi/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       ├── service/
    │       └── LivrariaApiApplication.java
    └── resources/
        ├── application.properties
        └── data.sql
```
