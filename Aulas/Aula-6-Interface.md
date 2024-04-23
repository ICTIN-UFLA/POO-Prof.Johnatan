
### Simulando Herança Múltipla em Java Usando Interfaces

#### Introdução

Em Java, a herança múltipla de classes **não é suportada diretamente** devido a problemas como ambiguidade e complexidade na implementação. No entanto, Java permite herança múltipla de tipos através do uso de interfaces. Vamos aprender como simular herança múltipla em Java usando interfaces, ilustrando com exemplos práticos.

#### O que é Herança Múltipla?

Herança múltipla ocorre quando uma classe pode herdar comportamentos e atributos de mais de uma classe base. Isso permite uma maior flexibilidade no design de software, mas também pode levar a problemas complexos, como o "Diamond Problem".

#### Simulando Herança Múltipla em Java

Java resolve a limitação de não suportar herança múltipla de classes permitindo que uma classe implemente múltiplas interfaces. Interfaces são tipos de referência em Java que são 100% abstratas; elas podem declarar métodos, mas não podem implementá-los.

#### Exemplo Prático

Vamos considerar um cenário onde temos diferentes tipos de trabalhadores que precisam implementar múltiplos comportamentos.

##### Definindo Interfaces

Primeiro, definimos as interfaces que representam diferentes capacidades:
```java
interface Worker {
    void work();
}


interface Singer {
    void sing();
}
```

##### Implementando as Interfaces

Agora, vamos criar uma classe `Artist` que implementa ambas as interfaces, demonstrando assim a herança múltipla via interfaces:

```java
class Artist implements Worker, Singer {
    public void work() {
        System.out.println("Creating a new piece of art.");
    }

    public void sing() {
        System.out.println("Singing a song.");
    }
}

```

#### Testando a Classe

Finalmente, vamos testar a implementação da nossa classe `Artist`:

```java
public class Main {
    public static void main(String[] args) {
        Artist myArtist = new Artist();
        myArtist.work();
        myArtist.sing();
    }
}

```
#### Conclusão

Usando interfaces, Java permite que você simule herança múltipla, possibilitando que uma classe implemente múltiplas interfaces para adquirir funcionalidades diversas. Isso é útil para combinar diferentes comportamentos de maneira flexível e segura.


# Hora de Praticar 

#### Contexto

Imagine que você está desenvolvendo um sistema para gerenciar diferentes tipos de veículos em um jogo de corrida. Cada tipo de veículo tem diferentes capacidades, como dirigir e voar. Seu objetivo é implementar essas capacidades usando interfaces e permitir que alguns veículos específicos usem múltiplas funcionalidades.

#### Tarefa - #1

Faça o que se pede a seguir:

1.  **Definição das Interfaces:**
    
    -   Crie uma interface `Driver` com um método `drive()`.
    -   Crie uma interface `Flyer` com um método `fly()`.
2.  **Implementação das Classes:**
    
    -   Crie uma classe `Car` que implementa a interface `Driver`. O método `drive()` deve imprimir "Driving on the road.".
    -   Crie uma classe `Plane` que implementa a interface `Flyer`. O método `fly()` deve imprimir "Flying in the sky.".
    -   Crie uma classe `FlyingCar` que implementa ambas as interfaces, `Driver` e `Flyer`. Certifique-se de que `FlyingCar` possa dirigir e voar, implementando os métodos `drive()` e `fly()` adequadamente.
3.  **Teste das Classes:**
    
    -   Crie uma classe `Main` com o método `main(String[] args)` onde você instanciará objetos de `Car`, `Plane` e `FlyingCar`. Chame os métodos `drive()` e `fly()` conforme aplicável para cada tipo de veículo e verifique o output.


#### Tarefa - #2


#### Contexto

Uma empresa tem diversos tipos de funcionários, incluindo Gerentes, Engenheiros e Estagiários. Cada tipo de funcionário possui diferentes responsabilidades e habilidades. O objetivo é modelar este sistema utilizando interfaces que definam essas habilidades de forma a permitir que cada classe de funcionário implemente as interfaces adequadas às suas responsabilidades.

#### Descrição das Tarefas e Interfaces

1.  **Interfaces a serem criadas:**
    
    -   `Manager`: Deverá ter o método `manageProjects()` que simula a gestão de projetos.
    -   `Coder`: Deverá ter o método `code()` que simula a programação de software.
    -   `Trainable`: Deverá ter o método `train()` que simula o treinamento ou aprendizado de novas habilidades.
2.  **Classes de Funcionários:**
    
    -   `Engineer`: Deve implementar as interfaces `Coder` e `Trainable`.
    -   `Manager`: Deve implementar a interface `Manager` e pode opcionalmente implementar `Trainable`.
    -   `Intern`: Deve implementar `Trainable` e pode opcionalmente implementar `Coder`.
3.  **Implementação de um sistema de execução de tarefas:**
    
    -   Crie uma classe abstrata `Employee` com atributos básicos como `name` e `id`. Todos os funcionários deverão herdar desta classe.
    -   Implemente as classes `Engineer`, `Manager` e `Intern` conforme descrito acima.
4.  **Classe de Teste:**
    
    -   Implemente uma classe `Company` com um método `main` que cria instâncias de cada tipo de funcionário e invoca seus métodos específicos.
