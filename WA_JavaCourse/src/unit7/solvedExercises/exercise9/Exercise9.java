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

public class Exercise9 {

	public static void main(String[] args) {

		House home = new House();

		home.lightbulbsStatusReport();
		
		home.turnEntranceOn();
		//home.turnKitchenOn();
		home.turnBathroomOn();
		//home.turnBedroomOn();
		home.turnLivingRoomOn();
		
		home.lightbulbsStatusReport();
		
		home.MainSwitchTurnOff();
		
		home.lightbulbsStatusReport();
		
		home.MainSwitchTurnOn();
		
		home.lightbulbsStatusReport();

		
		Lightbulb entrance = new Lightbulb("entrance");
		entrance.turnOffBulbSwitch();
		entrance.checkStatus();
		entrance.turnOnBulbSwitch();
		entrance.checkStatus();
		entrance.turnOnBulbSwitch();
		Lightbulb.turnMainSwitchOff();
		entrance.checkStatus();
		Lightbulb.turnMainSwitchOn();
		entrance.checkStatus();
		

	}

}
