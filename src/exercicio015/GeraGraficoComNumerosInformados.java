package exercicio015;

import java.util.Scanner;

public class GeraGraficoComNumerosInformados {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int TAM = 10;
		
		/**
		 * USUÁRIO DEFINE VALORES A SEREM VALIDADOS
		 */
		int [] vetor = new int[TAM];
		System.out.printf("Informe %d valores entre 0 e 20 para serem validados", TAM);
		System.out.println(" ");
		for (int i=0; i<TAM; i++) {
			System.out.printf("Valor %d: ", i+1, "\n");
			vetor[i] = entrada.nextInt();
			while (vetor[i]<0 || vetor[i]>20) {
				System.out.print("ERRO. Digite novamente! : ");
				vetor[i] = entrada.nextInt();
			}
		}
		
		/**
		 * IMPRIME UM GRÁFICO COM OS NÚMEROS INFORMADOS
		 */
		System.out.println(" ");
		for (int i=0; i<TAM; i++) {
			if (vetor[i] ==0)
				System.out.println("0 : ");
			if (vetor[i] ==1)
				System.out.println("1 : #");
			if (vetor[i] ==2)
				System.out.println("2 : ##");
			if (vetor[i] ==3)
				System.out.println("3 : ###");
			if (vetor[i] ==4)
				System.out.println("4 : ####");
			if (vetor[i] ==5)
				System.out.println("5 : #####");
			if (vetor[i] ==6)
				System.out.println("6 : ######");
			if (vetor[i] ==7)
				System.out.println("7 : #######");
			if (vetor[i] ==8)
				System.out.println("8 : ########");
			if (vetor[i] ==9)
				System.out.println("9 : #########");
			if (vetor[i] ==10)
				System.out.println("10 : ##########");
			if (vetor[i] ==11)
				System.out.println("11 : ###########");
			if (vetor[i] ==12)
				System.out.println("12 : ############");
			if (vetor[i] ==13)
				System.out.println("13 : #############");
			if (vetor[i] ==14)
				System.out.println("14 : ##############");
			if (vetor[i] ==15)
				System.out.println("15 : ###############");
			if (vetor[i] ==16)
				System.out.println("16 : ################");
			if (vetor[i] ==17)
				System.out.println("17 : #################");
			if (vetor[i] ==18)
				System.out.println("18 : ##################");
			if (vetor[i] ==19)
				System.out.println("19 : ###################");
			if (vetor[i] ==20)
				System.out.println("20 : ####################");
		}
		
		entrada.close();

	}

}
