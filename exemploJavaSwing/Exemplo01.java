package exemploJavaSwing;

import java.awt.*;    

//Exemplo AWT

public class Exemplo01 extends Frame {
	Exemplo01 (){
		
		Button b = new Button("Clique aqui");
		
		b.setBounds(30,100,80,30);
		
		add(b);
		
		setSize(300,300);
		
		setTitle("Esse é o exemplo básico AWT");
		
		setLayout(null);
		
		setVisible(true);
	}
	
	public static void main (String [] args) {
		Exemplo01 f = new Exemplo01();
	}
}
