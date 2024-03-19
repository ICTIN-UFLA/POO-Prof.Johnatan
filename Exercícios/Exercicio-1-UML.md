# Revisão para o exercício 
**Objeto:** um objeto é qualquer coisa que possamos ver, sentir, tocar ou idealizar.
Exemplos de objetos são: Eu, esse texto, sua conta de email, etc.
Computacionalmente falando, um objeto é uma abstração de algo do mundo
real. Em vista disso, um objeto nesse é bem mais simples que a sua contrapartida
original e representas as características e comportamentos relevantes desse
original.

**Classes:** corresponde a um agrupamento de objetos. Ela retém os
comportamento que serão característicos aos objetos que dela fazem parte. Por
exemplo: Pessoa é uma classe onde estamos contidos todos nós, porém quando
pensamos em alguém em específico, estamos pensando no objeto, quando
idealizamos uma imagem de uma pessoa fizemos usando as características da
classe. Por exemplo: Camisa é uma classe. A camisa que estou usando agora é
um objeto dessa classe.

**Herança:** é a capacidade que uma classe tem de herdar características da classe
que está acima dela hierarquicamente. Por exemplo: Camisa é uma subclasse da
classe Roupa, logo ela herda comportamentos e funções. Todas as duas tem a
comportamento de servir como vestimentas para quem a usa.

**Mensagem:** é um pedido ou informação passado de um objeto para outro. Por
exemplo, quando giramos o objeto chave na ignição do carro, ele passa a
mensagem para o carro de queremos que ele funcione, em reposta o carro
executa essa tarefa.

**Diagrama de classes:**  Demonstra a estrutura estática dessa colaboração,
mostra as classes de um sistema, seus atributos e
operações, e como as classes se relacionam.

**O diagrama de objetos** (que pode ser visto como uma
instanciação do diagrama de classes) também
representa a estrutrua estática 

*Agora vamos para o exercício.* 

## Lista Diagrama de Classes 

#### Exercício 0 Identificação de Classes em um "Mini Mundo"
Descrição do Mini Mundo:

Imagine uma pequena loja de departamentos. Nesta loja, há vários produtos à venda, incluindo roupas, eletrônicos, e utensílios domésticos. Cada produto tem um preço, uma categoria e está disponível em uma quantidade específica no estoque. Os clientes podem visitar a loja, escolher produtos e comprá-los. Para cada compra, é emitido um recibo que lista os itens comprados, a quantidade de cada item, o preço total e a data da compra.

Os funcionários da loja são responsáveis por gerenciar o estoque, atender os clientes e processar as vendas. Cada funcionário tem um nome, um ID único, uma função específica (como caixa, gerente ou assistente de vendas) e um salário.

**Instruções:**
*Identifique as Classes:* Leia a descrição do mini mundo acima e identifique todas as classes potenciais que podem ser modeladas em um software para esse cenário.

*Defina Atributos e Métodos:* Para cada classe identificada, liste os atributos e métodos relevantes. Por exemplo, para a classe Produto, os atributos podem incluir preco, categoria, e quantidadeEmEstoque, enquanto os métodos podem incluir adicionarEstoque() e removerEstoque().

*Relações entre Classes:* Pense sobre como essas classes podem estar relacionadas. Por exemplo, um Recibo está relacionado a um Cliente e a vários Produtos.

*Desenvolva um Diagrama de Classes:* Utilize uma ferramenta de diagramação (ex: ArgoUML ou draw.io )para criar um diagrama de classes UML representando as classes, seus atributos, métodos e as relações entre elas.

#### 1) Em relação aos relacionamentos abaixo, responda: 
a) Qual a representação mais correta, a primeira ou a segunda relação? Por quê? 

b) O que é preciso mudar na segunda relação para representar que uma casa possui diversos proprietários ao longo do tempo? 

![Diagrama de Classe](https://raw.githubusercontent.com/ICTIN-UFLA/POO-Johnatan-2024-1/main/img/class1.png)


#### 2) Qual a diferença de interpretação entre as duas representações ? Qual seria   a mais indicada para um tribunal regional eleitoral ?

![Diagrama de Classe](https://raw.githubusercontent.com/ICTIN-UFLA/POO-Johnatan-2024-1/main/img/class2.png)

#### 3) Qual a diferença de interpretação entre os relacionamentos livro-sobrecapa e livro-páginas ? 
![Diagrama de Classe](https://raw.githubusercontent.com/ICTIN-UFLA/POO-Johnatan-2024-1/main/img/class3.png)


#### 4) Todo aluno matriculado em trabalho de diplomação  será orientado por um professor. Alguns professores orientam vários alunos e outros, nenhum. Qual dos diagramas melhor representa esta relação ? 
![Diagrama de Classe](https://raw.githubusercontent.com/ICTIN-UFLA/POO-Johnatan-2024-1/main/img/class4.png)


#### 5) Construa um diagrama de classes  para o seguintes tipos de obras: romance, livro de ficção, livro de auto ajuda, gibi, musicas de rock, úsicas de mpb, filmes de ficção e comédia.  O seu diagrama deve representar somente as classes e o relacionamento de herança. Não é preciso apresentar os atributos e métodos. 
