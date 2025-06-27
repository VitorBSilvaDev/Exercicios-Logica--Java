package faccat;

import java.util.Scanner;
public class Exemplo32 {
	public static void main (String [] args) {
		
		/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do time 1:");
		String time1 = leitor.nextLine();
		
		System.out.println("Digite a quantidade de gols de " + time1);
		int golsTime1 = leitor.nextInt();
		
		leitor.nextLine();
		
		System.out.println("Digite o nome do time 2:");
		String time2 = leitor.nextLine();
		
		System.out.println("Digite a quantidade de gols de " + time2);
		int golsTime2 = leitor.nextInt();
		
		String mensagem = golsTime1 == golsTime2 ? "Empate" : golsTime1 > golsTime2 ? time1 + " vencedor" : time2 + " vencedor";
			
		System.out.println(mensagem);
		
		leitor.close();
			
	}
}
