package faccat;

import java.util.Scanner;
public class Exemplo31 {
	public static void main (String [] args) {
		
		/*Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados.*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor A:");
		int ladoA = leitor.nextInt();
		
		System.out.println("Digite o valor B:");
		int ladoB = leitor.nextInt();
		
		System.out.println("Digite o valor C:");
		int ladoC = leitor.nextInt();
		
		String mensagem = ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB ? "Não forma um triângulo" : "Forma um triângulo";
			
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
