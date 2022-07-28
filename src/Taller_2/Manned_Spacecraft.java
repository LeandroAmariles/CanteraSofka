package Taller_2;

public abstract class Manned_Spacecraft implements Spacecraft {
	
	private int numberCrewMembers;
	private String typeMission;
	private String country;
	
	
	public Manned_Spacecraft(int numberCrewMembers, String typeMission, String country) {
		super();
		this.numberCrewMembers = numberCrewMembers;
		this.typeMission = typeMission;
		this.country = country;
	}
	
	public abstract void increaseOrbit(double increase);

	public int getNumberCrewMembers() {
		return numberCrewMembers;
	}

	public void setNumberCrewMembers(int numberCrewMembers) {
		this.numberCrewMembers = numberCrewMembers;
	}

	public String getTypeMission() {
		return typeMission;
	}

	public void setTypeMission(String typeMission) {
		this.typeMission = typeMission;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
