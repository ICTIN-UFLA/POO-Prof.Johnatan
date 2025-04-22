
# 🔰 Aula sobre Enum em Java

## 👨‍🏫 Objetivo da Aula

Vamos aprender sobre **Enums** em Java. Os **Enums** são usados para representar um conjunto fixo de valores constantes e são uma maneira poderosa e segura de lidar com constantes em Java. Vamos ver como declarar, usar e aplicar **Enum** de forma prática.

---

## 📌 O que é um Enum em Java?

Em Java, um **Enum** (abreviação de **enumeration**) é uma classe especial que representa um conjunto fixo de constantes. Ele é ideal para representar valores que não mudam, como **dias da semana**, **meses do ano**, ou **status de um pedido**.

### Vantagens de usar Enum:
- **Segurança de tipo**: Como o **Enum** limita os valores possíveis, você evita erros que podem ocorrer ao usar números mágicos ou strings.
- **Legibilidade**: O código fica mais legível, pois você utiliza nomes que representam claramente os valores.
- **Facilidade de manutenção**: Ao invés de ter que alterar várias ocorrências de um valor constante, você pode modificar o **Enum** em um único lugar.

---

## 🧠 Exemplo do Mundo Real

Vamos imaginar que estamos criando um sistema de **gestão de pedidos**, e queremos representar o **status de um pedido**. O pedido pode ter os seguintes status:

- **PENDENTE**
- **PROCESSANDO**
- **ENVIADO**
- **ENTREGUE**

Esses valores são fixos e não mudam, portanto, podemos representá-los com um **Enum**.

---

## 🛠️ Como Criar e Usar Enum em Java?

### 1. Definindo um Enum

Aqui está um exemplo simples de como declarar um **Enum** que representa os status de um pedido:

```java
public enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}
```

### 2. Usando um Enum

Agora, vamos ver como podemos usar o **Enum** para definir o status de um pedido e verificar seu valor:

```java
public class Pedido {
    private StatusPedido status;

    // Construtor
    public Pedido(StatusPedido status) {
        this.status = status;
    }

    // Método para exibir o status do pedido
    public void exibirStatus() {
        System.out.println("Status do Pedido: " + status);
    }

    // Método para alterar o status do pedido
    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(StatusPedido.PENDENTE);
        pedido1.exibirStatus();

        // Alterando o status do pedido
        pedido1.alterarStatus(StatusPedido.PROCESSANDO);
        pedido1.exibirStatus();
    }
}
```

### Saída Esperada:

```
Status do Pedido: PENDENTE
Status do Pedido: PROCESSANDO
```

---

## 🔍 Trabalhando com Métodos em Enum

Além de representar valores, os **Enums** também podem ter **métodos** associados a eles. Vamos adicionar um método que retorna uma descrição do status do pedido.

### Exemplo de Enum com Método:

```java
public enum StatusPedido {
    PENDENTE("Aguardando processamento"),
    PROCESSANDO("Em processamento"),
    ENVIADO("Enviado para entrega"),
    ENTREGUE("Pedido entregue");

    private final String descricao;

    // Construtor para associar a descrição ao status
    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a descrição do status
    public String getDescricao() {
        return descricao;
    }
}

public class Pedido {
    private StatusPedido status;

    public Pedido(StatusPedido status) {
        this.status = status;
    }

    public void exibirStatus() {
        System.out.println("Status do Pedido: " + status + " - " + status.getDescricao());
    }

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(StatusPedido.PENDENTE);
        pedido1.exibirStatus();
        
        pedido1.alterarStatus(StatusPedido.ENVIADO);
        pedido1.exibirStatus();
    }
}
```

### Saída Esperada:

```
Status do Pedido: PENDENTE - Aguardando processamento
Status do Pedido: ENVIADO - Enviado para entrega
```

---

## 🔄 Iterando Sobre os Valores de um Enum

Você pode iterar sobre os valores de um **Enum** usando o método `values()`, que retorna todos os valores definidos no **Enum**.

### Exemplo de iteração com Enum:

```java
public class Main {
    public static void main(String[] args) {
        // Iterando sobre todos os valores do Enum StatusPedido
        for (StatusPedido status : StatusPedido.values()) {
            System.out.println(status + ": " + status.getDescricao());
        }
    }
}
```

### Saída Esperada:

```
PENDENTE: Aguardando processamento
PROCESSANDO: Em processamento
ENVIADO: Enviado para entrega
ENTREGUE: Pedido entregue
```

---

## 📘 O que aprendemos?

- **Enum** é uma maneira de representar um conjunto fixo de constantes.
- Você pode usar **Enum** para organizar valores constantes, tornando seu código mais legível e seguro.
- **Enums** podem ter atributos, construtores e métodos, oferecendo mais flexibilidade do que simplesmente usar constantes `static final`.
- Você pode iterar sobre os valores de um **Enum** com o método `values()`.

---
