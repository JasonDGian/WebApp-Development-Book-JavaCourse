package unit1.solvedExercises.exercise11;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {

		final double PRICE_APPLE = 2.35;
		final double PRICE_PEAR = 1.95;

		Scanner sc = new Scanner(System.in);

		double kgAppleFirstSem, kgPearFirstSem, kgAppleSecondSem, kgPearSecondSem;

		System.out.println("Enter the KG of Apples sold during the first semester.");
		kgAppleFirstSem = sc.nextDouble();

		System.out.println("Enter the KG of Pears sold during the first semester.");
		kgPearFirstSem = sc.nextDouble();

		System.out.println("Enter the KG of Apples sold during the second semester.");
		kgAppleSecondSem = sc.nextDouble();

		System.out.println("Enter the KG of Pears sold during the second semester.");
		kgPearSecondSem = sc.nextDouble();

		double totalApples = (kgAppleFirstSem + kgAppleSecondSem) * PRICE_APPLE;
		double totalPears = (kgPearFirstSem + kgPearSecondSem) * PRICE_PEAR;

		System.out.printf("Total revenue in apples : %.2f€\n", totalApples);
		System.out.printf("Total revenue in pears : %.2f€\n", totalPears);
		System.out.println("Overall products: " + (totalApples + totalPears) + "€");

		sc.close();
	}

}
