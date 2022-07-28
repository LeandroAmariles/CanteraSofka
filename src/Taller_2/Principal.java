package Taller_2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		do {
			int userAnswer=Integer.parseInt(JOptionPane.showInputDialog("Welcome... Enter 1 if you want start the adventure, Enter 2 to exit"));
			if(userAnswer == 1) {
				int f = Integer.parseInt(JOptionPane.showInputDialog(null, "What type of spacecraft do you want to build?"+"r"+"1.Shuttle"+"r"+"2.Unmanned"+"r"+"3.Manned"));
				
				switch(f) {
				
				case 1:{
					int shuttle = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to Saturno_V or 2 to URSS_Spacecraft"));
					if(shuttle == 1) {
						int weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the weight in Ton, example 3500 "));
						int height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the heigt in Ft, example 120 "));
						String fuelType = JOptionPane.showInputDialog(null,"Enter the fuel type, example propelent ");
						int engines = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of engines, example 4 "));
						String manufacturer = JOptionPane.showInputDialog(null,"Enter the country manufacturer example USA ");
						int power = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Hp power example 35000 "));
						int loadTON = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the loadTon examplo 120 "));
						Saturno_V nave = new Saturno_V(weight,height,fuelType,engines,manufacturer,power,loadTON);
						
						int play = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to start a trip, 2 to exit "));
						switch(play) {
						
						case 1:{
							nave.StartTrip(5000, fuelType);
							nave.prepare_cargo(loadTON);
							nave.KeepOrbiting();
							nave.GoBackToEarth();
							break;
						}
						case 2:{
							x=1;
							nave.autodestroy();
							break;
						}
						
		
						}
					}
					else if(shuttle == 2) {
						int weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the weight in Ton, example 3500 "));
						int height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the heigt in Ft, example 120 "));
						String fuelType = JOptionPane.showInputDialog(null,"Enter the fuel type, example propelent ");
						int engines = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of engines, example 4 "));
						String manufacturer = JOptionPane.showInputDialog(null,"Enter the country manufacturer example USA ");
						int power = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Hp power example 35000 "));
						int loadTON = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the loadTon examplo 120 "));
						URSS_Spacecraft nave2 = new URSS_Spacecraft(manufacturer,power,loadTON,weight,height,fuelType,engines);
						
						int play2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to start a trip, 2 to exit"));
						switch(play2) {
						
						case 1:{
							nave2.StartTrip(4600, fuelType);
							nave2.prepare_cargo(loadTON);
							nave2.KeepOrbiting();
							nave2.GoBackToEarth();
							break;
						}
						case 2:{
							x=1;
							nave2.autodestroy();
							break;
						}
						
						
							
						}
						
						
					}
				}
				case 2:{
					int unmanned = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to create an ATV or 2 to exit"));
					if(unmanned == 1) {
						String manufacturer = JOptionPane.showInputDialog(null,"Enter the country manufacturer example USA");
						int computerSystems = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of Computer Systems"));
						int numberEngine = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of engines"));
						String destination = JOptionPane.showInputDialog(null,"Enter the cdestination for example the Moon");
						String fuel = JOptionPane.showInputDialog(null,"Enter the fuel type for example tetroxido of N");	
						ATV atv = new ATV(manufacturer,computerSystems,numberEngine,destination,fuel);
						
						int play3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to start a trip, 2 to exit"));
						switch(play3) {
						case 1:{
							atv.StartTrip(5000, fuel);
							atv.KeepOrbiting();
							atv.especialTrip(destination);
							atv.especialFuntion();
							atv.GoBackToEarth();
							break;
						}
						case 2:{
							x=1;
							break;
						}
						}
					}
				}
				case 3:{
					int manned = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to create a Skylab, 2 to create a Salyut or 3 to exit"));
					if(manned==1) {
						int numberCrewMembers = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of crews"));
						String typeMission = JOptionPane.showInputDialog(null,"Enter the type of mission, example rescue");
						String country = JOptionPane.showInputDialog(null,"Enter the country");
						boolean destroyed = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"will Skylab be destroyed?, True or False"));
						double orbiteRatio = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the orbit distance"));
						int weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the weight"));
						String fuel = JOptionPane.showInputDialog(null,"Enter the fuelType");
						Skylab skylab = new Skylab(numberCrewMembers,typeMission,country,destroyed,orbiteRatio,weight,fuel);
						
						int play4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to start a trip, 2 to exit"));
						switch(play4) {
						case 1:{
							skylab.StartTrip(75000, fuel );
							skylab.increaseOrbit(orbiteRatio);
							skylab.finish();
							skylab.GoBackToEarth();	
						}
						case 2:{
							break;
						}
						}
					}
					else if(manned == 2) {
						int numberCrewMembers = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of crews"));
						String typeMission = JOptionPane.showInputDialog(null,"Enter the type of mission, example rescue");
						String country = JOptionPane.showInputDialog(null,"Enter the country");
						boolean destroyed = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"will Skylab be destroyed?, True or False"));
						double orbiteRatio = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the orbit distance"));
						int weight = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the weight"));
						String fuel = JOptionPane.showInputDialog(null,"Enter the fuelType");
						Salyut salyut= new Salyut(numberCrewMembers,typeMission,country,destroyed,orbiteRatio,weight,fuel);
						
						int play5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1 to start a trip, 2 to exit"));
						switch(play5) {
						case 1:{
							salyut.StartTrip(14000, fuel);
							salyut.increaseOrbit(salyut.getOrbiteRatio());
							salyut.KeepOrbiting();
							salyut.GoBackToEarth();
						}
						case 2:{
							break;
						}
						}
					}
				}
				
			
				}
			}
			else {
				x=1;
			}

		}while(x==0);
		
	}

}
