package aulas.aula1.exercicios;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double doacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doacao:")); //Joption cria uma caixa de dialogo
		 double investimento;
		 
//		 Scanner sc = new Scanner (System.in);
//		 
//		 System.out.println("Digite o valor da doacao:");
//		 doacao = sc.nextFloat();
		 
		 if (doacao < 1000) {
			 investimento = doacao * 0.05;
		 }else {
			 investimento = doacao * 0.15;
		 }
		 JOptionPane.showMessageDialog(null, "Foram doados " + doacao + " e o investimento sera " + investimento); // aparece uma box como o warning na tela
//		System.out.printf("Para o valor %.2f de doacao o valor do investimento e: %.2f ", doacao, investimento);
		
//		sc.close();
	}

}

