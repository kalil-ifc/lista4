package exercicio013;

import java.util.Scanner;

public class MisturaVetores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] vet1 = new int[20];
		int [] vet2 = new int[20];
		int [] vet3 = new int[20];
		
		
		/**
		 * PRIMEIRO VETOR
		 */
		
		for (int i = 0; i<10; i++) {
			vet1[i]=i+1;
			//System.out.println(vet1[i]);
		}
		
		/**
		 * SEGUNDO VETOR
		 */
		
		int j=11;
		for (int i = 0; i<10; i++) {
			vet2[i]=j++;
			//System.out.println(vet2[i]);
		}
		
		
		/**
		 * TERCEIRO VETOR (INTERCALANDO...)
		 */
		
		int x=0, y=0;
		for (int i = 0; i<20; i++) {
			x++;
			if (x<10) {
				if (i%2==0)
					vet3[i]=vet1[x];
				else
					vet3[i]=vet2[x];
			} else {
				y++;
				if (i%2==0)
					vet3[i]=vet1[y];
				else
					vet3[i]=vet2[y];
			}			
						
		}
		
		
		/**
		 * IMPRIMINDO
		 */
		
		for (int i = 0; i<20; i++) {
			
			System.out.print(" "+vet3[i]);
		}
		
		
		entrada.close();
	}

}
