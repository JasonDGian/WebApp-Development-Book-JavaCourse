package unit4.solvedExercises.exercise4;

import java.util.Scanner;

//Write a function that receives two integers as parameters and returns the maximum of both.

public class Exercise4 {

	public static int returnMax(int a, int b) {

//		int max = b;
//
//		if (a > b) {
//			max = a;
//		}
//
//		return max;

		// Improved version.
		return (a > b) ? a : b;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers to find the greater number.");

		System.out.println("Enter the first number.");
		int a = sc.nextInt();

		System.out.println("Enter the second number.");
		int b = sc.nextInt();

		// The function does not print the result, it returns it, so we print it
		// ourselves.
		System.out.println(returnMax(a, b));
		
		sc.close();

	}

}
