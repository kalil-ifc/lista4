package exercicio007;
import java.util.Scanner;

public class SistemaNotasEscolaresVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[][]aluno = new double[5][11];
		double[]media = new double[11];
		double auxiliar=0; int k=0;
		for (int i=0; i<10;i++) {
			for (int j=0; j<4; j++) {
				System.out.printf("Nota %d do aluno %d : ", j+1, i+1);
				auxiliar+=aluno[j][i]=entrada.nextDouble();
				if (j==3) {
					k++;
					media[k]=auxiliar/4;
					auxiliar=0;					
				}
			}
		}
		
		/**
		 * CONTAR O NÚMERO DE ALUNOS ACIMA DA MÉDIA
		 */
		int contador=0;
		for (int i=0; i<10;i++) {
			if (media[i]>7) {
				contador++;
			}
		}
		
		entrada.close();
		
		/** 
		 * RELATORIO
		 */
		System.out.println("O número de alunos acima da média é "+contador);
		System.out.print("As médias registradas foram: ");
		for (double a:media) {
			System.out.print("- "+a);
		}
	}

}
