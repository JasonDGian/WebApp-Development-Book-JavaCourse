package unit5.solvedExercises.exercise3;

import java.util.Scanner;

// Write an application that asks the user how many numbers they want to input. 
// Then, input that amount of integers via keyboard and finally display them in 
// reverse order of entry.

public class Exercise3 {

	// This method prints the elements of the input array in reverse order
	private static void printArrayInverted(double[] intArray) {
		
		// Loop through the array starting from the first element
		for (int i = 0; i < intArray.length; i++) {
			
			// Calculate the index of the element to be printed in reverse order
			// Must keep in mind the length of the array is offset +1 from the index.
			int reverseIndex = (intArray.length - 1) - i;
			
			// Print the element at the reverse index
			System.out.println(intArray[reverseIndex]);
		}
	}

	public static void main(String[] args) {
		// Create a Scanner object to read input from the keyboard
		Scanner sc = new Scanner(System.in);

		// Prompt the user to specify how many numbers they want to enter
		System.out.println("How many numbers do you want to enter?");

		// Read the number of entries
		int arrayLength = sc.nextInt();

		// Create an array of doubles with the specified length
		double[] myDoubleArray = new double[arrayLength];

		// Loop to read the specified number of double values from the user
		for (int i = 0; i < myDoubleArray.length; i++) {

			// Prompt the user to enter a number
			System.out.println("Enter a number:");

			// Read and store the number in the array
			myDoubleArray[i] = sc.nextDouble();
		}

		// Display the numbers entered by the user in reverse order
		System.out.println("Entered numbers:");

		// Call a method to print the array in reverse order
		printArrayInverted(myDoubleArray);

		// Close the scanner to free up resources
		sc.close();
	}

}
