package faccat;

import java.util.Scanner;
public class Exemplo33 {
	public static void main (String [] args) {
		
		/*Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro.*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int valor1 = leitor.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int valor2 = leitor.nextInt();
		
		
		String mensagem = valor1 == valor2 ? "Números iguais" : valor1 > valor2 ? "Primeiro é maior" : "Segundo é maior";
			
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
