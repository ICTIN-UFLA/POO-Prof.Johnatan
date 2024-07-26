
  

# Criando uma Mini Calculadora com Interface Gráfica em Java usando Eclipse IDE

  

Essa aula irá guiá-lo no processo de criação de uma simples mini calculadora com interface gráfica em Java usando o Eclipse IDE. Siga os passos abaixo para construir sua aplicação.

  

## Pré-requisitos:

- Java Development Kit (JDK) instalado.

- Eclipse IDE instalado.

  

## Passo 1: Configurando o Projeto

1.  **Abra o Eclipse IDE.**

2.  **Crie um Novo Projeto Java:**

- Vá para `File > New > Java Project`.

- Nomeie o projeto como `MiniCalculator`.

- Clique em `Finish`.

  

3.  **Crie um Pacote:**

- Clique com o botão direito em `src` no Project Explorer.

- Selecione `New > Package`.

- Nomeie o pacote como `com.calculator`.

- Clique em `Finish`.

  

4.  **Crie uma Nova Classe Java:**

- Clique com o botão direito no pacote `com.calculator`.

- Selecione `New > Class`.

- Nomeie a classe como `Calculator`.

- Marque a opção para incluir o método `public static void main(String[] args)`.

- Clique em `Finish`.

  

## Passo 2: Desenhando a Interface Gráfica

1. **Importe os Pacotes Necessários:**

```java

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

```

  

2. **Crie os Componentes da Interface Gráfica:**

- Atualize a classe `Calculator` como segue:

```java

public class Calculator extends JFrame implements ActionListener {

private JTextField display;

private JButton[] numberButtons = new JButton[10];

private JButton addButton, subButton, mulButton, divButton;

private JButton decButton, equButton, delButton, clrButton;

private JPanel panel;

  

private Font font = new Font("Arial", Font.PLAIN, 20);

  

private double num1 = 0, num2 = 0, result = 0;

private char operator;

  

public Calculator() {

setTitle("Mini Calculadora");

setSize(400, 500);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setLayout(null);

  

display = new JTextField();

display.setFont(font);

display.setBounds(50, 25, 300, 50);

display.setEditable(false);

add(display);

  

addButton = new JButton("+");

subButton = new JButton("-");

mulButton = new JButton("*");

divButton = new JButton("/");

decButton = new JButton(".");

equButton = new JButton("=");

delButton = new JButton("Del");

clrButton = new JButton("Clr");

  

JButton[] functionButtons = {addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton};

  

for (int i = 0; i < functionButtons.length; i++) {

functionButtons[i].addActionListener(this);

functionButtons[i].setFont(font);

functionButtons[i].setFocusable(false);

}

  

for (int i = 0; i < 10; i++) {

numberButtons[i] = new JButton(String.valueOf(i));

numberButtons[i].addActionListener(this);

numberButtons[i].setFont(font);

numberButtons[i].setFocusable(false);

}

  

delButton.setBounds(50, 430, 145, 50);

clrButton.setBounds(205, 430, 145, 50);

  

panel = new JPanel();

panel.setBounds(50, 100, 300, 300);

panel.setLayout(new GridLayout(4, 4, 10, 10));

  

panel.add(numberButtons[1]);

panel.add(numberButtons[2]);

panel.add(numberButtons[3]);

panel.add(addButton);

panel.add(numberButtons[4]);

panel.add(numberButtons[5]);

panel.add(numberButtons[6]);

panel.add(subButton);

panel.add(numberButtons[7]);

panel.add(numberButtons[8]);

panel.add(numberButtons[9]);

panel.add(mulButton);

panel.add(decButton);

panel.add(numberButtons[0]);

panel.add(equButton);

panel.add(divButton);

  

add(panel);

add(delButton);

add(clrButton);

  

setVisible(true);

}

  

public static void main(String[] args) {

new Calculator();

}

  

@Override

public void actionPerformed(ActionEvent e) {

for (int i = 0; i < 10; i++) {

if (e.getSource() == numberButtons[i]) {

display.setText(display.getText().concat(String.valueOf(i)));

}

}

if (e.getSource() == decButton) {

display.setText(display.getText().concat("."));

}

if (e.getSource() == addButton) {

num1 = Double.parseDouble(display.getText());

operator = '+';

display.setText("");

}

if (e.getSource() == subButton) {

num1 = Double.parseDouble(display.getText());

operator = '-';

display.setText("");

}

if (e.getSource() == mulButton) {

num1 = Double.parseDouble(display.getText());

operator = '*';

display.setText("");

}

if (e.getSource() == divButton) {

num1 = Double.parseDouble(display.getText());

operator = '/';

display.setText("");

}

if (e.getSource() == equButton) {

num2 = Double.parseDouble(display.getText());

switch (operator) {

case '+':

result = num1 + num2;

break;

case '-':

result = num1 - num2;

break;

case '*':

result = num1 * num2;

break;

case '/':

result = num1 / num2;

break;

}

display.setText(String.valueOf(result));

num1 = result;

}

if (e.getSource() == clrButton) {

display.setText("");

}

if (e.getSource() == delButton) {

String str = display.getText();

display.setText("");

for (int i = 0; i < str.length() - 1; i++) {

display.setText(display.getText() + str.charAt(i));

}

}

}

}

```

  

## Passo 3: Executando a Aplicação

1. **Execute a Aplicação:**

- Clique com o botão direito no arquivo `Calculator.java`.

- Selecione `Run As > Java Application`.

  

Você deve ver uma janela com uma interface de calculadora simples onde você pode realizar operações aritméticas básicas.

  

### Explicação do Código:

- **JFrame:** Uma classe do `javax.swing` usada para criar a janela principal.

- **JTextField:** Usado para exibir a entrada e saída.

- **JButton:** Representa os botões para dígitos e operações.

- **ActionListener:** Uma interface que escuta ações como cliques de botões.

- **actionPerformed:** Um método de `ActionListener` que é chamado sempre que uma ação é realizada.


# Prática com NetBeans 
https://edirlei.com/aulas/tp2_2014_2/TP2_Aula_03_GUI_e_Swing_2014.html

  

