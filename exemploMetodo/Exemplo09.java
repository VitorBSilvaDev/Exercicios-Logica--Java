package exemploMetodo;

import java.util.Scanner;
public class Exemplo09 {
	String nomePessoa;
	int idadePessoa;
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		Exemplo09 ex9 = new Exemplo09();
		
		ex9.nomePessoa = leitor.nextLine();
		ex9.idadePessoa = leitor.nextInt();
		
		System.out.println(ex9.nomePessoa + " : " + ex9.idadePessoa);
		
		leitor.close();
	}
}
