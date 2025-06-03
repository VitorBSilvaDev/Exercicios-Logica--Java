package exemplos;

import java.util.Scanner;
public class SwitchCase {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("1) Domingo");
		System.out.println("2) Segunda-feira");
		System.out.println("3) Terça-feira");
		System.out.println("4) Quarta-feira");
		System.out.println("5) Quinta-feira");
		System.out.println("6) Sexta-feira");
		System.out.println("7) Sábado-feira");
		
		int escolha = leitor.nextInt();		
		switch(escolha) {
		case 1:
			System.out.println("Hoje é segunda");
		}

	}
}
