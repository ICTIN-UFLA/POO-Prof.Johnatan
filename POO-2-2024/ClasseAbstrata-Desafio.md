
### Atividade Prática: Sistema de Gestão de Transportes

## Contexto

Uma empresa de transporte deseja desenvolver um sistema para gerenciar seus veículos e realizar a cobrança dos serviços de transporte de forma automatizada. A empresa oferece diferentes tipos de transportes, como transporte rodoviário, aéreo e marítimo. Cada tipo de transporte possui características e regras específicas de cobrança, como tarifas base, distância e capacidade de carga.

### Problema

A empresa precisa de um sistema para calcular o valor total dos serviços prestados para cada tipo de transporte, considerando as regras específicas de cada um. O sistema deve ser capaz de armazenar os detalhes de cada veículo, como o modelo, capacidade de carga e o tipo de transporte. O cálculo do custo do transporte deve levar em consideração o tipo específico de transporte e a distância percorrida.

### Objetivos

Criar uma estrutura de classes que permita:

1.  **Definir os diferentes tipos de transportes** (rodoviário, aéreo e marítimo), com suas características específicas.
2.  **Calcular o custo do transporte** com base no tipo de transporte e na distância percorrida.
3.  Implementar o conceito de classes abstratas para definir métodos e atributos comuns aos diferentes tipos de transportes.

### Especificações

1.  **Classe Abstrata `Transporte`**:
    -   Atributos comuns a todos os transportes: `modelo`, `capacidadeDeCarga` e `distanciaPercorrida`.
    -   Método abstrato `calcularCusto()` que será implementado nas subclasses para calcular o custo de cada tipo de transporte.
2.  **Classe `TransporteRodoviario`**:
    -   Extende `Transporte` e calcula o custo com base em uma tarifa fixa por quilômetro rodado, considerando a distância e um fator multiplicador específico para transporte rodoviário.
3.  **Classe `TransporteAereo`**:
    -   Extende `Transporte` e calcula o custo com base em uma tarifa fixa por quilômetro, multiplicado por um fator de risco devido à carga e a uma taxa adicional para transporte aéreo.
4.  **Classe `TransporteMaritimo`**:
    -   Extende `Transporte` e calcula o custo com base em uma tarifa fixa por quilômetro, considerando o tipo de carga e a capacidade do navio.

### Requisitos para a Solução

1.  Crie a **classe abstrata `Transporte`** para definir os métodos e atributos comuns a todos os transportes.
2.  Crie as classes concretas `TransporteRodoviario`, `TransporteAereo` e `TransporteMaritimo` que estendem `Transporte`.
3.  Cada tipo de transporte deve implementar o método `calcularCusto()` com uma lógica de cálculo específica.
4.  Instancie os diferentes tipos de transporte e calcule o custo para um determinado trajeto.
