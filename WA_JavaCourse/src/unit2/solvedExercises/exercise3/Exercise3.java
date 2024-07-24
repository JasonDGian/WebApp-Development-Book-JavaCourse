package unit2.solvedExercises.exercise3;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number:");
		int number1 = sc.nextInt();

		System.out.println("Enter another integer number:");
		int number2 = sc.nextInt();

		if (number1 > number2) {
			System.out.println("The first number is greater than the second number.");
		}

		else if (number1 < number2) {
			System.out.println("The first number is lesser than the second number.");
		}

		else {
			System.out.println("The first number is equal to the second number.");
		}

		sc.close();

	}

}
