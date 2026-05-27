# 📇 ContactManager API

> API REST para gerenciamento de contatos e especialidades, desenvolvida com **Spring Boot** e persistência em arquivo.  
> Projeto evoluído de uma aplicação de console para um serviço web moderno, pronto para integração com front-end e mobile.

---

##  Sobre o Projeto

Este projeto demonstra a evolução de um sistema simples de linha de comando para uma **API REST profissional**, aplicando conceitos fundamentais de desenvolvimento web:

- **Camadas bem definidas**: Controller, Service, Repository e Model.
- **Injeção de dependência** com Spring (`@Autowired`).
- **Tratamento de erros** e códigos HTTP apropriados (200, 201, 404, 409).
- **Persistência** em arquivo (`contatos.dat`) – ideal para aprendizado e protótipos.
- **Pronto para evolução** para banco de dados real (JPA/Hibernate) e autenticação (Spring Security + JWT).

---

##  Funcionalidades

-  **Adicionar** contato com nome, e-mail, telefone e lista de especialidades.
-  **Listar** todos os contatos.
-  **Buscar** contato por e-mail.
-  **Atualizar** dados de um contato.
-  **Remover** contato.
-  Persistência automática (não perde dados ao reiniciar).

---

##  Tecnologias Utilizadas

| Tecnologia       | Versão | Descrição                        |
|-----------------|--------|----------------------------------|
| Java            | 21     | Linguagem principal              |
| Spring Boot     | 3.1.5  | Framework para API REST          |
| Spring Web      | -      | Endpoints HTTP e JSON            |
| Maven           | 3.9+   | Gerenciador de dependências      |
| Git             | -      | Controle de versão               |

---

##  Como Executar Localmente

### Pré-requisitos
- **Java 17+** instalado.
- **Maven 3.8+** (ou use o wrapper `./mvnw` incluso).

### Passos

```bash
# 1. Clone o repositório e acesse a branch api
git clone https://github.com/nataliagilles/ContactManagerSpecialties.git
cd ContactManagerSpecialties
git checkout api   # importante: a API está nesta branch

# 2. Execute a aplicação com Maven
./mvnw spring-boot:run   # Linux/Mac
# ou
mvnw.cmd spring-boot:run # Windows
```

A aplicação iniciará na porta 8080.
Teste com o navegador: http://localhost:8080/api/contatos

## 📡 Endpoints da API
 
|Método	  |Endpoint	              | Descrição	                | Códigos HTTP   |
|---------|-----------------------|---------------------------|----------------|
|GET	    |/api/contatos	        | Lista todos os contatos   |	200            |
|GET	    |/api/contatos/{email}	| Busca contato por email	  | 200, 404       |
|POST	    |/api/contatos	        | Adiciona novo contato	    | 201, 409, 500  |
|PUT	    |/api/contatos/{email}	| Atualiza contato          |	200, 404, 500  |
|DELETE	  |/api/contatos/{email}	| Remove contato	          | 204, 404, 500  |

##  Exemplos de Requisições com curl

###  Adicionar contato
```bash
curl -X POST http://localhost:8080/api/contatos \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Ana Clara",
    "email": "ana@email.com",
    "telefone": "(11) 98888-7777",
    "especialidades": ["Java", "Spring Boot"]
  }'
```

###  Listar todos
```bash
curl -X GET http://localhost:8080/api/contatos
```

###  Buscar por e-mail
```bash
curl -X GET http://localhost:8080/api/contatos/ana@email.com
```

### Atualizar
```bash
curl -X PUT http://localhost:8080/api/contatos/ana@email.com \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Ana Clara Silva",
    "email": "ana@email.com",
    "telefone": "(11) 99999-1111",
    "especialidades": ["Java", "Spring Boot", "REST APIs"]
  }'
```

###  Remover
```bash
curl -X DELETE http://localhost:8080/api/contatos/ana@email.com
```

###  Estrutura do Projeto (Camadas)
```bash
src/main/java/br/contactmanager/api/
├── controller/          # Endpoints REST (ContatoController)
├── service/             # Regras de negócio (ContatoService)
├── repository/          # Persistência em arquivo (ContatoRepository)
├── model/               # Entidades (Contato, Especialidade)
└── util/                # Utilitários (ArquivoUtil, Validador)
```

### **Destaques de boas práticas:**
- Separação de responsabilidades.
- Uso de Optional para evitar NullPointerException.
- Injeção de dependência via Spring.
- Código limpo e comentários objetivos.

##  Possíveis Melhorias Futuras
- Adicionar SpringDoc OpenAPI (Swagger) para documentação interativa.
- Migrar persistência para banco de dados relacional (PostgreSQL/MySQL) com Spring Data JPA.
- Implementar autenticação e autorização com Spring Security e JWT.
- Criar um front-end simples (React, Vue ou Thymeleaf) para consumir a API.
- Escrever testes automatizados (unitários e de integração).
- Containerizar a aplicação com Docker.

##  Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.

## 👩‍💻 Autora
**Natalia Gilles**
Desenvolvedora backend em evolução, Java, Spring Boot e APIs REST.
](https://github.com/nataliagilles)
**Sugestões e contribuições são bem-vindas.**
