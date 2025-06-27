package faccat;

import java.util.Scanner;
public class Exemplo18 {
	public static void main (String [] args) {
		
		/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu)*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ano atual:");
		int anoAtual = leitor.nextInt();
		
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = leitor.nextInt();
		
		int resultado = anoAtual - anoNascimento;
		
		System.out.println("Idade = " + resultado);
		
		String mensagem = resultado >= 16 ? "Pode votar" : "Não pode votar";
		
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
