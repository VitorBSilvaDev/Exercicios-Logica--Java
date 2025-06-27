package faccat;

import java.util.Scanner;
public class Exemplo02 {
	
	public static void main (String [] args) {
		Scanner escaneia = new Scanner(System.in);
		System.out.println("Operação soma.");
		System.out.println("Digite o segundo número::");
		int primeiroNumero = escaneia.nextInt(); //nextInt = "Next inteiro" que entrar
		System.out.println("Digite o segundo número:");
		int segundoNumero = escaneia.nextInt();
		
		int resultado = primeiroNumero + segundoNumero;
		
		System.out.println("O resultado da soma é = " + resultado);
		
		escaneia.close();
	}
}
