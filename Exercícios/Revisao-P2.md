
# POO: Revisão para a Prova II

## Questões Discursivas

 1. Explique, com suas próprias palavras, o conceito de uma stream em Java. Como as streams facilitam a leitura e escrita de dados em arquivos? Cite exemplos de tipos de streams discutidos no material.
 2.   Diferencie entre `FileInputStream` e `FileOutputStream`. Em que situações você usaria cada uma dessas classes e porquê?
 3.    No exemplo do slide, o código lê dados de um arquivo `xanadu.txt` e grava em `byteoutput.txt` usando `FileInputStream` e `FileOutputStream`. Descreva o que acontece quando o arquivo de origem contém caracteres que não são ASCII. Como isso pode impactar o resultado no arquivo de destino?
 4. Proponha uma modificação ao código do exemplo `CopyBytes` para contar o número de bytes lidos e escritos durante o processo. Implemente essa modificação em Java.
 5. O que muda ao utilizar `FileReader` e `FileWriter` em vez de `FileInputStream` e `FileOutputStream`? Explique como a codificação de caracteres pode afetar a leitura e escrita de arquivos, especialmente em sistemas que utilizam UTF-8.
 6. Dado um arquivo de texto que contém caracteres acentuados (como `á`, `ç`, `é`), descreva como o Java lida com esses caracteres ao usar `FileReader` e `FileWriter` em comparação com `FileInputStream` e `FileOutputStream`.
 7.  Como as buffered streams melhoram a eficiência das operações de I/O? Compare a execução de um programa que lê e escreve dados usando streams com e sem buffer.
 8. Escreva um código em Java que utilize `BufferedReader` e `BufferedWriter` para copiar o conteúdo de um arquivo texto, linha por linha. Explique por que o método `readLine()` é útil nesse contexto.
9.  Explique o processo de serialização e desserialização de objetos em Java. Por que é necessário que uma classe implemente a interface `Serializable`?
10.  Considere uma classe `Pessoa` com os atributos `nome`, `idade` e `senha`. Explique como a serialização poderia ser utilizada para salvar uma instância dessa classe em um arquivo. O que acontece se o atributo `senha` for marcado como `transient`? Demonstre com código.
11. Escreva um programa em Java que interaja com o usuário via linha de comando, solicitando que ele digite uma série de números inteiros. O programa deve então calcular e exibir a soma desses números. Utilize a classe `Scanner` para ler os dados.

12. Explique, com suas próprias palavras, o que é a programação em camadas e por que ela é importante em sistemas de software. Como a separação em camadas pode melhorar a manutenção e evolução do código?
13. O que é o padrão MVC (Model-View-Controller) e como ele se relaciona com a programação em camadas? Identifique e descreva a função de cada componente dentro do padrão MVC.
14. Considere um sistema simples de gerenciamento de contas bancárias, onde é possível realizar operações de saque e depósito. Modele esse sistema usando o padrão MVC, descrevendo as responsabilidades de cada camada (Model, View, Controller). Como você implementaria a lógica de negócio na camada de controle?
15. Dado o exemplo do slide onde a interface (View) solicita ao controlador (Controller) para buscar uma conta bancária e realizar um saque, identifique possíveis pontos de melhoria no código para otimizar a busca e o processamento de operações. Como você refatoraria o código para evitar buscas redundantes?
16. Muitas vezes, é necessário armazenar o estado atual de um objeto em uma classe controladora para facilitar operações subsequentes. Quais são os possíveis riscos de manter estados em um controlador? Como você mitigaria esses riscos no contexto de um sistema bancário?
17. Em um ambiente de produção, o uso correto do padrão MVC pode ser crucial para o sucesso de um sistema. Cite exemplos de más práticas na implementação do padrão MVC que podem levar a um código difícil de manter e entender. Como essas práticas poderiam ser evitadas?
18. Imagine que você precise adaptar um sistema legado que não segue o padrão MVC para uma arquitetura em camadas. Quais são os principais desafios que você enfrentaria durante esse processo de refatoração? Como você planeja abordar cada um desses desafios?
19. Descreva como o padrão MVC pode ser aplicado em um sistema web. Compare e contraste a implementação do padrão MVC em um ambiente desktop versus um ambiente web. Quais são as diferenças chave e como essas diferenças impactam o design do sistema?
20. Explique o que é reengenharia de sistemas e como ela se diferencia da engenharia de software tradicional. Dê exemplos de situações em que a reengenharia pode ser preferível ao desenvolvimento de um novo sistema.
21. Descreva o que é refatoração de código. Por que a refatoração é considerada uma forma de manutenção preventiva? Como ela pode impactar a qualidade do código a longo prazo?
22. O que são "code smells" e como eles se relacionam com a necessidade de refatoração? Discuta a importância de identificar code smells em um projeto de software.
23. Um desenvolvedor identificou que uma classe no sistema possui muitos métodos e atributos, centralizando diversas responsabilidades. Qual code smell pode estar presente nesse cenário? Quais refatorações seriam recomendadas para resolver esse problema?
24. Explique o code smell "Feature Envy". Como ele pode comprometer a coesão de uma classe? Quais são as refatorações sugeridas para corrigir esse problema?
25. O que caracteriza o code smell "Shotgun Surgery"? Por que ele pode ser problemático para a manutenção do software? Proponha uma estratégia de refatoração para lidar com esse tipo de problema.
26. Compare os code smells "Divergent Change" e "Shotgun Surgery". Como esses problemas são diferentes, e por que é importante abordá-los de maneira distinta durante a refatoração?
27. Discuta o code smell "Refused Bequest". Como esse problema pode indicar uma falha na hierarquia de classes de um sistema? Qual refatoração poderia ser aplicada para resolver esse problema e por quê?
28. Suponha que você herde um projeto com métodos longos e complexos que centralizam a funcionalidade de suas classes. Como você abordaria a refatoração desses métodos para melhorar a clareza e a manutenibilidade do código? Explique seu raciocínio e descreva as etapas que você seguiria.
29. Em um código legado, você encontra comentários excessivos explicando o que cada bloco de código faz. Qual code smell isso pode indicar? Como você refatoraria o código para reduzir a necessidade de comentários extensivos?
30. Em um sistema orientado a objetos, você percebe que uma classe base (superclasse) está sendo estendida por várias subclasses, mas muitas das subclasses não utilizam todos os métodos e atributos herdados. Como você abordaria a refatoração dessa hierarquia de classes? Quais são os riscos de uma abordagem de "Refused Bequest" e como mitigá-los?
31. Discorra sobre a importância de testes automatizados durante o processo de refatoração. Como os testes podem ajudar a garantir que a refatoração não introduza novos bugs? Qual seria sua abordagem para manter a cobertura de testes adequada enquanto refatora um sistema?

