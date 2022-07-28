package Taller_2;

import javax.swing.JOptionPane;

public class ATV extends Unmanned_Spacecraft {
	
	private int numberEngine;
	private String destination ="";
	private String fuel;
	
	
	
	public ATV(String manufacturer, int computerSystems, int numberEngine, String destination, String fuel) {
		super(manufacturer, computerSystems);
		this.numberEngine = numberEngine;
		this.destination = destination;
		this.fuel = fuel;
	}
	public void especialTrip(String destination) {
		this.destination=destination;
		JOptionPane.showMessageDialog(null, "The ATV starts a especial trip to the "+destination);
	}
	
	@Override
	public void StartTrip(int speed) {
		JOptionPane.showMessageDialog(null, "The ATV can not start a trip, the speed is so low");
		
	}
	@Override
	public void StartTrip(int speed, String fuel) {
		JOptionPane.showMessageDialog(null, "The ATV stars a trip, the speed is so hight, is "+speed+", The fuel is "+fuel);
		
	}
	@Override
	public void GoBackToEarth() {
		JOptionPane.showMessageDialog(null, "The ATV can not go back to the earth, sorry");
		
	}
	@Override
	public void KeepOrbiting() {
		JOptionPane.showMessageDialog(null, "The ATV is in orbit");
		
	}
	@Override
	public void especialFuntion() {
		JOptionPane.showMessageDialog(null, "The Moon was destroyed");
		
	}
	@Override
	public int shareNumberSignal() {
		return numberEngine*4589;
	}

	
}
