package faccat;

import java.util.Scanner;
public class Exemplo30 {
	public static void main (String [] args) {
		
		/*Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int valor2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro:");
		int valor3 = leitor.nextInt();
		
		int menorValor = Math.min(valor1, Math.min(valor2, valor3)); // Math.min compara dois valores e retorna o menor
		
		int maiorValor = Math.max(valor1, Math.max(valor2, valor3));
		
		int meio = valor1 + valor2 + valor3 - menorValor - maiorValor;
			
		System.out.printf("\n%d \n %d \n %d\n",menorValor,meio,maiorValor);
		
		leitor.close();
			
	}
}
