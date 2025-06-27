package exemploBreak;

public class Exemplo03 {
	public static void main (String [] args) {
		int i = -5;
		while (i < 10) {
			System.out.println(i);
			i++;
			if (i == 4) {
				break;
			}
		}
	}
}
