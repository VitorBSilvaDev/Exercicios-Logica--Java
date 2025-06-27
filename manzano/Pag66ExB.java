package manzano;

public class Pag66ExB {
	public static void main (String [] args) {
		int numeroMultiplicado = 2;
		int produto;
		
		for (int numeroMultiplicar = 1; numeroMultiplicar < 11; numeroMultiplicar++) {
			produto = numeroMultiplicado * numeroMultiplicar;
			System.out.printf("%d x %d = %d%n", numeroMultiplicado, numeroMultiplicar, produto);
		}
	}
}
