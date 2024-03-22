## Resolução do Exercício 1 de UML 
#### 1) Em relação aos relacionamentos abaixo, responda:


**a)** Ambas as representações podem ser corretas, dependendo do contexto da aplicação que o modelo pretende representar. No primeiro modelo, está representado que uma `Pessoa` pode ser proprietária de nenhuma ou várias casas (`0..*`) e que uma `Casa` é propriedade de exatamente uma pessoa (`1`). Este modelo é adequado se cada casa só pode ser propriedade de uma única pessoa ao mesmo tempo.

No segundo modelo, é indicado que uma `Casa` deve ser propriedade de pelo menos uma pessoa (`1..*`), e que uma `Pessoa` pode ser proprietária de nenhuma ou várias casas (`0..*`). Além disso, os símbolos `+` indicam que `propriedade` e `proprietário` são atributos públicos (embora na prática este símbolo seja mais usado para indicar métodos ou variáveis de instância e não relações em diagramas de classe UML). Este modelo seria mais apropriado num contexto onde uma casa deve ter pelo menos um proprietário, mas pode ter vários.

Portanto, a escolha da representação mais correta depende de se uma casa pode ou não ter múltiplos proprietários simultaneamente.

**b)** Para representar que uma casa possui diversos proprietários ao longo do tempo, é necessário mudar a cardinalidade na relação de `Casa` para `Pessoa`. Atualmente, indica que uma casa pode ter um ou mais proprietários ao mesmo tempo. Para refletir que uma casa pode ter diferentes proprietários em momentos diferentes, você poderia:

-   Manter a cardinalidade múltipla do lado da `Casa` (indicando que uma casa pode ter mais de um proprietário) e adicionar um atributo temporal (como `dataDeInicioPropriedade` e `dataDeFimPropriedade`) na classe `Casa` ou em uma classe associativa entre `Casa` e `Pessoa` que registre os períodos de propriedade.
-   Utilizar uma classe associativa chamada `Propriedade`, por exemplo, que teria a data de início e fim da propriedade e associar `Casa` e `Pessoa` através dessa classe. Isso permitiria representar diferentes proprietários em diferentes momentos.

#### 2) Qual a diferença de interpretação entre as duas representações ? Qual seria a mais indicada para um tribunal regional eleitoral ?

A diferença está na navegabilidade das associações. Tanto no primeiro diagrama como no segundo representamos que um eleitor  vota em um candidato ( ou em nenhum). o primeiro diagrama, a partir de um candidato não podemos acessar seus eleitores. No segundo, podemos acessar todos os eleitores a partir  de um candidato. 

#### 3) Qual a diferença de interpretação entre os relacionamentos livro-sobrecapa e livro-páginas ?

Livro-página é uma agregação por composição, logo, se destruirmos o livro, somem as páginas e os parágrafos. Representamos um livro como algo fisicamente constituído de páginas. 

Na agregação livro-sobrecapa, representamos que um livro pode ser constituído por uma sobrecapa, mas que a sobrecapa é um objeto que existe independente do livro. Os tempos de vida dos objetos  não são semelhantes. 


#### 4) Todo aluno matriculado em trabalho de diplomação será orientado por um professor. Alguns professores orientam vários alunos e outros, nenhum. Qual dos diagramas melhor representa esta relação ?

Resposta certa é a letra C; 


#### 5) Construa um diagrama de classes para o seguintes tipos de obras: romance, livro de ficção, livro de auto ajuda, gibi, musicas de rock, úsicas de mpb, filmes de ficção e comédia. O seu diagrama deve representar somente as classes e o relacionamento de herança. Não é preciso apresentar os atributos e métodos.

![Diagrama de Classe](https://raw.githubusercontent.com/ICTIN-UFLA/POO-Johnatan-2024-1/main/img/gab2-class.png)
