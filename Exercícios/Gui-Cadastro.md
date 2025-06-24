

  

# Criando uma Interface com Menu de Abas no NetBeans para Cadastro de Pessoa em Java

  

Neste tutorial, vamos aprender a criar uma aplicação Java com interface gráfica no NetBeans, que permite o cadastro de pessoas com campos como nome, telefone, CPF, etc. A interface será composta por um menu com abas, e os dados cadastrados serão salvos em um vetor.


As telas deverão ser parecidas com as telas a seguir: 

#### Cadastro

![Logo da Minha Empresa](https://github.com/ICTIN-UFLA/POO-Johnatan-2024-1/blob/main/Exerc%C3%ADcios/img/cadastro.png)


#### Buscar 
![Logo da Minha Empresa](https://github.com/ICTIN-UFLA/POO-Johnatan-2024-1/blob/main/Exerc%C3%ADcios/img/buscar.png)
  

## Passo 1: Configurar o Projeto no NetBeans

1.  **Abrir o NetBeans** e criar um novo projeto:

- Vá em `File > New Project`.

- Selecione `Java > Java Application`.

- Clique em `Next`.

- Nomeie o projeto como `CadastroPessoa`.

- Desmarque a opção `Create Main Class` e clique em `Finish`.

  

## Passo 2: Criar a Interface Gráfica

1.  **Adicionar um JFrame Form**:

- Clique com o botão direito no pacote `src` e selecione `New > JFrame Form`.

- Nomeie a classe como `CadastroPessoaUI` e clique em `Finish`.

  

2.  **Adicionar um JTabbedPane**:

- Arraste um componente `JTabbedPane` da paleta para o `JFrame`.

  

3.  **Criar a Aba de Cadastro**:

- Arraste um componente `JPanel` para o `JTabbedPane`.

- Clique com o botão direito no `JPanel` e selecione `Change Variable Name` para renomear como `panelCadastro`.

- Arraste e solte componentes `JLabel` e `JTextField` para criar campos para Nome, Telefone e CPF.

- Adicione um botão `JButton` para salvar os dados.

  

## Passo 3: Configurar os Campos de Entrada

1.  **Renomear os Campos**:

- Renomeie os `JTextFields` para `txtNome`, `txtTelefone`, `txtCPF`.

- Renomeie o `JButton` para `btnSalvar` e altere o texto para "Salvar".

  

2.  **Adicionar Código para Salvar os Dados**:

- Clique duas vezes no botão `Salvar` para criar o evento de clique.

- Adicione o seguinte código no método `btnSalvarActionPerformed`:

  

```java

import java.util.ArrayList;

import javax.swing.JOptionPane;

  

public  class  CadastroPessoaUI  extends javax.swing.JFrame {

  

private  ArrayList<Pessoa> listaPessoas = new  ArrayList<>();

  

public  CadastroPessoaUI() {

initComponents();

}

  

private  void  btnSalvarActionPerformed(java.awt.event.ActionEvent  evt) {

// Capturar os dados dos campos de texto

String  nome = txtNome.getText();

String  telefone = txtTelefone.getText();

String  cpf = txtCPF.getText();

// Criar um objeto Pessoa

Pessoa  pessoa = new  Pessoa(nome, telefone, cpf);

// Adicionar a pessoa à lista

listaPessoas.add(pessoa);

// Limpar os campos de texto

txtNome.setText("");

txtTelefone.setText("");

txtCPF.setText("");

// Mostrar mensagem de confirmação

JOptionPane.showMessageDialog(this, "Pessoa cadastrada com sucesso!");

}

// Método main e inicialização do JFrame gerados pelo NetBeans

// ...

}

```

  

## Passo 4: Criar a Classe Pessoa

1.  **Adicionar a Classe Pessoa**:

- Clique com o botão direito no pacote `src` e selecione `New > Java Class`.

- Nomeie a classe como `Pessoa` e clique em `Finish`.

- Adicione os seguintes atributos e métodos:

  

```java

public  class  Pessoa {

private  String  nome;

private  String  telefone;

private  String  cpf;

  

public  Pessoa(String  nome, String  telefone, String  cpf) {

this.nome = nome;

this.telefone = telefone;

this.cpf = cpf;

}

  

public  String  getNome() {

return nome;

}

  

public  void  setNome(String  nome) {

this.nome = nome;

}

  

public  String  getTelefone() {

return telefone;

}

  

public  void  setTelefone(String  telefone) {

this.telefone = telefone;

}

  

public  String  getCpf() {

return cpf;

}

  

public  void  setCpf(String  cpf) {

this.cpf = cpf;

}

  

@Override

public  String  toString() {

return  "Nome: " + nome + ", Telefone: " + telefone + ", CPF: " + cpf;

}

}

```


## Passo 5: Criar a Aba de Busca:

-   Adicione outro `JPanel` ao `JTabbedPane`.
-   Renomeie para `panelBusca`.
-   Arraste e solte componentes `JLabel`, `JTextField`, `JButton` e `JTextArea` para criar os campos e botões necessários para a busca.
-   Adicione um campo para digitar o nome a ser buscado e um botão para realizar a busca.
-   Adicione um `JTextArea` para exibir os resultados da busca.


## Passo :6 Adicionar Código para Buscar os Dados**:

-   Clique duas vezes no botão `Buscar` para criar o evento de clique.
-   Adicione o seguinte código no método `btnBuscarActionPerformed`:

```java


private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
// Capturar o nome para busca
String nomeBusca = txtBuscaNome.getText(); 
StringBuilder resultado = new StringBuilder(); // Procurar a pessoa na lista 
for (Pessoa pessoa : listaPessoas) { 
	if (pessoa.getNome().equalsIgnoreCase(nomeBusca)) {
		 resultado.append(pessoa.toString()).append("\n"); 
	 } 
 } 
 // Exibir o resultado da busca 
 txtResultadoBusca.setText(resultado.toString()); 
 }
```

## Passo 7: Testar a Aplicação

1.  **Executar o Projeto**:

- Clique com o botão direito na classe `CadastroPessoaUI` e selecione `Run File`.

- Insira os dados nos campos de texto e clique em "Salvar".

- Verifique se a mensagem de confirmação é exibida e os campos são limpos.

  

Pronto! Você criou com sucesso uma interface gráfica com abas no NetBeans para cadastrar pessoas. Os dados são salvos em um vetor para futuras manipulações.




 
# 🧑‍🏫 Melhorando o sistema de cadastro com BD 

  

## 🎯 Objetivo

Ensinar como criar uma aplicação com interface gráfica usando **NetBeans + Java + MySQL**, com a interface construída pelo **Editor Visual (GUI Builder)**.

  

---

  

## 🛠️ Pré-requisitos

  

- NetBeans 12+ com suporte a Maven

- JDK 11+

- MySQL Workbench

  

---

  

## 🚀 Etapa 1 – Criar o Projeto

  

1.  **File > New Project**
2.  **Maven > Java Application**
3. **Finish**

  

---

  

## 📦 Etapa 2 – Adicionar MySQL ao pom.xml

  

```xml

<dependency>

<groupId>mysql</groupId>

<artifactId>mysql-connector-j</artifactId>

<version>9.3.0<</version>

</dependency>

```

  

---

  

## 🏗️ Etapa 3 – Criar o Banco de Dados

  

```sql
CREATE DATABASE db_pessoa;

USE db_pessoa;

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);
```


---

  

## 🧩 Etapa 4 – Backend

  

### Pessoa.java

  

```java
package com.mycompany.cadastropessoa;

public class Pessoa {

    private int id;
    private String nome;
    private String telefone;
    private String cpf;

    // Construtor para quando já temos o ID (ex: ao buscar do banco)
    public Pessoa(int id, String nome, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    // Construtor para inserir (sem ID)
    public Pessoa(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Telefone: " + telefone + ", CPF: " + cpf;
    }
}


```

  

### Conexao.java

  

```java

package com.mycompany.cadastropessoa;

  

import java.sql.*;

  

public class Conexao {

public static Connection getConexao() throws SQLException {

return DriverManager.getConnection(

"jdbc:mysql://localhost:3306/db_pessoa", "root", "SUA_SENHA");

}

}

```

  

### PessoaDAO.java

  

```java
package com.mycompany.cadastropessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome, telefone, cpf) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getTelefone());
            stmt.setString(3, pessoa.getCpf());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pessoa> buscarTodos() {
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Pessoa p = new Pessoa(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("cpf")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public List<Pessoa> buscarPorNome(String nome) {
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT * FROM pessoa WHERE nome LIKE ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nome + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pessoa p = new Pessoa(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getString("cpf")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void atualizar(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ?, telefone = ?, cpf = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getTelefone());
            stmt.setString(3, pessoa.getCpf());
            stmt.setInt(4, pessoa.getId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remover(int id) {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


```

  

---

## 🎨 Etapa 5 – Interface Visual com GUI Builder

  

### Criar JFrame

  

1. **New > JFrame Form** (nomeie como `CadastroPessoaUI`)

2. Use o **editor de telas** para adicionar:

3.
| Componente | Nome variável | Texto     |
| ---------- | ------------- | --------- |
| JLabel     |               | Nome:     |
| JTextField | txtNome       |           |
| JLabel     |               | Email:    |
| JTextField | txtEmail      |           |
| JLabel     |               | Telefone: |
| JTextField | txtTelefone   |           |
| JButton    | btnSalvar     | Salvar    |

4. Adicionando a tabela
Com o CadastroPessoaUI aberto no NetBeans:

Vá até a paleta (à direita, onde estão os componentes).

Arraste um JTable para o painel abaixo dos campos de texto.

Redimensione como quiser.

5. Renomeando a Tabela:
Clique com o botão direito na tabela.

Selecione Change Variable Name.

Dê o nome: tblPessoas.
6. Configurando as Colunas da Tabela
Clique na tabela.

No canto direito inferior da tela, vá em Table Contents ou Model.

Clique no botão ... para abrir a configuração do DefaultTableModel.

Altere o número de colunas para 3 (ou 4 se quiser exibir o ID).

Defina os nomes das colunas, por exemplo:
ID| Nome | Email | Telefone
Clique em OK.



7. ![Cadastro de Pessoa](https://github.com/ICTIN-UFLA/POO-Prof.Johnatan/raw/main/Exerc%C3%ADcios/img/cadastroPessoa.png)

### Ação do botão:

1. Na classe CadastroPessoaUI, Dê dois cliques no botão "Salvar" no editor visual.
2. Agora, cole o código dentro desse método:

```java

Pessoa p = new Pessoa(txtNome.getText(), txtTelefone.getText(), txtCpf.getText());
            dao.inserir(p);
            carregarTabela();
            JOptionPane.showMessageDialog(null, txtNome.getText() + " Foi salvo  com sucesso!");
            limparCampos();

```
  






## ▶️ Etapa 6 – Classe Principal

```java

package com.mycompany.cadastropessoa;

  

public  class  Cadastropessoa {

public  static  void  main(String[] args) {

java.awt.EventQueue.invokeLater(() -> {

new  CadastroPessoaUI().setVisible(true);

});

}

}

```
