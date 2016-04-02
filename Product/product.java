package mader.dbi.uebung6


public class Product{
	private String name;
	private boolean onStock;
	private int id;
	
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