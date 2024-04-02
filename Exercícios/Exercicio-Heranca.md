
**Problema: Sistema de Gerenciamento de Biblioteca**

**Descrição:** Desenvolva um sistema para uma biblioteca que gerencia informações sobre livros e usuários. O sistema deve permitir adicionar novos livros, emprestar livros aos usuários e retornar livros emprestados. Classes, comportamentos e atributos adicionais podem ser criados, mas sem adicionar gambiarras ao código-fonte.

*As primeiras atividades terão dicas de ajuda sobre as classes que deverão ser criadas. Futuramente,  o aluno deverá identificar essas classes para resolver o problema.* 

**Classes a Serem Criadas:**

1.  **Classe `Livro`:**
    
    -   Atributos: título, autor, ISBN, e status (disponível ou emprestado).
    -   Métodos: getters e setters para os atributos, e um método para imprimir informações do livro (atributos).
    
2.  **Classe `Usuario`:**
    
    -   Atributos: nome, ID do usuário.
    -   Métodos: getters e setters para os atributos, e um método para imprimir informações do usuário  (atributos).
3.  **Classe `Emprestimo`:**
    
    -   Atributos: livro (do tipo `Livro`), usuário (do tipo `Usuario`), data de empréstimo, data de devolução.
    -   Métodos: getters e setters para os atributos, e um método para imprimir detalhes do empréstimo  (atributos).
    

No contexto da classe `Emprestimo` no sistema de gerenciamento de biblioteca, os "detalhes do empréstimo" referem-se às informações específicas relacionadas ao ato de emprestar um livro a um usuário. Estes detalhes geralmente incluem:

  **Informações do Livro Emprestado:**
    
    -   Título do livro.
    -   Autor do livro.
    -   ISBN do livro.
 **Informações do Usuário que Pegou o Livro:**
    
    -   Nome do usuário.
    -   ID do usuário.
 **Datas Relacionadas ao Empréstimo:**
    
    -   Data de empréstimo: a data em que o livro foi emprestado ao usuário.
    -   Data prevista de devolução: a data em que o livro deve ser devolvido à biblioteca.    


4.  **Classe `Biblioteca`:**
    
    -   Atributos: lista de livros, lista de usuários.
    -   Métodos: adicionar livro, adicionar usuário, emprestar livro, retornar livro, imprimir informações de todos os livros, imprimir informações de todos os usuários.
    
No contexto da classe `Biblioteca` no sistema de gerenciamento de biblioteca, o método "imprimir informações de todos os usuários" refere-se a uma funcionalidade que permite exibir os detalhes de todos os usuários registrados no sistema da biblioteca. Essa função é útil para ter uma visão geral dos membros da biblioteca e para fins administrativos ou de gerenciamento.

Quando implementado, esse método deve percorrer a lista (ou qualquer estrutura de dados que você esteja usando) de usuários armazenados na biblioteca e chamar um método para imprimir as informações individuais de cada usuário. As informações típicas a serem exibidas para cada usuário incluem:

-   Nome do usuário.
-   ID do usuário.

5. **Classe Devolução**
Os alunos devem implementar uma nova classe, chamada `Devolucao`, que será responsável por processar devoluções de livros e calcular multas por atraso. Esta classe deve interagir com as classes `Emprestimo`, `Livro`, e `Usuario` para atualizar o status dos livros e registrar quaisquer multas devidas.

**Especificações Detalhadas:**

1.  **Classe `Devolucao`:**
    
    -   Crie uma nova classe chamada `Devolucao`.
    -   Esta classe deve ter métodos para processar a devolução dos livros.
    -   Inclua um método para calcular a multa com base no atraso da devolução.
    -
2.  **Cálculo da Multa por Atraso:**
    
    -   Defina uma taxa de multa constante (R$ 0,50 por dia de atraso).
    -   O método de cálculo deve determinar o número de dias de atraso comparando a data prevista de devolução com a data efetiva de devolução.
    -   A multa é calculada apenas se houver atraso.
    -
3.  **Atualização de Status de Empréstimo e Livro:**
    
    -   Ao processar a devolução, atualize o status do `Emprestimo` para concluído e altere o status do `Livro` para disponível.
    -   Registre a multa no sistema, associando-a ao usuário correspondente.

**Herança:**

-   Você deve introduzir herança criando subclasses de `Livro`, como `LivroFisico` e `LivroDigital`. Cada subclasse terá atributos específicos (por exemplo, `LivroFisico` pode ter número de páginas e `LivroDigital` pode ter tamanho do arquivo).

### Critérios de Avaliação e Pesos

1.  **Implementação das Classes Básicas (30%)**
    
    -   **Classe `Livro`** 
        -   Atributos e métodos corretamente implementados.
    -   **Classe `Usuario`** 
        -   Atributos e métodos corretamente implementados.
    -   **Classe `Emprestimo`** 
        -   Atributos e métodos corretamente implementados.
     -   **Classe `Devolução`** 
2.  **Implementação da Classe `Biblioteca` e `Devolução`  e Funcionalidades (30%)**
    
    -   Adicionar livro/usuário (10%)
    -   Emprestar e retornar livro (10%)
    -   Imprimir informações dos livros e usuários (10%)
3.  **Uso de Herança (20%)**
    
    -   Implementação correta das subclasses de `Livro` (ex.: `LivroFisico` e `LivroDigital`) (20%)
        -   Atributos e métodos específicos da subclasse.
4.  **Qualidade do Código (10%)**
    
    -   Organização e legibilidade do código (10%)
5.  **Funcionalidade do Sistema (10%)**
    
    -   O sistema funciona conforme esperado sem erros (5%) 
    -   Implementação e funcionamento correto do sistema de busca (5%).

### Observações:

-   A nota máxima é 100% (5 pontos).
-   Erros de compilação ou falhas na execução de qualquer funcionalidade básica podem levar a deduções significativas.
-   A criatividade na implementação e na expansão das funcionalidades, se feita sem comprometer os requisitos básicos, pode ser considerada como elementos relevantes de aprendizagem.

