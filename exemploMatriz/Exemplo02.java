package exemploMatriz;

public class Exemplo02 {
	public static void main (String [] args) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers.length);
		for (int linha = 0; linha < myNumbers.length; ++linha) {
			for (int coluna = 0; coluna < myNumbers[linha].length; ++coluna) {
				System.out.println(myNumbers[linha][coluna]);
			}
		}
	}
}
