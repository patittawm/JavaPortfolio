package day43;

public class BMW extends Car { //B4

	@Override 
	public void drive() {
		System.out.println("BMW is deiving");
	}
	@Override
	public void stop() {
		System.out.println("BMW is stopped");
	}
	@Override
	public double speed() {
		return 90.5;
	}
}
