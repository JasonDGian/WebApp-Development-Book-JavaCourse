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
public class Radio {

	// MHZ frequency.
	double frequency = 80;

	public Radio() {

	}

	public Radio(int initialFrequency) {

		this.frequency = initialFrequency;

	}

	// Display the frequency.
	public void display() {

		System.out.printf("Frequency %.02f MHz\n", this.frequency);

	}

	public void searchUp() {
		updateFrequency(0.5);
	}

	public void searchDown() {
		updateFrequency(-0.5);
	}

	/*
	 * If during an increase or decrease operation, one of the limits is exceeded,
	 * the frequency should wrap around to the opposite end.
	 */
	private void updateFrequency(double change) {

		double newFrequency = this.frequency + change;

		if (newFrequency > 108) {

			this.frequency = 80 + (newFrequency - 108);
		} else if (newFrequency < 80) {

			this.frequency = 108 + (newFrequency - 80);
		}

		else {
			this.frequency = newFrequency;
		}

	}

}
