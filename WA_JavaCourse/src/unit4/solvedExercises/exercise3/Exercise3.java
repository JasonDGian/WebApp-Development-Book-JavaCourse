package unit4.solvedExercises.exercise3;

import java.util.Scanner;

/*
 * Create a function that calculates and displays the area or the volume of a 
 * cylinder as specified. To distinguish between the two cases, a number will
 * be passed as an option: 1 for the area or 2 for the volume. Additionally, 
 *  the function should be passed the radius of the base and the height.
 */
public class Exercise3 {

	public static void calculateAreaOrVolume(int option, double radius, double height) {

		if (option == 1) {

			// Calculate the area.
			// Formula reference -> area = 2Pi * radius * (height + radius)
			double area = (Math.PI * 2) * radius * (height + radius);
			System.out.println("AREA: " + area);
		} else if (option == 2) {

			// Calculate the volume.
			// Formula reference -> volume = Pi * radio^2 * height.
			double volume = Math.PI * Math.pow(radius, 2) * height;
			System.out.println("VOLUME: " + volume);

		}

		else {
			System.out.println("ERROR: Unexpected option value.");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the cilynder height:");
		double height = sc.nextDouble();

		System.out.println("Enter the cilynder radius:");
		double radius = sc.nextDouble();

		System.out.println("Select an option:\n 1- Area \t 2- Volume");
		int option = sc.nextInt();

		// Now we pass all the values to the function all.
		calculateAreaOrVolume(option, radius, height);

		sc.close();

	}

}
