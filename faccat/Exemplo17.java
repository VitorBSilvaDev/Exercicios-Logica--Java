package faccat;

import java.util.Scanner;
public class Exemplo17 {
	public static void main (String [] args) {
		
		/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada.*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a nota 1:");
		float nota1 = leitor.nextFloat();
		
		System.out.println("Digite a nota 2:");
		float nota2 = leitor.nextFloat();
		
		float media = (nota1+nota2)/2;
		
		System.out.println("Media = " + media);
		
		String mensagem = media >= 6 ? "Aluno aprovado" : "Aluno reprovado";
		
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
