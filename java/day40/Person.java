package day40;

public class Person { // No.A1 อันนี้ เป็น blueprint or template
	public String firstName;
	public String lastName;
	public int age;
	public static String address; // ตัวนี้เป็น static obj ผลจะออกมาเหมือนกันทุกอย่าง
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	// static method it kind of global
	public static void sayHello() {
		System.out.println("Hello!");
	}
}
