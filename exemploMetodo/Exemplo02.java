package exemploMetodo;

public class Exemplo02 {
	static void dadosProfessor(String primeiroNome, int age) {
		System.out.println(primeiroNome + " tem " + age + " anos");
	}
	public static void main (String [] args) {
		dadosProfessor("Jailson", 80-40);
		dadosProfessor("Julio", 51);
		dadosProfessor("Aurora", 30);
	}
}
