package aulas.aula2;

public class Teste {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Cliente pamela = new Cliente ("14789523680", "47852169z", "Pamela", "Rua Feliz, 1234"); 
			Cliente isabella = new Cliente ("14789525570", "478547859z", "Isabella", "Rua Feliz, 1234"); 
			
			Conta contaPamela = new Conta ( 1111, 001, "P09876", pamela);
			Conta contaIsabella = new Conta ( 1478, 001, "I47851", isabella);
			
			contaPamela.Depositar(3540.50);
			contaPamela.Consultar_Saldo();
			contaPamela.Saque(1325.40);
			contaPamela.Consultar_Saldo();
			 System.out.println("---------------------");
			contaIsabella.Depositar(3522.10);
			contaIsabella.Consultar_Saldo();
			contaIsabella.Saque(1325.40);
			contaIsabella.Consultar_Saldo();
			System.out.println("---------------------");
			contaPamela.Transferir(contaIsabella, 1000);
			contaIsabella.Consultar_Saldo();
			contaPamela.Consultar_Saldo();
			System.out.println("---------------------");
			contaIsabella.Transferir(contaPamela, 1500);
			contaPamela.Consultar_Saldo();
			contaIsabella.Consultar_Saldo();
		}
	 
	}
