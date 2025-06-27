package manzano;

import java.util.Scanner;
public class Pag46ExB {
	public static void main (String[] args) {
		
		/*Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100)*/
		
		int contador = 1;
		int acumulador = 0;
		Scanner leitor = new Scanner(System.in);
		
		while(contador < 100) {
			acumulador = contador + contador + 1;
			System.out.printf("%n%d + %d = %d%n ",contador, contador + 1, acumulador);
			contador++;
		}
		
		leitor.close();
	}
}
