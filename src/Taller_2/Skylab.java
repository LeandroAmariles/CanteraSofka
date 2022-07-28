package Taller_2;

import javax.swing.JOptionPane;

public class Skylab extends Manned_Spacecraft{
	
	
	boolean destroyed;
	private double orbiteRatio;
	private int weight;
	private String fuel;
	
	
	
	public Skylab(int numberCrewMembers, String typeMission, String country, boolean destroyed, double orbiteRatio,
			int weight, String fuel) {
		super(numberCrewMembers, typeMission, country);
		this.destroyed = destroyed;
		this.orbiteRatio = orbiteRatio;
		this.weight = weight;
		this.fuel = fuel;
	}
	
	public void finish() {
		if(destroyed) {
		JOptionPane.showMessageDialog(null,"The Skylab was destroyed");
		}
		else {
		JOptionPane.showMessageDialog(null,"The Skylab is alive");	
		}
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



	@Override
	public void StartTrip(int speed) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Skylab stars the trip with "+ speed +"Km/h");
	}



	@Override
	public void StartTrip(int speed, String fuel) {
		JOptionPane.showMessageDialog(null,"The Skylab stars the trip with "+ speed +"Km/h and "+fuel+ "like fuel");
		
	}



	@Override
	public void GoBackToEarth() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Skylab go back to the earth planet");
	}



	@Override
	public void KeepOrbiting() {
		JOptionPane.showMessageDialog(null,"The URSS_Spc stays in orbit");
		
	}



	@Override
	public void increaseOrbit(double increase) {
		JOptionPane.showMessageDialog(null,"The Skylab increases the orbit "+increase);
		
	}
	


	
	
	

}
