package faccat;

import java.util.Scanner;
public class Exemplo27 {
	public static void main (String [] args) {
		
		/*Ler um valor e escrever se é positivo, negativo ou zero.*/
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valorDigitado = leitor.nextInt();
		
		String mensagem = valorDigitado < 0 ? " é negativo" : valorDigitado == 0 ? " é zero" : " é positivo";
		
		System.out.println(valorDigitado + mensagem);
		
		leitor.close();
			
	}
}
