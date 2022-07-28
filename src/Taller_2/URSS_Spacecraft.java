package Taller_2;

import javax.swing.JOptionPane;

public class URSS_Spacecraft extends Shuttle_Vehicule {


	private int weight;
	private int height;
	private String FuelType;
	private int engines;
	

	public URSS_Spacecraft(String manufactured, int power, int loadTON, int weight, int height, String fuelType, int engines) {
		super(manufactured, power, loadTON);
		this.weight = weight;
		this.height = height;
		FuelType = fuelType;
		this.engines = engines;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public String getFuelType() {
		return FuelType;
	}


	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}


	public int getEngines() {
		return engines;
	}


	public void setEngines(int engines) {
		this.engines = engines;
	}


	@Override
	public void StartTrip(int speed) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The URSS_spacecfat stars the trip with "+ speed +"Km/h");
	}


	@Override
	public void StartTrip(int speed, String fuel) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The URSS_Spacecraft stars the trip with "+ speed +"Km/h and "+fuel+ "like fuel");
	}


	@Override
	public void GoBackToEarth() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The URSS_Spc go back to the earth planet");
	}


	@Override
	public void KeepOrbiting() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The URSS_Spc stays in orbit");
	}


	@Override
	public void prepare_cargo(int Ton) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The cargo was loaded with "+ Ton +"Tons");
		System.out.println("The cargo was loaded with "+ Ton +"Tons");
	}


	@Override
	public void autodestroy() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The URSS_Spc was autdestroyed F ");
	}
	

}
