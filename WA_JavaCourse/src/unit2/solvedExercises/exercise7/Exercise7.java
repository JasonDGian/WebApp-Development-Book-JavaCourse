package unit2.solvedExercises.exercise7;

import java.util.Scanner;

/*
 * Must be improved. 
 * There are other ways, much better, to achieve the same results. 
 */

public class Exercise7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number:");
		int number1 = sc.nextInt();

		System.out.println("Enter another integer number:");
		int number2 = sc.nextInt();

		System.out.println("Enter the last integer number:");
		int number3 = sc.nextInt();

		// If number 1 is the greatest
		if (number1 > number2 && number1 > number3) {

			// Find out the second greatest.
			if (number2 > number3) {
				System.out.println("Order is: " + number1 + " " + number2 + " " + number3);
			}

			else {
				System.out.println("Order is: " + number1 + " " + number3 + " " + number2);
			}

		}

		// Here the number1 greatness has already been tested and failed.
		else if (number2 > number3) {

			if (number3 > number1) {
				System.out.println("Order is: " + number2 + " " + number3 + " " + number1);
			}

			else {
				System.out.println("Order is: " + number2 + " " + number1 + " " + number3);
			}

		}

		else {

			if (number2 > number1) {
				System.out.println("Order is: " + number3 + " " + number2 + " " + number1);
			}

			else {
				System.out.println("Order is: " + number3 + " " + number1 + " " + number3);
			}

		}

		sc.close();

	}

}
