package helloworld;

public class Car {

	private String company;
	private int price;
	private String name;
	
	
	
	
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Car company=" + company + ", price=" + price + ", name=" + name + "]";
	}
	
	
	
	
	//=========================
		
	
	
}
