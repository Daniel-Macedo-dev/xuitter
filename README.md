
# 🐦🚀 Xuitter API 🐦🚀

Projeto em Java para gerenciar usuários e pius (posts curtos), aplicando boas práticas com **DTOs** e **Mappers** para proteger dados internos e organizar o fluxo de informações.

## 🐤 Descrição

Esta API REST em Java permite cadastrar, listar e remover usuários e pius.  
Utiliza o banco de dados **MySQL**, simulando um ambiente real de aplicação.  

A arquitetura adota **DTOs** para transferência segura de dados e **Mappers** para converter entre entidades e DTOs.  

Atualmente, os métodos **GET (listar)**, **POST (cadastrar)** e **DELETE (remover)** estão implementados e funcionando. Futuramente podem ser adicionadas curtidas, comentários e sistema de seguidores.

## ⚙️ Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## 🚀 Funcionalidades

- Listar todos os usuários (`GET /usuario`)  
- Cadastrar novo usuário (`POST /usuario`)  
- Listar todos os pius (`GET /piu`)  
- Publicar novo piu (`POST /piu`)  
- Remover piu por ID (`DELETE /piu/{id}`)  
- Uso de DTOs para ocultar dados sensíveis  
- Mapeamento automático entre entidade e DTO  

## ▶️ Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/Daniel-Macedo-dev/Xuitter.git
````

2. Abra o projeto na IDE (IntelliJ, Eclipse, etc).
3. Configure o JDK 17+.
4. Configure o banco MySQL:

```sql
CREATE DATABASE xuitter_db;
```

5. Atualize as credenciais no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/xuitter_db
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

6. Execute:

```bash
mvn spring-boot:run
```

7. Acesse a API:

```
http://localhost:8080/usuario
http://localhost:8080/piu
```

## 📌 Próximos Passos

* Adicionar sistema de curtidas e comentários
* Criar endpoints para seguidores e perfis de usuário
* Implementar validações e exceções personalizadas

Qualquer dúvida ou sugestão, fique à vontade para abrir uma **issue** ou **pull request**.
Obrigado por conferir o projeto! 🐦🚀
