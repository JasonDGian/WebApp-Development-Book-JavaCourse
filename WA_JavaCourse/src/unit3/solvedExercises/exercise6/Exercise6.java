package unit3.solvedExercises.exercise6;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number. The programme will count from 0 to said number.");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {

			System.out.println(i);

		}
		
		sc.close();

	}

}
