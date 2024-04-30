
# Revisão P1 - Resolução 
 
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

### Resposta Exercício 1 

####  Classe Pessoa

```java
public class Pessoa {
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        ajustaDataDeNascimento(dia, mes, ano);
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;  
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
}

```


####  Classe Principal

```java
public class Main {
    public static void main(String[] args) {
        // Aqui faço a criação do que pediu no exercício que é criar objetos para Pessoa
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        int diaAtual = 25;
        int mesAtual = 4;
        int anoAtual = 2024;

        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos hoje.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos hoje.");
    }
}

```

### Parte teórica: Utilizando o exercício anterior como base, responda: 

 - Explique o que é uma classe e apresente um exemplo;
R:  A ***classe** é uma estrutura de programação que atua como um "molde" ou "template" para criar objetos. Ela define um tipo de dado, encapsulando dados (atributos) e operações (métodos) específicos que os objetos criados a partir dessa classe podem realizar. Uma classe é uma definição abstrata, que não representa um objeto real, mas sim as características que objetos desse tipo compartilham.*

 - Explique o que é um objeto e apresente um exemplo;
 R:*Um **objeto** é uma instância concreta de uma classe. É um elemento individual em que é criado usando a estrutura definida pela classe e contém dados reais distintos. Cada objeto possui seu próprio estado, comportamento e identidade. O estado é determinado pelos valores atribuídos aos atributos do objeto.  Um objeto pode ser `einstein`, que é uma instância da classe `Pessoa`. Este objeto tem nome "Albert Einstein" e uma data de nascimento específica. Ele usa a estrutura da classe `Pessoa` para armazenar seu nome, data de nascimento e calcular sua idade.* 
 *Exemplo de objeto: *
```java
Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
```

 
 - Explique o que é uma instância e apresente um exemplo;

***Instância** é frequentemente usado de forma intercambiável com "objeto", especialmente em contextos de programação orientada a objetos. Uma instância é uma realização concreta de uma classe. Quando uma classe é "instanciada", um objeto é criado na memória com as características definidas pela classe.*

#### Exemplo de Instância:

*Continuando com o exemplo acima, quando criamos o objeto `einstein`, estamos instanciando a classe `Pessoa`. O ato de usar o construtor `new Pessoa("Albert Einstein", 14, 3, 1879)` cria uma instância específica de `Pessoa`.*

## Exercício 2-- Relacionamentos entre classes
 Fazer um programa com as seguintes características: 
 

 - Uma classe chamada Universidade que terá como atributo um nome e terá um método para informar o seu nome. 
 - Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá ser associada a uma Universidade. 
 - A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que universidade trabalha.
 - Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643) 
 - Criar dois objetos de Universidade, associando um para Einstein e outro para Newton. 
	 - Einstein trabalhou como professor de física em Princeton (Nova Jersey - Estados Unidos da América). 
	 -  Newton trabalhou como professor de matemática em Cambridge (Inglaterra).


### Resposta Exercício 2

Criaremos duas classes: `Universidade` e `Pessoa`. A classe `Universidade` terá um nome e um método para informar esse nome. A classe `Pessoa` será atualizada para incluir uma referência à `Universidade` a qual está associada e um método para informar o nome da pessoa e o nome da universidade onde trabalha.

```java
public class Universidade {
    private String nome;
    public Universidade(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
```

```java

public class Pessoa {
    private String nome;
    private int diaNascimento, mesNascimento, anoNascimento;
    private Universidade universidade;

    public Pessoa(String nome, int dia, int mes, int ano, Universidade universidade) {
        this.nome = nome;
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
        this.universidade = universidade;
    }

    public String informaTrabalho() {
        return nome + " trabalha em " + universidade.getNome();
    }
}
```
```java

public class Main {
    public static void main(String[] args) {
        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879, princeton);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643, cambridge);

        System.out.println(einstein.informaTrabalho());
        System.out.println(newton.informaTrabalho());
    }
}
```


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

### Resposta Exercício 3

