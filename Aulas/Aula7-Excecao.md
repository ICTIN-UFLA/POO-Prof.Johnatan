
  

#  Tratamento de Exceções em Java

  

O tratamento de exceções é um aspecto fundamental da programação em Java, ajudando a gerenciar erros de forma elegante e segura, sem interromper abruptamente o fluxo do programa. Vamos explorar os conceitos básicos e como utilizá-los em seu código.

  

## O que é uma Exceção?

  

Em Java, uma exceção é um evento que ocorre durante a execução do programa e que interrompe o fluxo normal das instruções. Por exemplo, tentar acessar um índice fora dos limites de um array ou tentar ler um arquivo que não existe pode gerar uma exceção.

  

## Blocos `try` e `catch`

  

O bloco `try` permite que você teste um bloco de código em busca de erros. O bloco `catch` permite que você lide com o erro.

  

### Sintaxe

  

```java

try {

// Código que pode gerar uma exceção

} catch (ExceptionType name) {

// Código que é executado se uma exceção ocorrer

}

```

  

### Exemplo

  

```java

try {

int[] myNumbers = {1, 2, 3};

System.out.println(myNumbers[10]); // Isso vai gerar uma exceção

} catch (ArrayIndexOutOfBoundsException e) {

System.out.println("Índice do array fora dos limites!");

}

```

  

## Bloco `finally`

  

O bloco `finally` é opcional e é executado após os blocos `try` e `catch`, independentemente de uma exceção ter sido lançada ou não.

  

### Sintaxe

  

```java

try {

// Código que pode gerar uma exceção

} catch (ExceptionType e) {

// Código que é executado se uma exceção ocorrer

} finally {

// Código que é executado após try e catch, independentemente de uma exceção ter sido lançada ou não

}

```

  

### Exemplo

  

```java

try {

int[] myNumbers = {1, 2, 3};

System.out.println(myNumbers[10]);

} catch (ArrayIndexOutOfBoundsException e) {

System.out.println("Índice do array fora dos limites!");

} finally {

System.out.println("O bloco 'try catch' foi executado.");

}

```

  

## Lançando Exceções

  

Você também pode lançar exceções manualmente usando a palavra-chave `throw`.

  

### Sintaxe

  

```java

throw new ExceptionType("Mensagem de erro");

```

  

### Exemplo

  

```java

public void checkAge(int age) {

if (age < 18) {

throw new ArithmeticException("Acesso negado - Você deve ter pelo menos 18 anos.");

} else {

System.out.println("Acesso concedido - Você é maior de idade!");

}

}

```

  

## Outro exemplo 

  
Suponhamos que temos um arquivo CSV chamado `dados.csv` com o seguinte conteúdo, que lista nomes de pessoas e suas idades:

Nome,Idade 
Alice,30 
Bob,25 
Carlos,28 
Diana,22

### Exemplo de Código Java para Ler o Arquivo CSV

Aqui está um exemplo de como você pode ler este arquivo CSV em Java:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) {
        try {
            File file = new File("dados.csv");
            Scanner scanner = new Scanner(file);

            // Lendo o cabeçalho para ignorá-lo
            if (scanner.hasNext()) {
                scanner.nextLine();
            }

            // Lendo os dados do arquivo
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");
                System.out.println("Nome: " + columns[0] + ", Idade: " + columns[1]);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}
```
