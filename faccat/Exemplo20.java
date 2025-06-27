package faccat;

import java.util.Scanner;
public class Exemplo20 {
	public static void main (String [] args) {
		
		float maior;
		float menor;
		
		/*Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		float valor1 = leitor.nextFloat();
		
		System.out.println("Digite o segundo valor:");
		float valor2 = leitor.nextFloat();
		
		if (valor1 > valor2) {	
			maior = valor1;
			menor = valor2;
		} else {
			maior = valor2;
			menor = valor1;
		}
		
		if (menor % 1 == 0 ) {
			System.out.println((int)menor);
		} else {
			System.out.println(menor);
		}
		
		if (maior % 1 == 0 ) {
			System.out.println((int)maior);
		} else {
			System.out.println(maior);
		}
		
		
		leitor.close();
			
	}
}
