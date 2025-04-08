
# 📝 Atividade: Sistema de Controle de Funcionários

## 🧩 Problema

Você foi contratado para desenvolver um sistema de controle de **Funcionários** para uma empresa. O sistema deve ser capaz de armazenar informações sobre diferentes tipos de funcionários, como **Gerentes** e **Operários**. Ambos os tipos de funcionários compartilham algumas características, como **nome** e **salário**, mas possuem comportamentos diferentes, como o **cálculo do salário**.

A classe **Funcionário** será a superclasse, e as classes **Gerente** e **Operário** serão subclasses que herdam da classe **Funcionário**. Cada tipo de funcionário terá seu próprio método para calcular o salário, com base em regras diferentes.

## 🛠️ Requisitos

1. **Classe `Funcionario`**:
    - Atributos: `nome` (String), `salarioBase` (double).
    - Construtor: Receber o nome e o salário base.
    - Método: `calcularSalario()`, que retorna o salário base. Este método será sobrescrito pelas subclasses.

2. **Classe `Gerente`** (subclasse de `Funcionario`):
    - Atributos adicionais: Nenhum.
    - Construtor: Chama o construtor da classe `Funcionario` para inicializar o nome e o salário base.
    - Sobrescreve o método `calcularSalario()`: O gerente recebe 10% de bônus sobre o salário base.

3. **Classe `Operario`** (subclasse de `Funcionario`):
    - Atributos adicionais: Nenhum.
    - Construtor: Chama o construtor da classe `Funcionario` para inicializar o nome e o salário base.
    - Sobrescreve o método `calcularSalario()`: O operário recebe um adicional fixo de R$ 500,00 sobre o salário base.

4. **Classe Principal** (`Main`):
    - Crie uma classe chamada `Main` (ou `Empresa`, como preferir) que deve conter o método `main`.
    - No método `main`, crie instâncias de **Gerente** e **Operário**, inicialize seus dados e mostre o nome e o salário calculado para cada um.

## 🧑‍💻 Tarefa

1. Crie a classe `Funcionario` com o atributo `nome` e `salarioBase`, o construtor e o método `calcularSalario()`.
2. Crie a classe `Gerente`, que herda de `Funcionario` e sobrescreve o método `calcularSalario()` para aplicar o bônus de 10%.
3. Crie a classe `Operario`, que herda de `Funcionario` e sobrescreve o método `calcularSalario()` para adicionar o valor fixo de R$ 500,00.
4. Crie a **classe principal com o método `main`** que cria instâncias de **Gerente** e **Operário**, inicializa seus dados e exibe o nome e o salário calculado para cada um.

## 📝 Exemplo de Saída Esperada:

```
Funcionario: João
Salário: R$ 2500.00

Funcionario: Maria (Gerente)
Salário com bônus: R$ 2750.00

Funcionario: José (Operário)
Salário com adicional: R$ 3000.00
```

## 📘 O que você deve demonstrar nesta atividade:
- Uso de **herança** para compartilhar características entre diferentes tipos de funcionários.
- Como usar **construtores** para inicializar os dados dos objetos.
- Como usar **@Override** para sobrescrever o método `calcularSalario()` de acordo com as regras de cada tipo de funcionário.
- Como criar uma **classe principal** com o **método `main`**, que é necessário para executar o programa.
