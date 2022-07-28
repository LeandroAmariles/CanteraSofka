package Taller_1;
/**
 * Class Product with name, id and a constant basic price;
 * @author Leandro
 *
 */

public class Product {
	
	 public String name;
	 private long id;
	 private static final double Basicprice = 150;
	 
	 /**
	  * Creates a new Product object with a name and id;
	  * @param name
	  * @param id
	  */
	public Product(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}
	 
	/**
	 * Methods Getter and Setter 
	 * @param id
	 */
	
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return this.id;
	}
	 
	protected void changeName(String name) {
		this.name=name+"-name changed-";
		
	}

}
