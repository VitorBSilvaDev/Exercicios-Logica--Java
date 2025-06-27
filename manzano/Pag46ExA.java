package manzano;

import java.util.Scanner;
public class Pag46ExA {
	public static void main (String[] args) {
		
		/*Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.*/
		
		int contador = 1;
		int resultado;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = leitor.nextInt();
		
		while(contador < 11) {
			resultado = numero * contador;
			System.out.printf("%n%d x %d = %d%n ",numero, contador, resultado);
			contador++;
		}
		
		leitor.close();
	}
}
