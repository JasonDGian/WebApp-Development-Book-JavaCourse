package unit7.solvedExercises.exercise10.machinery;

import java.util.Objects;

class Wagon {

	// ATTRIBUTES
	private int ID;
	private double maxLoad;
	private double currentLoad;
	private String typeOfLoad;

	// CONSTRUCTORS.
	public Wagon() {

	}

	public Wagon(int id, double maxLoad, double currentLoad, String typeOfLoad) {
		super();
		ID = id;
		this.maxLoad = maxLoad;
		this.currentLoad = currentLoad;
		this.typeOfLoad = typeOfLoad;
	}

	// ACCECSS METHODS.

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	public double getCurrentLoad() {
		return currentLoad;
	}

	public void setCurrentLoad(double currentLoad) {
		this.currentLoad = currentLoad;
	}

	public String getTypeOfLoad() {
		return typeOfLoad;
	}

	public void setTypeOfLoad(String typeOfLoad) {
		this.typeOfLoad = typeOfLoad;
	}

	// COMPARISON METHODS.

	@Override
	public int hashCode() {
		return Objects.hash(ID, currentLoad, maxLoad, typeOfLoad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wagon other = (Wagon) obj;
		return ID == other.ID && Double.doubleToLongBits(currentLoad) == Double.doubleToLongBits(other.currentLoad)
				&& Double.doubleToLongBits(maxLoad) == Double.doubleToLongBits(other.maxLoad)
				&& Objects.equals(typeOfLoad, other.typeOfLoad);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Wagon [ID=" + ID + ", maxLoad=" + maxLoad + ", currentLoad=" + currentLoad + ", typeOfLoad="
				+ typeOfLoad + "]";
	}

}
