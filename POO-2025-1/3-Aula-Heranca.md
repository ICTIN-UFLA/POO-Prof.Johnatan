
# 🔰  Entendendo Herança Simples em Java

## 👨‍🏫 Objetivo da aula

Você vai aprender o que é **herança simples**, como usá-la na linguagem Java, e entender conceitos importantes como **construtores** e a anotação **@Override**.

---

## 📌 O que é Herança?

Na Programação Orientada a Objetos, **herança** é o mecanismo que permite que uma classe herde atributos e métodos de outra.

- A classe que herda é chamada de **subclasse** ou **classe filha**.
- A classe que é herdada é chamada de **superclasse** ou **classe mãe**.

👉 Isso é útil quando temos comportamentos e características em comum entre diferentes classes.

---

## 🧠 Exemplo do mundo real

Imagine que estamos criando um sistema para um zoológico.

Temos uma classe chamada `Animal`, que possui atributos e comportamentos comuns a todos os animais, como `nome` e `fazerSom()`.

Agora, queremos criar classes mais específicas como `Cachorro` e `Gato`, que também são animais, mas com sons diferentes.

---

## 🛠️ Passo a Passo: Implementando Herança Simples

### 1. Criando a superclasse `Animal`

```java
public class Animal {
    String nome;

    // Construtor da classe Animal
    public Animal(String nome) {
        this.nome = nome; // Inicializa o nome do animal
    }

    // Método que será sobrescrito pelas subclasses
    public void fazerSom() {
        System.out.println("O animal faz um som...");
    }

    // Método para mostrar o nome do animal
    public void mostrarNome() {
        System.out.println("Nome: " + nome);
    }
}
```

#### **O que é um construtor?**

O **construtor** é um método especial de uma classe que é chamado automaticamente quando um objeto dessa classe é criado. Ele tem o mesmo nome da classe e é usado para **inicializar os objetos**. 

No exemplo acima, o construtor da classe `Animal` recebe o parâmetro `nome` e o utiliza para inicializar o atributo `nome` do objeto. Isso é importante porque garante que o nome de cada animal será definido no momento de sua criação.

---

### 2. Criando a subclasse `Cachorro` que **herda** de `Animal`

```java
public class Cachorro extends Animal {

    // Construtor da classe Cachorro
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe Animal para inicializar o nome
    }

    // Sobrescreve o método fazerSom da classe Animal
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
```

#### **O que é o `@Override`?**

A anotação `@Override` é usada para **sobrescrever um método da superclasse**. Quando colocamos essa anotação antes de um método, estamos dizendo que queremos **substituir o comportamento do método** herdado pela nossa versão personalizada.

No exemplo acima, a classe `Cachorro` usa `@Override` para substituir o método `fazerSom()` da classe `Animal`. O comportamento do método é modificado para que, ao chamar `fazerSom()`, o cachorro "late" em vez de apenas dizer "O animal faz um som...".

---

### 3. Criando a subclasse `Gato` que **herda** de `Animal`

```java
public class Gato extends Animal {

    // Construtor da classe Gato
    public Gato(String nome) {
        super(nome); // Chama o construtor da classe Animal
    }

    // Sobrescreve o método fazerSom da classe Animal
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}
```

---

### 4. Testando tudo em um programa principal

```java
public class Zoologico {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Rex");
        Animal a2 = new Gato("Didi");

        a1.mostrarNome();
        a1.fazerSom();

        System.out.println();

        a2.mostrarNome();
        a2.fazerSom();
    }
}
```

---

## ✅ Saída esperada:

```
Nome: Rex
O cachorro late: Au Au!

Nome: Mimi
O gato mia: Miau!
```

---

## 📘 O que aprendemos?

- **Herança**: Como criar uma classe base (superclasse) e como as subclasses herdam suas características.
- **Construtores**: Como usar um construtor para inicializar objetos e garantir que atributos sejam definidos corretamente ao criar objetos.
- **@Override**: Como sobrescrever um método herdado para modificar seu comportamento nas subclasses.

---

## 🧪 Desafio para você

Crie uma nova subclasse chamada `Passaro` que herda de `Animal` e exiba uma mensagem personalizada no método `fazerSom()`, como:

```
O pássaro canta: Piu piu!
```

