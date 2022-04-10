package day43;
//			ใส่ extends ไม่ work ต้อง implement โดย override
public class Audi extends Car { // B3
	// Audi must implement Car's abstract methods
	// implement = Override
	@Override 
	public void drive() {
		System.out.println("Audi is driving");
	}
	@Override
	public void stop() {
		System.out.println("Audi is stopped");
	}
	@Override
	public double speed() {
		return 90.5;
	}
}
