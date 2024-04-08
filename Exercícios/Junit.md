
# Teste Unitário e JUnit em Java

## Introdução

Olá, nessa aula vocês aprenderão sobre os fundamentos dos testes unitários em Java usando JUnit. Assumindo que já têm o Eclipse e o JUnit instalados, mergulharemos diretamente nos conceitos e práticas.

## O que são Testes Unitários?

Testes unitários são uma forma de verificar se as menores partes do código, como métodos e funções, estão funcionando conforme o esperado. Esses testes são cruciais para garantir a qualidade e a estabilidade do software ao longo do tempo.

## JUnit: Uma Visão Geral

JUnit é uma framework popular para teste unitário em Java. Ela oferece anotações e asserções que facilitam a escrita e a leitura dos testes.

## Configurando o JUnit no Eclipse

1.  **Criar Projeto**: No Eclipse, crie um novo projeto Java.
2.  **Adicionar JUnit**: Vá em `Project > Properties > Java Build Path > Libraries > Add Library > JUnit`. Selecione a versão mais recente do JUnit e adicione ao projeto.
## Escrevendo Testes Unitários

Vamos criar uma classe simples e seus testes correspondentes.

### Classe de Exemplo: `Calculator.java`

```Java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    // Métodos multiply e divide...
}
```

### Classe de Teste: `CalculatorTest.java`

Para criar um teste unitário para a classe `Calculator`, siga estas etapas:

1.  **Crie uma classe de teste**: No mesmo pacote da sua classe `Calculator`, crie uma nova classe chamada `CalculatorTest`.
2.  **Escreva métodos de teste**: Use a anotação `@Test` para indicar que um método é um teste unitário.

```Java
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Erro no método add", 5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Erro no método subtract", 1, calculator.subtract(4, 3));
    }

    // Outros métodos de teste...
}
```


## Tipos de Asserts

JUnit fornece vários métodos `assert` para validar diferentes condições:

### `assertEquals`

Verifica se dois valores são iguais.

```Java
@Test
public void testEquality() {
    assertEquals("Os valores devem ser iguais", 20, calculator.add(10, 10));
}

```

### `assertNotEquals`

Verifica se dois valores não são iguais.
```java
@Test
public void testNotEquality() {
    assertNotEquals("Os valores não devem ser iguais", 20, calculator.add(10, 5));
}
```

### `assertTrue` e `assertFalse`

Verifica se uma condição é verdadeira ou falsa.

```java
@Test
public void testCondition() {
    assertTrue("A condição deve ser verdadeira", calculator.add(2, 2) == 4);
    assertFalse("A condição deve ser falsa", calculator.subtract(5, 3) == 1);
}
```

### `assertArrayEquals`

Verifica se dois arrays são iguais.

```java
@Test
public void testArrayEquality() {
    int[] expected = {1, 2, 3};
    int[] actual = calculator.getArray();
    assertArrayEquals("Os arrays devem ser iguais", expected, actual);
}

```

### Executando os Testes

No Eclipse, clique com o botão direito na classe de teste e selecione `Run As > JUnit Test`. Os resultados serão exibidos no JUnit view.


  

# AGORA VAMOS PARA ATIVIDADE PRÁTICA: Construção de Casos de Teste em Java com JUnit

  
## Classes para Testar

  

### Classe 1: `Calculator`

Classe que realiza operações matemáticas básicas.
```java

public  class  Calculator {
public  int  add(int  a, int  b) {
return a + b;
}
  
public  int  subtract(int  a, int  b) {
return a - b;
}


public  int  multiply(int  a, int  b) {
return a * b;
}

public  double  divide(int  a, int  b) {
if (b == 0) {
throw  new  IllegalArgumentException("Divisor cannot be zero.");
}
return a / (double) b;
}
}
```


### Classe 2: `StringHelper`

Classe para manipulação de strings.

```java

public  class  StringHelper {
public  String  reverse(String  input) {
return  new  StringBuilder(input).reverse().toString();
}

public  boolean  isPalindrome(String  input) {
String  reversed = reverse(input);
return  input.equals(reversed);
}
}

```
  
## Sua Tarefa

### 1. Escrever Casos de Teste

Crie testes unitários para cada método nas classes `Calculator` e `StringHelper`.

  
### Dicas

-  **Calculator**:

- Teste com números positivos, negativos e zero.
- Teste a divisão por zero.

-  **StringHelper**:

- Teste com strings comuns, vazias e palíndromos.


### Exemplo de Caso de Teste para `Calculator`

```java

import  static org.junit.Assert.*;
import org.junit.Test;


public  class  CalculatorTest {
private  Calculator  calculator = new  Calculator();
@Test

public  void  testAddPositiveNumbers() {
assertEquals(10, calculator.add(6, 4));
}

// Mais testes aqui...

}

```

  

### 2. Estrutura do Teste

Use a anotação `@Test` e asserções do JUnit.

  

### 3. Execução dos Testes

Execute os testes com o JUnit.

  
