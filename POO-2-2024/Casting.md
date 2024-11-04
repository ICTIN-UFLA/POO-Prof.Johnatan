
# Exemplos de Casting em Java

 
  

---

  

## 1. Exemplo de Upcasting

Demonstra o casting implícito de uma subclasse (`Cachorro`) para uma superclasse (`Animal`).

  

```java

class  Animal {

public  void  emitirSom() {

System.out.println("Animal faz som");

}

}

  

class  Cachorro  extends  Animal {

public  void  emitirSom() {

System.out.println("Cachorro late");

}

  

public  void  correr() {

System.out.println("Cachorro está correndo");

}

}

  

public  class  MainUpcasting {

public  static  void  main(String[] args) {

Cachorro  cachorro = new  Cachorro();

// Upcasting: o objeto "cachorro" é tratado como um Animal

Animal  animal = cachorro;

animal.emitirSom(); // Saída: "Cachorro late"

// animal.correr(); // Erro de compilação, pois Animal não possui o método "correr"

}

}

```

  

---

  

## 2. Exemplo de Downcasting

Mostra o casting explícito de uma superclasse (`Animal`) de volta para uma subclasse (`Cachorro`) com verificação `instanceof`.

  

```java

class  Animal {

public  void  emitirSom() {

System.out.println("Animal faz som");

}

}

  

class  Cachorro  extends  Animal {

public  void  emitirSom() {

System.out.println("Cachorro late");

}

  

public  void  correr() {

System.out.println("Cachorro está correndo");

}

}

  

public  class  MainDowncasting {

public  static  void  main(String[] args) {

Animal  animal = new  Cachorro(); // Upcasting implícito

animal.emitirSom(); // Saída: "Cachorro late"

// Downcasting: Animal para Cachorro

if (animal instanceof Cachorro) {

Cachorro  cachorro = (Cachorro) animal;

cachorro.correr(); // Saída: "Cachorro está correndo"

} else {

System.out.println("O objeto não é um Cachorro");

}

}

}

```

  

---

  

## 3. Exemplo de Widening de Tipos Primitivos (Implícito)

Demonstra o widening implícito de `int` para `double`.

  

```java

public  class  MainPrimitiveWidening {

public  static  void  main(String[] args) {

int  numeroInteiro = 100;

double  numeroDouble = numeroInteiro; // Conversão implícita (int -> double)

  

System.out.println("Valor do double: " + numeroDouble); // Saída: 100.0

}

}

```

  

---

  

## 4. Exemplo de Narrowing de Tipos Primitivos (Explícito)

Mostra o narrowing explícito de `double` para `int`, com perda de precisão.

  

```java

public  class  MainPrimitiveNarrowing {

public  static  void  main(String[] args) {

double  valorDouble = 99.99;

int  valorInteiro = (int) valorDouble; // Conversão explícita (double -> int)

  

System.out.println("Valor do int: " + valorInteiro); // Saída: 99

}

}

```

  

---

  

## 5. Narrowing de Tipos Primitivos com Perda de Dados

Mostra o narrowing explícito de `int` para `byte`, causando perda de dados devido ao estouro de intervalo.

  

```java

public  class  MainDataLoss {

public  static  void  main(String[] args) {

int  valorGrande = 130;

byte  valorPequeno = (byte) valorGrande; // Conversão explícita (int -> byte)

  

System.out.println("Valor do byte: " + valorPequeno); // Saída: -126

}

}

```
