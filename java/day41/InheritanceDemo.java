package day41;

public class InheritanceDemo { //I3

	public static void main(String[] args) {
		Student obj = new Student();
		//
		obj.firstName = "John";
		obj.lastName = "Doe";
		obj.age = 28;
		
		obj.studentId = 1;
		obj.course = "Java";
		
		System.out.println(obj.getFullName());
	}

}
