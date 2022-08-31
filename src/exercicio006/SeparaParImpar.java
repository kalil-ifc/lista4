package exercicio006;
import java.util.Scanner;

public class SeparaParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[]numeros=new int[20];
		System.out.println("Digite 20 números inteiros.");
		for (int i=0; i<numeros.length;i++) {
			System.out.printf("Número %d : ", i+1);
			numeros[i]=entrada.nextInt();
		}
		
		/**
		 * SEPARANDO OS PARES E IMPARES
		 */
		int[]pares=new int[numeros.length];
		int[]impares=new int[numeros.length];
		for (int i=0; i<numeros.length;i++) {
			if (numeros[i]%2==0) {
				pares[i]=numeros[i];
			} else {
				impares[i]=numeros[i];
			}
		}
		
		entrada.close();
		
		/**
		 * IMPRIMINDO OS TRÊS VETORES
		 */
		System.out.print("\nNúmeros digitados: ");
		for (int a:numeros) {
			System.out.printf("%d - ", a);
		}
		System.out.print("\nNúmeros pares: ");
		for (int b:pares) {
			if (b!=0) {
				System.out.printf("%d - ", b);
			}
		}
		System.out.print("\nNúmeros impares: ");
		for (int c:impares) {
			if (c!=0) {
				System.out.printf("%d - ", c);
			}
		}
	}

}
