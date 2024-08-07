package unit7.solvedExercises.exercise6;

import java.util.Scanner;

/**
 * Write a program that reads any given time and a number N from the keyboard,
 * which represents a quantity of seconds. The program will display the entered
 * time and the following N times that differ by one second each. For this, we
 * need to design the Time class beforehand, which has the attributes hour,
 * minute, and second. The values of the attributes will be controlled through
 * set/get methods.
 */

public class Exercise6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hour time = new Hour();

		System.out.println("Enter the current time.");
		System.out.println("Enter the hours:");
		time.setHours(sc.nextInt());

		System.out.println("Enter the hours:");
		time.setMinutes(sc.nextInt());

		System.out.println("Enter the hours:");
		time.setSeconds(sc.nextInt());

		time.printTime();
		
		System.out.println("Enter a number of seconds to show the time difference.");
		time.incrementSecondbySecond(sc.nextInt());

		sc.close();
	}

}
