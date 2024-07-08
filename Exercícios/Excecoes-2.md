
#  Sistema de Gerenciamento de Biblioteca com Tratamento de Exceções

## Descrição

Neste exercício, você irá desenvolver um sistema simples de gerenciamento de uma biblioteca. O sistema permitirá adicionar livros, buscar livros pelo título e emprestar livros a usuários. Você deve implementar o tratamento de exceções para lidar com situações como livro não encontrado, livro já emprestado e usuário não autorizado para empréstimos. Identifique onde deveria ter tratamento de exceção.

## Instruções

1. **Crie exceções personalizadas:**

    - `LivroNaoEncontradoException`
    - `LivroJaEmprestadoException`
    - `UsuarioNaoAutorizadoException`

    ```java
    public class LivroNaoEncontradoException extends Exception {
        public LivroNaoEncontradoException(String message) {
            super(message);
        }
    }

    public class LivroJaEmprestadoException extends Exception {
        public LivroJaEmprestadoException(String message) {
            super(message);
        }
    }

    public class UsuarioNaoAutorizadoException extends Exception {
        public UsuarioNaoAutorizadoException(String message) {
            super(message);
        }
    }
    ```

2. **Crie uma classe `Livro` para representar um livro na biblioteca:**

    ```java
    public class Livro {
        private String titulo;
        private boolean emprestado;

        public Livro(String titulo) {
            this.titulo = titulo;
            this.emprestado = false;
        }

        public String getTitulo() {
            return titulo;
        }

        public boolean isEmprestado() {
            return emprestado;
        }

        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }
    }
    ```

3. **Crie uma classe `Usuario` para representar um usuário da biblioteca:**

    ```java
    public class Usuario {
        private String nome;
        private boolean autorizado;

        public Usuario(String nome, boolean autorizado) {
            this.nome = nome;
            this.autorizado = autorizado;
        }

        public String getNome() {
            return nome;
        }

        public boolean isAutorizado() {
            return autorizado;
        }
    }
    ```

4. **Crie uma classe `Biblioteca` que gerencia a coleção de livros e usuários:**

    ```java
    import java.util.ArrayList;
    import java.util.List;

    public class Biblioteca {
        private List<Livro> livros;
        private List<Usuario> usuarios;

        public Biblioteca() {
            this.livros = new ArrayList<>();
            this.usuarios = new ArrayList<>();
        }

        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }

        public void adicionarUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }

        public Livro buscarLivro(String titulo) throws LivroNaoEncontradoException {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    return livro;
                }
            }
        }

        public void emprestarLivro(String titulo, Usuario usuario) throws LivroNaoEncontradoException, LivroJaEmprestadoException, UsuarioNaoAutorizadoException {
            Livro livro = buscarLivro(titulo);

            if (livro.isEmprestado()) {
                System.out.println(Livro já está emprestado: " + titulo);

            }

            if (!usuario.isAutorizado()) {
                    System.out.println(Usuário não autorizado para empréstimos: " + usuario.getNome());
            }

            livro.setEmprestado(true);
            System.out.println("Livro " + titulo + " emprestado para " + usuario.getNome());
        }
    }
    ```

5. **Crie uma classe `Main` com o método `main` para testar a aplicação:**

    ```java
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Biblioteca biblioteca = new Biblioteca();
            Scanner scanner = new Scanner(System.in);

            // Adicionar alguns livros e usuários para teste
            biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis"));
            biblioteca.adicionarLivro(new Livro("1984"));
            biblioteca.adicionarLivro(new Livro("O Pequeno Príncipe"));

            Usuario usuario1 = new Usuario("Alice", true);
            Usuario usuario2 = new Usuario("Bob", false);
            biblioteca.adicionarUsuario(usuario1);
            biblioteca.adicionarUsuario(usuario2);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar Livro");
                System.out.println("2. Emprestar Livro");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 3) {
                    System.out.println("Programa finalizado.");
                    break;
                }

                try {
                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o título do livro: ");
                            String titulo = scanner.nextLine();
                            biblioteca.adicionarLivro(new Livro(titulo));
                            System.out.println("Livro adicionado: " + titulo);
                            break;
                        case 2:
                            System.out.print("Digite o título do livro: ");
                            titulo = scanner.nextLine();
                            System.out.print("Digite o nome do usuário: ");
                            String nomeUsuario = scanner.nextLine();
                            Usuario usuario = null;
                            for (Usuario u : biblioteca.usuarios) {
                                if (u.getNome().equalsIgnoreCase(nomeUsuario)) {
                                    usuario = u;
                                    break;
                                }
                            }
                            if (usuario == null) {
                                throw new UsuarioNaoAutorizadoException("Usuário não encontrado: " + nomeUsuario);
                            }
                            biblioteca.emprestarLivro(titulo, usuario);
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } catch (LivroNaoEncontradoException | LivroJaEmprestadoException | UsuarioNaoAutorizadoException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Erro: Você deve digitar um número inteiro válido.");
                } catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            }

            scanner.close();
        }
    }
    ```

### Explicação

1. **Exceções Personalizadas:**
    - **`LivroNaoEncontradoException`:** Lançada quando o livro buscado não é encontrado na biblioteca.
    - **`LivroJaEmprestadoException`:** Lançada quando o livro já está emprestado.
    - **`UsuarioNaoAutorizadoException`:** Lançada quando o usuário não está autorizado a realizar empréstimos.

2. **Classe `Livro`:**
    - Representa um livro com título e estado de empréstimo.

3. **Classe `Usuario`:**
    - Representa um usuário com nome e autorização para empréstimos.

4. **Classe `Biblioteca`:**
    - Gerencia a coleção de livros e usuários, permitindo buscar e emprestar livros com tratamento de exceções apropriado.

5. **Classe `Main`:**
    - Fornece uma interface de texto simples para adicionar livros e emprestar livros a usuários, com tratamento de exceções.


2. Execute o programa:

    ```sh
    java Main
    ```

Insira diferentes valores para testar os diferentes casos de exceções tratadas pelo programa.
