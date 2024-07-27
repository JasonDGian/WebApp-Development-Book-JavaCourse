package unit4.solvedExercises.exercise1;

import java.util.Scanner;

// Create a function 'echo()' which will receive a parameter to determine how
// many times the word 'echo' is printed on screen.

public class Exercise1 {

	// Private because it shan't be called from another classes.
	// Static to access this function without creating an instance of the class.
	// Void because it returns nothing.
	private static void echo(int n) {

		for (int i = 0; i < n; i++) {
			System.out.println("Echo...");
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for echo prints:");
		echo(sc.nextInt());
		
		sc.close();

	}

}
