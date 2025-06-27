package faccat;

import java.util.Scanner;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.*/

public class Exemplo12 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Cálculo de idade");
		
		System.out.println("Digite quantos anos você tem:");
		int anos = leitor.nextInt();
		System.out.println("Digite quantos meses se passaram desde seu último mêsversário:");
		int meses = leitor.nextInt();
		System.out.println("Digite em qual dia do mês você faz aniversário:");
		int dias = leitor.nextInt();
		
		int idadeEmDias = (365 * anos) + (30 * meses) + 30 - dias;
		
		System.out.println(anos + " anos em dias = " + idadeEmDias + " dias");
		
		leitor.close();
		
	}
}