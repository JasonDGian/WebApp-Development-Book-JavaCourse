package unit2.solvedExercises.exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// Examples of quasi-zero.
		// 0.99 0.1 -0.5 -0.123
		// NOTE: 0 is not a quasi-zero number, because is literally 0.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		double number = sc.nextDouble();

		// If the number is greater than -1 but lesser than 1 AND is NOT 0.
		if (number > -1 && number < 1 && number != 0) {

			System.out.println("The number is a quasi-zero number.");

		}

		else {
			System.out.println("The number is NOT a quasi-zero number.");
		}

		sc.close();
	}

}
