package day43;

public class CarDemo { // B2

	public static void main(String[] args) { 
		//Car car = new Car();
		//Abstract class cannot be initialized
		//directly
		
		//We use abstract classes by providing concrete class
		BMW car = new BMW(); // เปลี่ยนเป็น Audi ตรงนี้ได้
		//Audi car = new Audi();
		car.drive();
		car.stop();
		System.out.println(car.speed()); // อันนนี้ต้องมี System.out เพราะว่า ใน คลาส  
		
		System.out.println("---------");
		
		//drive around ถ้าอยากให้พิมพ์ หลายๆ จำนวน ให้ใช้ตรงนี้ loop
		for(int i = 0; i < 5; i++) {
			car.drive();
		}
		
		System.out.println("---------");
		
		//a lot of code
		car.stop();
		System.out.println(car.speed()); // 90.5

	}
	
}
