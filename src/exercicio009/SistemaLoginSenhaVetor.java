package exercicio009;
import java.util.Scanner;

public class SistemaLoginSenhaVetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char[]alfabeto= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String senha=""; int quantidade=0, auxiliar=0; boolean loop = true;
		while (loop) {
			System.out.println("Informe quantos dígitos pretende gerar a senha. Ex.: 10");
			System.out.print("Quantidade: ");
			quantidade=entrada.nextInt();
			if (quantidade < 26) {
				loop = false;
			} else {
				System.out.println("A senha não pode ter mais de 26 caracteres");
			}
		}
		
		for (int i=0; i<quantidade; i++) {
			auxiliar = (int) (Math.random()*alfabeto.length);	// https://www.guj.com.br/t/gerador-de-senha-alfanumerico/40241
			senha+=alfabeto[auxiliar];
		}
		
		System.out.println("Senha : "+senha);
	
	entrada.close();
	}

}
