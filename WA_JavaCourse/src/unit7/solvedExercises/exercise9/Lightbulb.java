package unit7.solvedExercises.exercise9;

/*
 * Model a house with many light bulbs, where each bulb can be turned on or off individually.
 * To do this, create a LightBulb class with a private variable that indicates 
 * whether it is on or off, as well as a method that tells us the state of a specific bulb.
 * 
 * Additionally, we want to add a general switch so that if it is turned off, 
 * all the bulbs turn off with it. When the general switch is turned on again, 
 * the bulbs return to their previous state, either on or off.
 */
public class Lightbulb {

	public static boolean mainSwitchOn = true;

	private String room;

	private boolean bulbSwitchOn = false;

	private boolean status = bulbSwitchOn && mainSwitchOn;

	// CONSTRUCTOR
	public Lightbulb(String room) {
		this.room = room;
	}

	// FUNCTIONALS
	public void turnOnBulbSwitch() {

		this.bulbSwitchOn = true;

	}

	public void turnOffBulbSwitch() {

		this.bulbSwitchOn = false;

	}

	public static void turnMainSwitchOn() {
		mainSwitchOn = true;
	}

	public static void turnMainSwitchOff() {
		mainSwitchOn = false;
	}

	public void checkStatus() {

		this.status = bulbSwitchOn && mainSwitchOn;

		String statusString;

		if (this.status) {
			statusString = "ON";
		} else {
			statusString = "OFF";
		}

		printStatus(statusString);

	}

	public void printStatus(String status) {
		System.out.println("The " + room.toUpperCase() + " lightbulb is " + status);
	}

}
