package manzano;

import java.util.Scanner;
public class Pag46ExI {
	
	/*Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do
somatório e a média aritmética dos valores lidos.*/
	public static void main (String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		int contador = 1;
		float somatorio = 0;
		
		while(contador < 3) {
			System.out.println("Digite um número:");
			float numero = leitor.nextFloat();
			somatorio = somatorio + numero;
			contador++;
		}
		
		contador = contador - 1;
		
		float mediaSimples = somatorio / contador;
		
		System.out.println("Total = " + somatorio);
		System.out.println("Quantidade de números inseridos = " + contador);
		System.out.println("Média simples = " + mediaSimples);
		
		leitor.close();
	}
}
