package exemploConstrutor;

import java.util.Scanner;
public class Exemplo02 {
	int idade;
	String nome;
	public Exemplo02 (int idadeEscolhida, String nomeEscolhido){
		idade = idadeEscolhida;
		nome = nomeEscolhido;
	}
	public static void main (String [] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite uma idade:");
		int idadeDigitada = leitor.nextInt();
		leitor.nextLine();
		
		System.out.println("Digite um nome:");
		String nomeDigitado = leitor.nextLine();
		
		Exemplo02 ex2 = new Exemplo02(idadeDigitada, nomeDigitado);
		
		
		System.out.println(ex2.idade + " : " + ex2.nome);
		
		leitor.close();
	}
}
