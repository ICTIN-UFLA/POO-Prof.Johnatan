# Revisão P1
 
## Exercício 1

Criar a classe Pessoa com as seguintes características: 

 -  atributos: idade e dia, mês e ano de nascimento, nome da
 - métodos: 
	 - o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e armazena no atributo idade a idade atual da pessoa
	 - informaIdade(), que retorna o valor da idade 
	 - informaNome(), que retorna o nome da pessoa 
	 - ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como parâmetros e preenche nos atributos correspondentes do objeto. 
	 
 - Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 
 - Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de Einstein e Newton caso estivessem vivos.

### Parte teórica 
Utilizando o exercício anterior como base, responda: 

 - Explique o que é uma classe e apresente um exemplo;
 - Explique o que é um objeto e apresente um exemplo;
 - Explique o que é uma instância e apresente um exemplo;

 ## Exercício 2-- Relacionamentos entre classes
 Fazer um programa com as seguintes características: 
 

 - Uma classe chamada Universidade que terá como atributo um nome e terá um método para informar o seu nome. 
 - Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a uma Universidade. 
 - A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que universidade trabalha.
 - Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 
 - Criar dois objetos de Universidade, associando um para Einstein e outro para Newton. 
	 - Einstein trabalhou como professor de física em Princeton (Nova Jersey - Estados Unidos da América). 
	 -  Newton trabalhou como professor de matemática em Cambridge (Inglaterra).
 
 ## Exercício 3 -- Herança e polimorfismo

 - Implementar a classe PolReg, que define um polígono regular 
 -  Atributos: número de lados, tamanho do lado 
 - Métodos: cálculo do perímetro, cálculo do ângulo interno e cálculo de área. Este último deve retornar o valor zero, dado que não é possível calcular a área de um polígono regular genérico 
 - Construtora (construtor) que inicializa os valores dos atributos Fazer a classe TrianguloEqderivada de PolReg, que: 
	 - redefine o método de cálculo de área para calcular e retornar a área do triângulo equilátero
- Fazer a classe Quadrado, também derivada de PolReg, que: 
	-  redefine o método de cálculo de área para calcular e retornar a área do quadrado Fazer um programa que: 
	-  pergunte ao usuário que tipo de objeto ele quer criar (polígono regular, triângulo equilátero ou quadrado) 
	- pergunte número de lados (se for polígono regular) e tamanho dos lados 
	-  instancie o objeto e mostre o valor do perímetro, ângulo interno e área calculados.


## Questões Teóricas

 1. No que diz respeito à programação orientada a objetos, assinale a alternativa incorreta.


A) Uma classe pode ser utilizada como base para criar objetos.
B) Objetos são instâncias de uma classe.
C) Um objeto não armazena valores.
D) Métodos públicos podem ser acessados fora do objeto em que foi criado.

2. No paradigma de programação orientada a objetos, a característica em que uma nova classe é criada adquirindo atributos e métodos de uma classe existente é chamada de:

A) Interface.
B) Polimorfismo.
C) Abstração.
D) Encapsulamento.
E) Herança.

3.  Quais dos identificadores abaixo podem ser usados como nomes de classes, atributos, métodos e variáveis em Java? Quais não podem, e por quê? 
A. four 
B. for
C. from 
D. 4 
E. FOR

4. O paradigma orientado a objetos é um estilo de programação que se baseia no conceito de "objetos", que são instâncias de classes e possuem características (atributos) e comportamentos (métodos). Esse paradigma enfatiza a organização do código em torno de objetos e suas interações, permitindo a modelagem do mundo real de forma mais natural. Qual conceito de programação orientada a objetos enfatiza a ideia de ocultar os detalhes internos de um objeto e permitir o acesso somente por meio de métodos específicos? 
 A) Herança. 
 B) Polimorfismo. 
 C) Encapsulamento. 
 D) Abstração.
