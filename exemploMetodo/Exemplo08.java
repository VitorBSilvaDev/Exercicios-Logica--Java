package exemploMetodo;

public class Exemplo08 {
	public static void main (String [] args) {
		int resultado = soma(10);
		System.out.println(resultado);
	}
	public static int soma (int k) {
		if (k > 0) {
			return k + soma(k - 1);
			// soma(10) : 10 - 9
			// soma(9) : 9 - 8
		} else {	
			return 0;
		}
	}
}
