package day42;

public class Animal { //A1  Parent Class
	
	
	public String name = "Animal";
	public int age;
	
	public void eat() {
		System.out.println("Aimal is eating");
		
	}
	public void run() {
		System.out.println("Aimal is runing");
	}
	public String getName() {
		return "Animal's name : " + name;
	}

}
