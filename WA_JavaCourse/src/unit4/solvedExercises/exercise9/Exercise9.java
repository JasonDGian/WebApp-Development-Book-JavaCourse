package unit4.solvedExercises.exercise9;

import java.util.Scanner;

public class Exercise9 {

	// Original from the exercise 4
	public static int returnMax(int a, int b) {
		return (a > b) ? a : b;

	}

	// Overriding with 3 parameters.
	public static int returnMax(int a, int b, int c) {

//		int aux = returnMax(a, b );		
//		return returnMax(aux, c); 

		// Alternative single line solution..
		return returnMax(returnMax(a, b), c);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first operand.");
		int a = sc.nextInt();

		System.out.println("Enter the first operand.");
		int b = sc.nextInt();

		System.out.println("Enter the first operand.");
		int c = sc.nextInt();

		System.out.println(returnMax(a, b, c));

		sc.close();

	}

}
