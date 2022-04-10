package day41;
	//TODO Encapsulate
	// 1. Make instance variables private
	// 2. generate getters and setters 
public class House {
	
	private String type;
	private int numberOfRoom;
	private double pricre;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}
	public double getPricre() {
		return pricre;
	}
	public void setPricre(double pricre) {
		this.pricre = pricre;
	}
	
	

}
