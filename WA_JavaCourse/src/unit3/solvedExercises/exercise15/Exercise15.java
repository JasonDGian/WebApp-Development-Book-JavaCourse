package unit3.solvedExercises.exercise15;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rectangle side length: ");
		int num = sc.nextInt();
		int row = num;

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < row; j++) {

				System.out.print(" * ");

			}

			row--;

			System.out.println();

		}
		
		sc.close();

	}

}
