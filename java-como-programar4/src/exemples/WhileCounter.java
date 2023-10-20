//Fig. 5.1: Repetição por contador
package exemples;

import java.awt.Graphics;

import javax.swing.JFrame;

public class WhileCounter extends JFrame {

	public static void main(String[] args) {

		new WhileCounter();

	}

	public WhileCounter() {
		setSize(600, 535);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g) {

		int counter = 1;

		while (counter <= 10) {
			g.drawLine(10, 50, 400, counter * 50);
			++counter;
		}
	}

}