*Criaremos a classe  `PolReg` e duas subclasses derivadas, `TrianguloEq` e `Quadrado`, que herdarão atributos e métodos de `PolReg` e redefinirão o método de cálculo de área conforme especificado.*

```java
public class PolReg {
    protected int numeroDeLados;
    protected double tamanhoDoLado;

    public PolReg(int numeroDeLados, double tamanhoDoLado) {
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDoLado = tamanhoDoLado;
    }
    public double calculaPerimetro() {
        return numeroDeLados * tamanhoDoLado;
    }
    public double calculaAnguloInterno() {
        return (numeroDeLados - 2) * 180 / numeroDeLados;
    }
    public double calculaArea() {
        return 0;
    }
}
```


```java
public class TrianguloEq extends PolReg {
    public TrianguloEq(double tamanhoDoLado) {
        super(3, tamanhoDoLado);
    }

    @Override
    public double calculaArea() {
        return (Math.sqrt(3) / 4) * tamanhoDoLado * tamanhoDoLado;
    }
}

```

```java
public class Quadrado extends PolReg {
    public Quadrado(double tamanhoDoLado) {
        super(4, tamanhoDoLado);
    }

    @Override  // lembra o que isso faz ? ????
    public double calculaArea() {
        return tamanhoDoLado * tamanhoDoLado;
    }
}

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o tipo de objeto (1- Polígono Regular, 2- Triângulo Equilátero, 3- Quadrado):");
        int choice = scanner.nextInt();
        double tamanhoLado;
        int numeroLados;
        PolReg poligono;

        switch (choice) {
            case 1:
                System.out.println("Digite o número de lados:");
                numeroLados = scanner.nextInt();
                System.out.println("Digite o tamanho dos lados:");
                tamanhoLado = scanner.nextDouble();
                poligono = new PolReg(numeroLados, tamanhoLado);
                break;
            case 2:
                System.out.println("Digite o tamanho dos lados do triângulo equilátero:");
                tamanhoLado = scanner.nextDouble();
                poligono = new TrianguloEq(tamanhoLado);
                break;
            case 3:
                System.out.println("Digite o tamanho dos lados do quadrado:");
                tamanhoLado = scanner.nextDouble();
                poligono = new Quadrado(tamanhoLado);
                break;
            default:
                System.out.println("Escolha inválida.");
                scanner.close();
                return;
        }

        System.out.println("Perímetro: " + poligono.calculaPerimetro());
        System.out.println("Ângulo Interno: " + poligono.calculaAnguloInterno());
        System.out.println("Área: " + poligono.calculaArea());

        scanner.close();
    }
}

```


## Questões Teóricas 

#### A resposta está em negrito

 1. No que diz respeito à programação orientada a objetos, assinale a alternativa incorreta.

A) Uma classe pode ser utilizada como base para criar objetos.
B) Objetos são instâncias de uma classe.
**C) Um objeto não armazena valores.**
D) Métodos públicos podem ser acessados fora do objeto em que foi criado.

*Justificativa*:  objeto é uma instância de uma classe e **armazena valores** em seus atributos. Os objetos são a base da POO e são usados para modelar entidades do mundo real, armazenando dados e comportamentos que são representados por suas propriedades (valores) e métodos (funções ou procedimentos). Os bjetos são construídos para conter estados (ou seja, valores armazenados em seus atributos) e comportamentos (métodos). Os valores dos atributos de um objeto são fundamentais para representar características ou propriedades desse objeto.

2. No paradigma de programação orientada a objetos, a característica em que uma nova classe é criada adquirindo atributos e métodos de uma classe existente é chamada de:

A) Interface.
B) Polimorfismo.
C) Abstração.
D) Encapsulamento.
**E) Herança.**

