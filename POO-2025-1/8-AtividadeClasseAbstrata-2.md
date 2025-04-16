
# Atividade Prática: Sistema de Gerenciamento de Veículos em uma Frota

## Contexto do Problema

Você foi contratado para desenvolver um sistema de **gerenciamento de veículos** para uma empresa de aluguel de veículos. A empresa possui diferentes tipos de veículos, como **carros**, **motos** e **caminhões**, e cada tipo de veículo tem regras e comportamentos distintos. O sistema precisa ser capaz de:

1. Registrar veículos na frota.
2. Registrar a entrada e a saída dos veículos.
3. Calcular o tempo de locação e as tarifas com base no tipo de veículo.
4. Aplicar diferentes tarifas e calcular multas para veículos que excedem o tempo de locação permitido.
5. Gerenciar a manutenção dos veículos, com a possibilidade de adicionar novos tipos de veículos no futuro.

Para isso, o sistema deve ser flexível e extensível. Você usará os conceitos de **classe abstrata** e **interface** para garantir a flexibilidade do código, e **polimorfismo** para lidar com diferentes tipos de veículos de forma eficiente.

## Objetivo da Atividade

- Criar uma **classe abstrata** chamada `Veiculo` com métodos abstratos para as funcionalidades comuns a todos os veículos (como `calcularTarifa()` e `registrarEntrada()`).
- Criar uma **interface** chamada `Manutencao` que define os métodos para gerenciar a manutenção dos veículos.
- Criar classes concretas para cada tipo de veículo: `Carro`, `Moto`, `Caminhao`, que herdam de `Veiculo` e implementam o método `calcularTarifa()` de forma diferente para cada tipo de veículo.
- Criar classes de manutenção para cada tipo de veículo, que implementam a interface `Manutencao` e fornecem comportamentos específicos de manutenção.
- Implementar o **polimorfismo** para tratar os veículos de maneira genérica, sem precisar saber o tipo exato de veículo.

## Passo 1: Criar a Classe Abstrata `Veiculo`

A classe `Veiculo` será a classe base para todos os veículos e terá métodos comuns que serão implementados nas subclasses. Vamos definir os métodos abstratos para registrar entrada, calcular tarifa, e registrar saída de veículos.

```java
public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected int horasLocacao;


    public Veiculo(String placa, String modelo) {

    }


    public abstract double calcularTarifa();

    public abstract void registrarEntrada();


    public void registrarSaida() {
        System.out.println("Saída registrada para o veículo " + modelo);
    }
}
```

## Passo 2: Criar a Interface `Manutencao`

Agora, criamos a interface `Manutencao`, que define os métodos para gerenciar a manutenção de qualquer tipo de veículo. As classes que implementarem essa interface devem fornecer a implementação de como os veículos passam por manutenção.

```java
// Manutencao.java - Interface
public interface Manutencao {
    void realizarManutencao();
}
```

## Passo 3: Criar as Subclasses `Carro`, `Moto` e `Caminhao`

Agora vamos criar as classes que representam os veículos da frota. Cada uma delas implementa o método `calcularTarifa()` de forma diferente, conforme o tipo de veículo.

### **Classe `Carro`**

```java
// Carro.java - Subclasse de Veiculo
public class Carro extends Veiculo implements Manutencao {

    public Carro(String placa, String modelo) {
        super(placa, modelo);
    }


    @Override
    public double calcularTarifa() {
        return  // R$ 50 por hora
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no carro " + modelo);
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Entrada registrada para o carro " + modelo);
    }
}
```

### **Classe `Moto`**

```java
// Moto.java - Subclasse de Veiculo
public class Moto extends Veiculo implements Manutencao {

    public Moto(String placa, String modelo) {
        super(placa, modelo);
    }

    // Sobrescrita do método calcularTarifa para Moto
    @Override
    public double calcularTarifa() {
        return  // R$ 30 por hora
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada na moto " + modelo);
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Entrada registrada para a moto " + modelo);
    }
}
```

### **Classe `Caminhao`**

```java
// Caminhao.java - Subclasse de Veiculo
public class Caminhao extends Veiculo implements Manutencao {

    public Caminhao(String placa, String modelo) {
        super(placa, modelo);
    }

    // Sobrescrita do método calcularTarifa para Caminhao
    @Override
    public double calcularTarifa() {
        return // R$ 100 por hora
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no caminhão " + modelo);
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Entrada registrada para o caminhão " + modelo);
    }
}
```

## Passo 4: Polimorfismo e Sobrescrita

Agora vamos demonstrar o uso de **polimorfismo** e **sobrescrita** de métodos. Na classe `Main`, vamos tratar todos os veículos como objetos da classe `Veiculo` e usar o polimorfismo para chamar o método `calcularTarifa()` de acordo com o tipo real do veículo.

### **Classe `Main`**

```java
// Main.java - Classe principal com o método main
public class Main {

    public static void main(String[] args) {
        // Criando veículos
        Veiculo carro = new Carro("ABC-1234", "Fusca");
        Veiculo moto = new Moto("XYZ-5678", "Honda");
        Veiculo caminhao = new Caminhao("LMN-9876", "Volvo");

        
    }
}
```

## Exercício:

Agora, com base no sistema de gerenciamento de veículos, implemente um novo tipo de veículo chamado `Onibus`. Ele deve ter a sua própria tarifa, que será **R$ 150 por hora**, e também implementar o comportamento de manutenção. Após isso, adicione o `Onibus` à classe `Main` e calcule a tarifa de locação.
