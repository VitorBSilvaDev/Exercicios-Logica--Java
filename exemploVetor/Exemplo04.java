package exemploVetor;

public class Exemplo04 {
	public static void main (String [] args) {
		int ages[] = {10, 20, 10};
		
		float avg, sum = 0;
		
		int length = ages.length;
		
		for (int age : ages) {
			System.out.println(age);
			sum += age;
		}
		
		avg = sum / length;
		
		System.out.println(sum + " divido por " + length + " = " + avg);
	}
}
