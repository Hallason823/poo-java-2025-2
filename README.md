# POO Java 2025-2

## Sobre o Projeto

Repositório de exercícios e trabalhos da disciplina de Programação Orientada a Objetos (POO) em Java, segundo semestre de 2025. O conteúdo abrange conceitos fundamentais de POO e desenvolvimento de aplicações com Spring Boot.

## Tecnologias Utilizadas

 Java | Spring Boot | Spring Data JPA | Maven/Gradle

## Estrutura do Projeto

### `/ex` - Exercícios
Exercícios práticos desenvolvidos durante as aulas, abordando desde conceitos fundamentais de POO até desenvolvimento com Spring Boot:
- Classes e Objetos
- Encapsulamento com modificadores de acesso (private, public, protected)
- Herança e Polimorfismo (sobrescrita e sobrecarga)
- Classes Abstratas e Interfaces
- Tratamento de Exceções
- Coleções (ArrayList, HashMap, LinkedList)
- Streams e expressões lambda
- Desenvolvimento de APIs REST com Spring Boot
- Persistência com JPA/Hibernate
- Arquitetura em camadas (Controller, Service, Repository)

### `/homework` - Trabalhos
Atividades avaliativas focadas em POO puro, integrando múltiplos conceitos:
- Modelagem orientada a objetos
- Composição e agregação de classes
- Hierarquias de herança complexas
- Manipulação avançada de coleções

### `/tests` - Avaliações
Materiais de testes e provas práticas organizados por professor e período.

## Como Executar

### Pré-requisitos
- JDK 11 ou superior
- Maven ou Gradle (para projetos Spring Boot)
- IDE Java (IntelliJ IDEA, Eclipse, NetBeans)

### Execução

**Exercícios e Trabalhos (Java puro):**
```bash
javac fileName.java
java fileName
```

**Projetos Spring Boot:**
```bash
# Com Maven
mvn spring-boot:run

# Com Gradle
gradle bootRun
```

## Conceitos Abordados

**Fundamentos de POO:**
- Encapsulamento, Herança, Polimorfismo e Abstração
- Composição e Agregação de objetos
- Tratamento de Exceções
- Coleções e Generics
- Padrões de Projeto

**Desenvolvimento com Spring:**
- Controllers REST e requisições HTTP
- Repositories e persistência com JPA
- Services e lógica de negócio
- Injeção de dependências (DI/IoC)
