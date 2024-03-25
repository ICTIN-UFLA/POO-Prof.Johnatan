
# Atividade em Java: Calculando a Média com Vetores

## Problema
Escreva um programa em Java que calcula a média de um conjunto de números armazenados em um vetor.

## Solução
Para resolver este problema, vamos seguir os seguintes passos:
1. Criar um vetor com os números.
2. Calcular a soma de todos os números do vetor.
3. Dividir a soma pelo número total de elementos no vetor para encontrar a média.

## Código Java

```java
public class CalculaMedia {
    public static void main(String[] args) {
        // Passo 1: Criar um vetor com os números
        double[] numeros = {10.5, 20.5, 30.0, 40.5, 50.0};

        // Passo 2: Calcular a soma dos números
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Passo 3: Calcular a média
        double media = soma / numeros.length;

        // Exibir a média
        System.out.println("A média é: " + media);
    }
}
```

## Explicação
No código acima, definimos um vetor `numeros` contendo alguns valores. Usamos um loop `for` para iterar sobre todos os elementos do vetor e somá-los. Após calcular a soma total, dividimos esse valor pelo número de elementos no vetor (obtido por `numeros.length`) para encontrar a média. Por fim, imprimimos o resultado no console.

