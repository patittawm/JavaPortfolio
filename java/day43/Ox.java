package day43;
// first concrete class is the class that we can create instance variable by using "new" keyword
public class Ox extends Mammal { // TODO 1.3...6.Create concrete class OX that implements Mammal
	@Override
	public void eat() {
		System.out.println("Ox is eating");
	}
	
	@Override
	public void drink() {
		System.out.println("Ox is drinking");
	}
	
	public static void main(String[] args) {
		
		Ox ox = new Ox();     //----> อันนี้คือการใช้ new keyword 
		ox.name = "Ox";
		System.out.println(ox.name);
	}
	
}
//Animal <-- Mammal <--Ox