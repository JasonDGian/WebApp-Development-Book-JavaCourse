package unit1.solvedExercises.exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		// Scanner object.
		Scanner sc = new Scanner(System.in);
		
		// User prompt.
		System.out.println("Enter a number.");
		
		// Number integer variable.
		int number = sc.nextInt();
		
		// Return the user the number they entered.
		System.out.println("The number you entered is: " + number);
		
		sc.close(); // close scanner.

	}

}
