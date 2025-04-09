
# 🔰  Trabalhando com ArrayList em Java

## 👨‍🏫 Objetivo da Aula

Você vai aprender como usar a classe **ArrayList** em Java, que é uma implementação de uma **lista dinâmica**. Vamos ver como criar e manipular listas, adicionar, remover e acessar elementos, além de entender quando e por que usar um **ArrayList**.

---

## 📌 O que é um ArrayList?

Em Java, o **ArrayList** é uma **classe que implementa a interface List**, permitindo que você armazene uma lista de elementos de maneira flexível. Ele funciona como um **vetor dinâmico**, ou seja, um **array** que pode crescer ou diminuir conforme a necessidade. O **ArrayList** é ideal para quando você não sabe o tamanho exato da lista ou quando a quantidade de elementos pode variar ao longo do tempo.

### Por que usar um ArrayList?

- **Tamanho dinâmico**: O **ArrayList** pode crescer e diminuir automaticamente, diferente de um array tradicional em Java, que tem tamanho fixo.
- **Acessibilidade**: Acesso rápido a qualquer elemento, como em um array.
- **Facilidade de uso**: Oferece métodos úteis para manipulação de elementos como adicionar, remover, verificar se o item existe, e outros.

---

## 🧠 Exemplo do Mundo Real

Imagine que você está criando um sistema para gerenciar uma lista de **estudantes** em uma turma. O número de estudantes pode variar, então usar um **ArrayList** é uma boa escolha, pois você pode adicionar ou remover estudantes facilmente.

---

## 🛠️ Como Criar um ArrayList em Java?

Primeiro, você precisa importar a classe **ArrayList**:

```java
import java.util.ArrayList;
```

Agora, você pode criar um **ArrayList**. Vamos criar um ArrayList de **Strings** para armazenar os nomes dos estudantes.

```java
ArrayList<String> estudantes = new ArrayList<>();
```

---

## 🧑‍💻 Como Usar um ArrayList

### 1. **Adicionando Elementos ao ArrayList**

Para adicionar elementos ao **ArrayList**, usamos o método `add()`:

```java
estudantes.add("João");
estudantes.add("Maria");
estudantes.add("Carlos");
```

### 2. **Acessando Elementos**

Para acessar um elemento de um **ArrayList**, usamos o método `get()`. O índice dos elementos começa de 0:

```java
String primeiroEstudante = estudantes.get(0);  // Acessa "João"
System.out.println(primeiroEstudante);
```

### 3. **Removendo Elementos**

Você pode remover elementos usando o método `remove()`. Pode-se remover pelo índice ou pelo próprio valor:

```java
estudantes.remove(1);  // Remove o segundo elemento, que é "Maria"
estudantes.remove("Carlos");  // Remove "Carlos" pelo valor
```

### 4. **Verificando o Tamanho do ArrayList**

O método `size()` retorna o número de elementos no **ArrayList**:

```java
int tamanho = estudantes.size();
System.out.println("Número de estudantes: " + tamanho);
```

### 5. **Verificando se um Elemento Existe**

Usando o método `contains()`, você pode verificar se um **ArrayList** contém um determinado valor:

```java
boolean existe = estudantes.contains("João");
System.out.println("João está na lista? " + existe);
```

### 6. **Iterando sobre os Elementos**

Você pode usar um **for** tradicional ou um **foreach** para iterar sobre os elementos de um **ArrayList**:

```java
// Usando for tradicional
for (int i = 0; i < estudantes.size(); i++) {
    System.out.println(estudantes.get(i));
}

// Usando foreach
for (String estudante : estudantes) {
    System.out.println(estudante);
}
```

---

## 💡 Quando Usar um ArrayList?

- **Quando você precisar de uma lista dinâmica**: Se você não souber de antemão o número de elementos que a lista terá, um **ArrayList** é uma boa opção.
- **Quando você precisar de operações de busca e modificação rápidas**: O **ArrayList** oferece acesso rápido aos elementos, especialmente quando você usa um índice.
- **Quando você precisar adicionar e remover elementos frequentemente**: Como ele tem uma estrutura dinâmica, o **ArrayList** é eficiente para inserir ou excluir elementos.

---

## 📘 Exemplo Completo: Gerenciando Estudantes com ArrayList

Agora, vamos ver um exemplo completo em Java usando **ArrayList**:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar os nomes dos estudantes
        ArrayList<String> estudantes = new ArrayList<>();

        // Adicionando elementos
        estudantes.add("João");
        estudantes.add("Maria");
        estudantes.add("Carlos");

        // Exibindo o tamanho da lista
        System.out.println("Número de estudantes: " + estudantes.size());

        // Acessando o primeiro estudante
        System.out.println("Primeiro estudante: " + estudantes.get(0));

        // Verificando se "João" está na lista
        if (estudantes.contains("João")) {
            System.out.println("João está na lista.");
        }

        // Removendo um estudante pelo índice
        estudantes.remove(1);  // Remove "Maria"

        // Exibindo todos os estudantes
        System.out.println("
Estudantes após remoção:");
        for (String estudante : estudantes) {
            System.out.println(estudante);
        }

        // Exibindo o novo tamanho da lista
        System.out.println("
Número de estudantes após remoção: " + estudantes.size());
    }
}
```

---

## ✅ Saída Esperada:

```
Número de estudantes: 3
Primeiro estudante: João
João está na lista.

Estudantes após remoção:
João
Carlos

