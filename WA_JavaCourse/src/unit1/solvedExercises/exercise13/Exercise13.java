package unit1.solvedExercises.exercise13;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int grade1, grade2, grade3;

		System.out.println("Enter the grades for the first trimester.");
		grade1 = sc.nextInt();

		System.out.println("Enter the grades for the second trimester.");
		grade2 = sc.nextInt();

		System.out.println("Enter the grades for the third trimester.");
		grade3 = sc.nextInt();

		double gradeDouble = (grade1 + grade2 + grade3) / 3.0;
		int gradeInt = (int) gradeDouble;

		System.out.printf("For reports the grade is %d.\n", gradeInt);

		System.out.printf("For grade  the grade is %.2f.\n", gradeDouble);

		sc.close();
	}

}
