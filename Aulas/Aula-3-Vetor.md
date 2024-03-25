

  

# Tutorial de Vetores em Java

  

## Introdução

  

Este tutorial introduz o conceito e a utilização de vetores (arrays) em Java, uma estrutura de dados fundamental para armazenar coleções de elementos do mesmo tipo.

  

## O que é um Vetor?

  

Um vetor, ou array, em Java, é uma coleção de elementos do mesmo tipo, acessados através de índices numéricos começando do zero.

  

## Declaração e Inicialização de Vetores

  

Para declarar e inicializar um vetor em Java, você pode usar a seguinte sintaxe:

  

```java

// Declaração de um vetor de inteiros

int[] numeros;

  

// Inicialização do vetor

numeros = new int[5]; // Vetor com 5 elementos

```

  

Ou, declarar e inicializar na mesma linha:

  

```java

int[] numeros = new int[5];

```

  

## Atribuindo Valores aos Elementos do Vetor

  

Valores são atribuídos aos elementos do vetor usando índices:

  

```java

numeros[0] = 10;

numeros[1] = 20;

numeros[2] = 30;

numeros[3] = 40;

numeros[4] = 50;

```

  

## Acessando Elementos do Vetor

  

Para acessar elementos, use o índice do elemento:

  

```java

int primeiroElemento = numeros[0]; // Retorna 10

int terceiroElemento = numeros[2]; // Retorna 30

```

  

## Iterando Sobre um Vetor

  

Use um loop `for` para iterar sobre um vetor:

  

```java

for (int i = 0; i < numeros.length; i++) {

	System.out.println(numeros[i]);

}

```

  

## Vetor com Valores Iniciais

  

Você também pode criar um vetor com valores iniciais:

  

```java

int[] numeros = {10, 20, 30, 40, 50};

```

  

## Exemplo Completo

  

Um exemplo completo de uso de vetores em Java:

  

```java

public class ExemploVetor {

	public static void main(String[] args) {

	// Declaração e inicialização do vetor

	int[] numeros = {10, 20, 30, 40, 50};

	  

		// Iterando sobre o vetor

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Elemento no índice " + i + ": " + numeros[i]);
		}

	}

}

```

  
