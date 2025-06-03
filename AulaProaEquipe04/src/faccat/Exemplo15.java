package faccat;

import java.util.Scanner;
public class Exemplo15 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numeroDigitado = leitor.nextInt();
		
		String mensagem = numeroDigitado < 0 ? "Número negativo" : "Número positivo";
		
		System.out.println(mensagem);
		
		leitor.close();
	}
}
