package aulas.aula2;
import java.sql.Date;

public class Conta {

	private int numeroconta, agencia;
	private Date dataconta;
	private double saldo;
	private String senhaconta;
	private Cliente cliente;
	
	public Conta(int numeroconta, int agencia, String senhaconta, Cliente cliente) {
		this.numeroconta = numeroconta;
		this.agencia = agencia;
		this.dataconta = new Date (System.currentTimeMillis());
		this.senhaconta = senhaconta;
		this.cliente = cliente;
		
		System.out.println("Objeto Conta criado!");
		System.out.println("Data abertura: " + this.dataconta);
	}
	
	
	
	public int getNumeroconta() {
		return numeroconta;
	}



	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public Date getDataconta() {
		return dataconta;
	}



	public void setDataconta(Date dataconta) {
		this.dataconta = dataconta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getSenhaconta() {
		return senhaconta;
	}



	public void setSenhaconta(String senhaconta) {
		this.senhaconta = senhaconta;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public boolean Saque (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
		return true;
		
	}
	
	public void Depositar (double valor) {
		this.saldo += valor;
	}
	
	public void Transferir(Conta conta, double valor) {
		
		boolean teste = this.Saque (valor);
		if (teste == true) {
		conta.Depositar(valor);
		}
	}
	
	public void Consultar_Saldo () {
		System.out.println("Nome do titular da conta: "  + cliente.getNometitular() + "\nSaldo da conta: " + this.saldo );
	}

	
	
}