*Justificativa:* 
A herança permite que uma nova classe, chamada de subclasse, adquira os atributos e métodos de uma classe existente, conhecida como superclasse. Isso facilita a reutilização de código e a criação de relações hierárquicas entre classes. As outras opções se referem a outros conceitos da POO:
-   **A) Interface**: Um contrato que define um conjunto de métodos que uma classe deve implementar.
-   **B) Polimorfismo**: A capacidade de tratar objetos de diferentes classes que têm uma relação de herança como se fossem objetos de uma superclasse comum.
-   **C) Abstração**: O processo de ocultar detalhes complexos e mostrar apenas as funcionalidades essenciais ao usuário.
-   **D) Encapsulamento**: A técnica de restringir o acesso a alguns componentes de um objeto e proteger os dados internos da classe.


3.  Quais dos identificadores abaixo podem ser usados como nomes de classes, atributos, métodos e variáveis em Java? Quais não podem, e por quê? 
A. four 
B. for
C. from 
**D. 4** 
E. FOR

*Justificativa:* 
Em Java, a escolha de identificadores para classes, atributos, métodos e variáveis deve seguir algumas regras básicas. Vamos analisar cada alternativa: 

**A. four**

-   **Pode ser usado:** É uma palavra comum em inglês e não é uma palavra reservada em Java. Pode ser usada para nomear classes, métodos, atributos e variáveis.

**B. for**

-   **Não pode ser usado:** `for` é uma palavra reservada em Java, usada para criar loops. Portanto, não pode ser usada como nome de classe, atributo, método ou variável.

**C. from**

-   **Pode ser usado:** Não é uma palavra reservada em Java, então pode ser usada como identificador para classes, métodos, atributos e variáveis.

**D. 4**

-   **Não pode ser usado:** Identificadores em Java não podem começar com um dígito. Números podem fazer parte de um identificador, mas não podem ser o primeiro caractere.

**E. FOR**

-   **Pode ser usado:** Apesar de `for` ser uma palavra reservada, identificadores em Java são sensíveis a maiúsculas e minúsculas. `FOR` em maiúsculas é diferente de `for` em minúsculas, e portanto pode ser usado como nome de classe, método, atributo ou variável.

Portanto, as opções **A**, **C** e **E** podem ser usadas como identificadores em Java, enquanto **B** e **D** não podem, devido a serem uma palavra reservada e começar com um dígito, respectivamente.

4. O paradigma orientado a objetos é um estilo de programação que se baseia no conceito de "objetos", que são instâncias de classes e possuem características (atributos) e comportamentos (métodos). Esse paradigma enfatiza a organização do código em torno de objetos e suas interações, permitindo a modelagem do mundo real de forma mais natural. Qual conceito de programação orientada a objetos enfatiza a ideia de ocultar os detalhes internos de um objeto e permitir o acesso somente por meio de métodos específicos? 
 A) Herança. 
 B) Polimorfismo. 
 **C) Encapsulamento.** 
 D) Abstração.

*Justificativa:* 

-   **Encapsulamento (C )** é um princípio fundamental na programação orientada a objetos que envolve restringir o acesso direto aos componentes de um objeto e proteger a integridade interna do objeto. Isso é realizado por meio da definição de métodos públicos (interfaces) que podem ser usados para acessar e modificar os dados encapsulados, enquanto os detalhes de implementação são mantidos privados.
-   **Herança (A)** é um conceito que permite que uma classe adote atributos e métodos de outra classe, promovendo a reutilização e a organização do código.
-   **Polimorfismo (B)** se refere à capacidade de objetos de diferentes classes derivadas serem tratados como objetos de uma classe base, permitindo que métodos tenham diferentes implementações sob um mesmo nome, dependendo do tipo de objeto que os invoca.
-   **Abstração (D)** se concentra em ocultar a complexidade detalhada e mostrar apenas os aspectos essenciais de uma forma ou objeto, permitindo ao desenvolvedor trabalhar em um nível mais conceitual.

Assim, a resposta correta é a alternativa C, "Encapsulamento", que é diretamente relacionada à proteção dos dados de um objeto e ao controle do acesso a estes.

5. Por que programação orientada a objetos tem esse nome? O que são objetos nesse contexto?

