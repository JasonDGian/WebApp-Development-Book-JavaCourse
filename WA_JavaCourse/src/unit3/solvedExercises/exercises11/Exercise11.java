package unit3.solvedExercises.exercises11;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		// Calculate the factorial number.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to calculate it's factorial value.");

		int num = sc.nextInt();
		int result = 1;

		for (int i = num; i > 0; i--) {

			result = result + (result * (num - i));

		}

		System.out.printf("!%d is %d", num, result);
		sc.close();
	}

}
