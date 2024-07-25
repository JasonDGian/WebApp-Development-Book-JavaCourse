package unit3.solvedExercises.exercise4;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double tallestTreeHeight = 0;
		int tallestTreeID = 0;

		double treeHeight;
		int treeId = 0;
		boolean exit = false;

		// Required to use while instead of do-while.
		while (!exit) {

			System.out.println("Enter the height of the tree in CM");
			treeHeight = sc.nextDouble();

			if (treeHeight < 0) {
				System.out.println("Exiting programme.");
				exit = true;
			}

			else {
				treeId++;
				if (treeHeight > tallestTreeHeight) {
					tallestTreeHeight = treeHeight;
					tallestTreeID = treeId;
				}
			}

		}

		System.out.printf("The tallest tree ID is %d with a height of %.02fcm.", tallestTreeID, tallestTreeHeight);
		sc.close();

	}

}
