package unit1.solvedExercises.exercise7;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		// Calculate the length and the area of a circle. Ask for the radius.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius of the cricumference ");
		double radius = sc.nextFloat();

		// Formula for area. > A = Pi+R^2

		// Must be changed to double from float because Pi is double type.
		double area = Math.PI * Math.pow(radius, 2);

		// Formula for the perimeter. C = 2*Pi*R

		double perimeter = (Math.PI * 2) * radius;

		System.out.printf("The area of the entered circumference is %.2f \n", area);
		System.out.printf("The perimeter of the entered circumference is %.2f \n", perimeter);

		sc.close();

	}

}
