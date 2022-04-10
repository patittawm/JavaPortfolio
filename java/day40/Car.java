package day40;
//TODO encapsulate this class
//1. Make all properties private.
//2. Provide public getters and setters.
public class Car { // TODO..A1
	private String model; // เปลี่ยนเป็น private ก่อน public String model;
	private double price; //public double price;

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Price cannot be negatice : " + price);
		}
		this.price = price;
	}
	
}
