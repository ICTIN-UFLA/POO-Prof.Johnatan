
  

# Streams, Arquivos e Serialização em Java

   

## Passo a Passo

  

### Passo 1: Configuração do Projeto

  
1.1. Abra sua IDE e crie um novo projeto Java.

  
1.2. Adicione um novo pacote chamado `br.ufla.tutorial`.

  
### Passo 2: Criação de um Arquivo de Texto

  
Crie um arquivo de texto chamado `entrada.txt` no diretório do projeto com o seguinte conteúdo:

  ```
João,30
Maria,25
Carlos,40
Ana,22
```

### Passo 3: Lendo Arquivos Usando Streams

 Vamos criar uma classe para ler o conteúdo do arquivo `entrada.txt` utilizando `FileInputStream` e `BufferedReader`.
 

#### 3.1. Crie a classe `LeituraArquivo`:

  
```java
package br.ufla.tutorial;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public class LeituraArquivo {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("entrada.txt")))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

  

**Explicação:**

- Utilizamos `FileInputStream` para ler o arquivo.

- `InputStreamReader` converte os bytes lidos em caracteres.

- `BufferedReader` lê o texto de forma eficiente.

- O conteúdo do arquivo é lido linha por linha e impresso no console.

  
### Passo 4: Escrevendo em Arquivos Usando Streams


Vamos criar uma classe para escrever dados em um novo arquivo `saida.txt`.


#### 4.1. Crie a classe `EscritaArquivo`:

  

```java

package br.ufla.tutorial;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class EscritaArquivo {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("saida.txt")))) {
            bw.write("Nome,Idade");
            bw.newLine();
            bw.write("João,30");
            bw.newLine();
            bw.write("Maria,25");
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
```

  

**Explicação:**

- Utilizamos `FileOutputStream` para escrever no arquivo.

- `OutputStreamWriter` converte caracteres em bytes.

- `BufferedWriter` escreve texto de forma eficiente.

- O conteúdo é escrito no arquivo linha por linha.

  

### Passo 5: Serializando Objetos

  
### O Que é Serialização de Objetos

#### Conceito de Serialização

Serialização é o processo de converter um objeto em um formato que pode ser facilmente armazenado ou transmitido e posteriormente reconstruído. Em Java, esse processo envolve transformar um objeto em uma sequência de bytes, que pode ser armazenada em um arquivo, enviada pela rede ou salva em um banco de dados.

#### Propósito da Serialização

O principal propósito da serialização é permitir que os objetos sejam persistidos e transferidos de maneira eficiente. Isso é útil em várias situações, como:

-   Armazenar o estado de um objeto em um arquivo para que ele possa ser recuperado mais tarde.
-   Enviar um objeto através de uma rede (por exemplo, em uma aplicação cliente-servidor).
-   Fazer backup do estado de um objeto.

#### Como Funciona a Serialização em Java

Em Java, para que um objeto seja serializável, a classe do objeto deve implementar a interface `Serializable`. Esta interface é um marcador (ou seja, não possui métodos), mas sinaliza ao compilador e à JVM que a classe pode ser serializada.

Quando serializamos um objeto, o Java transforma o estado do objeto em uma sequência de bytes. Esse processo envolve a serialização dos valores dos atributos do objeto e a identificação da classe do objeto, de modo que ele possa ser reconstruído posteriormente.


Vamos criar uma classe para serializar objetos de uma classe `Pessoa` e salvar em um arquivo `pessoas.ser`.

  

#### 5.1. Crie a classe `Pessoa`:

  

```java

package br.ufla.tutorial;
import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1 L;
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}

```

  #### 5.2. Crie a classe `SerializaPessoa`:

Vamos criar a classe `SerializaPessoa` com o objetivo de demonstrar o processo de serialização de objetos em Java. A serialização permite converter um objeto em uma sequência de bytes que pode ser armazenada em um arquivo ou transmitida pela rede. A classe `SerializaPessoa` realiza esse processo, salvando objetos da classe `Pessoa` em um arquivo chamado `pessoas.ser`.

```java

package br.ufla.tutorial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 30);
        Pessoa pessoa2 = new Pessoa("Maria", 25);


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoas.ser"))) {
            oos.writeObject(pessoa1);
            oos.writeObject(pessoa2);
            System.out.println("Objetos serializados com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

  

**Explicação:**

- `Pessoa` implementa `Serializable` para permitir a serialização.

- `ObjectOutputStream` é usado para escrever objetos serializados no arquivo `pessoas.ser`.

  

### Passo 6: Deserializando Objetos

  
#### Propósito da Deserialização

A deserialização é o processo inverso da serialização. Ela transforma uma sequência de bytes que representa um objeto de volta no próprio objeto. Este processo permite restaurar o estado de um objeto que foi previamente serializado e armazenado em um arquivo ou transmitido pela rede.

#### Objetivo

O objetivo do ** Deserializando Objetos** é demonstrar como ler objetos serializados de um arquivo e reconstruí-los na forma original, com todos os dados e estado intactos. Neste caso, vamos ler os objetos da classe `Pessoa` que foram serializados e salvos no arquivo `pessoas.ser`.

Vamos criar uma classe para deserializar os objetos do arquivo `pessoas.ser`.

  

#### 6.1. Crie a classe `DeserializaPessoa`:

  
```java

package br.ufla.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializaPessoa {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoas.ser"))) {
            Pessoa pessoa1 = (Pessoa) ois.readObject();
            Pessoa pessoa2 = (Pessoa) ois.readObject();
            System.out.println("Objetos deserializados:");
            System.out.println(pessoa1);
            System.out.println(pessoa2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```


**Explicação:**

- `ObjectInputStream` é usado para ler objetos serializados do arquivo `pessoas.ser`.

- Os objetos são lidos e exibidos no console.


## Resumo

  

Você aprendeu a:

  

1. Ler arquivos em Java utilizando `FileInputStream` e `BufferedReader`.
2. Escrever em arquivos utilizando `FileOutputStream` e `BufferedWriter`.
3. Serializar objetos de uma classe em um arquivo.
4. Deserializar objetos de um arquivo.

  

## Teste

  
1. Execute a classe `LeituraArquivo` para ler e imprimir o conteúdo de `entrada.txt`.

2. Execute a classe `EscritaArquivo` para escrever em `saida.txt`.

3. Execute a classe `SerializaPessoa` para serializar objetos e salvar em `pessoas.ser`.

4. Execute a classe `DeserializaPessoa` para deserializar e exibir os objetos do arquivo `pessoas.ser`.

