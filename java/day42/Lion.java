package day42;

/*
 * What's inheritance in java?
 * It is a process where one class can inherit visible
 * properties and method from another class
 * extends keyword is used for inheritance
 * Lion is child/ sub class
 * Animal is parent / super class
 * 
 * What happens if child class will define the same method
 * as parent class has it?
 * It overrides the parent's class class method
 * Ovetide is optional tag the helps us to check if overide
 */
public class Lion extends Animal{ // A2
	public String str;
	
	@Override // have rule จะคอยเชคว่าถูกต้องหรือไม่ไม่ default
	public void eat() {
		System.out.println("Lion is eating");
	}
	@Override 
	public void run() { // A2 child class
		System.out.println("Aimal is runing");
	}
	@Override
	public String getName() {  // string ไม่ต้องมี void
		return "Animal's name : " + name;
	}
}
/*
 * Method name and number order and type of argument should be the same as in the parent
 */
