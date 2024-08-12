package unit7.solvedExercises.exercise10.personal;

import java.util.Objects;



public class TrainOperator {

	// ATTRIBUTES
	private String name;
	private String ID;
	private String rank;
	private double salary;

	// CONSTRUCTORS.
	public TrainOperator() {

	}

	public TrainOperator(String name, String iD, String rank, double salary) {
		super();
		this.name = name;
		ID = iD;
		this.rank = rank;
		this.salary = salary;
	}

	// ACCESS METHODS.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// COMPARISON METHODS.

	@Override
	public int hashCode() {
		return Objects.hash(ID, name, rank, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainOperator other = (TrainOperator) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(name, other.name) && Objects.equals(rank, other.rank)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	// TO STRING.

	@Override
	public String toString() {
		return "Train operator [name=" + name + ", ID=" + ID + ", rank=" + rank + ", salary=" + salary + "]";
	}

}
