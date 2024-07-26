package unit3.solvedExercises.exercise9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String error = "ERROR: Exceeded expected limits. Please try again.";
		String splitLine = "-".repeat(error.length());

		int num;

		do {
			
			System.out.println("Enter a number to print the miltiplication table.\nNumber must be between 1 and 10.");
			num = sc.nextInt();
			
		} while (num < 1 || num > 10);

		System.out.println(splitLine);

		for (int i = 0; i <= 10; i++) {

			System.out.printf("%d * %d = %d\n", num, i, (num * i));

		}

		System.out.println(splitLine);
		
		sc.close();
	}

}
