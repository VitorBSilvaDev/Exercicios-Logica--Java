package faccat;

import java.util.Scanner;
public class Exemplo25 {
	public static void main (String [] args) {
		
		/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/
		
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
