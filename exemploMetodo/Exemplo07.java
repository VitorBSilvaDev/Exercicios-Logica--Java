package exemploMetodo;

public class Exemplo07 {
	static int calcularSoma(int x, int y) {
		return x + y;
	}
	static double calcularSoma (double x, double y) {
		return x + y;
	}
	public static void main (String [] args) {
		int exemplo1 = calcularSoma(2,3);
		System.out.println("Tipo int = " + exemplo1);
		double exemplo2 = calcularSoma(2.5, 3);
		System.out.println("Tipo double = " + exemplo2);
	}
}
