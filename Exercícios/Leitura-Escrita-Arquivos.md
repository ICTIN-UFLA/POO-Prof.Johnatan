
  

# Leitura e Escrita de Arquivos .txt em Java

  



## Passo a Passo

  

### Passo 1: Configuração do Projeto

  

1. Abra sua IDE e crie um novo projeto Java.

2. Adicione um novo pacote chamado `br.ufla.tutorial`.

  

### Passo 2: Ler um Arquivo de Texto

  

Vamos criar uma classe para ler o conteúdo de um arquivo de texto `entrada.txt` utilizando `FileInputStream` e `BufferedReader`.

  

#### 2.1. Crie um arquivo chamado `entrada.txt` com o seguinte conteúdo:

  

```

João,30
Maria,25
Carlos,40
Ana,22
```

  

#### 2.2. Crie a classe `LeituraArquivo`:

  

```java

package br.ufla.tutorial;

  

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.InputStreamReader;

import java.io.IOException;

  

public  class  LeituraArquivo {

public  static  void  main(String[] args) {

try (BufferedReader  br = new  BufferedReader(new  InputStreamReader(new  FileInputStream("entrada.txt")))) {

String  linha;

while ((linha = br.readLine()) != null) {

System.out.println(linha);

}

} catch (IOException  e) {

e.printStackTrace();

}

}

}

```

  

**Explicação:**

- Utilizamos `FileInputStream` para ler o arquivo.

-  `InputStreamReader` converte os bytes lidos em caracteres.

-  `BufferedReader` lê o texto de forma eficiente.

- O conteúdo do arquivo é lido linha por linha e impresso no console.

  

### Passo 3: Escrever em um Arquivo de Texto

  

Vamos criar uma classe para escrever dados em um novo arquivo `saida.txt`.

  

#### 3.1. Crie a classe `EscritaArquivo`:

  

```java

package br.ufla.tutorial;

  

import java.io.BufferedWriter;

import java.io.FileOutputStream;

import java.io.OutputStreamWriter;

import java.io.IOException;

  

public  class  EscritaArquivo {

public  static  void  main(String[] args) {

try (BufferedWriter  bw = new  BufferedWriter(new  OutputStreamWriter(new  FileOutputStream("saida.txt")))) {

bw.write("Nome,Idade");

bw.newLine();

bw.write("João,30");

bw.newLine();

bw.write("Maria,25");

bw.newLine();

} catch (IOException  e) {

e.printStackTrace();

}

}

}

```

  

**Explicação:**

- Utilizamos `FileOutputStream` para escrever no arquivo.

-  `OutputStreamWriter` converte caracteres em bytes.

-  `BufferedWriter` escreve texto de forma eficiente.

- O conteúdo é escrito no arquivo linha por linha.

  

### Passo 4: Combinar Leitura e Escrita

  

Vamos criar uma classe que leia o conteúdo de `entrada.txt`, faça algum processamento (neste caso, apenas uma simples leitura) e escreva os dados processados em `saida.txt`.

  

#### 4.1. Crie a classe `ProcessaArquivo`:

  

```java

package br.ufla.tutorial;

  

import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.io.IOException;

  

public  class  ProcessaArquivo {

public  static  void  main(String[] args) {

try (BufferedReader  br = new  BufferedReader(new  InputStreamReader(new  FileInputStream("entrada.txt")));

BufferedWriter  bw = new  BufferedWriter(new  OutputStreamWriter(new  FileOutputStream("saida.txt")))) {

String  linha;

while ((linha = br.readLine()) != null) {

bw.write(linha);

bw.newLine();

}

} catch (IOException  e) {

e.printStackTrace();

}

}

}

```

  

**Explicação:**

- Lê o arquivo `entrada.txt` linha por linha.

- Escreve cada linha lida em `saida.txt`.

  

### Passo 5: Executar e Verificar os Resultados

  

1.  **Executar a classe `LeituraArquivo`**:

- Verifique se o conteúdo de `entrada.txt` é impresso no console.

2.  **Executar a classe `EscritaArquivo`**:

- Verifique se o arquivo `saida.txt` foi criado e contém os dados escritos.

3.  **Executar a classe `ProcessaArquivo`**:

- Verifique se o arquivo `saida.txt` contém o mesmo conteúdo de `entrada.txt`.

  

### Resumo

  

Neste tutorial, você aprendeu a:

1. Ler arquivos de texto em Java utilizando `FileInputStream` e `BufferedReader`.

2. Escrever em arquivos de texto utilizando `FileOutputStream` e `BufferedWriter`.

3. Combinar leitura e escrita de arquivos para processar dados.

  

Com essas habilidades, você pode manipular arquivos de texto em Java para diversas finalidades, como armazenar dados, fazer backup e muito mais.