*POO  tem esse nome porque se baseia no conceito de "objetos", que são as principais unidades de software no paradigma de  POO. Um objeto é uma instância de uma classe, que encapsula dados (através de atributos) e funcionalidades (através de métodos) que operam sobre esses dados. Essa abordagem reflete a maneira como interagimos com o mundo real, onde objetos (como carros, pessoas, árvores) possuem características distintas e comportamentos específicos. POO permite que programadores criem modelos de objetos do mundo real, facilitando assim a compreensão, o desenvolvimento e a manutenção do software.*

6.  A análise e o projeto orientados a objetos têm como meta identificar o melhor conjunto de objetos para descrever um sistema de software. O funcionamento desse sistema se dá por meio do relacionamento e troca de mensagens entre esses objetos. Na programação orientada a objetos, implementa-se um conjunto de classes que definem os objetos presentes no sistema de software. Com relação à herança múltipla é correto afirmar

(ANO: 2009 BANCA: TJPR ÓRGÃO: TJ-PR PROVA: INFORMÁTICA - ANALISTA DE SISTEMAS):


a)  O usuário não necessita conhecer detalhes do funcionamento interno do sistema para poder utilizá-lo
b)   É o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação mas comportamentos distintos
c) As mensagens enviadas a um  objeto podem mudar o valor de um ou mais atributos
**d) Possibilita que uma   classe herde atributos e métodos de duas ou mais classes**

*JUSTIFICATIVA:*

a) **Incorreta para herança múltipla.** Esta descrição é mais relevante para o conceito de abstração ou encapsulamento, onde os detalhes de implementação de um sistema são ocultados do usuário.

b) **Incorreta para herança múltipla.** Esta descrição refere-se mais ao polimorfismo, onde diferentes classes podem implementar o mesmo método de maneiras diferentes.

c) **Incorreta para herança múltipla.** Esta opção descreve um conceito geral aplicável a qualquer objeto em OOP, que é a capacidade de métodos mudarem o estado de um objeto.

d) **Correta.** A herança múltipla é uma característica de alguns linguagens de programação orientada a objetos, como C++ e Python (através de classes base múltiplas), onde uma classe pode herdar atributos e métodos de mais de uma classe base.

Logo, a resposta correta para a questão sobre herança múltipla é a opção **d**, que explicita a capacidade de uma classe derivar de múltiplas classes superiores, herdados atributos e métodos de todas elas.



7. Controlar a complexidade pela ênfase em características essenciais e pela supressão de detalhes em orientação a objetos é denominado(a) 

**a. abstração** 
b. herança 
c. analogia 
d. visibilidade

*jUSTIFICATIVA*

-   **Abstração (a)** é o conceito em programação orientada a objetos que envolve a focalização nas características essenciais de um objeto, ignorando as menos importantes ou aquelas que não são relevantes para o contexto específico. Ela permite que programadores reduzam a complexidade e aumentem a eficiência ao lidar com objetos.
    
-   **Herança (b)** é um mecanismo pelo qual uma nova classe pode herdar características de uma classe já existente. Embora também ajude a gerenciar a complexidade reduzindo a repetição de código, não é a resposta correta para esta pergunta, pois não trata diretamente da supressão de detalhes irrelevantes.
    
-   **Analogia (c )** não é um termo técnico em programação orientada a objetos.
    
-   **Visibilidade (d)** refere-se ao controle de acesso às partes de um programa, como classes, métodos e atributos. Este conceito está relacionado a quem pode ver ou usar partes do código, mas não aborda diretamente a simplificação através da supressão de detalhes.

8. Na orientação a objetos, o conceito que garante que nenhum acesso direto é concedido aos dados é atribuído por meio do(a)
a  polimorfismo.
b.  herança.
c.  agregação.
d.  abstração.  
**e.  encapsulamento.**

*JUSTIFICATIVA*

-   **Polimorfismo (a)** refere-se à capacidade de um método ter várias formas ou de objetos de diferentes classes responderem a uma mesma chamada de método, cada um de uma maneira específica. Não está diretamente relacionado com o controle de acesso aos dados.
    
