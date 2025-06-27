package faccat;

import java.util.Scanner;
public class Exemplo11 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Cálculo de área círculo");
		System.out.println("Digte o valor do raio:");
		float valorRaio = leitor.nextFloat();
		
		double resultado = valorRaio * valorRaio * Math.PI;
		
		System.out.printf("Resultado = %.2f%n", resultado);
		
		leitor.close();
	}
 }
