package unit2.solvedExercises.exercises9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("METHOD 1");
		System.out.println("Enter an integer number between 0 and 99999");
		int number = sc.nextInt();
		int number2 = number;
		boolean done = false;

		int counter = 0;

		// Method 1.

		// Checking the number size.
		if (number >= 0 && number <= 99999) {

			while (!done) {

				if (number > 0) {
					number = number / 10;
					counter++;
				}

				else {
					done = true;
				}

			}

			System.out.printf("The entered number has %d digits.\n", counter);

		}
		// if number to big complain.
		else {
			System.out.printf("The entered number does not respect the imposed limits.\n");
		}

		// Method 2 (following the books indications)
		System.out.println("METHOD 2");

		// RESET COUNTER VARIABLE.
		counter = 0;

		if (number2 < 10) {
			counter = 1;
		} else if (number2 < 100) {
			counter = 2;
		} else if (number2 < 1000) {
			counter = 3;
		} else if (number2 < 10000) {
			counter = 4;
		} else if (number2 < 100000) {
			counter = 5;
		}

		System.out.printf("The entered number has %d digits.", counter);

		sc.close();

	}

}