-   **Herança (b)** é um mecanismo que permite que uma nova classe adquira os atributos e métodos de outra classe. Enquanto pode ser usada para reutilizar e organizar código, não impede o acesso direto aos dados.
    
-   **Agregação (c)** é uma forma de associação que representa uma relação "tem-um" entre objetos, onde um objeto composto pode conter um ou mais objetos de outras classes. Não controla o acesso direto aos dados.
    
-   **Abstração (d)** ajuda a focar nas características essenciais de um objeto, ignorando as que são menos importantes ou irrelevantes. Este conceito não está diretamente ligado ao controle de acesso a dados.
    
-   **Encapsulamento (e)** é a técnica usada para proteger os dados dentro de uma classe, escondendo-os e disponibilizando métodos para acesso seguro e controlado. Isso impede que os dados sejam acessados diretamente de fora da classe, o que está em perfeita alinhamento com a descrição da questão.
    

Portanto, a resposta correta é a **opção e, encapsulamento**, que é o conceito responsável por garantir que o acesso aos dados seja feito de maneira segura e controlada, protegendo a integridade dos dados dentro de um objeto.

9.  Na orientação a objetos, a sobrecarga é utilizada por meio do conceito de:
a.  encapsulamento.  
b.  herança.
c.  agregação.  
**d.  polimorfismo.**  
e.  abstração. 

-   **Encapsulamento (a)** é o conceito que protege os dados dentro de uma classe, controlando o acesso aos mesmos através de métodos definidos. Não está relacionado diretamente com a sobrecarga de métodos.
    
-   **Herança (b)** permite que uma classe derive atributos e métodos de outra classe. Embora a herança possa envolver o uso de métodos sobrecarregados, não é o conceito primário que define a sobrecarga.
    
-   **Agregação (c)** é uma forma de relação entre objetos que indica uma relação "tem-um". Não tem relação direta com a sobrecarga de métodos.
    
-   **Polimorfismo (d)** geralmente é associado à capacidade de um método ser implementado de várias formas (polimorfismo de inclusão), mas também inclui a sobrecarga de métodos (polimorfismo ad-hoc), onde métodos com o mesmo nome mas diferentes parâmetros são definidos na mesma classe.
    
-   **Abstração (e)** envolve focar nas características essenciais de um objeto, ignorando as menos importantes. Não está diretamente relacionado com a sobrecarga de métodos.
    

A sobrecarga é uma forma de polimorfismo ad-hoc, onde o mesmo nome de método é usado para diferentes implementações que diferem no tipo ou no número de parâmetros. A resposta correta é **d. polimorfismo**.


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
**E) Errado**

*JUSTIFICATIVA:*

O trecho de código fornecido não é um exemplo perfeito de encapsulamento devido ao uso de atributos públicos (`public`). Em um design que segue estritamente os princípios de encapsulamento na programação orientada a objetos, os atributos de uma classe devem ser privados (`private`). Isso protege os dados, permitindo que sejam acessados ou modificados apenas através de métodos controladores (getters e setters), mantendo assim o controle sobre como os dados são utilizados e prevenindo mudanças indesejadas de estado.

Um exemplo mais apropriado de encapsulamento mudaria os modificadores de acesso dos atributos para `private`, como no exemplo abaixo:

```java
public class Animal {
    private String nome;
    private String tipo;
    private String cor;

    public String getNome() { 
	    return nome; 
    }
    public void setNome(String nome) { 
	    this.nome = nome; 
	}
    public String getTipo() { 
	    return tipo; 
    }
    public void setTipo(String tipo) { 
	    this.tipo = tipo; 
	}
    public String getCor() { 
	    return cor; 
	}
    public void setCor(String cor) { 
	    this.cor = cor; 
	}
}
```

Nesta versão MELHORADA, todos os atributos são privados e apenas acessíveis através dos métodos getters e setters, o que é uma prática correta de **encapsulamento**.




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


1 **Correto.** Objetos são instâncias de classes. Esta é uma definição fundamental na programação orientada a objetos.
    
