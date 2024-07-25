package unit3.solvedExercises.exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number;
		boolean isEven;
		boolean isPositive;

		do {
			// reset values.
			isEven = false;
			isPositive = false;

			System.out.println("-- Enter 0 to abort. --\nEnter an integer number: ");
			number = sc.nextInt();

			if (number % 2 == 0) {
				isEven = true;
			}

			if (number > 0) {
				isPositive = true;
			}

			System.out.println("The number is even: " + isEven);
			System.out.println("The number is positive: " + isPositive);
			System.out.println("The square of the number is : " + (number * number));

		} while (number != 0);

		sc.close();
	}
}
