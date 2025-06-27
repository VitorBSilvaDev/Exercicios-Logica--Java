package faccat;

import java.util.Scanner;
public class Exemplo22 {
	public static void main (String [] args) {
		
		/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas)*/
		
		float salarioTotal;
		float horaExtra;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite quantas horas você trabalhou nesse mês:");
		float horasTrabalho = leitor.nextFloat();
		
		System.out.println("Digite seu salário por hora:");
		float salarioHora = leitor.nextFloat();
		
		
		if (horasTrabalho > 160) {
			horaExtra = horasTrabalho - 160;
			salarioTotal = salarioHora * horasTrabalho + ((horaExtra * salarioHora) * 50/100);
			System.out.println("Horas extra = " + horaExtra);
		} else {
			salarioTotal = salarioHora * horasTrabalho;
		}
		
		
		System.out.println("Salário total = " + salarioTotal);
		
		
		leitor.close();
			
	}
}
