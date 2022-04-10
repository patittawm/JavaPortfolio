package day40;

public class PersonDemo2 { // A3 show about static เริ่มตั้งแต่ line 7 ใน A1

	public static void main(String[] args) {
		// What's static keyword in Java?
		// - static variables and method are belong to class and not to specific object
		// - the correct way of using static members is by class name without
		//    create object
		//(class Person ).address = values
		
		//Person.address = "101 main st";
		//Person.sayHello();//Hello! ไม่ต้องใส่ค่าในนี้ เพราะว่าสร้างไว้แล้วใน A1
		
		Person person = new Person();
		person.firstName = "Vijay";
		person.lastName = "Kumar";
		person.age = 45;
		
		person.address = "123 North Street";
		//Person.address = "101 main st";
		
		System.out.println(person.getFullName());
		System.out.println(person.age);
		System.out.println(person.address);
	
		System.out.println("--------2");
		
		Person person2 = new Person();
		System.out.println(person2.getFullName());
		System.out.println(person2.age);
		System.out.println(person2.address);
		
		System.out.println("--------3");
		Person person3 = new Person();
		System.out.println(person2.address);
	// จากตัวอย่างด้านบน แสดงให้เห็นว่า static keyword จะไม่เปลี่ยน ไม่ว่าจะ assign ค่าใหม่มาแล้ว
		// เป็นตัวอย่างที่ไม่ถูกต้อง person.address = "123 North Street";
		// การครีเอทที่ถูกต้องคือ Person.address = "101 main st";
	}

}
