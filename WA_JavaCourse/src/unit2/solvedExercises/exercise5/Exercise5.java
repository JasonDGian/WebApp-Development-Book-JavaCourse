package unit2.solvedExercises.exercise5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number1 = sc.nextInt();

		System.out.println("Enter another number:");
		int number2 = sc.nextInt();

		/*
		if ( number1 > number2) {
			System.out.printf("%d is greater than %d", number1, number2);
		}
		else if ( number1 < number2 ) {
			System.out.printf("%d is greater than %d", number2, number1);
		}
		
		else {
			System.out.printf("%d is equal to %d", number1, number2);
		}
		*/

		// Using ternary operator.
		boolean isEqual = number1 == number2;
		int greater = number1 > number2 ? number1 : number2;
		int lesser = number1 < number2 ? number1 : number2;

		if (!isEqual) {
			System.out.printf("%d is greater than %d", greater, lesser);
		} else {
			System.out.println("Numbers are equal.");
		}

		sc.close();

	}

}
