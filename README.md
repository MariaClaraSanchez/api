# App Simulando uma Clínica Médica
Este app foi desenvolvido durante a formação de Spring Boot da Alura. O objetivo do projeto é simular uma clínica médica e possui funcionalidades como CRUD, cadastro de médicos e pacientes, autenticação de usuários, testes automatizados, entre outras.

## Requirements

Para rodar o projeto você precisa:

- [JDK 8+](https://www.oracle.com/br/java/technologies/downloads/#java20)
- [Maven 3](https://maven.apache.org)
- Um banco de dados SQL configurado, conforme documentação

## Tecnologias Utilizadas

- Spring Boot
- Java

## Funcionalidades

- Autenticação de usuários
- CRUD de entidades
- Validação de dados
- Paginação e ordenação
- Entre Outras funcionalidades

## Instalação

1 - Clone o repositório: git clone [https://github.com/MariaClaraSanchez/api]
2 - Entre na pasta do projeto: cd nome_da_pasta
3 - Execute o comando para iniciar o projeto: mvn spring-boot:run


## Uso

Ao executar o projeto, é possível visualizar a documentação que mostra todos os passos para usar a API.

## Exemplo de Requisição:

POST [http://localhost:8080/login]

Content-Type: application/json
```
{
	"login": "user@e-mail.com",
	"senha": "1234567"
}
```

## Exemplo de Resposta
HTTP/1.1 200 
Content-Type: application/json
``` 
json
{
	"token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJtYXJpYUB2b2xsLm1lZCIsImlzcyI6IkFQSSBWb2xsLm1lZCIsImV4cCI6MTY4NzgwNzI4NH0.m_Ks13qwHnHDfT_pLH7YJXEEgMGt8JuNOvjBU364zWQ"
}
```
