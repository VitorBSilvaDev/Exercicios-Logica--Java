package exemploConstrutor;

public class Exemplo01 {
	int x;
	public Exemplo01 () {
		x = 5;	
	}
	public static void main (String [] args) {
		Exemplo01 ex1 = new Exemplo01();
		
		System.out.println(ex1.x);
	}
}
