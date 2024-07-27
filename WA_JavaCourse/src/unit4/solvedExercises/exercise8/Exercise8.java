package unit4.solvedExercises.exercise8;

import java.util.Scanner;

/* Design the calculator() function that takes two real numbers (operands) 
 * and the operation to be performed on them. The available operations are 
 * addition, subtraction, multiplication, or division. These are specified 
 * by a number: 1 for addition, 2 for subtraction, etc. The function will 
 * return the result of the operation as a real number.
 */

public class Exercise8 {

	public static double calculator(double operand1, double operand2, int operation) {

		double result = 0;

		switch (operation) {

		case 1:
			result = operand1 + operand2;
			break;

		case 2:
			result = operand1 - operand2;
			break;

		case 3:
			result = operand1 * operand2;
			break;

		case 4:
			result = operand1 / operand2;
			break;

		default:
			System.out.println("ERROR: Invalid option.");
			break;

		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double ope1, ope2;
		int opt;

		System.out.println("Enter the first operand.");
		ope1 = sc.nextDouble();

		System.out.println("Enter the second operand.");
		ope2 = sc.nextDouble();

		System.out.println("Enter the desired operation.\n| 1 - Sum | 2- Subtract | 3 - Multiply | 4 - Divide |");
		opt = sc.nextInt();

		System.out.println("The result: " + calculator(ope1, ope2, opt));

		sc.close();
	}

}
