package unit4.solvedExercises.exercise11;

import java.util.Scanner;

/* 
 * Write a function that recursively calculates the greatest common 
 * divisor of two numbers.
 */

public class Exercise11 {

	// Using something called "Euclidian Algorithm".
	private static int greatestCommonDivider(int a, int b) {
		/*
		 * Tests: (270,160) -> 10 | (155,345) -> 5 | (12350,780) -> 130
		 */

		// Input check code block.
		if (b > a) {
			int aux = b;
			b = a;
			a = aux;
		}

		int res;
		// int q = a / b; -> Never used.
		int r = a % b;

		// Base case.
		if (r == 0) {
			return b;
		}

		else {
			// This call officialy moves variables around in the next iteration to achieve
			// the Euclidian Algorithm.
			res = greatestCommonDivider(b, r);
		}

		return res;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find it's GCD:");
		int num1 = sc.nextInt();

		System.out.println("Enter another number to find it's GCD:");
		int num2 = sc.nextInt();

		System.out.printf("The GCD for %d and %d is: %d", num1, num2, greatestCommonDivider(num1, num2));

		sc.close();
	}

}
