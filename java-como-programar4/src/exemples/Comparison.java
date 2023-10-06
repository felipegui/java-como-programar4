//Fig. 2.20: Compara inteiros utilizando instruções if, operadores
//relacionais e operadores de igualdade

package exemples;

import javax.swing.JOptionPane;

public class Comparison {

	public static void main(String[] args) {
		
		String firstNumber, secondNumber, result;
		int number1, number2;
		
		firstNumber = JOptionPane.showInputDialog( "Enter first integer:" );

		secondNumber = JOptionPane.showInputDialog( "Enter second integer:" );
		
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		result = "";
		
		if ( number1 == number2 )
			result = result + number1 + " == " + number2;
		
		if ( number1 != number2 )
			result = result + number1 + " != " + number2;
		
		if ( number1 < number2 )
			result = result + "\n" + number1 + " < " + number2;
		
		if ( number1 > number2 )
			result = result + "\n" + number1 + " > " + number2;
		
		if ( number1 <= number2 )
			result = result + "\n" + number1 + " <= " + number2;
		
		if ( number1 >= number2 )
			result = result + "\n" + number1 + " >= " + number2;
		
		JOptionPane.showMessageDialog(null, result, "Comparison Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);

	}

}
