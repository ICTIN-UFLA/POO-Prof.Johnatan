
# Banco de Dados MySQL no NetBeans com MySQL Workbench

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

## Passo 2: Configurar o NetBeans para MySQL

### 2.1 Configurar Dependências no Maven
1. No NetBeans, abra o arquivo `pom.xml` do seu projeto.
2. Adicione a seguinte dependência para o MySQL Connector/J dentro da seção `<dependencies>`:

```xml
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
</dependencies>
```

3. Salve o arquivo e vá para a guia do projeto.
4. Clique com o botão direito no projeto e selecione **Build** para baixar as dependências.

### 2.2 Criar Conexão no NetBeans
1. Vá para **Window > Services**.
2. Expanda a seção "Databases" e clique com o botão direito em **Drivers > MySQL (Connector/J)**.
3. Escolha "Connect Using...".
4. Preencha os campos:
    - **Host**: `localhost`
    - **Port**: `3306`
    - **Database**: `exemplo_db`
    - **User**: `root`
    - **Password**: `sua_senha`
5. Teste a conexão e clique em "Finish".

## Passo 3: Criando um Projeto Java no NetBeans

1. Vá para **File > New Project**.
2. Escolha **Java with Maven > Java Application** e clique em "Next".
3. Defina o nome do projeto e clique em "Finish".

## Passo 4: Conectar-se ao Banco de Dados

Crie uma classe para a conexão:

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
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carregar o driver
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC não encontrado", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }
}
```

## Passo 5: Executando Consultas SQL

Crie uma classe para executar operações no banco:

```java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    public void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        try (Connection conn = ConexaoMySQL.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nome: " + rs.getString("nome") + ", Email: " + rs.getString("email"));
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


