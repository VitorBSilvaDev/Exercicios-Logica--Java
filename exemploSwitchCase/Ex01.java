package exemploSwitchCase;

import java.util.Scanner;
public class Ex01 {
	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
		String mensagem = "";
		
		System.out.println("Digite um número:");
		int numero = leitor.nextInt();
		
		switch(numero) {
			case 1:
				mensagem = "Janeiro";
				break;
			case 2:
				mensagem = "Fevereiro";
				break;
			case 3:
				mensagem = "Março";
				break;
			case 4:
				mensagem = "Abril";
				break;
			case 5:
				mensagem = "Maio";
				break;
			case 6:
				mensagem = "Junho";
				break;
			case 7:
				mensagem = "Julho";
				break;
			case 8:
				mensagem = "Agosto";
				break;
			case 9:
				mensagem = "Setembro";
				break;
			case 10:
				mensagem = "Outubro";
				break;
			case 11:
				mensagem = "Novembro";
				break;
			case 12:
				mensagem = "Dezembro";
				break;
			default:
				mensagem = "Número inválido";
		}
		
		System.out.println(mensagem);
	}
}
