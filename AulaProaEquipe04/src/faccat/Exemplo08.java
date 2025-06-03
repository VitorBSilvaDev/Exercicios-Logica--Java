package faccat;

import java.util.Scanner;

public class Exemplo08 {
	public static void main(String[] args) {
		int totalVotosBrancos;
		int totalVotosNulos;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Cálculo de eleição");

		System.out.println("Digite o número total de eleitores:");
		int totalEleitores = leitor.nextInt();
		do {
			System.out.println("Digite o total de votos brancos:");
			totalVotosBrancos = leitor.nextInt();
			if (totalVotosBrancos > totalEleitores) {
				System.out.println("Número inválido");
			}
		} while (totalVotosBrancos > totalEleitores);
		
		do {
			System.out.println("Digite o total de votos nulos:");
			totalVotosNulos = leitor.nextInt();
			if (totalVotosNulos > totalEleitores - totalVotosBrancos) {
				System.out.println("Número inválido");
			}
		} while (totalVotosNulos > totalEleitores - totalVotosBrancos);

		int votosValidos = totalEleitores - totalVotosBrancos - totalVotosNulos;
		
		System.out.println("Total eleitores = " + totalEleitores);
		System.out.println("Total votos brancos = " + totalVotosBrancos);
		System.out.println("Total votos nulos = " + totalVotosNulos);
		System.out.println("Total votos válidos = " + votosValidos);
		
		leitor.close();

	}
}
