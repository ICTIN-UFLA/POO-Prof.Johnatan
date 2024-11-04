# Exercícios de Prática sobre Casting em Java

Aqui estão alguns exercícios de prática para ajudar os alunos a consolidar o entendimento sobre casting em Java.

---

### Exercício 1: Upcasting e Downcasting com Classes

1. Crie as classes **Veiculo**, **Carro** e **Moto**:
   - A classe `Veiculo` deve ter o método `mover()`, que exibe a mensagem `"Veículo em movimento"`.
   - A classe `Carro` deve herdar de `Veiculo` e sobrescrever o método `mover()` para exibir `"Carro em movimento"`.
   - A classe `Moto` deve herdar de `Veiculo` e sobrescrever o método `mover()` para exibir `"Moto em movimento"`.

2. No método `main`, faça o seguinte:
   - Crie um objeto `Carro` e um objeto `Moto`.
   - Realize **upcasting** para tratar ambos como `Veiculo` e chame o método `mover()` para cada um.
   - Realize **downcasting** de `Veiculo` para `Carro` e `Moto`, e chame o método `mover()` novamente.

*Dica:* Utilize o operador `instanceof` para garantir que o objeto pode ser convertido de volta ao tipo específico.

---

### Exercício 2: Casting entre Tipos Primitivos

1. Defina três variáveis de tipos diferentes: `int`, `double` e `float` com valores iniciais. Exemplo:
   ```java
   int numeroInt = 150;
   double numeroDouble = 123.45;
   float numeroFloat = 10.5f;
   ```

2. Converta:
   - O valor de `numeroInt` para `double` (casting implícito).
   - O valor de `numeroDouble` para `int` (casting explícito).
   - O valor de `numeroFloat` para `int` e `double` (casting explícito e implícito, respectivamente).

3. Exiba os resultados e explique quais valores foram mantidos e quais foram alterados devido ao casting.

---

### Exercício 3: Perda de Dados com Casting Explícito

1. Defina uma variável `int valorInt = 260;`.
2. Converta `valorInt` para o tipo `byte` usando casting explícito.
3. Exiba o valor resultante e explique por que o valor exibido pode não ser o esperado.

*Dica:* Revise o intervalo de valores que o tipo `byte` pode armazenar.

---

### Exercício 4: Casting entre Tipos Primitivos em Operações Matemáticas

1. Crie uma variável `short` com o valor `10`.
2. Crie uma variável `byte` com o valor `20`.
3. Faça a soma dessas duas variáveis e armazene o resultado em uma variável `int` sem usar casting explícito. Exiba o resultado.
4. Agora, armazene o resultado da soma em uma variável `short` usando **casting explícito** e exiba o resultado.
5. Explique o motivo pelo qual o casting explícito foi necessário.

---

### Exercício 5: Casting em Herança de Classes

Crie um sistema de gerenciamento de dispositivos:

1. Crie a classe `Dispositivo` com o método `ligar()` que exibe `"Dispositivo ligado"`.
2. Crie as classes `Computador` e `Celular` que herdam de `Dispositivo`. Cada uma deve sobrescrever o método `ligar()` para exibir, respectivamente, `"Computador ligado"` e `"Celular ligado"`.
3. No `main`, faça o seguinte:
   - Crie um `ArrayList<Dispositivo>` e adicione instâncias de `Computador` e `Celular`.
   - Use **upcasting** para armazenar os objetos na lista.
   - Percorra a lista e, usando **downcasting**, chame o método `ligar()` específico de cada classe.

---
