package unit2.solvedExercises.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number:");
		int number1 = sc.nextInt();

		System.out.println("Enter another integer number:");
		int number2 = sc.nextInt();

		if (number1 == number2) {
			System.out.println("The numbers are equal.");
		} else {
			System.out.println("The numbers are not equal.");

		}
		
		sc.close();

	}

}
