package manzano;

public class Pag46ExH {
	
	/*Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de
10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius*/
	public static void main (String [] args) {
		float grausCelsius = 10;
		float conversaoFahrenheit = 0;
		while(grausCelsius < 101) {
			conversaoFahrenheit = (9 * grausCelsius + 160) / 5;
			System.out.printf("%n%.2fº celsius = %.2fº fahrenheit",grausCelsius, conversaoFahrenheit);
			grausCelsius = grausCelsius + 10;
		}
		
	}
}
