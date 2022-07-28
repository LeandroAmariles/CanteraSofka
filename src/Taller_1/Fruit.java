package Taller_1;

import java.util.ArrayList;
/**
 * Class fruit creates a object with name, weight and a list of your colors.
 * @author Leandro
 *
 */

public class Fruit {
	
	
	public String name;
	public float averageWeight;
	private ArrayList<String> colors;
	
	/**
	 * Creates a object type Fruit with the following parameters.	
	 * @param name name of the new fruit
	 * @param average Weight weight of the new fruit
	 * @param colors list of color of the new fruit
	 */
	public Fruit(String name, float averageWeight, ArrayList<String> colors) {
		super();
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}
/**
 * Methods to get or changes the list of colors, setColors just can replace the old list for a new list.
 * @return
 */

	public ArrayList<String> getColors() {
		return colors;
	}

	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	
	
	

}
