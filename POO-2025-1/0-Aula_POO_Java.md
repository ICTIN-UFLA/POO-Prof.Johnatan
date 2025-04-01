
# Aula de POO em Java: Criando Classes, Atributos, Métodos e Entrada de Dados

## Objetivos
- Aprender a criar uma classe em Java.
- Declarar atributos.
- Criar métodos.
- Solicitar informações do usuário via teclado.

---

## 💡 Explicação passo a passo

### 1️⃣ Criando uma classe

Em Java, toda estrutura de código começa com uma classe. Exemplo de uma classe chamada `Pessoa`:

```java
public class Pessoa {
    // Aqui dentro vão os atributos e métodos
}
```

---

### 2️⃣ Declarando atributos

Atributos são as características que um objeto pode ter:

```java
public class Pessoa {
    String nome;
    int idade;
}
```

---

### 3️⃣ Criando métodos

Métodos são as ações ou comportamentos de uma classe:

```java
public class Pessoa {
    String nome;
    int idade;

    // Método para exibir dados
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
```

---

### 4️⃣ Solicitando informações do usuário

Para ler dados digitados pelo usuário, usamos a classe `Scanner`:

```java
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Digite o nome da pessoa: ");
        p.nome = teclado.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        p.idade = teclado.nextInt();

        System.out.println("\n--- Dados cadastrados ---");
        p.exibirDados();

        teclado.close();
    }
}
```

---

## ✅ O que você aprendeu hoje?
- Criar uma classe (`Pessoa`)
- Declarar atributos (`nome`, `idade`)
- Criar um método (`exibirDados`)
- Solicitar informações do usuário com `Scanner`

---

## 📝 Desafio

Crie uma nova classe chamada `Produto` com:
- Atributos: `nome` (String), `preco` (double)
- Método: `exibirProduto()`, que imprime o nome e o preço
- Peça ao usuário para digitar os dados e mostre na tela

---