2  **Incorreto.** Herança é uma relação entre classes, não entre objetos. Uma classe derivada herda características de uma ou mais classes base.
    
3  **Correto.** Mensagens são formas de executar métodos. Em termos de programação orientada a objetos, enviar uma mensagem a um objeto geralmente resulta na execução de um dos métodos do objeto.
    
4  **Incorreto.** Classes são mais do que agrupamentos de métodos; elas também incluem atributos (dados). Classes definem os atributos e comportamentos dos objetos.
    
5  **Incorreto.** Ocorre herança múltipla quando uma classe herda características de mais de uma classe base, não apenas quando mais de um método é herdado. Herança múltipla refere-se à herança de estruturas completas de classe, incluindo atributos e métodos.
    
6  **Correto.** Herança é uma relação entre classes. Isso é verdade, como mencionado na resposta à afirmativa 2.


A opção correta é a **2. I, III e VI**, que são as afirmativas corretamente descritas no contexto de programação orientada a objetos.


12 . QUESTÃO ERRADA. IDENTIFIQUE O PORQUÊ: Na orientação a objetos, em uma relação de herança entre classes, a subclasse herda da superclasse

(FCC - 2012 - TRE-SP - Técnico Judiciário - Programação de Sistemas)

1.  apenas as variáveis públicas de  instância
2.  apenas os métodos e variáveis de  instância públicos.
3.  todas as variáveis de  instância e apenas os métodos estáticos.
4.  todas as variáveis e métodos, exceto os públicos e os que foram sobrescritos.
5.  todas as variáveis de  instância e os métodos, entretanto, podem explicitamente sobrescrever alguns destes componentes.


Vamos analisar cada uma das opções:

1  **Incorreta.** A afirmativa diz que uma subclasse herda "apenas as variáveis públicas de instância". Isso é incorreto porque uma subclasse herda mais do que apenas as variáveis públicas de instância; ela também herda métodos públicos e, dependendo da linguagem de programação e do modificador de acesso, pode herdar variáveis e métodos protegidos.
    
2  **Incorreta.** Afirmativa que a subclasse herda "apenas os métodos e variáveis de instância públicos". Este também é um entendimento incorreto, pois as subclasses podem herdar métodos e variáveis protegidos, além dos públicos, dependendo da linguagem de programação.
    
3  **Incorreta.** Esta opção afirma que a subclasse herda "todas as variáveis de instância e apenas os métodos estáticos". Esta é uma compreensão claramente errada da herança, pois a herança não se aplica a métodos estáticos da mesma maneira que se aplica a métodos de instância. Métodos estáticos pertencem à classe, não às instâncias.
    
4  **Incorreta.** Esta opção diz que a subclasse herda "todas as variáveis e métodos, exceto os públicos e os que foram sobrescritos". Este também é um entendimento errado, pois a subclasse herda métodos públicos, e os métodos que foram sobrescritos na subclasse ainda são considerados parte da herança da superclasse, apenas com um comportamento modificado.
    
5  **Correta.** Esta opção afirma que a subclasse herda "todas as variáveis de instância e os métodos, entretanto, podem explicitamente sobrescrever alguns destes componentes". Esta é a única descrição correta da herança em programação orientada a objetos, onde todos os métodos e variáveis (exceto privados e outros especificados por modificadores de acesso particulares em algumas linguagens) são herdados, e a subclasse pode optar por sobrescrever alguns desses métodos para modificar seu comportamento.


13. Sejam A e B duas classes em um programa orientado a objetos. Se A é  de B, então objetos da classe A  ___  atributos que objetos da classe B.

(FEPESE - 2010 - UDESC - Analista de Sistemas)

Assinale a alternativa que completa correta e sequencialmente as lacunas do texto.

1.  subclasse ; podem possuir mais
    
2.  subclasse ; não podem possuir mais
    
3.  superclasse ; possuem necessariamente mais
    
4.  superclasse ; possuem necessariamente menos
    
5.  subclasse ; possuem necessariamente menos



