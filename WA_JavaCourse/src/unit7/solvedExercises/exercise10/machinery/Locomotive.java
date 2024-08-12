package unit7.solvedExercises.exercise10.machinery;

import java.time.LocalDate;
import java.util.Objects;

import unit7.solvedExercises.exercise10.personal.Mechanic;

public class Locomotive {

	// ATTRIBUTES
	private String plate;
	private double enginePower;
	private LocalDate manufactureYear;
	private Mechanic assignedMechanic;

	// CONSTRUCTOR
	public Locomotive() {

	}

	public Locomotive(String plate, double enginePower, LocalDate manufactureYear, Mechanic assignedMechanic) {
		super();
		this.plate = plate;
		this.enginePower = enginePower;
		this.manufactureYear = manufactureYear;
		this.assignedMechanic = assignedMechanic;
	}

	// ACCESS METHODS.
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public double getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(double enginePower) {
		this.enginePower = enginePower;
	}

	public LocalDate getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(LocalDate manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public Mechanic getAssignedMechanic() {
		return assignedMechanic;
	}

	public void setAssignedMechanic(Mechanic assignedMechanic) {
		this.assignedMechanic = assignedMechanic;
	}

	// COMPARISON METHODS
	@Override
	public int hashCode() {
		return Objects.hash(assignedMechanic, enginePower, manufactureYear, plate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locomotive other = (Locomotive) obj;
		return Objects.equals(assignedMechanic, other.assignedMechanic)
				&& Double.doubleToLongBits(enginePower) == Double.doubleToLongBits(other.enginePower)
				&& Objects.equals(manufactureYear, other.manufactureYear) && Objects.equals(plate, other.plate);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Locomotive [plate=" + plate + ", enginePower=" + enginePower + ", manufactureYear=" + manufactureYear
				+ ", assignedMechanic=" + assignedMechanic + "]";
	}

}
