package manzano;

public class Pag46ExJ {
	public static void main(String[] args) {
		/*
		 * Elaborar um programa que apresente os resultados da soma e da média
		 * aritmética dos valores pares situados na faixa numérica de 50 a 70.
		 */
		
		int contador = 50;
		float somatorio = 0;
		
		while (contador <= 70) {
			if (contador % 2 == 0) {
				System.out.println(contador);
				somatorio = somatorio + contador;
			}
			contador++;
		}
		contador = contador - 1;	
		float media = somatorio / contador;
		
		System.out.println("Total = " + somatorio);
		System.out.println("Contador = " + contador);
		System.out.println("Média = " + media);
		
	}
}
