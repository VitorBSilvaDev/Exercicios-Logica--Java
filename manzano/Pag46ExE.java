package manzano;

public class Pag46ExE {
	/*
	  Apresentar os resultados das potências de 3, variando do expoente 0 até o
	  expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e
	  elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado
	  o operador de exponenciação do portuguol (^).
	 */

	public static void main(String[] args) {
		int base = 3;
		int resultado = base;
		int expoente = 0;

		while (expoente <= 15) {
			if (expoente == 0) {
				resultado = 1;
			} else if (expoente == 1) {
				resultado = base;
			} else {
				resultado = resultado * base;
			}
			System.out.printf("%n%d elevado a %d = %d", base, expoente, resultado);
			expoente++;
		}
	}
}
