
# Usando Banco de Dados MySQL no NetBeans com MySQL Workbench

## Introdução
Esta aula irá guiá-lo passo a passo na configuração e utilização do banco de dados MySQL no NetBeans, utilizando o MySQL Workbench para gerenciar o banco de dados e criando uma interface gráfica para interagir com ele.

## Pré-requisitos
Antes de começar, certifique-se de ter:

- NetBeans IDE instalado ([Download NetBeans](https://netbeans.apache.org/download/index.html))
- MySQL Server e MySQL Workbench instalados ([Download MySQL](https://dev.mysql.com/downloads/))

## Passo 1: Configurar o Banco de Dados MySQL

### 1.1 Instalar o MySQL e MySQL Workbench
1. Baixe e instale o MySQL Server e o MySQL Workbench.
2. Durante a instalação, configure a senha do usuário `root`.
3. Verifique se o serviço MySQL está em execução.

### 1.2 Criar um Banco de Dados no MySQL Workbench
1. Abra o MySQL Workbench.
2. Clique em "Local Instance MySQL" para conectar ao servidor.
3. Vá para a aba "Schemas" e clique com o botão direito para criar um novo banco de dados.
4. Execute o seguinte script SQL na aba de query:

```sql
CREATE DATABASE exemplo_db;
USE exemplo_db;
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    email VARCHAR(50)
);
```

5. Clique no botão "Execute" para criar o banco de dados e a tabela.

## Passo 2: Criando o Projeto no NetBeans

1. Abra o NetBeans e vá para **File > New Project**.
2. Escolha **Java with Maven > Java Application** e clique em "Next".
3. Defina o nome do projeto como `AulaBanco` e clique em "Finish".

### 2.1 Configurando as Dependências no `pom.xml`
Abra o arquivo `pom.xml` e adicione a dependência do MySQL Connector/J:

```xml
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>
```

### Passo 2.2: Criando a Classe de Conexão

Crie uma classe chamada `ConexaoMySQL` para gerenciar a conexão com o banco de dados:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static final String URL = "jdbc:mysql://localhost:3306/exemplo_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "sua_senha";

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }
}
```

## Passo 3: Criando Interface Gráfica com Swing

### 3.1 Criando a Interface Gráfica
1. No NetBeans, clique com o botão direito no projeto e vá para **New > JFrame Form**.
2. Nomeie a classe como `UsuarioGUI` e clique em "Finish".
3. No editor gráfico, adicione os seguintes componentes e configure seus **nomes de variáveis**:
   - **JLabel** para "Nome" (nome: `nomeLabel`)
   - **JTextField** para entrada de nome (nome: `nomeField`)
   - **JLabel** para "Email" (nome: `emailLabel`)
   - **JTextField** para entrada de email (nome: `emailField`)
   - **JButton** chamado "Adicionar" (nome: `addButton`)
   - **JTextArea** para exibir os resultados (nome: `resultadoArea`)

4. Para adicionar funcionalidades ao botão "Adicionar":
   - Clique com o botão direito sobre o botão **Adicionar** na interface gráfica.
   - Selecione **Events > Action > actionPerformed**.
   - No método gerado `addButtonActionPerformed`, insira o seguinte código:

```java
private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    usuarioDAO.inserirUsuario(nomeField.getText(), emailField.getText());
    listarUsuarios();
}
```

5. Crie o método abaixo na classe `UsuarioGUI` para listar os usuários na área de texto:

```java
private void listarUsuarios() {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    resultadoArea.setText("");
    usuarioDAO.listarUsuarios(resultadoArea);
}
```

### 3.2 Modificando a Classe `UsuarioDAO`

Crie uma classe chamada `UsuarioDAO` para lidar com as operações no banco de dados:

```java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextArea;

public class UsuarioDAO {
    public void listarUsuarios(JTextArea resultadoArea) {
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                resultadoArea.append("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome") + ", Email: " + rs.getString("email") + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inserirUsuario(String nome, String email) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Usuário inserido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## Conclusão

Nesta  aula , aprendemos a:

1. Instalar e configurar o MySQL e o MySQL Workbench.
2. Configurar as dependências via Maven no NetBeans.
3. Criar uma interface gráfica no NetBeans e associar eventos para manipular dados no banco de dados.

Agora você pode expandir esse projeto para incluir mais funcionalidades conforme necessário.

---

Esperamos que este guia tenha sido útil. Caso tenha dúvidas, sinta-se à vontade para deixar um comentário!
