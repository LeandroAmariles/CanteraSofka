package Taller_1;

public class Employee_type_1 extends Employee{
	
	private String area;
	
	
	public Employee_type_1(String name, String lastName, long id, String area) {
		super(name, lastName, id);
		this.area = area;
	
	}
	public void increaseSalary(double increase) {
		this.basic_Salary += 150;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

	

}
