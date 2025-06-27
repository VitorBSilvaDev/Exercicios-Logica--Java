package exemploVetor;

public class Exemplo05 {
	public static void main(String [] args) {
		int[] ages = {10, 20, 3, 24, 34, -1};
		
		int length 	= ages.length;
		
		int lowestAge = ages[0];
		
		for (int age : ages) {
			lowestAge = age < lowestAge ? age : lowestAge;
		}
		
		System.out.println("A menor idade no vetor de comprimento " + length + " é: " + lowestAge);
	}
}
