package unit5.solvedExercises.exercise2;

import java.util.Scanner;

//Design a program that asks the user to input 5 decimal numbers via keyboard. 
//Then, display the numbers in the same order they were entered.

public class Exercise2 {

	private static void printArray(double[] intArray) {

		for (int i = 0; i < intArray.length; i++) {

			System.out.println(intArray[i]);

		}

	}

	public static void main(String[] args) {

		double[] myDoubleArray = new double[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Enter a number;");
			myDoubleArray[i] = sc.nextDouble();

		}

		System.out.println("Entered numbers;");
		printArray(myDoubleArray);

		sc.close();

	}

}
