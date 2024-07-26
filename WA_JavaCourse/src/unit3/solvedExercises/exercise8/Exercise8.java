package unit3.solvedExercises.exercise8;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("The programme will ask for 10 numbers to calculate the median.");
		int numSum = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Enter a number (" + i + "/10).");
			numSum = numSum + sc.nextInt();

		}

		double median = (double) numSum / 10;
		System.out.printf("The median is %.02f.", median);

		sc.close();

	}

}
