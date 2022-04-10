package Day23;

public class Main { // ลอง object ทำ ในคลาสเดียวกัน

	public static void main(String[] args) {
		// 2.
		Student student = new Student();
		student.firstName = "John";
		student.lastName = "Doe";
		student.program = "Java";
		student.grade = 95.0;

		// System.out.println(student.lastName);
		student.printDetails();
		/*  first name: John
			last name: Doe
			program: Java
			grade: 95.0
		 */
		Student student2 = new Student();
		student2.printDetails();  
		/*  first name: null   ออกมาเป็น default value เพราะไม่มีการ assign value ให้
			last name: null    กับ student2
			program: null
			grade: 0.0
		 */

		System.out.println("-------");
		// TODO A
		// create an object with constructor that has arguments
		// print object properties
		Student student3 = new Student("Jim", "James", "pyton", 99.99);
		student3.printDetails(); //

	}
}
// 1.
//เรียกว่า student Blueprint
class Student {  
	public String firstName;
	public String lastName;
	public String program;
	public double grade;

	// TODO A
	// -> create an empty constructor.เพราะว่า ถ้าเราสร้าง method แบบนี้ new Student();ไม่มี argument
	// -> create constructor that will accept all arguments to assign object
	// properties
	// assign all object properties in the constructor.
	public Student() {  // อันนี้ควรจะทำ empty constructor it very good for practice
		//System.out.println("in empty constructor"); ไม่ต้องมีอันนี้ก็ได้เพราะ java จะสร้างขึ้นมาเองได้
	}

	public Student(String firstName, String lastName, String program, double grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.program = program;
		this.grade = grade;

	}
	// Object can have property and method 
	public void printDetails() {
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);
		System.out.println("program: " + program);
		System.out.println("grade: " + grade);
	}
}
