package day44;
// first concrete class จากนั้นไป ครีเอท ใน CarDemo
public class TeslaModelS implements Car{ //A2

	@Override
	public void drive() {
		System.out.println("TeslaModelS is driving.");
	}
	@Override
	public void stop () {
		System.out.println("TeslaModelS is stopped");
	}
	@Override
	public double getSpeed () {
		return 90.5;
	}
	@Override
	public void turn (String way) {
		if(way.equals("left")) {
			System.out.println("Go left");
		} else {
			System.out.println("Go right");
		}
	}
	public void driveFast() {
		
	}
}
