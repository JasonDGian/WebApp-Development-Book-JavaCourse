package unit2.solvedExercises.exercise7;

import java.util.Scanner;

public class Exercise7v2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer number:");
		int a = sc.nextInt();

		System.out.println("Enter another integer number:");
		int b = sc.nextInt();

		System.out.println("Enter the last integer number:");
		int c = sc.nextInt();

		if (a > b && a > c) {

			if (b > c) {
				System.out.println("The order is: " + a + b + c);
			}

			else {
				System.out.println("The order is: " + a + c + b);
			}

		}

		if (b > a && b > c) {

			if (a > c) {
				System.out.println("The order is: " + b + a + c);
			}

			else {
				System.out.println("The order is: " + b + c + a);
			}

		}

		if (c > a && c > b) {

			if (a > b) {
				System.out.println("The order is: " + c + a + b);
			}

			else {
				System.out.println("The order is: " + c + b + a);
			}

		}

		sc.close();

		// This can certainly be optimized using else and else-if more efficiently.

	}

}
