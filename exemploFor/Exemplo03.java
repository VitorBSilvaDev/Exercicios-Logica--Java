package exemploFor;

public class Exemplo03 {
	public static void main (String [] args) {
		int minutos;
		int segundos;
		
		for(int horas = 0; horas < 3; horas++) {
			for(minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + ":" + minutos + ":" + segundos);
				}
				segundos = 0;
			}
			minutos = 0;
		}
	}
}
