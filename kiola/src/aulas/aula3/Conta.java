package aulas.aula3;

import java.util.Date;

//superclass
public abstract class Conta { // proibe a instancia da classe

	// atributos
	protected final Cliente cliente; // composição, pois este atributo guarda um objeto (instancia) da classe cliente ----- REUSABILIDADE
	protected final long numeroConta;
	protected double saldo;
	protected Date dataAbertura;
	private static long contador; // static é um variavel local da classe, pertence ao projeto e não ao objeto

	public Conta(Cliente cliente, long numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.dataAbertura = new Date();
		contador++;
	}

	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void transferir(double valor, Conta conta) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	public abstract void exibirSaldo(); // abstract no metodo forca a reescrita na classe que ta fazendo heranca, neste caso é conta corrente.

	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}

}

