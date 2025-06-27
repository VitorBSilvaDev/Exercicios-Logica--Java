package manzano;

import java.math.BigInteger;

public class Pag50ExD {
	/*
	 * Elaborar um programa que efetue o cálculo e no final apresente o somatório do
	 * número de grãos de trigo que se pode obter num tabuleiro de xadrez,
	 * obedecendo à seguinte regra: colocar um grão de trigo no primeiro quadro e
	 * nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro quadro
	 * coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se
	 * 3 grãos), no terceiro quadro colocam-se 4 grãos (tendo neste momento 7
	 * grãos), no quarto colocam-se 8 grãos (tendo-se então 15 grãos) até atingir o
	 * sexagésimo quarto (64o) quadro. Utilize variáveis do tipo real como
	 * acumuladores.
	 */
	public static void main(String[] args) {
		
		// Somatorio e proximoQuadro, BigInteger
		
		BigInteger somatorio = BigInteger.ZERO; // Atribui o valor zero
		BigInteger proximoQuadro = BigInteger.ONE;
		BigInteger primeiroQuadro = BigInteger.ONE; // Atribui o valor 1
		BigInteger segundoQuadro = BigInteger.ONE;
		
		// int segundoQuadro;
		proximoQuadro = primeiroQuadro;
		int contador = 1;
		
		do {
			System.out.printf("%nQuadrante %dº = %d %n", contador, proximoQuadro);
			segundoQuadro = primeiroQuadro.multiply(BigInteger.valueOf(2));
			proximoQuadro = proximoQuadro.add(segundoQuadro);
			primeiroQuadro = segundoQuadro;
			somatorio = somatorio.add(proximoQuadro);
			contador++;
		} while (contador < 65);
		
	}	
}