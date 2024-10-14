
# Conceito de Herança em Java



## Introdução à Herança

A **Herança** é um dos pilares da **Programação Orientada a Objetos (POO)**. Ela permite que uma **classe filha (subclasse)** herde atributos e comportamentos de uma **classe pai (superclasse)**, promovendo **reutilização de código** e **organização**.

----------

## Por que usar Herança?

Sem herança, teríamos que repetir código para todas as classes que compartilham comportamentos semelhantes, o que tornaria o código mais difícil de manter. Com herança:

-   Evitamos duplicação de código.
-   Criamos uma hierarquia lógica de classes.
-   Aumentamos a flexibilidade e extensibilidade do sistema.

----------

## Contexto e Problema Real

Imagine que estamos desenvolvendo um **sistema escolar** para gerenciar **Pessoas** envolvidas na escola. Esse sistema deve lidar com dois tipos de usuários principais: **Alunos** e **Professores**.

Ambos possuem **atributos em comum**:

-   **Nome**
-   **Idade**

No entanto, cada um tem **atributos específicos**:

-   **Aluno**: matrícula e curso.
-   **Professor**: salário e disciplina que ensina.

Se criarmos as classes `Aluno` e `Professor` de forma independente, teríamos código duplicado, pois ambos têm atributos e comportamentos em comum. A **solução ideal** é usar **herança**: criamos uma classe **`Pessoa`** que contém os atributos e métodos comuns, e as classes **`Aluno`** e **`Professor`** herdam dessa classe, adicionando seus próprios atributos e comportamentos específicos.

----------

### Código das Classes

#### `Pessoa.java`

Esta é a **superclasse** que contém os atributos e métodos comuns a todas as pessoas.

```java
public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

```
#### `Aluno.java`

A classe **Aluno** herda de `Pessoa` e adiciona os atributos e comportamentos específicos de um aluno.
```java
public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);  // Chama o construtor da superclasse Pessoa
        this.matricula = matricula;
        this.curso = curso;
    }

    public void estudar() {
        System.out.println(nome + " está estudando o curso de " + curso + ".");
    }
}

```
#### `Professor.java`

A classe **Professor** herda de `Pessoa` e adiciona os atributos e comportamentos específicos de um professor.

```java
public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, double salario, String disciplina) {
        super(nome, idade);  // Chama o construtor da superclasse Pessoa
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando " + disciplina + ".");
    }
}

```
#### `Main.java`

Esta é a classe principal que cria objetos das classes `Aluno` e `Professor` e executa seus métodos.
```java
public class Main {
    public static void main(String[] args) {
        // Criando um objeto Aluno
        Aluno aluno = new Aluno("Carlos", 20, "20230101", "Ciência da Computação");
        aluno.apresentar();
        aluno.estudar();

        // Criando um objeto Professor
        Professor professor = new Professor("Ana", 45, 8500.00, "Programação");
        professor.apresentar();
        professor.ensinar();
    }
}

```


## Com este exemplo, você aprendeu:

-   Como aplicar o conceito de **herança** em Java.
-   Como organizar o código em **arquivos separados** para facilitar a manutenção.
-   Como reutilizar código com **superclasses** e especializar comportamentos com **subclasses**.

**Resumo**:

-   `Pessoa`: Superclasse com atributos e métodos comuns.
-   `Aluno` e `Professor`: Subclasses que herdam de `Pessoa` e adicionam seus próprios atributos e comportamentos.

## Desafio 


1.  **Novo Funcionário**: Crie uma nova classe `Funcionario` que herde de `Pessoa` e inclua atributos como `cargo` e `salário`.
2.  **Promoção de Professor**: Adicione um método `promover` em `Professor` que aumente seu salário.
3.  **Bibliotecário**: Crie uma classe `Bibliotecario` que herde de `Funcionario` e tenha um método para registrar empréstimos de livros.
