package day44;

public class Eagle extends Bird implements CanFly, Animal { //C2
	// We can implement many interfaces at the same time.	
	// we can extends and implement other interfaces as well.
	
	@Override
	public void fly() {
		System.out.println("Egle can fly");
		
	}

	@Override
	public void takeoff() {
		System.out.println("I can take off a lot time");
		
	}

	@Override
	public void dive() {
		System.out.println("IEagle is diving.");
		
	}
	@Override
	public void eat() {
		System.out.println("Eagle is eating");
	}

	@Override
	public void drink() {
		System.out.println("Eagle is drinking");
	}
	
	public static void main(String[] args) {
		Eagle obj = new Eagle();
		obj.fly();
		obj.takeoff();
		obj.dive();
	
	}
}
