package faccat;

import java.util.Scanner;

public class Exemplo04 {

	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Operação multiplicação");
		System.out.println("Digite o primeiro valor:");
		int primeiroValor = leitor.nextInt();
		System.out.println("Digite o segundo valor:");
		int segundoValor = leitor.nextInt();
		
		int resultado = primeiroValor * segundoValor;
		
		System.out.println("Resultado = " + resultado);
		
		leitor.close();
	}
}
