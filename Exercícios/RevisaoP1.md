
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

5. Por que programação orientada a objetos tem esse nome? O que são objetos nesse contexto?
6.  A análise e o projeto orientados a objetos têm como meta identificar o melhor conjunto de objetos para descrever um sistema de software. O funcionamento desse sistema se dá por meio do relacionamento e troca de mensagens entre esses objetos. Na programação orientada a objetos, implementa-se um conjunto de classes que definem os objetos presentes no sistema de software. Com relação à herança múltipla é correto afirmar

(ANO: 2009 BANCA: TJPR ÓRGÃO: TJ-PR PROVA: INFORMÁTICA - ANALISTA DE SISTEMAS):


a)  O usuário não necessita conhecer detalhes do funcionamento interno do sistema para poder utilizá-lo
b)   É o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação mas comportamentos distintos
c) As mensagens enviadas a um  objeto podem mudar o valor de um ou mais atributos
d) Possibilita que uma   classe herde atributos e métodos de duas ou mais classes

7.  Controlar a complexidade pela ênfase em características essenciais e pela supressão de detalhes em orientação a objetos é denominado(a)
a. abstração
b. herança  
c.  analogia
d. visibilidade

8. Na orientação a objetos, o conceito que garante que nenhum acesso direto é concedido aos dados é atribuído por meio do(a)
a  polimorfismo.
b.  herança.
c.  agregação.
d.  abstração.  
e.  encapsulamento.

9.  Na orientação a objetos, a sobrecarga é utilizada por meio do conceito de:
a.  encapsulamento.  
b.  herança.
c.  agregação.  
d.  polimorfismo.  
e.  abstração. 

10.  O trecho de código mostrado abaixo é um exemplo de encapsulamento.
```java
public class Animal
{
    public String nome;
    public String tipo;
    public String cor;

    public String getNome(){ return nome; }
    public void setNome(String nome){ this.nome = nome; }
    public String getTipo(){ return tipo; }
    public void setTipo(String tipo){ this.tipo = tipo; }
    public String getCor(){ return cor; }
    public void setCor(String cor){ this.cor = cor; }
}
```

C) Certo  
E) Errado

11. No contexto de programação orientada a objetos, considere as afirmativas abaixo.

(FCC - 2012 - TJ-RJ - Analista Judiciário - Análise de Sistemas)

1.  Objetos são instâncias de classes.
2.  Herança é uma relação entre objetos
3.  Mensagens são formas de executar métodos.
4.  Classes são apenas agrupamentos de métodos.
5.  Ocorre herança múltipla quando mais de um  método é herdado.
6.  Herança é uma relação entre classes.
    
Está correto o que se afirma APENAS em

1.  I, III e IV.
2.  I, III e VI.
3.  III, IV e VI.
4.  II, III e V.
5.  II, IV e V.


12 . QUESTÃO ERRADA. IDENTIFIQUE O PORQUÊ: Na orientação a objetos, em uma relação de herança entre classes, a subclasse herda da superclasse

(FCC - 2012 - TRE-SP - Técnico Judiciário - Programação de Sistemas)

1.  apenas as variáveis públicas de  instância
2.  apenas os métodos e variáveis de  instância públicos.
3.  todas as variáveis de  instância e apenas os métodos estáticos.
4.  todas as variáveis e métodos, exceto os públicos e os que foram sobrescritos.
5.  todas as variáveis de  instância e os métodos, entretanto, podem explicitamente sobrescrever alguns destes componentes.



13.Sejam A e B duas classes em um programa orientado a objetos. Se A é  de B, então objetos da classe A  ___  atributos que objetos da classe B.

(FEPESE - 2010 - UDESC - Analista de Sistemas)

Assinale a alternativa que completa correta e sequencialmente as lacunas do texto.

1.  subclasse ; podem possuir mais
    
2.  subclasse ; não podem possuir mais
    
3.  superclasse ; possuem necessariamente mais
    
4.  superclasse ; possuem necessariamente menos
    
5.  subclasse ; possuem necessariamente menos

14.Dada a classe abaixo:
    

 ```java 
public class Blue{
static int color;
public static String NAME = "Blue";
public Blue(int hue) { ... }
public int getHue() {return hue;}
public void setHue(int hue) { ... }
public void makeItDarker() { ... }
void calculateHue() { ... }
private void makeHueDarker(int value) { ... }
}
```

Responda:

1.  Quais são as variáveis de classe?
    
2.  Quais são os construtores?
    
3.  Quais métodos fazem parte da interface dessa classe?
    
4.  Quais métodos e variáveis devem ser documentados com JavaDoc?
    
5.  Sem mudar o código que está escrito. Implemente o método setHue e a variável que ele necessita.
    
6.  Sem mudar o código que está escrito. Implemente o construtor.
    
7.  O código abaixo roda? Justifique.
    ``` java
    var color = new Blue();
    ```
