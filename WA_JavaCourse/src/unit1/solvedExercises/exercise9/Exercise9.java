package unit1.solvedExercises.exercise9;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		boolean isEven = num % 2 == 0;

		System.out.println("The entered number is even: " + isEven);

		sc.close();

	}

}
