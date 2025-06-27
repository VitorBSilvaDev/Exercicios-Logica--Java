package faccat;

import java.util.Scanner;

public class Exemplo03 {
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in); // System.in é um parâmetro que define o tipo de scanner
		System.out.println("Operação subtração");
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = leia.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = leia.nextInt();
		int resultado = primeiroNumero + segundoNumero;
		
		System.out.println("Resultado = " + resultado);
		
		leia.close();
	}
}
