package Taller_2;

public abstract class  Shuttle_Vehicule implements Spacecraft {
	
private String manufacturer;
private int power;
private int loadTON;
private static final double max_fuel = 10000;



public Shuttle_Vehicule(String manufacturer, int power, int loadTON) {
	this.manufacturer = manufacturer;
	this.power = power;
	this.loadTON = loadTON;
}
public abstract void prepare_cargo(int Ton);

public abstract void autodestroy();

public String getFuel() {
	return manufacturer;
}

public void setFuel(String manufacturer) {
	this.manufacturer = manufacturer;
}

public int getPower() {
	return power;
}

public void setPower(int power) {
	this.power = power;
}

public int getMax_loadTON() {
	return loadTON;
}

public void setMax_loadTON(int loadTON) {
	this.loadTON = loadTON;
}

public static double getMaxFuel() {
	return max_fuel;
}






	

}
