package faccat;

import java.util.Scanner;
public class Exemplo16 {
	public static void main(String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número de maçãs compradas");
		int macasCompradas = leitor.nextInt();
		
		double valorMaca = macasCompradas < 12 ? 1.30 : 1.00;
		
		double
		resultado = valorMaca * macasCompradas;
		
		System.out.println("Quantidade da maçã = " + macasCompradas);
		System.out.println("Valor da maçã = " + valorMaca);
		System.out.println("Resultado = " + resultado);
		
		leitor.close();
	}
}
