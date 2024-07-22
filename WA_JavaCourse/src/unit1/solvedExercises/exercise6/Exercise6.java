package unit1.solvedExercises.exercise6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// Calculate the arithmetic median.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a value: ");
		int val1 = sc.nextInt();

		System.out.println("Enter the another value: ");
		int val2 = sc.nextInt();
		
		float median = (float)(val1+val2)/2;
		
		System.out.printf("The median is: %.2f", median);
		
		sc.close();
		
	}

}
