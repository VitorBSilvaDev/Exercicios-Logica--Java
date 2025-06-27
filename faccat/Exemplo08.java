package faccat;

import java.util.Scanner;
public class Exemplo08 {
	public static void main (String [] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Cálculo de área quadrado");
		System.out.println("Digite o valor do lado");
		float valorLado = leitor.nextFloat();
		
		float resultado = valorLado * valorLado;
		
		System.out.println("Resultado = " + resultado + "cm");
		leitor.close();
	}
}
