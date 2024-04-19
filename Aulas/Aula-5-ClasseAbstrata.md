
# Classes Abstratas em Java

## O que são Classes Abstratas?

Classes abstratas em Java são usadas para criar uma classe base que não pode ser instanciada por si só, mas pode servir como uma superclasse para outras classes. Elas podem conter métodos abstratos sem corpo, que as subclasses são obrigadas a implementar, e também podem conter métodos concretos com uma implementação padrão.

## Por que usar Classes Abstratas?

Classes abstratas são úteis quando você tem um conceito de alto nível que não deve ser instanciado, mas possui uma estrutura comum que outras classes podem herdar e sobre a qual podem construir.

## Exemplo Prático: Pizzaria e Sanduicheria

Imagine que você está criando um sistema para uma pizzaria que também vende sanduíches. Ambos os produtos podem ser descritos por uma classe com métodos para preparar, cozinhar e servir o item. No entanto, o processo exato varia entre pizzas e sanduíches.

### Passo 1: Criando a Classe Abstrata `ItemDeMenu`

```java
public abstract class ItemDeMenu {
    protected String nome;
    protected double preco;

    public ItemDeMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método abstrato
    public abstract void preparar();

    // Método abstrato
    public abstract void cozinhar();

    // Método abstrato
    public abstract void servir();

    // Método concreto
    public void exibirInfo() {
        System.out.println(nome + ": R$" + preco);
    }
}

```

### Passo 2: Subclasse `Pizza`

```java

public class Pizza extends ItemDeMenu {

    public Pizza(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando a massa e adicionando ingredientes para a pizza.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando a pizza no forno a lenha.");
    }

    @Override
    public void servir() {
        System.out.println("Servindo a pizza quente.");
    }
}
```

### Passo 3: Subclasse `Sanduiche`

```java
public class Sanduiche extends ItemDeMenu {

    public Sanduiche(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Montando o sanduíche com frios e vegetais frescos.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Grelhando o sanduíche até o queijo derreter.");
    }

    @Override
    public void servir() {
        System.out.println("Servindo o sanduíche com batatas fritas.");
    }
}

```

### Passo 4: Testando as Classes

```java
public class TestePizzaria {

    public static void main(String[] args) {
        ItemDeMenu pizza = new Pizza("Pizza Margherita", 20.0);
        ItemDeMenu sanduiche = new Sanduiche("Sanduíche de Frango", 12.0);

        pizza.preparar();
        pizza.cozinhar();
        pizza.servir();
        pizza.exibirInfo();

        sanduiche.preparar();
        sanduiche.cozinhar();
        sanduiche.servir();
        sanduiche.exibirInfo();
    }
}

```


