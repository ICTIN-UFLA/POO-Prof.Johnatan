
  

# Atividade Prática - Resolvida: Sistema de Gerenciamento de Pedidos para Pizzaria

  

## Contexto

Uma pizzaria deseja desenvolver um sistema para gerenciar os pedidos. Há diferentes tipos de pizzas com ingredientes específicos, e a pizzaria também oferece outros itens, como bebidas e sobremesas. A ideia é criar um sistema que permita cadastrar esses produtos e calcular o valor total do pedido, aplicando conceitos de herança, classes abstratas e casting.

  

## Objetivo

Criar uma estrutura de classes que represente produtos da pizzaria, utilizando classes abstratas para definir comportamentos comuns e aplicando casting para manipulação dos diferentes tipos de produtos.

  

## Descrição do Problema

O sistema da pizzaria deve permitir:

1.  **Registrar diferentes tipos de produtos**: pizzas, bebidas e sobremesas.

2.  **Calcular o preço total do pedido**.

3. Diferenciar os produtos e realizar operações específicas, como aplicar desconto para pizzas de sabores específicos.

  

## Especificações

1.  **Classe Abstrata `Produto`**: Define atributos e métodos comuns a todos os produtos, como `nome` e `preco`, e um método abstrato `calcularPreco()`.

2.  **Classe `Pizza`**: Extende `Produto` e possui atributos específicos, como `tamanho` e `ingredientes`. Implementa o método `calcularPreco()` considerando o tamanho.

3.  **Classe `Bebida`**: Extende `Produto` e possui atributos específicos, como `volume` (em ml).

4.  **Classe `Sobremesa`**: Extende `Produto` e tem atributos como `tipo` (bolo, sorvete, etc.).

5.  **Classe `Pedido`**: Armazena uma lista de `Produto` e calcula o preço total.

  

## Estrutura de Arquivos

Cada classe deverá ser colocada em um arquivo Java separado. Isso ajuda na organização do código e facilita a compreensão da estrutura de classes.

  

### Produto.java

  

```java

// Classe abstrata Produto

abstract  class  Produto {

protected  String  nome;

protected  double  preco;

  

public  Produto(String  nome, double  preco) {

this.nome = nome;

this.preco = preco;

}

  

public  String  getNome() {

return nome;

}

  

public  double  getPreco() {

return preco;

}

  

// Método abstrato para cálculo do preço

public  abstract  double  calcularPreco();

}

```

  

### Pizza.java

  

```java

import java.util.ArrayList;

import java.util.List;

  


class  Pizza  extends  Produto {

private  String  tamanho; // Ex: Pequena, Média, Grande

private  List<String> ingredientes;

  

public  Pizza(String  nome, double  preco, String  tamanho) {

super(nome, preco);

this.tamanho = tamanho;

this.ingredientes = new  ArrayList<>();

}

  

public  void  adicionarIngrediente(String  ingrediente) {

ingredientes.add(ingrediente);

}

  

@Override

public  double  calcularPreco() {

switch (tamanho.toLowerCase()) {

case  "pequena":

return preco;

case  "média":

return preco * 1.2;

case  "grande":

return preco * 1.5;

default:

return preco;

}

}

}

```

  

### Bebida.java

  

```java


class  Bebida  extends  Produto {

private  int  volume; // em ml

  

public  Bebida(String  nome, double  preco, int  volume) {

super(nome, preco);

this.volume = volume;

}

  

@Override

public  double  calcularPreco() {

return preco;

}

}

```

  

### Sobremesa.java

  

```java


class  Sobremesa  extends  Produto {

private  String  tipo; // Ex: bolo, sorvete

  

public  Sobremesa(String  nome, double  preco, String  tipo) {

super(nome, preco);

this.tipo = tipo;

}

  

@Override

public  double  calcularPreco() {

return preco;

}

}

```

  

### Pedido.java

  

```java

import java.util.ArrayList;

import java.util.List;

  


class  Pedido {

private  List<Produto> produtos;

  

public  Pedido() {

produtos = new  ArrayList<>();

}

  

public  void  adicionarProduto(Produto  produto) {

produtos.add(produto);

}

  

public  double  calcularTotal() {

double  total = 0;

for (Produto  produto  : produtos) {

total += produto.calcularPreco();

}

return total;

}

  

public  void  aplicarDescontoPizza() {

for (Produto  produto  : produtos) {

if (produto instanceof Pizza) {

Pizza  pizza = (Pizza) produto; // Casting para Pizza

if (pizza.getNome().equals("Margherita")) {

pizza.preco *= 0.9; // Aplica 10% de desconto

}

}

}

}

}

```

  

### Main.java

  

```java

public  class  Main {

public  static  void  main(String[] args) {

Pedido  pedido = new  Pedido();

  

// Adicionando produtos

Pizza  pizza1 = new  Pizza("Margherita", 20.0, "Grande");

pizza1.adicionarIngrediente("Tomate");

pizza1.adicionarIngrediente("Queijo");

  

Bebida  bebida1 = new  Bebida("Refrigerante", 5.0, 500);

  

Sobremesa  sobremesa1 = new  Sobremesa("Sorvete", 7.0, "Chocolate");

  

pedido.adicionarProduto(pizza1);

pedido.adicionarProduto(bebida1);

pedido.adicionarProduto(sobremesa1);

  

// Aplicando desconto em pizzas específicas

pedido.aplicarDescontoPizza();

  

// Calculando total

System.out.println("Total do Pedido: R$ " + pedido.calcularTotal());

}

}

```

  

## Explicação 

- A **classe abstrata `Produto`** define métodos e atributos comuns a todos os produtos da pizzaria.

- Cada tipo de produto (`Pizza`, `Bebida`, `Sobremesa`) herda de `Produto`, implementando o método `calcularPreco()` conforme necessário.

- A **classe `Pedido`** gerencia a lista de produtos e aplica um desconto em pizzas específicas usando casting (`Pizza`).

- No método `aplicarDescontoPizza`, verificamos se cada produto é uma `Pizza` usando `instanceof` e, em seguida, realizamos o casting para aplicar um desconto, mostrando o uso prático de casting.

  

Essa atividade permitirá que os alunos explorem a criação de classes abstratas, herança e casting em um contexto próximo do mundo real, facilitando a compreensão prática desses conceitos.
