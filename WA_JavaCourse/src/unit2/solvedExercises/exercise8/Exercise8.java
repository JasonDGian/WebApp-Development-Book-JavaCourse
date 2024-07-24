package unit2.solvedExercises.exercise8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		// Coefficients for the equation..
		double a, b, c;

		Scanner sc = new Scanner(System.in);

		// x = (-b ± sqrt(b^2 - 4*a*c)) / (2*a) -> Derives in two possible results.

		System.out.println("Enter an integer number for the 'a' coefficient:");
		a = sc.nextInt();

		System.out.println("Enter an integer number for the 'b' coefficient:");
		b = sc.nextInt();

		System.out.println("Enter an integer number for the 'c' coefficient:");
		c = sc.nextInt();

		double discriminant = (b * b) - (4 * a * c);
		if (discriminant > 0) {
			double radical = Math.sqrt(discriminant);
			double sum = (-1 * b) + radical;
			double subtraction = (-1 * b) - radical;
			double resultSum = sum / (2 * a);
			double resultSubt = subtraction / (2 * a);

			System.out.println("The solution with addition: " + resultSum);
			System.out.println("The solution with subtraction: " + resultSubt);
		} else {
			System.out.println("[ATTENTION!]\nEquation impossible. Radicand is negative.");
		}

		sc.close();

	}

}