Número de estudantes após remoção: 2
```

---

## 📘 O que aprendemos?

- **ArrayList** é uma implementação de uma lista dinâmica em Java.
- Usamos métodos como `add()`, `remove()`, `get()`, `size()`, e `contains()` para manipular os elementos de um **ArrayList**.
- **ArrayList** é útil quando o número de elementos pode variar ao longo do tempo e você precisa de operações eficientes de leitura e escrita.

---



# 📝 Desafio: Sistema de Gerenciamento de Livros

## 🧩 Problema

Você foi contratado para desenvolver um sistema de **gerenciamento de livros** em uma biblioteca. O sistema deve permitir que o usuário adicione, remova, pesquise e liste livros. A solução deve ser feita utilizando **ArrayList**.

## 🧑‍💻 Requisitos:

1. **Classe Livro**:
    - Atributos: `titulo` (String), `autor` (String), `anoPublicacao` (int).
    - Métodos:
        - Construtor para inicializar os atributos.
        - Um método `toString()` que exibe o livro em formato de string: `"Titulo: [titulo], Autor: [autor], Ano de Publicação: [anoPublicacao]"`.

2. **Classe Biblioteca**:
    - Atributos: Um **ArrayList** de objetos `Livro` para armazenar os livros.
    - Métodos:
        - `adicionarLivro(Livro livro)`: Adiciona um livro ao **ArrayList**.
        - `removerLivro(String titulo)`: Remove o livro do **ArrayList** pelo título.
        - `buscarLivro(String titulo)`: Retorna o livro com o título correspondente, ou uma mensagem informando que o livro não foi encontrado.
        - `listarLivros()`: Exibe todos os livros presentes na biblioteca.

3. **Classe Principal (Main)**:
    - No método `main`, crie uma instância de **Biblioteca** e realize as seguintes ações:
        1. Adicionar pelo menos 3 livros na biblioteca.
        2. Remover um livro.
        3. Buscar um livro pelo título.
        4. Listar todos os livros na biblioteca.

## 🧑‍💻 Exemplo de Execução:

1. Adicionar livros:
    - Livro 1: `"O Senhor dos Anéis", autor: "J.R.R. Tolkien", ano de publicação: 1954`
    - Livro 2: `"Harry Potter e a Pedra Filosofal", autor: "J.K. Rowling", ano de publicação: 1997`
    - Livro 3: `"O Hobbit", autor: "J.R.R. Tolkien", ano de publicação: 1937`

2. Remover o livro `"Harry Potter e a Pedra Filosofal"`.

3. Buscar o livro `"O Senhor dos Anéis"`.

4. Listar todos os livros na biblioteca.

## 📝 Exemplo de Saída Esperada:

```
Livros na biblioteca:
Titulo: O Senhor dos Anéis, Autor: J.R.R. Tolkien, Ano de Publicação: 1954
Titulo: Harry Potter e a Pedra Filosofal, Autor: J.K. Rowling, Ano de Publicação: 1997
Titulo: O Hobbit, Autor: J.R.R. Tolkien, Ano de Publicação: 1937

Livro removido: Harry Potter e a Pedra Filosofal

Livros na biblioteca após remoção:
Titulo: O Senhor dos Anéis, Autor: J.R.R. Tolkien, Ano de Publicação: 1954
Titulo: O Hobbit, Autor: J.R.R. Tolkien, Ano de Publicação: 1937

Livro encontrado: Titulo: O Senhor dos Anéis, Autor: J.R.R. Tolkien, Ano de Publicação: 1954
```


# 📝 Exemplo de Menu Interativo em Java

Neste exemplo, vamos criar um **menu interativo** em Java onde o usuário pode escolher entre diferentes opções. O programa exibirá o menu, lerá a escolha do usuário e executará uma ação com base na opção escolhida.

## 📌 Código do Exemplo

```java
import java.util.Scanner;

public class MenuExemplo {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        int opcao;

        do {
            // Exibe o menu
            System.out.println("====== Menu ======");
            System.out.println("1. Exibir mensagem");
            System.out.println("2. Calcular soma");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Lê a opção do usuário
            opcao = scanner.nextInt();
            
            // Executa a ação com base na opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1: Exibir mensagem!");
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    int soma = num1 + num2;
                    System.out.println("A soma é: " + soma);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println(); // Linha em branco para melhor visualização
        } while (opcao != 3); // O loop continua até o usuário escolher a opção 3 para sair
        
        // Fecha o scanner
        scanner.close();
    }
}
```

## 📘 Explicação do Código

- **Scanner**: Usamos a classe `Scanner` para ler a entrada do usuário via console. O método `nextInt()` é utilizado para ler números inteiros.
- **do-while**: O menu continua sendo exibido enquanto o usuário não escolher a opção de sair (opção 3).
- **switch-case**: A estrutura `switch` é usada para tomar decisões baseadas na opção escolhida pelo usuário. Dependendo da escolha, o programa executa diferentes blocos de código.
- **Menu de opções**: O menu é exibido a cada iteração, e o programa espera a escolha do usuário. Se a escolha for inválida, o programa pede para o usuário tentar novamente.

## ✅ Exemplo de Saída Esperada

```
====== Menu ======
1. Exibir mensagem
2. Calcular soma
3. Sair
Escolha uma opção: 1
Você escolheu a opção 1: Exibir mensagem!

====== Menu ======
1. Exibir mensagem
2. Calcular soma
3. Sair
Escolha uma opção: 2
Digite o primeiro número: 5
Digite o segundo número: 7
A soma é: 12

====== Menu ======
1. Exibir mensagem
2. Calcular soma
3. Sair
Escolha uma opção: 3
Saindo...
```

---

Este é um exemplo básico de como criar um menu em Java. Ele pode ser expandido para incluir mais opções e funcionalidades conforme necessário.
