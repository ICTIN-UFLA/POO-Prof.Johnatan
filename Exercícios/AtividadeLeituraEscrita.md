
  

# Atividade Prática: Leitura e Escrita de Arquivos em Java

  

## Contexto do Problema

  

Você é contratado por uma empresa para desenvolver um software que processe uma lista de produtos em um inventário. A lista de produtos contém informações sobre o nome do produto, preço unitário e quantidade em estoque. Sua tarefa é ler esses dados de um arquivo de entrada, calcular o valor total de cada produto (preço unitário * quantidade) e escrever esses valores em um arquivo de saída.

  

## Objetivo da Atividade

  

- Ler um arquivo de entrada contendo dados de produtos.

- Calcular o valor total de cada produto.

- Escrever os resultados em um arquivo de saída.

  

## Arquivo de Entrada

  

Crie um arquivo chamado `produtos.txt` com o seguinte conteúdo (contendo pelo menos 20 linhas):

  

```
Arroz,10.50,5
Feijão,15.00,3
Macarrão,7.20,10
Azeite,22.50,2
Açúcar,5.75,12
Leite,8.90,7
Café,14.60,6
Farinha,3.50,20
Óleo,12.30,4
Sal,4.40,15
Molho de Tomate,11.50,3
Papel Higiênico,6.80,8
Detergente,9.90,6
Sabão em Pó,13.30,5
Desinfetante,7.75,10
Amaciante,2.50,25
Shampoo,18.00,2
Condicionador,5.60,9
Creme Dental,8.20,7
Escova de Dentes,10.00,10
```
  
## Instruções 


1.  **Criar uma classe `Produto` que represente cada produto com os atributos: nome, preço e quantidade.**

2.  **Ler o arquivo `produtos.txt` e criar uma lista de objetos `Produto`.**

3.  **Calcular o valor total de cada produto (preço unitário * quantidade).**

4.  **Escrever os resultados em um arquivo chamado `resultados.txt`, com o formato: nome do produto, quantidade, valor total.**

  
## Resultado Esperado

Após a execução do programa, o arquivo `resultados.txt` deve conter algo como:

````
Arroz,5,52.5
Feijão,3,45.0
Macarrão,10,72.0
Azeite,2,45.0
Açúcar,12,69.0
Leite,7,62.3
Café,6,87.6
Farinha,20,70.0
Óleo,4,49.2
Sal,15,66.0
Molho de Tomate,3,34.5
Papel Higiênico,8,54.4
Detergente,6,59.4
Sabão em Pó,5,66.5
Desinfetante,10,77.5
Amaciante,25,62.5
Shampoo,2,36.0
Condicionador,9,50.4
Creme Dental,7,57.4
Escova de Dentes,10,100.0
````
