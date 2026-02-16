# Gerenciador de Contatos com Especialidades

Sistema simples em Java para cadastro e gerenciamento de contatos, com suporte a múltiplas especialidades (ex: programador, designer, consultor) e valor por hora.

## Funcionalidades

- Adicionar contato com nome, e-mail, data de nascimento
- Adicionar múltiplas especialidades com valor por hora
- Buscar contato por e-mail
- Listar todos os contatos
- Listar contatos ordenados por nome
- Buscar contatos por especialidade
- Remover contato por e-mail

##  Tecnologias utilizadas

- Java 8+
- Programação orientada a objetos
- Estrutura de dados: HashMap
- Validação de e-mail com regex

## Estrutura do projeto
ContactManager/
├── application/ # Classe principal (Main)
├── model/ # Entidades (Contato, Especialidade)
├── repository/ # Repositório com Map (simulação de banco)
├── service/ # Lógica de negócio (ContatoService)
└── util/ # Utilitários (Validador)


## 📌 Melhorias futuras
- Persistência em arquivo ou banco de dados

- Interface gráfica (JavaFX ou Swing)

- Testes unitários

📄 Licença
Este projeto está sob a licença MIT.

##  Como executar

1. Clone o repositório
2. Compile os arquivos `.java`
3. Execute a classe `Main`

```bash
javac projetos/application/Main.java
java projetos.application.Main

