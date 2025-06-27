package manzano;

public class Pag50exB {
	public static void main(String[] args) {
		/*
		 * Elaborar um programa que apresente no final o somatório dos valores pares
		 * existentes na faixa de 1 até 500
		 */
		
		int contador = 1;
		int somatorio = 0;
		
		do {
			if (contador % 2 == 0) {
				System.out.println("Número encontrado = " + contador);
				somatorio = contador + somatorio;
			}
			contador++;
		} while(contador < 501);
		
		System.out.println("Somatório = " + somatorio);
	}
}
