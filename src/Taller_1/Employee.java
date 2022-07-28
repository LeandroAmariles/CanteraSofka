package Taller_1;

public class Employee {
	protected  static double basic_Salary = 100;
	protected final static String securityHealthCare = "MediCare";
	
	private String name;
	private String lastName;
	private long id;
		
	public Employee(String name, String lastName, long id) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		
	}
	
	public void increaseSalary(double increase) {
		this.basic_Salary += 50;
	}

	public static double getBasic_Salary() {
		return basic_Salary;
	}

	public static void setBasic_Salary(double basic_Salary) {
		Employee.basic_Salary = basic_Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public static String getSecurityhealthcare() {
		return securityHealthCare;
	}
	
	

}
