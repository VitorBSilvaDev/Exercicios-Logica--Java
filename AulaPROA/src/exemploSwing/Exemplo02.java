package exemploSwing;

import javax.swing.*;

public class Exemplo02 extends JFrame {// inheriting JFrame
	JFrame f;

	Exemplo02() {
		JButton b = new JButton("Clica");// create button
		b.setBounds(130, 100, 100, 40);
		add(b);// adding button on frame
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exemplo02();
	}
}