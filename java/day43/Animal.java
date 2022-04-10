package day43;

public abstract class Animal { //TODO 1.1 ...1. Create an abstract class Animal
	
	public String name; //...2. Create any 1 instance variable
	
	public void printName() {//...3. Create 1 non abstract method
		System.out.println(name);
	}
	
	public abstract void eat();//...4. Create any 2 abstract method
	public abstract void drink();

}

// Animal <-- Mammal <--Ox


