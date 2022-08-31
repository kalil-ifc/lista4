package exercicio014;

import java.util.Scanner;

public class AlturaDeAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/**
		 * DECLARADANDO O VETOR
		 */
		float [] altura = new float[30];
		int [] idade = new int[30];
		
		/**
		 * POPULANDO O VETOR
		 */
		
		for (int i=0; i<30; i++) {
			System.out.printf("Altura do aluno %d: ", i+1);
			altura[i] = entrada.nextFloat();
			System.out.printf("Idade do aluno %d: ", i+1);
			idade[i] = entrada.nextInt();
		}
		
		/**
		 * CALCULANDO A MÉDIA DE ALTURA
		 */
		float media=0;
		for (int i=0; i<30; i++) {
			media=media+altura[i];
		}
		media=media/30;
		
		/**
		 * VERIFICAR ALUNOS DE 13 ANOS ABAIXO DA MÉDIA
		 */
		int contador = 0;
		for (int i=0; i<30; i++) {
			if (altura[i]<media && idade[i]==13)
				contador++;
		}
		
		/**
		 * RELATÓRIO FINAL
		 */
		System.out.println("Há "+contador+" alunos com 13 anos abaixo da média de altura da turma");
		
		entrada.close();
	}

}
