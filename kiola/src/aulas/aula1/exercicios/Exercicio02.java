package aulas.aula1.exercicios;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
		
		if (idade < 16) {
			 JOptionPane.showMessageDialog(null, "Voce nao pode votar e nem embarcar");
			 
		} else if (idade >= 16 && idade < 18 || idade >70) {
			JOptionPane.showInputDialog("Voce tem a opcao de votar, qual sera a sua resposta?");
//			 JOptionPane.showMessageDialog(null, "Voce tem a opcao de votar");

		}else {
			 JOptionPane.showMessageDialog(null, "Voce deve votar!");

		}

	}

}

