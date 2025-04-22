# Atividade: Modelagem de Classes UML para um Sistema de Biblioteca Universitária  


## Objetivo  
Desenvolver um diagrama de classes UML que represente o sistema descrito no problema, aplicando os conceitos de POO (abstração, encapsulamento, herança, associação, etc.).  

---

## Descrição do Problema  
A **Biblioteca Universitária XPTO** precisa de um sistema para gerenciar:  

1. **Livros**:  
   - Atributos: `título`, `ISBN`, `autor(es)`, `anoPublicacao`, `editora`, `categoria`.  
   - Um livro pode ter múltiplos exemplares físicos.  

2. **Exemplares**:  
   - Atributos: `idExemplar` (único), `status` (Disponível/Emprestado/Em Manutenção), `localizacao`.  
   - Relacionamento: Associado a um `Livro`.  

3. **Usuários**:  
   - Classes: `Aluno`, `Professor`, `Funcionario` (herdam de `Usuario`).  
   - Atributos comuns: `matricula`, `nome`, `email`, `telefone`.  
   - Regras: Professores emprestam por 30 dias; outros por 15 dias.  

4. **Empréstimos**:  
   - Atributos: `dataEmprestimo`, `dataDevolucaoPrevista`, `multa` (R$ 5/dia se atraso).  
   - Relacionamentos: Liga `Exemplar` a `Usuario`.  

5. **Reservas**:  
   - Atributos: `dataReserva`, `status` (Ativa/Concluída).  
   - Ordem por data para notificar disponibilidade.  

6. **Busca**:  
   - Métodos: `buscarPorTitulo()`, `buscarPorAutor()`, `buscarPorCategoria()`.  

---

## Tarefas  
1. **Identifique as classes** e seus atributos/métodos.  
2. **Modele os relacionamentos**:  
   - Herança (`Usuario` → `Aluno`, `Professor`, `Funcionario`).  
   - Associação/Agregação (`Livro` → `Exemplar`).  
   - Cardinalidades (ex: 1 `Livro` para 1..* `Exemplares`).  
3. **Adicione classes auxiliares** se necessário (ex: `Multa`, `Busca`).  

---

## Exemplo se fosse para  Entregar  
- **Formato**: Diagrama UML (feito em Lucidchart, StarUML, ou foto de desenho manual).  
- **Critérios de Avaliação**:  
  - ✔️ Classes e atributos corretos.  
  - ✔️ Relacionamentos precisos.  
  - ✔️ Cardinalidades claras (1..1, 1..*, etc.).  

---

### Resposta  
![Diagrama UML](https://github.com/ICTIN-UFLA/POO-Prof.Johnatan/blob/main/img/Primeiro.png)
