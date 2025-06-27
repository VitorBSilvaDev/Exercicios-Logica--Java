package manzano;

import java.util.Scanner;
public class Pag46Exl {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		int numeroDigitado;
		int maiorNumero;
		int menorNumero;
		int resposta = 1;
		
		System.out.println("Digite um número positivo:");
		numeroDigitado = leitor.nextInt();
		
		maiorNumero = numeroDigitado;
		menorNumero = numeroDigitado;
		
		if (numeroDigitado > 0) {
			while (resposta > 0) {
				System.out.println("Digite outro número:");
				numeroDigitado = leitor.nextInt();
				if (numeroDigitado > maiorNumero) {
					maiorNumero = numeroDigitado;
				}
				if (numeroDigitado < menorNumero) {
					menorNumero = numeroDigitado;
				}
				System.out.println("Digite número negativo para sair ou positivo para continuar:");
				resposta = leitor.nextInt();
			}
		}
		
		System.out.println("Maior número = " + maiorNumero);
		System.out.println("Menor número = " + menorNumero);

		leitor.close();
	}
}
