package mader.dbi.uebung6


public class Product{
	private String name;
	
	
	public Product(String name) {
		setName(name);
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}