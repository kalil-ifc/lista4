package exercicio001;

import java.util.Scanner;

public class LeMostraVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// DECLARANDO O VETOR
		int [] vetor = new int[6];

		// RECEBENDO OS NÚMEROS
		for (int i=1; i<=vetor.length-1;i++) {
			System.out.print("Número "+i+" : ");		
			vetor[i] = entrada.nextInt();
		}
		
		// MOSTRANDO OS NÚMEROS
		System.out.println("Os números digitados foram:");
		for (int i=1; i<=vetor.length-1; i++) {
			System.out.printf("Número"+i+" : "+vetor[i]+"\n");
		}
	
	entrada.close();
	}

}
