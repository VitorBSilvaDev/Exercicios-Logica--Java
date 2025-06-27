package faccat;

import java.util.Scanner;
public class Exemplo24 {
	public static void main (String [] args) {
		
		/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.*/
		
		float salarioTotal;
		float comissao = 3.0f / 100.0f;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu salário fixo:");
		float salarioFixo = leitor.nextFloat();
		
		System.out.println("Digite o valor total das vendas:");
		float totalVenda = leitor.nextFloat();
		
		
		salarioTotal = totalVenda > 1499.0 ? salarioFixo + totalVenda + (totalVenda * comissao) : salarioFixo + totalVenda;
		
		System.out.println("Salário total = " + salarioTotal);
		
		
		leitor.close();
			
	}
}
