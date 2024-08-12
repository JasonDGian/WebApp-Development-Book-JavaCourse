package unit7.solvedExercises.exercise10.personal;

import java.time.LocalDate;
import java.util.Objects;

public class StationMaster {

	// ATTRIBUTES.
	private String name;
	private String ID;
	private LocalDate dateOfNaming;

	// CONSTRUCTORS.
	public StationMaster() {

	}

	public StationMaster(String name, String iD, LocalDate dateOfNaming) {
		super();
		this.name = name;
		ID = iD;
		this.dateOfNaming = dateOfNaming;
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

	public LocalDate getDateOfNaming() {
		return dateOfNaming;
	}

	public void setDateOfNaming(LocalDate dateOfNaming) {
		this.dateOfNaming = dateOfNaming;
	}

	// COMPARISON METHODS.

	@Override
	public int hashCode() {
		return Objects.hash(ID, dateOfNaming, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationMaster other = (StationMaster) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(dateOfNaming, other.dateOfNaming)
				&& Objects.equals(name, other.name);
	}

	// TO STRING METHOD.

	@Override
	public String toString() {
		return "StationMaster [name=" + name + ", ID=" + ID + ", dateOfNaming=" + dateOfNaming + "]";
	}

}
