package faccat;

import java.util.Scanner;
public class Exemplo21 {
	public static void main (String [] args) {
		
		/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.*/
		
		int horaTotal;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial do jogo de xadrez:");
		int horaInicial = leitor.nextInt();
		
		System.out.println("Digite a hora que final do jogo de xadrez:");
		int horaFinal = leitor.nextInt();
		
		horaTotal = horaFinal - horaInicial;
		
		if (horaTotal < 0) {
			horaTotal = horaTotal + 24;
		}
		
		System.out.println("Duração total do jogo de xadrez = " + horaTotal);
		
		
		leitor.close();
			
	}
}
