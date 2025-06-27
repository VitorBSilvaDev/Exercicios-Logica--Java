package faccat;

import java.util.Scanner;

public class Exemplo06 {
	public static void main (String [] args) {
		/* Elaborar um programa que apresente o número sucessor e o antecessor do número presente*/
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Número sucessor:");
		int numeroSucessor = leitor.nextInt();
		
		numeroSucessor = numeroSucessor + 1;
		
		System.out.println("Número sucessor = " + numeroSucessor);
		
		leitor.close();
		}
	}

