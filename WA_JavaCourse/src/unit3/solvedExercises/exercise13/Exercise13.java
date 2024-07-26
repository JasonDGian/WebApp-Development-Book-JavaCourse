package unit3.solvedExercises.exercise13;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int passed = 0, failed = 0, needAssistance = 0;
		int grade;

		for (int i = 0; i < 6; i++) {

			System.out.println("Enter the student's grade.");
			grade = sc.nextInt();

			if (grade < 4) {
				failed++;
			} else if (grade == 4) {
				needAssistance++;
			} else if (grade >= 5) {
				passed++;
			}

		}

		System.out.printf("There are %d failing students.\n", failed);
		System.out.printf("There are %d students in need of assistance.\n", needAssistance);
		System.out.printf("There are %d passed students.", passed);

		sc.close();
	}

}
