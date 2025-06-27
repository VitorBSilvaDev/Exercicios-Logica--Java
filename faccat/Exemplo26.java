package faccat;

import java.util.Scanner;
public class Exemplo26 {
	public static void main (String [] args) {
		
		/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'..*/
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade mínima em estoque:");
		int qtMinEstoque = leitor.nextInt();
		
		System.out.println("Digite a quantidade máxima em estoque:");
		int qtMaxEstoque = leitor.nextInt();
		
		System.out.println("Digite a quantidade atual em estoque:");
		int qtAtualEstoque = leitor.nextInt();
		
		int qtMediaEstoque = (qtMaxEstoque + qtMinEstoque) / 2;
		
		System.out.println("Deve ter ao menos " + qtMediaEstoque + " em estoque");
		
		String mensagem = qtAtualEstoque < qtMediaEstoque ? "Efetuar compra" : "Não efetuar compra";
		
		System.out.println(mensagem);
		
		
		leitor.close();
			
	}
}
