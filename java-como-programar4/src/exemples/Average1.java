//Fig. 4.7: Programa de media da turma com repetição controlada por contador
package exemples;

import javax.swing.JOptionPane;

public class Average1 {

	public static void main(String[] args) {

		int total, gradeCounter, gradeValue, average;
		String grade;
		
		total = 0;		
		gradeCounter = 1;
		
		while ( gradeCounter <= 10 ) {
			
			grade = JOptionPane.showInputDialog("Enter integer grade:");
			
			gradeValue = Integer.parseInt(grade);
			
			total += gradeValue;
			
			gradeCounter ++;
		}

		average = total / 10;
		
		JOptionPane.showMessageDialog(null, "Class average is " + average, "Class Average", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}

}
