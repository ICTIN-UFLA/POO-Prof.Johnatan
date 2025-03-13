## Classe Conta.java

````Java

public class Conta {
	
	private double saldo;

	public Conta(double saldoInicial) {
		
		if (saldoInicial < 0) {
			System.out.println("Erro: Saldo inicial não pode ser negativo. Inicializando saldo com 0.");
			this.saldo = 0;
		} else {
			this.saldo = saldoInicial;
		}
	}

	public void credito(double valor) {
		this.saldo += valor;
	}

	public void debito(double valor) {
		if (valor > this.saldo) {
			System.out.println("Erro: Saldo insuficiente para realizar o débito.");
		} else {
			this.saldo -= valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
}
````


## Classe AplicacaoConta.java


````Java
public class AplicacaoConta {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(100);
		Conta conta2 = new Conta(-50);

		// Operações na conta1
		conta1.credito(50);
		conta1.debito(20);

		// Operações na conta2
		conta2.credito(200);
		conta2.debito(250);

		// Exibindo os saldos finais
		System.out.println("Saldo da conta 1: " + conta1.getSaldo());
		System.out.println("Saldo da conta 2: " + conta2.getSaldo());
	}
}
````
