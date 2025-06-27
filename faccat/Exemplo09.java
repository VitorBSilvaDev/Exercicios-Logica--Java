package faccat;

import java.util.Scanner;
public class Exemplo09 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Cálculo de área retângulo");
		System.out.println("Digite o valor da base:");
		float valorBase = leitor.nextFloat();
		System.out.println("Digie o valor da altura:");
		float valorAltura = leitor.nextFloat();
		
		float resultado = valorBase * valorAltura;
		
		System.out.println("Resultado = " + resultado + "cm");
		
		leitor.close();
	}
}
