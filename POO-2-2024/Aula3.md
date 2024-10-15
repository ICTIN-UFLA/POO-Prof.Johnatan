## Desenvolvimento de um Sistema de Pacotes de Viagens

Imagine que você foi contratado por uma **agência de viagens especializada em pacotes turísticos** para desenvolver um sistema de gerenciamento de pacotes de viagens. O objetivo é criar uma solução que ajude a organizar e apresentar aos clientes os destinos disponíveis, com preços diferenciados conforme a temporada do ano. A agência trabalha com três temporadas:

-   **Baixa temporada**: Períodos com menor demanda e preços reduzidos.
-   **Média temporada**: Momentos intermediários de fluxo turístico, como feriados prolongados.
-   **Alta temporada**: Períodos de maior demanda, como férias e festividades, em que os preços são mais elevados.

Cada **pacote de viagem** contém uma **lista de destinos** e uma **matriz de preços** correspondente às três temporadas. Dessa forma, o cliente pode visualizar os preços para cada destino em diferentes períodos do ano. A agência também oferece pacotes especiais denominados **Pacotes Personalizados**, que são variações dos pacotes básicos e proporcionam descontos específicos ou benefícios adicionais.

Além de organizar as informações de forma clara e eficiente, o sistema precisa seguir os princípios da **Programação Orientada a Objetos (POO)**, aproveitando conceitos como:

-   **Herança:** Os pacotes personalizados devem ser criados a partir dos pacotes básicos, aproveitando o código existente.
-   **Construtores:** Utilizados para inicializar as informações de cada pacote e personalizar suas características no momento da criação.
-   **Lista:** Para armazenar dinamicamente os destinos disponíveis em cada pacote.
-   **Matriz:** Para organizar os preços por destino e por temporada de forma estruturada.

----------

### **Objetivo do Sistema**

O sistema precisa ser **fácil de utilizar e extensível**, permitindo a inclusão de novos pacotes e destinos no futuro. Além disso, deve facilitar a criação de **variações personalizadas** dos pacotes existentes, oferecendo descontos exclusivos e pacotes premium para clientes que buscam experiências diferenciadas.

O desafio está em projetar e desenvolver uma **aplicação modular e eficiente** que implemente esses conceitos fundamentais. A aplicação deverá:

1.  **Armazenar e exibir uma lista de pacotes com múltiplos destinos.**
2.  **Organizar os preços em uma matriz**, onde as linhas representam destinos e as colunas as temporadas.
3.  **Utilizar herança** para criar pacotes personalizados a partir dos pacotes básicos.
4.  **Aplicar descontos** de forma dinâmica nos pacotes personalizados, simulando uma funcionalidade comum em promoções turísticas.

Este projeto não apenas servirá como uma aplicação prática dos conceitos de POO, mas também proporcionará aos alunos uma **experiência próxima ao desenvolvimento real de software** para a indústria de turismo.


### *Saída Esperada*

Pacote: Pacote Europa
Destinos:
 - Paris
 - Londres
 - Nova York

Preços por Temporada (Baixa, Média, Alta):
Paris: 5000.0 7000.0 9000.0 
Londres: 6000.0 8000.0 10000.0 
Nova York: 7000.0 9000.0 11000.0 

Aplicando 10.0% de desconto na baixa temporada:
Paris: Preço original: 5000.0 | Preço com desconto: 4500.0
Londres: Preço original: 6000.0 | Preço com desconto: 5400.0
Nova York: Preço original: 7000.0 | Preço com desconto: 6300.0

Pacote: Pacote Premium
Destinos:
 - Paris
 - Londres
 - Nova York

Preços por Temporada (Baixa, Média, Alta):
Paris: 5000.0 7000.0 9000.0 
Londres: 6000.0 8000.0 10000.0 
Nova York: 7000.0 9000.0 11000.0 

