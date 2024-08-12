package unit7.solvedExercises.exercise10.personal;

import java.util.Objects;

public class Mechanic {
	
	public enum Expertise {

		BRAKES, HIDRAULICS, ELECTRICITY, ENGINE

	}

	// ATTRIBUTES
	private String name;
	private String phone;
	private Expertise expertise;

	
	//CONSTRUCTORS
	public Mechanic() {
		
	}
	
	public Mechanic(String name, String phone, Expertise expertise) {
		super();
		this.name = name;
		this.phone = phone;
		this.expertise = expertise;
	}

	// ACCESS METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Expertise getExpertise() {
		return expertise;
	}

	public void setExpertise(Expertise expertise) {
		this.expertise = expertise;
	}

	
	// COMPARISON METHODS.
	@Override
	public int hashCode() {
		return Objects.hash(expertise, name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mechanic other = (Mechanic) obj;
		return expertise == other.expertise && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	// TO STRING
	@Override
	public String toString() {
		return "Mechanic [name=" + name + ", phone=" + phone + ", expertise=" + expertise + "]";
	}
	
	

}
