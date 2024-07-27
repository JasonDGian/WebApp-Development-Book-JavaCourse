package unit4.solvedExercises.exercise2;

import java.util.Scanner;

//Write a function that takes two integers and displays all the numbers between them.

public class Exercise2 {

	public static void numbersBetween(int n, int m) {

		int start = 0, end = 0;

		// Is the parameters are passed out of order, reorder them by magnitude.
		if (n > m) {
			start = m;
			end = n;
		} else {
			start = n;
			end = m;
		}

		// i = start+1 because we are excluding the start and end values to show only
		// what is in between them.
		for (int i = (start + 1); i < end; i++) {

			System.out.println(i);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to start from:");
		int start = sc.nextInt();

		System.out.println("Enter a number to end on:");
		int end = sc.nextInt();

		System.out.printf("Between %d and %d the numbers are:\n", start, end);
		numbersBetween(start, end);

		sc.close();

	}

}
