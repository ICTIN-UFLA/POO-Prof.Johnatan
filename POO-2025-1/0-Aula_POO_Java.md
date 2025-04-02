
# Primeira aula com Algoritmo (POO)  
## Aula: Criando Classes, Métodos e Atributos no Eclipse

---

## 🎯 Objetivos da Aula

- Entender o que é uma **classe**, um **atributo** e um **método**.
- Criar um projeto com **múltiplas classes** no Eclipse.
- Ler dados do usuário utilizando o teclado.
- Exibir dados na tela de forma organizada.

---

## 🟣 Problema Proposto

Queremos fazer um sistema que:

1. Pergunta o nome e a idade de uma pessoa.
2. Pergunta a rua e o número da casa onde essa pessoa mora.
3. Mostra todas essas informações organizadas na tela.

---

# 🚦 Passo-a-Passo no Eclipse

---

### ✅ Passo 1 - Criar o Projeto

1. Abra o Eclipse.
2. Clique em `File` ➤ `New` ➤ `Java Project`.
3. Dê o nome ao projeto: **CadastroPessoa** e clique em `Finish`.

---

### ✅ Passo 2 - Criar a Classe `Endereco`

1. Clique com o botão direito na pasta `src` ➤ `New` ➤ `Class`.
2. Nome da classe: **Endereco**.
3. Clique em `Finish`.
4. Cole o seguinte código:

```java
public class Endereco {
    String rua;
    int numero;

    // Método para exibir o endereço
    public void mostrarEndereco() {
        System.out.println("Endereço: " + rua + ", nº " + numero);
    }
}
```

---

### ✅ Passo 3 - Criar a Classe `Pessoa`

1. Clique com o botão direito na pasta `src` ➤ `New` ➤ `Class`.
2. Nome da classe: **Pessoa**.
3. Clique em `Finish`.
4. Cole o seguinte código:

```java
public class Pessoa {
    String nome;
    int idade;
    Endereco endereco; // Atributo que é um objeto do tipo Endereco

    // Método para exibir os dados da pessoa
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        endereco.mostrarEndereco();
    }
}
```

---

### ✅ Passo 4 - Criar a Classe Principal `Main`

1. Clique com o botão direito na pasta `src` ➤ `New` ➤ `Class`.
2. Nome da classe: **Main**.
3. Marque a opção: `public static void main(String[] args)`.
4. Clique em `Finish`.
5. Cole o seguinte código:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pessoa p = new Pessoa();
        p.endereco = new Endereco(); // Sempre criamos o endereço antes de usá-lo

        // Entrada de dados da pessoa
        System.out.print("Digite o nome da pessoa: ");
        p.nome = entrada.nextLine();

        System.out.print("Digite a idade da pessoa: ");
        p.idade = entrada.nextInt();
        entrada.nextLine(); // Limpar buffer do teclado

        // Entrada de dados do endereço
        System.out.print("Digite o nome da rua: ");
        p.endereco.rua = entrada.nextLine();

        System.out.print("Digite o número da casa: ");
        p.endereco.numero = entrada.nextInt();

        // Exibição dos dados
        System.out.println("\n--- Dados Cadastrados ---");
        p.mostrarDados();

        entrada.close();
    }
}
```

---

## 💡 Explicação Detalhada

| Conceito      | O que significa?                                     |
|---------------|-----------------------------------------------------|
| Classe        | Modelo para criar objetos. Exemplo: `Pessoa`, `Endereco`. |
| Atributo      | Característica de um objeto. Exemplo: `nome`, `idade`, `rua`. |
| Método        | Ação que o objeto pode fazer. Exemplo: `mostrarDados()`. |
| Objeto        | Uma variável baseada em uma classe. Exemplo: `Pessoa p = new Pessoa()`. |

---

## 🔔 Observações importantes

- Sempre inicialize (`new`) os objetos antes de usá-los.
- O método `mostrarDados()` chama o método `mostrarEndereco()` porque a pessoa tem um endereço.
- Sempre feche o `Scanner` com `entrada.close()` ao final do programa.

---

## 🟣 Desafio

💡 Melhore o programa incluindo o atributo `cidade` na classe `Endereco`.  
Peça para o usuário digitar também a cidade e mostre essa informação ao final.

---

## ✅ Conclusão

- Agora você sabe como:
   - Criar múltiplas classes.
   - Criar atributos e métodos.
   - Trabalhar com objetos dentro de outros objetos.
   - Ler dados do usuário.
   - Exibir informações organizadas.

---
