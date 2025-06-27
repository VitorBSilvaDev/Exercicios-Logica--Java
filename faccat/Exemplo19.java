package faccat;

import java.util.Scanner;
public class Exemplo19 {
	public static void main (String [] args) {
		
		String mensagem;
		
		/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		float valor1 = leitor.nextFloat();
		
		System.out.println("Digite o segundo valor:");
		float valor2 = leitor.nextFloat();
		
		if (valor1 > valor2) {
			mensagem = (valor1 % 1 == 0 ) ? ((int)valor1 + " é o maior") : (valor1 + " é o maior");
		} else {
			mensagem = (valor2 % 1 == 0 ) ? ((int)valor2 + " é o maior") : (valor2 + " é o maior");
		}
		
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
