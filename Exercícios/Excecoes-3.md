
  

# Exercício Prático: Identificação e Implementação de Tratamento de Exceções

  

## Descrição

  

Neste exercício, você irá analisar um software de gerenciamento de pedidos em um restaurante. O software já possui várias classes implementadas, mas não possui tratamento de exceções adequado. Sua tarefa é identificar onde o tratamento de exceções é necessário e implementar as exceções apropriadas.

  

## Objetivos

  

- Analisar um código existente para identificar possíveis pontos de falha.

- Implementar tratamento de exceções utilizando blocos `try-catch`.

- Criar exceções personalizadas para cenários específicos.

  

## Estrutura do Projeto

  

O projeto consiste nas seguintes classes:

  

1.  **Item**

2.  **Pedido**

3.  **Cliente**

4.  **Restaurante**

5.  **Exceções Personalizadas**

6.  **Main** (Classe de Teste)

  

## Código Inicial

  

### Classe `Item`

  

```java

public  class  Item {

private  String  nome;

private  double  preco;

  

public  Item(String  nome, double  preco) throws  ItemInvalidoException {

if (preco < 0) {

throw  new  ItemInvalidoException("O preço do item não pode ser negativo.");

}

this.nome = nome;

this.preco = preco;

}

  

public  String  getNome() {

return nome;

}

  

public  double  getPreco() {

return preco;

}

}

```

  

### Classe `Pedido`

  

```java

import java.util.ArrayList;

import java.util.List;

  

public class Pedido {

private List<Item> itens;

  

public Pedido() {

this.itens = new ArrayList<>();

}

  

public void adicionarItem(Item item) {

itens.add(item);

}

  

public double calcularTotal() {

double total = 0;

for (Item item : itens) {

total += item.getPreco();

}

return total;

}

  

public List<Item> getItens() {

return itens;

}

}

```

  

### Classe `Cliente`

  

```java

public class Cliente {

private String nome;

  

public Cliente(String nome) {

this.nome = nome;

}

  

public String getNome() {

return nome;

}

}

```

  

### Classe `Restaurante`

  

```java

import java.util.HashMap;

import java.util.Map;

  

public class Restaurante {

private Map<String, Pedido> pedidos;

  

public Restaurante() {

this.pedidos = new HashMap<>();

}

  

public void adicionarPedido(String nomeCliente, Pedido pedido) {

pedidos.put(nomeCliente, pedido);

}

  

public Pedido buscarPedido(String nomeCliente) throws PedidoNaoEncontradoException {

Pedido pedido = pedidos.get(nomeCliente);

if (pedido == null) {

throw new PedidoNaoEncontradoException("Pedido não encontrado para o cliente: " + nomeCliente);

}

return pedido;

}

  

public void imprimirConta(String nomeCliente) {

try {

Pedido pedido = buscarPedido(nomeCliente);

System.out.println("Conta de " + nomeCliente + ":");

for (Item item : pedido.getItens()) {

System.out.println(item.getNome() + " - " + item.getPreco());

}

System.out.println("Total: " + pedido.calcularTotal());

} catch (PedidoNaoEncontradoException e) {

System.out.println(e.getMessage());

}

}

}

```

  

### Exceções Personalizadas

  

```java

public class ItemInvalidoException extends Exception {

public ItemInvalidoException(String message) {

super(message);

}

}

  

public class PedidoNaoEncontradoException extends Exception {

public PedidoNaoEncontradoException(String message) {

super(message);

}

}

```

  

### Classe `Main` (Classe de Teste)

  

```java

import java.util.Scanner;

  

public class Main {

public static void main(String[] args) {

Restaurante restaurante = new Restaurante();

Scanner scanner = new Scanner(System.in);

  

while (true) {

System.out.println("

Menu:");

System.out.println("1. Adicionar Pedido");

System.out.println("2. Imprimir Conta");

System.out.println("3. Sair");

System.out.print("Escolha uma opção: ");

int opcao = Integer.parseInt(scanner.nextLine());

  

if (opcao == 3) {

System.out.println("Programa finalizado.");

break;

}

  

try {

switch (opcao) {

case 1:

System.out.print("Digite o nome do cliente: ");

String nomeCliente = scanner.nextLine();

Pedido pedido = new Pedido();

while (true) {

System.out.print("Digite o nome do item (ou 'fim' para terminar): ");

String nomeItem = scanner.nextLine();

if (nomeItem.equalsIgnoreCase("fim")) {

break;

}

System.out.print("Digite o preço do item: ");

double precoItem = Double.parseDouble(scanner.nextLine());

Item item = new Item(nomeItem, precoItem);

pedido.adicionarItem(item);

}

restaurante.adicionarPedido(nomeCliente, pedido);

System.out.println("Pedido adicionado para o cliente: " + nomeCliente);

break;

  

case 2:

System.out.print("Digite o nome do cliente: ");

nomeCliente = scanner.nextLine();

restaurante.imprimirConta(nomeCliente);

break;

  

default:

System.out.println("Opção inválida. Tente novamente.");

}

  

} catch (ItemInvalidoException e) {

System.out.println(e.getMessage());

} catch (PedidoNaoEncontradoException e) {

System.out.println(e.getMessage());

} catch (NumberFormatException e) {

System.out.println("Erro: Você deve digitar um número válido.");

} catch (Exception e) {

System.out.println("Erro inesperado: " + e.getMessage());

}

}

  

scanner.close();

}

}

```

 Insira diferentes valores e cenários para testar o tratamento de exceções implementado no programa.
