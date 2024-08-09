package unit7.solvedExercises.exercise8;

/*
 * Define a class that allows controlling a digital FM radio tuner.
 * Specifically, the controller should have an interface that allows
 * increasing or decreasing the frequency in steps of 0.5 MHz and 
 * displaying the tuned frequency at any given moment.
 * 
 * We will assume that the frequency range to handle oscillates 
 * between 80 MHz and 108 MHz and that at the beginning, the controller 
 * tunes to the frequency indicated in the constructor or 80 MHz by default.
 * 
 * If during an increase or decrease operation, one of the limits is exceeded, 
 * the frequency should wrap around to the opposite end.
 * 
 * Write a small main program to test its functionality.
 */

public class Exercise8 {

	public static void main(String[] args) {
	
		Radio radioFM = new Radio(90);
		
		// Cycling downwards.
		System.out.println("Cycling downwards.");
		for (int i = 0 ; i < 25; i++) {
			radioFM.display();
			radioFM.searchDown();
		}

		// Cycling upwards.
		System.out.println("Cycling upwards.");
		for (int i = 0 ; i < 25; i++) {
		radioFM.display();
		radioFM.searchUp();
		}
		

	}

}
