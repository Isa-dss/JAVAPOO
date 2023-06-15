package aulas.aula1;

public class Aula1 {


	public static void main(String[] args) {
		
//		if 
//		if-else
//		if-else-if

//	Balança dos metais-> Considere 3 metais distintos: ouro, prata e bronze. Escreva num algoritmo para exibir o mais pesado.
// Fazer com if-else encadeado
		
//		meu jeito
		float ouro = 10, prata = 20, bronze = 30;
		
		if (ouro > prata ) {
			if (prata > bronze) {
				System.out.println("ouro " + ouro);
			}
		} else if (bronze > ouro) {
			if (bronze > prata) {
				System.out.println("bronze " + bronze);
			}
		}else if (prata > ouro) {
			if (prata > bronze) {
				System.out.println("prata " + prata);
			}
		}
		
//		Jeito do professor
		if (ouro > prata ) {
			if (ouro > bronze) {
				System.out.println("ouro é o mais pesado " + ouro);
			}else {
				System.out.println("o bronze é mais pesado" + bronze);
			}
		} else {
			if (prata > bronze) {
				System.out.println("prata é a mais pesada" + prata);
			}else {
				System.out.println("o bronze é mais pesado" + bronze);
			}
		}
			
		if (ouro > prata && ouro > bronze) {
				System.out.println("ouro é o mais pesado " + ouro);
		} else if (prata > bronze) {
				System.out.println("prata é a mais pesada" + prata);
			}else {
				System.out.println("o bronze é mais pesado" + bronze);
			}
		}

	
	}
 

