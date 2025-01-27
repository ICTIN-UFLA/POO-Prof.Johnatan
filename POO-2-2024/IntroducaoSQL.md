## Na aula de hoje iremos aprender mais detalhes sobre Banco de Dados com MYSQL 




## 1. Criando um Banco de Dados

### Passo 1: Abrir o MySQL Workbench
1. Abra o **MySQL Workbench**.
2. Conecte-se ao servidor MySQL local ou remoto.
3. No menu "Navigator", clique com o botão direito em "Schemas" e selecione "Create Schema".

### Passo 2: Criação de Banco de Dados

```sql
CREATE DATABASE empresa_db CHARACTER SET utf8 COLLATE utf8_general_ci;
```

Esse comando cria um banco de dados chamado `empresa_db` com suporte a caracteres acentuados.

Para usá-lo, digite:

```sql
USE empresa_db;
```

---

## 2. Criando Tabelas

Criaremos três tabelas: `clientes`, `pedidos` e `produtos`.

### Tabela clientes

```sql
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    idade INT NOT NULL
);
```

Essa tabela armazena informações dos clientes, como nome, e-mail e idade. A coluna `id` é a chave primária e se auto incrementa.

### Tabela produtos

```sql
CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);
```

Tabela para armazenar informações dos produtos vendidos, com nome e preço.

### Tabela pedidos

```sql
CREATE TABLE pedidos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT,
    produto_id INT,
    quantidade INT NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id),
    FOREIGN KEY (produto_id) REFERENCES produtos(id)
);
```

Essa tabela registra os pedidos realizados, associando clientes e produtos.

---

## 3. Inserindo Dados

```sql
INSERT INTO clientes (nome, email, idade) VALUES
('João Silva', 'joao@email.com', 30),
('Maria Oliveira', 'maria@email.com', 25);
```

O comando acima insere dois clientes na tabela `clientes`.

```sql
INSERT INTO produtos (nome, preco) VALUES
('Notebook', 3500.00),
('Smartphone', 2000.00);
```

Adiciona dois produtos na tabela `produtos`.

```sql
INSERT INTO pedidos (cliente_id, produto_id, quantidade) VALUES
(1, 2, 1),
(2, 1, 2);
```

Insere pedidos associando os IDs de clientes e produtos.

---

## 4. Consultando Dados

### Consultas básicas

```sql
SELECT * FROM clientes;
```

Retorna todos os registros da tabela `clientes`.

```sql
SELECT nome, preco FROM produtos WHERE preco > 2500;
```

Seleciona apenas produtos com preço superior a 2500.

### Consultas com JOIN

### Explicação sobre JOIN

O comando `JOIN` é usado para combinar registros de duas ou mais tabelas com base em uma condição relacionada. Existem vários tipos de `JOIN` no MySQL:

- **INNER JOIN**: Retorna registros que possuem correspondências em ambas as tabelas.
- **LEFT JOIN**: Retorna todos os registros da tabela à esquerda e os registros correspondentes da tabela à direita.
- **RIGHT JOIN**: Retorna todos os registros da tabela à direita e os registros correspondentes da tabela à esquerda.
- **FULL OUTER JOIN** (não suportado diretamente pelo MySQL, mas pode ser simulado usando UNION): Retorna todos os registros quando há uma correspondência em uma das tabelas.

#### INNER JOIN

```sql
SELECT clientes.nome, produtos.nome, pedidos.quantidade
FROM pedidos
INNER JOIN clientes ON pedidos.cliente_id = clientes.id
INNER JOIN produtos ON pedidos.produto_id = produtos.id;
```

Esse comando retorna apenas os registros onde há correspondência entre clientes e produtos.

#### LEFT JOIN

```sql
SELECT clientes.nome, pedidos.id
FROM clientes
LEFT JOIN pedidos ON clientes.id = pedidos.cliente_id;
```

Lista todos os clientes, mesmo aqueles que não possuem pedidos.

#### RIGHT JOIN

```sql
SELECT produtos.nome, pedidos.id
FROM pedidos
RIGHT JOIN produtos ON pedidos.produto_id = produtos.id;
```

Retorna todos os produtos, mesmo aqueles que não tenham sido pedidos.

---

## 5. Atualizando Dados

```sql
UPDATE clientes
SET email = 'joao.silva@email.com'
WHERE nome = 'João Silva';
```

Atualiza o e-mail de João Silva.

---

## 6. Excluindo Dados

```sql
DELETE FROM pedidos WHERE cliente_id = 2;
```

Remove pedidos do cliente com ID 2.

```sql
DELETE FROM clientes WHERE nome = 'Maria Oliveira';
```

Remove a cliente Maria Oliveira da tabela.

---

## 7. Gerando Relatórios

Para gerar relatórios básicos, utilize:

```sql
SELECT clientes.nome, produtos.nome, pedidos.quantidade
FROM pedidos
JOIN clientes ON pedidos.cliente_id = clientes.id
JOIN produtos ON pedidos.produto_id = produtos.id
ORDER BY clientes.nome;
```

Esse relatório retorna os clientes, os produtos que compraram e as quantidades ordenadas por nome do cliente.

---



## 8. Removendo Tabelas e Banco de Dados

```sql
DROP TABLE pedidos;
```

Exclui a tabela `pedidos`.

```sql
DROP DATABASE empresa_db;
```

Remove o banco de dados inteiro.