*JUSTIFICATIVA*
Uma subclasse é uma classe que herda de outra classe, chamada superclasse. A subclasse herda os atributos e métodos da superclasse e pode adicionar mais atributos e métodos ou modificar os existentes.

A afirmativa correta, portanto, deve refletir que uma subclasse herda atributos da superclasse e pode adicionar mais, não menos. Vamos analisar as opções:

1.  **subclasse ; podem possuir mais** - Esta é a afirmação correta, pois objetos da subclasse podem possuir todos os atributos da superclasse mais quaisquer atributos adicionais que a subclasse possa definir.
    
2.  **subclasse ; não podem possuir mais** - Esta é incorreta, pois contradiz o princípio de herança, onde a subclasse herda todos os atributos da superclasse e pode adicionar mais.
    
3.  **superclasse ; possuem necessariamente mais** - Esta é incorreta, pois inverte os papéis de subclasse e superclasse. A superclasse não possui necessariamente mais atributos que a subclasse.
    
4.  **superclasse ; possuem necessariamente menos** - Também incorreta pelo mesmo motivo que a opção 3.
    
5.  **subclasse ; possuem necessariamente menos** - Esta opção é claramente errada, pois uma subclasse pode ter mais atributos do que sua superclasse, não menos.
    

Portanto, a alternativa correta é:

**1. subclasse ; podem possuir mais**

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

***RESPOSTAS***
1.  Quais são as variáveis de classe?
As variáveis de classe são aquelas que são declaradas com o modificador  `static`, o que significa que elas pertencem à classe e não a uma instância específica da classe. Na classe  `Blue`, as variáveis de classe são:

-   `static int color`
-   `public static String NAME`
    
2. Quais são os construtores?
Os construtores são métodos especiais que têm o mesmo nome da classe e são usados para inicializar novos objetos da classe. Na classe  `Blue`, o construtor é:

-   `public Blue(int hue) { ... }`
    
3. Quais métodos fazem parte da interface dessa classe?
A interface de uma classe é composta pelos métodos que são acessíveis de fora da classe. Na classe  `Blue`, os métodos que fazem parte da interface pública são:

-   `public int getHue() {return hue;}`
-   `public void setHue(int hue) { ... }`
-   `public void makeItDarker() { ... }`
-   `void calculateHue() { ... }`  (Este método tem visibilidade de pacote, então faz parte da interface da classe dentro do mesmo pacote)
    
4.  Quais métodos e variáveis devem ser documentados com JavaDoc? (ANULADA)
Em geral, todos os membros públicos de uma classe devem ser documentados com JavaDoc. Na classe  `Blue`, os membros que devem ser documentados são:

-   `static int color`
-   `public static String NAME`
-   `public Blue(int hue) { ... }`
-   `public int getHue() {return hue;}`
-   `public void setHue(int hue) { ... }`
-   `public void makeItDarker() { ... }`
    
5.  Sem mudar o código que está escrito. Implemente o método setHue e a variável que ele necessita.
```java
	public void setHue(int hue) {
	    // Supondo que 'hue' é uma variável de instância que ainda não foi declarada.
	    this.hue = hue;
	}
```
Para que o método `setHue` funcione, precisamos assumir que existe uma variável de instância `hue` que não foi mostrada no código fornecido.
    
6.  Sem mudar o código que está escrito. Implemente o construtor.
```java

public Blue(int hue) {
    // Supondo que 'hue' é uma variável de instância que ainda não foi declarada.
    this.hue = hue;
}
```

7.  O código abaixo roda? Justifique.
    ``` java
    var color = new Blue();
    ```
1.  **Não**, o código não roda como está. O construtor  `Blue(int hue)`  exige um argumento inteiro para ser passado quando um novo objeto  `Blue`  é criado. O uso de  `var`  para declarar  `color`  é válido em Java 10 e versões posteriores, mas o construtor precisa ser chamado com o argumento correto. Por exemplo,  `var color = new Blue(0);`  seria válido se  `0`  fosse um valor de tonalidade aceitável.
    
