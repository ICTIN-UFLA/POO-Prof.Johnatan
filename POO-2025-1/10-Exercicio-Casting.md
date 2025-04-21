# 🛠️ Atividade Resolvida: Aplicando Casting e `instanceof` em Java

## 📚 Enunciado

Imagine que estamos modelando um sistema para uma locadora de veículos. Temos diferentes tipos de veículos, como `Carro`, `Moto` e `Caminhao`, todos herdando da classe `Veiculo`.

Sua tarefa é:

1. Criar a hierarquia de classes (`Veiculo`, `Carro`, `Moto`, `Caminhao`).
2. Criar um método específico em cada subclasse.
3. Demonstrar o uso de:
   - **Casting Implícito** (atribuindo subclasses a uma variável da superclasse).
   - **Casting Explícito** (retornando para a subclasse).
   - **`instanceof`** para verificar o tipo antes do casting.

---

## 🛠️ Resolução Completa

### 1. Criando as classes

```java
class Veiculo {
    void mover() {
        System.out.println("Veículo se movendo...");
    }
}

class Carro extends Veiculo {
    void abrirPorta() {
        System.out.println("Porta do carro aberta!");
    }
}

class Moto extends Veiculo {
    void empinar() {
        System.out.println("Moto empinando!");
    }
}

class Caminhao extends Veiculo {
    void carregarCarga() {
        System.out.println("Caminhão carregando carga!");
    }
}
```

---

### 2. Código Principal com Casting Implícito e Explícito

```java
public class Locadora {
    public static void main(String[] args) {
        // Casting implícito: Carro -> Veiculo
        Veiculo veiculo1 = new Carro();
        Veiculo veiculo2 = new Moto();
        Veiculo veiculo3 = new Caminhao();
        
        // Todos podem se mover
        veiculo1.mover();
        veiculo2.mover();
        veiculo3.mover();
        
        System.out.println("-----");

        // Usando instanceof para casting seguro
        if (veiculo1 instanceof Carro) {
            Carro carro = (Carro) veiculo1; // Casting explícito
            carro.abrirPorta();
        }
        
        if (veiculo2 instanceof Moto) {
            Moto moto = (Moto) veiculo2; // Casting explícito
            moto.empinar();
        }
        
        if (veiculo3 instanceof Caminhao) {
            Caminhao caminhao = (Caminhao) veiculo3; // Casting explícito
            caminhao.carregarCarga();
        }
    }
}
```

---

## 🌟 O que foi feito?

- Criamos **objetos de subclasses** (`Carro`, `Moto`, `Caminhao`) e os atribuímos a uma **referência de superclasse** (`Veiculo`) — **casting implícito**.
- **Usamos `instanceof`** para verificar o tipo real antes de realizar o **casting explícito**.
- Após o casting, **chamamos métodos específicos** de cada subclasse.

---

## 🧐 Reflexão

Por que precisamos de `instanceof`?

> Porque, se tentarmos fazer um casting para o tipo errado (por exemplo, transformar uma `Moto` em `Carro`), o programa vai lançar um erro em tempo de execução.  
> Usar `instanceof` garante a **segurança** do código!

---

# 🎯 DESAFIO PARA VOCÊ

Crie uma nova classe chamada `Bicicleta`, que também herda de `Veiculo`, e implemente o método `pedalar()`.

Depois:

1. Crie um objeto do tipo `Bicicleta`.
2. Faça o casting implícito para `Veiculo`.
3. Verifique com `instanceof` e retorne para `Bicicleta`, chamando o método `pedalar()`.

**Bônus:** tente fazer uma lista de `Veiculo` contendo `Carro`, `Moto`, `Caminhao` e `Bicicleta`, e percorra a lista usando um laço `for`, verificando e chamando o método específico de cada tipo! 🚴🚗🛵️🚛

---

# 🚀 Continue praticando para dominar casting e hierarquia de classes!
