
# Atividade Prática: Sistema de Gerenciamento de Animais no Zoológico

## Contexto do Problema:

Em um zoológico, há diferentes tipos de animais, e cada tipo de animal tem um comportamento único. Por exemplo, os **elefantes** têm um som característico, os **macacos** têm outro som, e as **zebras** também têm seu som característico. O zoológico precisa de um sistema para gerenciar esses animais, onde cada animal pode emitir um som específico.

O sistema deve ser flexível, permitindo que novos tipos de animais sejam adicionados no futuro, sem necessidade de modificar a estrutura existente. Para isso, usaremos **classe abstrata** e **interface**.

## Objetivo da Atividade:

1. Criar uma **classe abstrata** chamada `Animal` com um método abstrato `emitirSom()`.
2. Criar uma **interface** chamada `Alimentacao` que define os métodos `alimentar()` e `dormir()`.
3. Criar três subclasses que estendem a classe `Animal`: `Elefante`, `Macaco` e `Zebra`, cada uma com seu comportamento específico de som.
4. Criar três classes que implementam a interface `Alimentacao`: `ElefanteAlimentacao`, `MacacoAlimentacao` e `ZebraAlimentacao`, implementando os comportamentos de alimentação e descanso.
5. Criar uma classe `Main` que instanciaria os objetos de cada tipo de animal e exibiria os resultados.

## Passo 1: Criar a Classe Abstrata `Animal`

```java
// Animal.java - Classe Abstrata
public abstract class Animal {
    // Atributo
    protected String nome;

    // Método abstrato (sem implementação)
    public abstract void emitirSom();
}
```

## Passo 2: Criar a Interface `Alimentacao`

```java
// Alimentacao.java - Interface
public interface Alimentacao {
    void alimentar();
    void dormir();
}
```

## Passo 3: Criar as Subclasses `Elefante`, `Macaco` e `Zebra`

```java
// Elefante.java - Subclasse de Animal
public class Elefante extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O elefante faz: Paaaahhh!");
    }
}
```

```java
// Macaco.java - Subclasse de Animal
public class Macaco extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O macaco faz: Uuuuuuuhhhh!");
    }
}
```

```java
// Zebra.java - Subclasse de Animal
public class Zebra extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("A zebra faz: Heeeehhh!");
    }
}
```

## Passo 4: Criar as Classes que Implementam a Interface `Alimentacao`

```java
// ElefanteAlimentacao.java - Implementação de Alimentacao para Elefante
public class ElefanteAlimentacao implements Alimentacao {
    @Override
    public void alimentar() {
        System.out.println("O elefante está comendo capim.");
    }

    @Override
    public void dormir() {
        System.out.println("O elefante está dormindo.");
    }
}
```

```java
// MacacoAlimentacao.java - Implementação de Alimentacao para Macaco
public class MacacoAlimentacao implements Alimentacao {
    @Override
    public void alimentar() {
        System.out.println("O macaco está comendo bananas.");
    }

    @Override
    public void dormir() {
        System.out.println("O macaco está dormindo nas árvores.");
    }
}
```

```java
// ZebraAlimentacao.java - Implementação de Alimentacao para Zebra
public class ZebraAlimentacao implements Alimentacao {
    @Override
    public void alimentar() {
        System.out.println("A zebra está comendo capim.");
    }

    @Override
    public void dormir() {
        System.out.println("A zebra está dormindo de pé.");
    }
}
```

## Passo 5: Criar a Classe `Main`

```java
// Main.java - Classe principal com o método main
public class Main {
    public static void main(String[] args) {
        // Criando objetos de animais
        Animal elefante = new Elefante();
        Animal macaco = new Macaco();
        Animal zebra = new Zebra();

        // Criando objetos de alimentação
        Alimentacao elefanteAlimentacao = new ElefanteAlimentacao();
        Alimentacao macacoAlimentacao = new MacacoAlimentacao();
        Alimentacao zebraAlimentacao = new ZebraAlimentacao();

        // Chamando métodos de emissão de som
        elefante.emitirSom();
        macaco.emitirSom();
        zebra.emitirSom();

        // Chamando métodos de alimentação e descanso
        elefanteAlimentacao.alimentar();
        macacoAlimentacao.alimentar();
        zebraAlimentacao.alimentar();

        // Chamando métodos de dormir
        elefanteAlimentacao.dormir();
        macacoAlimentacao.dormir();
        zebraAlimentacao.dormir();
    }
}
```

## Exercício:

Implemente um novo animal chamado `Leão` e forneça uma implementação para os métodos `emitirSom()`, `alimentar()` e `dormir()`. Certifique-se de adicionar esse novo animal à classe `Main`.
