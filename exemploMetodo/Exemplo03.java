package exemploMetodo;

public class Exemplo03 {
	static void checarIdade(int idade) {
		if (idade < 18) {
			System.out.println("Acesso negado");
		} else {
			System.out.println("Acesso permitido");
		}
	}
	public static void main (String [] args) {
		checarIdade(17);
		checarIdade(18);
	}
}
