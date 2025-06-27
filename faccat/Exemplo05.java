package faccat;

import java.util.Scanner;
public class Exemplo05 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		// Saida de dados
		System.out.println("Operação divisão");
		System.out.println("Digite o primeiro número:");
		int primeiroNum = leitura.nextInt();
		System.out.println("Digite o segundo número:");
		// Entrada de dados
		int segundoNum = leitura.nextInt();
		
		int resultado = primeiroNum / segundoNum;
		
		// Saida de dados
		System.out.println("Resultado = " + resultado);
		
		leitura.close();
	}
}
