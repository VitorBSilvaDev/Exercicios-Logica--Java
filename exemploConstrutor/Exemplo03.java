package exemploConstrutor;

public class Exemplo03 {
	int x;
	public Exemplo03(int x) {
		this.x = x;
	}
	
	public static void main (String [] args) {
		Exemplo03 ex3 = new Exemplo03(15);
		
		System.out.println(ex3.x);
	}
}
