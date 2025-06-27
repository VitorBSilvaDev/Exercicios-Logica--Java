package faccat;

import java.util.Scanner;
public class Exemplo28 {
	public static void main (String [] args) {
		
		/*Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int valor2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro:");
		int valor3 = leitor.nextInt();
		
		int maior = valor1;
		
		if (valor2 > maior) {
			maior = valor2;
		}
		if (valor3 > maior) {
			maior = valor3;
		}
		
		System.out.println(maior + " é o maior");
		
		leitor.close();
			
	}
}
