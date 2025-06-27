package manzano;

import java.util.Scanner;

public class Pag46ExK {
	public static void main(String[] args) {
		/*
		 * Elaborar um programa que possibilite calcular a área total de uma residência
		 * (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.).
		 * O programa deve solicitar a entrada do nome, a largura e o comprimento de um
		 * determinado cômodo. Em seguida, deve apresentar a área
		 */

		Scanner leitor = new Scanner(System.in);
		float area = 0;
		float somatorio = 0;
		int resposta = 1;

		while (resposta != 0) {
			System.out.println("Digite o nome do cômodo:");
			String comodo = leitor.nextLine();
			System.out.println("Digite a largura do cômodo:");
			float largura = leitor.nextFloat();
			System.out.println("Digite o comprimento do cômodo:");
			float comprimento = leitor.nextFloat();

			area = largura * comprimento;
			somatorio = somatorio + area;

			System.out.println("Quer continuar adicionando mas cômodos? Se não, digite '0':");
		    resposta = leitor.nextInt();
		}

		System.out.println("Somatório de área = " + somatorio);
		
		leitor.close();

	}
}
