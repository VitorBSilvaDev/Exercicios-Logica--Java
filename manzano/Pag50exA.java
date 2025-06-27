package manzano;

public class Pag50exA {
	/*Apresentar os quadrados dos números inteiros de 15 a 200.*/
	public static void main (String [] args) {
		int contador = 15;
		
		do {
			System.out.println("Quadro " + contador + "º");
			contador++;
		} while (contador < 201);
	}
}
