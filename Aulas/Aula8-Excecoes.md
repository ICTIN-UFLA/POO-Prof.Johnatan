
# Aula de Programação Orientada a Objetos (POO) em Java  
## Tema: Tratamento de Exceções

---

## Objetivos da Aula

- Compreender o conceito de exceções em Java.
- Identificar os tipos de exceções: verificadas (checked) e não verificadas (unchecked).
- Aprender a tratar exceções utilizando `try`, `catch`, `finally` e `throw`.
- Criar exceções personalizadas com `extends Exception` ou `RuntimeException`.

---

## 1. Introdução às Exceções

Em Java, uma exceção é um problema que ocorre durante a execução de um programa. Quando uma exceção ocorre, o fluxo normal do programa é interrompido.

---

## 2. Tipos de Exceções

### a. Exceções Verificadas (Checked Exceptions)
- São verificadas em tempo de compilação.
- Exemplo: `IOException`, `SQLException`.

```java
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
```

### b. Exceções Não Verificadas (Unchecked Exceptions)
- São subclasses de `RuntimeException`.
- O compilador não obriga a tratá-las.
- Exemplo: `NullPointerException`, `ArithmeticException`.

```java
public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(a / b); // ArithmeticException
    }
}
```

---

## 3. Blocos try-catch-finally

```java
public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = new int[3];
            numeros[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora do limite do vetor.");
        } finally {
            System.out.println("Este bloco sempre será executado.");
        }
    }
}
```

---

## 4. Lançando Exceções com throw

```java
public class ThrowExample {
    public static void verificaIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Menor de idade não permitido.");
        }
    }

    public static void main(String[] args) {
        verificaIdade(15);
    }
}
```

---

## 5. Criando Exceções Personalizadas

```java
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExcecaoPersonalizada {
    public static void checarValor(int valor) throws MinhaExcecao {
        if (valor < 0) {
            throw new MinhaExcecao("Valor não pode ser negativo!");
        }
    }

    public static void main(String[] args) {
        try {
            checarValor(-5);
        } catch (MinhaExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
```

---

## 6. Atividade Proposta

### Crie um programa Java que simule um sistema bancário com as seguintes funcionalidades:

- Saque e depósito em conta.
- Lançamento de exceção personalizada `SaldoInsuficienteException` quando o saldo for menor que o valor solicitado para saque.
- Tratamento adequado de exceções.

---

## 7. Conclusão

O tratamento de exceções é essencial para tornar aplicações mais robustas e seguras. Saber quando tratar e quando lançar exceções ajuda na manutenção e entendimento do código.

---

## Referências

- Documentação oficial Java: https://docs.oracle.com/javase/tutorial/essential/exceptions/
- Livros de Java POO como “Use a Cabeça! Java” e “Java: Como Programar” dos Deitel.
