package Taller_2;

import javax.swing.JOptionPane;

public class Salyut extends Manned_Spacecraft {
	
	boolean destroyed;
	private double orbiteRatio;
	private int weight;
	private String fuel;
	private static final int numberCrewMembers = 3;
	
	public Salyut(int numberCrewMembers, String typeMission, String country, boolean destroyed, double orbiteRatio,
			int weight, String fuel) {
		super(numberCrewMembers, typeMission, country);
		this.destroyed = destroyed;
		this.orbiteRatio = orbiteRatio;
		this.weight = weight;
		this.fuel = fuel;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getOrbiteRatio() {
		return orbiteRatio;
	}

	public void setOrbiteRatio(double orbiteRatio) {
		this.orbiteRatio = orbiteRatio;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public static int getNumbercrewmembers() {
		return numberCrewMembers;
	}

	@Override
	public void StartTrip(int speed) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Salyut stars the trip with "+ speed );
	}

	@Override
	public void StartTrip(int speed, String fuel) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Salyut stars the trip with "+ speed +"Km/h and "+fuel+ "like fuel");
	}

	@Override
	public void GoBackToEarth() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Salyut go back to the earth planet");
	}

	@Override
	public void KeepOrbiting() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The can not keeping in orbit");
	}

	@Override
	public void increaseOrbit(double increase) {
		// TODO Auto-generated method stub
		double i = orbiteRatio + increase;
		JOptionPane.showMessageDialog(null,"The Salyut increase orbit to"+i);
	}

	
	
}
