//Fig. 4.9: Programa de média da turma com repetição controlada por sentinela
package exemples;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Average2 {

	public static void main(String[] args) {

		int gradeCounter,
			gradeValue,
			total;
		double average;
		String input;
		
		total = 0;
		gradeCounter = 0;
		
		input = JOptionPane.showInputDialog(
				"Enter Integer Grade, -1 to Quit:");
		
		gradeValue = Integer.parseInt( input );
		
		while ( gradeValue != -1 ) {
			
			total = total + gradeValue;
			
			gradeCounter = gradeCounter + 1;
			
			input = JOptionPane.showInputDialog(
					"Enter Integer Grade, -1 to Quit:");
			
			gradeValue = Integer.parseInt( input );
		}
		
		DecimalFormat twoDigits = new DecimalFormat( "0.00" );
		
		if ( gradeCounter != 0 ) {
			average = (double) total / gradeCounter;
			
			JOptionPane.showMessageDialog(null,
					"Class average is " + twoDigits.format( average ),
					"Class Average", JOptionPane.INFORMATION_MESSAGE);
		}
		else
			JOptionPane.showMessageDialog(null,
					"No grades were entered", "Class Average",
					JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
