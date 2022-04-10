package day43;

public abstract class Car { // B1
	// 1. Abstraction lets us focus on what object does instead of how it does
	// 2. Abstract classes can have abstract methods. Abstract methods don't have bodies
	// ถึือว่าเป็น Template
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract double speed();
	
}
