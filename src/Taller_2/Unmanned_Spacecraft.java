package Taller_2;

public abstract class Unmanned_Spacecraft implements Spacecraft{
	
	private String manufacturer;
	private static final  double max_speed = 12000;
	private int computerSystems;
	
	
	public Unmanned_Spacecraft(String manufacturer, int computerSystems) {
		super();
		this.manufacturer = manufacturer;
		this.computerSystems = computerSystems;
	}
	
	public abstract void especialFuntion();
	
	public abstract int shareNumberSignal();


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public int getComputerSystems() {
		return computerSystems;
	}


	public void setComputerSystems(int computerSystems) {
		this.computerSystems = computerSystems;
	}


	public static double getMaxSpeed() {
		return max_speed;
	}
	
	
	
	
	

}
