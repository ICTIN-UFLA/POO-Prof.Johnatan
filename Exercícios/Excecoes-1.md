# Exercício Prático: Lançamento e Tratamento de Exceção em Java

## Descrição

Neste exercício, você irá criar um programa em Java que solicita ao usuário que insira dois números inteiros e então divide o primeiro pelo segundo. O programa deve ser capaz de tratar exceções que possam ocorrer durante a execução, como a divisão por zero e a entrada de valores não inteiros.

## Instruções

1. **Crie uma classe chamada `DivisaoPorZeroException` que estenda `Exception`:**

    ```java
    public class DivisaoPorZeroException extends Exception {
        public DivisaoPorZeroException(String message) {
            super(message);
        }
    }
    ```

2. **Crie uma classe chamada `ExcecaoExemplo` que contenha o método principal (`main`):**

    ```java
    import java.util.Scanner;

    public class ExcecaoExemplo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = Integer.parseInt(scanner.nextLine());

                if (num2 == 0) {
                    throw new DivisaoPorZeroException("Erro: Divisão por zero não é permitida.");
                }

                int resultado = dividir(num1, num2);
                System.out.println("O resultado da divisão é: " + resultado);

            } catch (DivisaoPorZeroException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Você deve digitar um número inteiro válido.");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Programa finalizado.");
            }
        }

        public static int dividir(int a, int b) {
            return a / b;
        }
    }
    ```

## Explicação

1. **Classe `DivisaoPorZeroException`:**
    - Esta é uma exceção personalizada que será lançada quando o segundo número for zero. Ela estende a classe `Exception`.

2. **Classe `ExcecaoExemplo`:**
    - **Método `main`:**
        - Utiliza `Scanner` para ler a entrada do usuário.
        - Envolve a lógica de leitura e divisão dos números em um bloco `try-catch`.
        - Lança a exceção `DivisaoPorZeroException` se o segundo número for zero.
        - Captura e trata exceções específicas como `DivisaoPorZeroException` e `NumberFormatException`.
        - O bloco `finally` é usado para garantir que o `Scanner` seja fechado, independentemente de uma exceção ser lançada ou não.

3. **Método `dividir`:**
    - Este método realiza a divisão dos dois números fornecidos.

## Tarefas Adicionais

- Modifique o programa para lançar outras exceções personalizadas para diferentes tipos de erros.
- Adicione um tratamento para `InputMismatchException` para lidar com entradas não inteiras.
- Implemente um menu que permita ao usuário realizar várias operações matemáticas e tratar exceções para cada operação.


## Resolução da tarefa adicional 


### 1. Modifique o programa para lançar outras exceções personalizadas para diferentes tipos de erros

Vamos criar uma exceção personalizada chamada `NumeroNegativoException` para lançar uma exceção quando o usuário insere um número negativo.

**Classe `NumeroNegativoException`:**

```java
public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}
```

**Modificações na classe `ExcecaoExemplo`:**

```java
import java.util.Scanner;

public class ExcecaoExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            if (num1 < 0) {
                throw new NumeroNegativoException("Erro: Número negativo não é permitido.");
            }

            System.out.print("Digite o segundo número inteiro: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            if (num2 < 0) {
                throw new NumeroNegativoException("Erro: Número negativo não é permitido.");
            }

            if (num2 == 0) {
                throw new DivisaoPorZeroException("Erro: Divisão por zero não é permitida.");
            }

            int resultado = dividir(num1, num2);
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (DivisaoPorZeroException | NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você deve digitar um número inteiro válido.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
```

### 2. Adicione um tratamento para `InputMismatchException` para lidar com entradas não inteiras

Como estamos usando `Integer.parseInt`, `NumberFormatException` já cobre o caso de entradas não inteiras, então o tratamento já está incluído no bloco `catch (NumberFormatException e)`.

### 3. Implemente um menu que permita ao usuário realizar várias operações matemáticas e tratar exceções para cada operação

Vamos expandir o programa para incluir um menu com várias operações matemáticas (adição, subtração, multiplicação e divisão) e tratar as exceções para cada operação.

**Classe `ExcecaoExemplo` com menu:**

```java
import java.util.Scanner;

public class ExcecaoExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma operação: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 5) {
                System.out.println("Programa finalizado.");
                break;
            }

            try {
                System.out.print("Digite o primeiro número inteiro: ");
                int num1 = Integer.parseInt(scanner.nextLine());
                if (num1 < 0) {
                    throw new NumeroNegativoException("Erro: Número negativo não é permitido.");
                }

                System.out.print("Digite o segundo número inteiro: ");
                int num2 = Integer.parseInt(scanner.nextLine());
                if (num2 < 0) {
                    throw new NumeroNegativoException("Erro: Número negativo não é permitido.");
                }

                int resultado;
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        System.out.println("O resultado da adição é: " + resultado);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        System.out.println("O resultado da subtração é: " + resultado);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        System.out.println("O resultado da multiplicação é: " + resultado);
                        break;
                    case 4:
                        if (num2 == 0) {
                            throw new DivisaoPorZeroException("Erro: Divisão por zero não é permitida.");
                        }
                        resultado = dividir(num1, num2);
                        System.out.println("O resultado da divisão é: " + resultado);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } catch (DivisaoPorZeroException | NumeroNegativoException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Você deve digitar um número inteiro válido.");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }

    public static int adicionar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
```

