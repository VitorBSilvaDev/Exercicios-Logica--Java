package faccat;

import java.util.Scanner;

public class Exemplo07 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Numero antecessor");
		System.out.println("Digite um número");
		int numeroAntecessor = leitor.nextInt();
		
		numeroAntecessor = numeroAntecessor - 1;
		
		System.out.println(numeroAntecessor);
		leitor.close();
	}
}
