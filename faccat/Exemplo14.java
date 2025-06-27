package faccat;

import java.util.Scanner;
public class Exemplo14 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numeroDigitado = leitor.nextInt();
		
		String mensagem = numeroDigitado == 10 ? "Número igual a 10" : numeroDigitado < 10 ?
				"Número menor que 10" : "Número maior que 10";
		
		System.out.println(mensagem);
		leitor.close();
		}

}
