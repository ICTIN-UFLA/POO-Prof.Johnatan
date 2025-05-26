
# Atividade Proposta – CRUD de Cadastro de Alunos com Tratamento de Exceções

## Objetivo
Desenvolver um sistema de cadastro de alunos (CRUD: Create, Read, Update, Delete) em Java que funcione totalmente em memória (sem banco de dados) e que utilize **tratamento de exceções** para garantir a estabilidade da aplicação.

---

## Cenário

Você foi contratado para criar um sistema simples de gerenciamento de alunos para uma escola. O sistema deverá permitir:

1. Cadastrar um novo aluno.
2. Consultar um aluno por matrícula.
3. Atualizar o nome de um aluno.
4. Remover um aluno por matrícula.
5. Listar todos os alunos cadastrados.

O sistema deve ser executado em modo texto (linha de comando) e armazenar os dados dos alunos em uma lista (`ArrayList`).

---

## Regras de negócio e tratamento de exceções

- Nenhum campo pode ser vazio ou nulo.
- O número da matrícula deve ser único.
- Deve ser lançada uma exceção personalizada (`AlunoNaoEncontradoException`) se o aluno não for encontrado.
- Deve ser tratada a exceção de entrada inválida (por exemplo, digitar texto em vez de número).
- O programa deve capturar quaisquer exceções inesperadas para evitar que o sistema seja encerrado abruptamente.

---

## Exemplo de exceção personalizada

```java
public class AlunoNaoEncontradoException extends Exception {
    public AlunoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
```

---

## Sugestão de estrutura

- Classe `Aluno` com os atributos `nome` (String) e `matricula` (int).
- Classe `SistemaAlunos` com `main` e menu de opções.
- Métodos separados para cada operação: `cadastrarAluno()`, `consultarAluno()`, `atualizarAluno()`, `removerAluno()`, `listarAlunos()`.

---

## Exemplo de execução esperada

```
1 - Cadastrar aluno
2 - Consultar aluno
3 - Atualizar aluno
4 - Remover aluno
5 - Listar alunos
6 - Sair
Escolha: 1

Nome do aluno: João
Matrícula: 101
Aluno cadastrado com sucesso!

Escolha: 2
Matrícula do aluno: 999
Erro: Aluno com matrícula 999 não encontrado.

Escolha: 5
Lista de alunos:
Matrícula: 101 | Nome: João
```

---

## Critérios de Avaliação

- ✅ Uso obrigatório de exceção personalizada.
- ✅ Implementação de todas as funcionalidades CRUD.
- ✅ Uso de `ArrayList` para armazenar os dados.
- ✅ Separação de responsabilidades (métodos separados).
- ✅ Tratamento completo de exceções esperadas e inesperadas.
- ✅ Interface simples via terminal (linha de comando).

---

## Entrega

Entregar um arquivo `.java` com a implementação completa do sistema. Todos os métodos devem estar organizados e comentados. O sistema deve compilar e funcionar corretamente via terminal. Você deve colocar o código no seu GitHub e  enviar o link para o professor via e-mail até segunda feira 02-06-2025 até meia noite. 

