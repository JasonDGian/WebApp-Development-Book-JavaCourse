package unit7.solvedExercises.exercise10.machinery;

import java.util.Arrays;
import java.util.Objects;

import unit7.solvedExercises.exercise10.personal.TrainOperator;

public class Train {

	private TrainOperator trainOperator;
	private Locomotive trainLocomotive;
	private Wagon[] trainWagons;
	private int numWagons;

	// CONSTRUCTORS.
	public Train() {

	}

	public Train(TrainOperator trainOperator, Locomotive trainLocomotive) {
		this.trainOperator = trainOperator;
		this.trainLocomotive = trainLocomotive;
		this.trainWagons = new Wagon[5];
		this.numWagons = 0;

	}

	// ACCESS METHODS.
	public TrainOperator getTrainOperator() {
		return trainOperator;
	}

	public void setTrainOperator(TrainOperator trainOperator) {
		this.trainOperator = trainOperator;
	}

	public Locomotive getTrainLocomotive() {
		return trainLocomotive;
	}

	public void setTrainLocomotive(Locomotive trainLocomotive) {
		this.trainLocomotive = trainLocomotive;
	}

	public Wagon[] getTrainWagons() {
		return trainWagons;
	}

	public void setTrainWagons(Wagon[] trainWagons) {
		this.trainWagons = trainWagons;
	}

	public int getNumWagons() {
		return numWagons;
	}

	public void setNumWagons(int numWagons) {
		this.numWagons = numWagons;
	}

	// FUNCTIONAL METHODS.
	public void attachWagon(int id, double maxLoad, double currentLoad, String typeOfLoad) {

		if (numWagons >= 5) {
			System.out.println("The train cannot attach more wagons.");
		}

		else {
			this.trainWagons[numWagons] = new Wagon(id, maxLoad, currentLoad, typeOfLoad);
			numWagons++;
			System.out.println("Waggon successfully attached | ID: " + id + " | Max load: " + maxLoad
					+ "  | Current load: " + currentLoad + " | Load type: " + typeOfLoad + " |");
		}
	}

	// COMPARISON METHODS.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(trainWagons);
		result = prime * result + Objects.hash(numWagons, trainLocomotive, trainOperator);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return numWagons == other.numWagons && Objects.equals(trainLocomotive, other.trainLocomotive)
				&& Objects.equals(trainOperator, other.trainOperator) && Arrays.equals(trainWagons, other.trainWagons);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Train [trainOperator=" + trainOperator + ", trainLocomotive=" + trainLocomotive + ", trainWagons="
				+ Arrays.toString(trainWagons) + ", numWagons=" + numWagons + "]";
	}

}
