package exemploMetodo;

public class Exemplo06 {
	static int calculoSoma (int x, int y) {
		return x + y;
	}
	public static void main (String [] args) {
		int z = calculoSoma(5,3);
		System.out.println(z);
		z = calculoSoma(5,5);
		System.out.println(z);
	}
}
