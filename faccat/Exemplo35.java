package faccat;

import java.util.Scanner;
public class Exemplo35 {
	public static void main (String [] args) {
		
		/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
até 20 litros, desconto de 3% por litro
Álcool acima de 20 litros, desconto de 5% por litro
até 20 litros, desconto de 4% por litro
Gasolina acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/
		
		Scanner leitor = new Scanner(System.in);
		
		double valorPagar = 0;
		double precoGasolina = 3.30;
		double precoAlcool = 2.90;
		
		System.out.println("Digite o valor de litros vendidos:");
		int litros = leitor.nextInt();
		
		leitor.nextLine();
		
		System.out.println("Digite o tipo de combustível:");
		String combustivel = leitor.nextLine();
		
		if (combustivel.equalsIgnoreCase("A")) {
			valorPagar = litros <= 20 ? precoAlcool * litros - (precoAlcool * litros) * 0.03 : precoAlcool * litros - (precoAlcool * litros) * 0.05;
		} else if (combustivel.equalsIgnoreCase("G")) {
			valorPagar = litros <= 20 ? precoGasolina * litros - (precoGasolina * litros) * 0.04 : precoGasolina * litros - (precoGasolina * litros) * 0.06;
		} else {
			System.out.println("Valor inválido");
		}
		
		System.out.println("Valor a pagar = " + valorPagar);
		
		leitor.close();
			
	}
}
