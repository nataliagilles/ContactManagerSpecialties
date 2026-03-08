# 📇 Contact Manager with Specialties

Sistema de gerenciamento de contatos desenvolvido em Java, com funcionalidades de cadastro, busca, listagem ordenada e persistência em arquivo. Cada contato pode ter múltiplas especialidades associadas (ex: programador, designer) com valor por hora.

## ✨ Funcionalidades

- ✅ **Adicionar contato** com nome, email, data de nascimento e lista de especialidades.
- 🔍 **Buscar contato** por email.
- 📋 **Listar todos os contatos** cadastrados.
- 🗑️ **Remover contato** por email.
- 🎯 **Buscar contatos** por nome da especialidade.
- 🔤 **Listar contatos ordenados** por nome (case insensitive).
- ✏️ **Editar contato** (alterar nome, data de nascimento e especialidades).
- 💾 **Persistência automática** em arquivo (`contatos.dat`) – os dados são salvos ao adicionar, editar ou remover, e carregados ao iniciar o programa.

## 🛠️ Tecnologias Utilizadas

- **Java 17** (ou superior)
- **Programação Orientada a Objetos** (POO)
- **Java Stream API** para filtros e ordenações
- **Serialização** para persistência em arquivo
- **Optional** para evitar null pointers
- **Git** e **GitHub** para versionamento

## 📂 Estrutura do Projeto

```
ContactManagerSpecialties/
├── src/
│ └── ContactManager/
│ ├── application/ # Interface com usuário (ConsoleUI, Main)
│ ├── model/ # Classes de domínio (Contato, Especialidade)
│ ├── repository/ # Camada de dados (ContatoRepository)
│ ├── service/ # Regras de negócio (ContatoService)
│ └── util/ # Utilitários (Validador, ArquivoUtil)
├── .gitignore
├── contatos.dat
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos
- JDK 17 ou superior instalado.
- Git (opcional, para clonar).

### Passos

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/nataliagilles/ContactManagerSpecialties.git
   ```
2. **Acesse a pasta do projeto:**
 ```cd ContactManagerSpecialties```

3. **Compile os arquivos Java (dentro da pasta src):**
```javac ContactManager/application/*.java ContactManager/model/*.java ContactManager/repository/*.java ContactManager/service/*.java ContactManager/util/*.java```

4. **Execute a aplicação:**
```java ContactManager.application.Main```


**Se estiver usando uma IDE (como VS Code, IntelliJ ou Eclipse), basta importar o projeto como pasta e executar a classe Main.***

## 🔮 Melhorias Futuras:

- Adicionar interface gráfica (JavaFX ou Swing).

- Implementar busca por nome (aproximada).

- Permitir remover especialidades individualmente.

- Adicionar testes unitários com JUnit.

- Exportar contatos para CSV ou JSON.



## 📌 Sobre o Projeto
Este projeto foi desenvolvido como parte dos meus estudos em Java, com foco em:

- Organização em camadas (model, repository, service, application).

- Boas práticas de validação e tratamento de entradas.

- Persistência de dados sem banco de dados (serialização).

- Uso de recursos modernos do Java (Streams, Optional, LocalDate).



## 👩‍💻 Autora

Natalia Gilles
Estudante Análise e Desenvolvimento de Sistemas | Foco em Back-End

⭐ Se este projeto te ajudou de alguma forma, considere dar uma estrela no repositório!
