package manzano;

import java.util.Scanner;
public class Pag46ExG {
	
	/*Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de
Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza
pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo
valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo
é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc*/
	
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		int primeiroTermo = 1;
		int segundoTermo = 1;
		int proximoTermo = 1;
		int contador = 1;
		
		System.out.print(primeiroTermo + ", "); /* Exibe já o primeiro termo pois dentro do loop isso não seria possível. */
		
		while (contador < 5) {
			System.out.print(proximoTermo + ", "); // Próximo termo é exibido como o segundo termo de na primeira iteração.
			proximoTermo = primeiroTermo + segundoTermo; // Próximo termo recebe o primeiro + o segundo 
			segundoTermo = primeiroTermo; // Segundo termo armazena o valor do primeiro para que 2 + 1 seja possível na próxima iteração
			primeiroTermo = proximoTermo; // Primeiro termo recebe o resultado do proximo termo para que na próxima iteração 2 + 1 seja possível
			contador++;
		}
		
		leitor.close();
	}
}
