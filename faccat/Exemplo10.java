package faccat;

import java.util.Scanner;
public class Exemplo10 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Cálculo de área triângulo");
		System.out.println("Digite o valor da base:");
		float valorBase = leitor.nextFloat();
		System.out.println("Digite o valor da altura:");
		float valorAltura = leitor.nextFloat();
		
		float resultado = (valorAltura * valorBase) / 2;
		
		System.out.println("Resultado = " + resultado);
		
		leitor.close();
	}
}
