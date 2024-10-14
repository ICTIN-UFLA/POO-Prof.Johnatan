## Lista 1 - Data de Entrega 21/10/2024 até 23:59  - Pontos 2
###  POO com Java: Sistema de Gestão de Biblioteca

Você foi contratado por uma biblioteca comunitária para desenvolver um sistema que ajude a organizar e automatizar a gestão dos empréstimos de livros. Atualmente, o processo é manual, o que gera confusão e erros frequentes. A ideia é criar um software utilizando **Programação Orientada a Objetos (POO)** para resolver o problema.

### **Requisitos do Sistema**

#### **Cadastro e Exclusão de Livros**

-   Cada livro possui:
    -   **Título**, **autor**, **ano de publicação**, **ISBN** e **status** (disponível ou emprestado).
-   O sistema deve permitir:
    -   Adicionar novos livros.
    -   Listar todos os livros.
    -   **Excluir livros** que estejam **disponíveis**. Livros emprestados não podem ser excluídos.

#### **Cadastro, Edição e Exclusão de Usuários**

-   Cada usuário possui:
    -   **Nome**, **número de matrícula** e **telefone**.
-   O sistema deve permitir:
    -   Adicionar e listar usuários.
    -   **Editar dados** (nome e telefone).
    -   **Excluir usuários**, mas apenas se **não possuírem empréstimos pendentes**.

#### **Empréstimos e Devoluções**

-   O sistema deve permitir:
    -   Um usuário pode emprestar até **3 livros** simultaneamente.
    -   Cada empréstimo tem um **prazo de devolução de 7 dias**.
    -   O sistema deve bloquear novos empréstimos para usuários com **multas superiores a R$ 50,00** ou livros atrasados.

#### **Multa por Atraso**

-   **R$ 2,00 por dia de atraso** para cada livro.
-   **Teto máximo por livro:** R$ 30,00.

#### **Lista de Empréstimos e Relatórios**

-   O sistema deve fornecer uma **lista de todos os empréstimos**.
-   Permitir **consulta por usuário** e **por livro**:
    -   **Consulta por usuário**: Exibir todos os empréstimos do usuário.
    -   **Consulta por livro**: Mostrar se está emprestado e por quem.
