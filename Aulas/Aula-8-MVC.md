
  

# MVC:  Programação em Camadas em Java POO
  

## Introdução

  

A programação em camadas é uma prática comum em desenvolvimento de software que separa a aplicação em diferentes camadas ou módulos, cada uma com responsabilidades específicas. O padrão Model-View-Controller (MVC) é uma arquitetura que facilita essa separação de preocupações, tornando o código mais modular e fácil de manter. Esta aula tem como objetivo ensinar a estrutura MVC em Java, apresentando exemplos práticos e uma atividade final para consolidar o aprendizado.

  

---

  

## Conteúdo

1. [Introdução ao MVC](#1-introdução-ao-mvc)

- [Definição](#definição)

- [Benefícios](#benefícios)

2. [Estrutura do Projeto](#2-estrutura-do-projeto)

3. [Implementação das Camadas](#3-implementação-das-camadas)

- [Model](#model)

- [View](#view)

- [Controller](#controller)

4. [Exemplo Prático](#4-exemplo-prático)

- [Projeto de Cadastro de Usuários](#projeto-de-cadastro-de-usuários)

5. [Atividade Prática](#5-atividade-prática)

- [Implementação de uma Aplicação de Cadastro de Produtos](#implementação-de-uma-aplicação-de-cadastro-de-produtos)

  

---

  

## 1. Introdução ao MVC

  

### Definição

O MVC é um padrão arquitetural que divide a aplicação em três componentes principais:

-  **Model**: Responsável pela lógica de negócios e acesso a dados.

-  **View**: Responsável pela interface com o usuário.

-  **Controller**: Intermedia a comunicação entre Model e View, recebendo entradas do usuário e retornando as respostas adequadas.

  

### Benefícios

-  **Separação de Preocupações**: Facilita a manutenção e a escalabilidade do código.

-  **Reutilização de Código**: Componentes podem ser reutilizados em diferentes partes da aplicação.

-  **Testabilidade**: Facilita a realização de testes unitários e de integração.

  

---

  

## 2. Estrutura do Projeto

  

Vamos criar um projeto Java no Eclipse que siga a estrutura MVC. Primeiramente, crie um novo projeto Java.

  

### Passos:

1. Abra o Eclipse e vá em `File > New > Java Project`.

2. Nomeie o projeto como `MVCExample`.

3. Dentro do projeto, crie três pacotes:

-  `model`

-  `view`

-  `controller`

  

---

  

## 3. Implementação das Camadas

  

### Model

O Model é responsável pela lógica de negócios e acesso a dados. Vamos criar uma classe `User` com alguns atributos e métodos básicos.

  

```java

// model/User.java

package model;

  

public  class  User {

private  String  name;

private  String  email;

  

public  User(String  name, String  email) {

this.name = name;

this.email = email;

}

  

// Getters and Setters

public  String  getName() {

return name;

}

  

public  void  setName(String  name) {

this.name = name;

}

  

public  String  getEmail() {

return email;

}

  

public  void  setEmail(String  email) {

this.email = email;

}

}

```

  

### View

A View é responsável pela interface com o usuário. Vamos criar uma classe `UserView` que exibe as informações do usuário.

  

```java

// view/UserView.java

package view;

  

public  class  UserView {

public  void  printUserDetails(String  userName, String  userEmail) {

System.out.println("User: ");

System.out.println("Name: " + userName);

System.out.println("Email: " + userEmail);

}

}

```

  

### Controller

O Controller é responsável por intermediar a comunicação entre Model e View. Vamos criar uma classe `UserController`.

  

```java

// controller/UserController.java

package controller;

  

import model.User;

import view.UserView;

  

public  class  UserController {

private  User  model;

private  UserView  view;

  

public  UserController(User  model, UserView  view) {

this.model = model;

this.view = view;

}

  

public  void  setUserName(String  name) {

model.setName(name);

}

  

public  String  getUserName() {

return  model.getName();

}

  

public  void  setUserEmail(String  email) {

model.setEmail(email);

}

  

public  String  getUserEmail() {

return  model.getEmail();

}

  

public  void  updateView() {

view.printUserDetails(model.getName(), model.getEmail());

}

}

```

  

---

  

## 4. Exemplo Prático: Projeto de Cadastro de Usuários

  

Agora, vamos unir tudo em uma classe principal que inicializa o projeto.

  

```java

// Main.java

import model.User;

import view.UserView;

import controller.UserController;

  

public  class  Main {

public  static  void  main(String[] args) {

// Fetch user record from the database

User  model = new  User("John Doe", "john.doe@example.com");

  

// Create a view to display user details on console

UserView  view = new  UserView();

  

// Create a controller

UserController  controller = new  UserController(model, view);

  

// Update the view with user data

controller.updateView();

  

// Update model data

controller.setUserName("Jane Doe");

controller.setUserEmail("jane.doe@example.com");

  

// Update the view again

controller.updateView();

}

}

```

  

---

  

## 5. Atividade Prática
Para essa atividade, sugiro o Neatbeans
  

### Implementação de uma Aplicação de Cadastro de Produtos

  

Como atividade prática, você vai implementar um sistema de cadastro de produtos seguindo a arquitetura MVC. O sistema deve permitir a criação, atualização e visualização de produtos. O sistema deve permitir cadastrar um produto com os itens: Nome, código, quantidade em estoque  e preço. Deverá permitir a busca pelo produto pelo código ou nome, você escolhe. Deverá permitir a   partir da busca  atualizar os dados do produto e mostrar em uma table view ( ou text area)  ou outro mecanismo de apresentação   os dados atualizados. Deverá permitir também a exclusão do produto completo ou alguma unidade. 

  
### Passos:


1.  **Criar a Classe Produto (Model)**

- Atributos: `id`, `nome`, `preco` etc .....

- Métodos: Getters e Setters.



2. **Criar a Classe ProdutoView (View)**

- Métodos para exibir os detalhes do produto.

  

3. **Criar a Classe ProdutoController (Controller)**

- Métodos para gerenciar as interações entre a Model e a View.

  

4. **Criar a Classe Principal (Main)**

- Inicializar o sistema com um produto e atualizar os detalhes do produto. Essa classe fica fora dos pacotes MVC e pode criar um pacote exclusivo para ela chamado Main.

  
