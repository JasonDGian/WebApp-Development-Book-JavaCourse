package unit7.solvedExercises.exercise6;

// Hour class declaration.
public class Hour {

	private int hours;
	private int minutes;
	private int seconds;

	public Hour() {
	}

	public Hour(int hours, int minutes, int seconds) {

		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;

	}

	// GETTERS AND SETTERS.

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	// Functionals.

	public void incrementSeconds(int secondsIncrement) {

		this.seconds = this.seconds + secondsIncrement;

		if (this.seconds > 59) {
			this.seconds = this.seconds - 60;
			this.minutes++;

			if (this.minutes > 59) {
				this.minutes = this.minutes - 60;
				this.hours++;

				if (this.hours > 23) {
					this.hours = 00;
				}
			}
		}

	}

	public void incrementSecondbySecond(int seconds) {

		for (int i = 0; i < seconds; i++) {

			incrementSeconds(1);
			printTime();
		}

	}

	public void printTime() {

		System.out.printf("The time is %02d:%02d:%02d \n", this.getHours(), this.getMinutes(), this.getSeconds());

	}

}