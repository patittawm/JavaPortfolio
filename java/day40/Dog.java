package day40;

public class Dog { //No.C1  access modifier
	// Encapsulation
	// It is data protecting mechanism
	// We achieve encapsulation by making properties
	// private and by providing public getters and setters
	// ปกป้อง ให้ได้ค่าที่ถูกต้อง เช่น อายุ ไม่ต้องการค่าติดลบ หรือค่าบางค่าไม่ต้องการโชว์
	
	
		private String name;
		private int age;
		
		// setter sets the value for private property
		public void setName(String name) {
			this.name = name;
		}
		// getter will return private property
		public String getName() {
			return name;
		}
		
		public void setAge(int age) {
			if (age < 1) {
				// System.out.println("Invalid age: " + age);
				throw new IllegalArgumentException("Invalid age: " + age);
			} else {
				this.age = age;
			}
		}
		
		public int getAge() {
			return age;
		}
	
	
	
}
