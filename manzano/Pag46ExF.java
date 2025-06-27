package manzano;

import java.util.Scanner;
public class Pag46ExF {
	/*Elaborar um programa que apresente como resultado o valor de uma potência de uma base
	qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor
	do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do
	portuguol (^)
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int expoente = 0;
		
		System.out.println("Digite o valor da base:");
		int base = leitor.nextInt();
		
		System.out.println("Digite o valor do expoente:");
		int contador = leitor.nextInt();
		
		int resultado = base;

		while (expoente <= contador) {
			if (expoente == 0) {
				resultado = 1;
			} else if (expoente == 1) {
				resultado = base;
			} else {
				resultado = resultado * base;
			}
			System.out.printf("%n%d elevado a %d = %d", base, expoente, resultado);
			expoente++;
		}
		
		leitor.close();
	}
}
