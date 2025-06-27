package exemploMatriz;

public class Exemplo01 {
	public static void main (String [] args) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		myNumbers[0][1] = 2;
		System.out.println(myNumbers[0][1]);
	}
}
