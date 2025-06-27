package manzano;

public class Pag46ExC {
	/*Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
	1 até 500.*/
	
	public static void main (String[] args) {
		int contador = 1;
		int acumulador = 0;
		
		while (contador < 500) {
			if (contador % 2 == 0) {
				acumulador = acumulador + contador;
				System.out.printf("%n%d = %d",contador, acumulador);
			}
			contador++;
		}
	}
}
