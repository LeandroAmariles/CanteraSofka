package Taller_1;

import java.sql.Date;
/**
 * Class Person with all the attributes privates, each attribute has a get and setter method.
 * The class has two constructors, one with all its attributes and other empty.
 *
 */
public class Person {
	
	private String name;
	private String lastName1;
	private String lastName2;
	private Date dateBirth;
	private float height;
	
	/**
	 * Creates an instance of class Person with all its parameters.
	 * @param name name of the person
	 * @param lastName1 first last name of the person
	 * @param lastName2 second last name of the person
	 * @param dateBirth Birth date of the person
	 * @param height height of the person
	 */
	public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
		super();
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	/**
	 * Creates an instance of class Person
	 */
	public Person() {}
	
	/**
	 * Getter and setter methods to use or change the object attributes.
	 * 
	 */
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

	public String getLastName1() {
		return lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
	

}
