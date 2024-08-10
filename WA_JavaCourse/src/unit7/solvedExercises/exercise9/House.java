package unit7.solvedExercises.exercise9;

public class House {

	// Lightbulbs

	private Lightbulb entrance = new Lightbulb("entrance");
	private Lightbulb kitchen = new Lightbulb("kitchen");
	private Lightbulb bathroom = new Lightbulb("bathroom");
	private Lightbulb bedroom = new Lightbulb("bedroom");
	private Lightbulb livingRoom = new Lightbulb("living room");

	public House() {

	}

	public void MainSwitchTurnOff() {
		Lightbulb.turnMainSwitchOff();
	}

	public void MainSwitchTurnOn() {
		Lightbulb.turnMainSwitchOn();
	}

	public Lightbulb getEntrance() {
		return entrance;
	}

	public Lightbulb getKitchen() {
		return kitchen;
	}

	public Lightbulb getBathroom() {
		return bathroom;
	}

	public Lightbulb getBedroom() {
		return bedroom;
	}

	public Lightbulb getLivingRoom() {
		return livingRoom;
	}

	public void lightbulbsStatusReport() {
		System.out.println("-".repeat(20) + " BULB STATUS " + "-".repeat(20));
		entrance.checkStatus();
		kitchen.checkStatus();
		bathroom.checkStatus();
		bedroom.checkStatus();
		livingRoom.checkStatus();
		System.out.println("-".repeat(53));
	}

	// QOL Methods
	public void turnEntranceOn() {
		this.entrance.turnOnBulbSwitch();
	}

	public void turnEntranceOff() {
		this.entrance.turnOffBulbSwitch();
	}

	public void turnKitchenOn() {
		this.kitchen.turnOnBulbSwitch();
	}

	public void turnKitchenOff() {
		this.kitchen.turnOffBulbSwitch();
	}

	public void turnBathroomOn() {
		this.bathroom.turnOnBulbSwitch();
	}

	public void turnBathroomOff() {
		this.bathroom.turnOffBulbSwitch();
	}

	public void turnBedroomOn() {
		this.bedroom.turnOnBulbSwitch();
	}

	public void turnBedroomOff() {
		this.bedroom.turnOffBulbSwitch();
	}

	public void turnLivingRoomOn() {
		this.livingRoom.turnOnBulbSwitch();
	}

	public void turnLivingRoomOff() {
		this.livingRoom.turnOffBulbSwitch();
	}

}
