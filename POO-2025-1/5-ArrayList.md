
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

