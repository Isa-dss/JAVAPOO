package aulas.aula1.exercicios;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		int num = 0;

		
		for (num =0 ;num <= 100; num ++) {
			if (num >= 50 && num <= 75 ){
				continue;
		}
			System.out.println(num);
			
		}
	}

}
