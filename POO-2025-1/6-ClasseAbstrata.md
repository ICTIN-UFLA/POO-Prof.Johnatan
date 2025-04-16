
# Classe Abstrata e Interface em Java

## 1. O que é uma Classe Abstrata?

Em Java, uma classe abstrata é uma classe que não pode ser instanciada diretamente. Ou seja, você não pode criar objetos de uma classe abstrata. Ela serve como um modelo para outras classes, fornecendo uma estrutura comum de atributos e métodos. Uma classe abstrata pode ter métodos abstratos (sem implementação) e métodos concretos (com implementação).

**Características de uma classe abstrata:**
- Não pode ser instanciada diretamente.
- Pode ter métodos abstratos (sem implementação).
- Pode ter métodos concretos (com implementação).
- Pode ter construtores.

### Exemplo de Classe Abstrata em Java

```java
// Veiculo.java - Classe Abstrata
public abstract class Veiculo {
    protected String modelo;

    // Método concreto (com implementação)
    public void ligar() {
        System.out.println("Veículo ligado.");
    }

    // Método abstrato (sem implementação)
    public abstract void dirigir();
}
```

## 2. O que é uma Interface?

Uma interface em Java é um tipo de contrato para outras classes. Ela define um conjunto de **métodos** que uma classe deve implementar, mas não fornece uma implementação para esses métodos. Ao contrário de uma classe abstrata, que pode ter métodos concretos, uma interface **não pode** fornecer implementação para nenhum dos seus métodos (a não ser que o método seja `default` ou `static`).

**Características de uma Interface:**
- Não pode ter implementação de métodos (a não ser que sejam métodos `default` ou `static`).
- Não pode ter **atributos de instância** (apenas variáveis `static final`).
- As classes **que implementam** a interface devem fornecer a implementação dos métodos definidos nela.
- Uma classe pode implementar **várias interfaces**.

### Exemplo de Interface em Java

```java
// VeiculoInterface.java - Interface
public interface VeiculoInterface {

    // Método abstrato (sem implementação)
    void ligar();

    void dirigir();
}
```

## 3. Diferenças entre Classe Abstrata e Interface

| Característica                 | Classe Abstrata                             | Interface                            |
|---------------------------------|---------------------------------------------|--------------------------------------|
| **Métodos**                     | Pode ter métodos abstratos e concretos      | Pode ter apenas métodos abstratos (até Java 7) |
| **Atributos**                    | Pode ter atributos de instância             | Só pode ter variáveis `public static final` |
| **Herança**                      | Uma classe abstrata pode herdar de outra classe abstrata ou concreta | Uma interface pode ser herdada por outra interface, mas uma classe pode implementar várias interfaces |
| **Instanciação**                 | Não pode ser instanciada diretamente        | Não pode ser instanciada diretamente |
| **Implementação de Métodos**     | Pode fornecer implementação para alguns métodos | Não pode fornecer implementação, a menos que sejam métodos `default` ou `static` (Java 8) |
| **Construtores**                 | Pode ter construtores                      | Não pode ter construtores           |

## 4. Exercício Prático Resolvido

### Enunciado do Exercício:
Crie uma classe abstrata `Animal` com um método abstrato `emitirSom()`. Em seguida, crie duas subclasses, `Cachorro` e `Gato`, que implementem o método `emitirSom()` de forma específica para cada tipo de animal.

### Resolução:

#### `Animal.java` (Classe Abstrata)

```java
// Animal.java - Classe Abstrata
public abstract class Animal {

    // Método abstrato (sem implementação)
    public abstract void emitirSom();
}
```

#### `Cachorro.java` (Subclasse de Animal)

```java
// Cachorro.java - Subclasse que implementa a classe abstrata Animal
public class Cachorro extends Animal {

    // Implementação do método abstrato
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au");
    }
}
```

#### `Gato.java` (Subclasse de Animal)

```java
// Gato.java - Subclasse que implementa a classe abstrata Animal
public class Gato extends Animal {

    // Implementação do método abstrato
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau");
    }
}
```

#### `Main.java` (Classe Principal com o método main)

```java
// Main.java - Classe principal com o método main
public class Main {

    public static void main(String[] args) {
        // Criando objetos de Cachorro e Gato
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        // Chamando o método emitirSom() de cada classe
        cachorro.emitirSom();  // "O cachorro late: Au Au"
        gato.emitirSom();      // "O gato mia: Miau"
    }
}
```

