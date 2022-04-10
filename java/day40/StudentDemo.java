package day40;

public class StudentDemo { //S2

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "John Doe";
		obj.course = "Java";
		obj.grade = 90.0;
		
		// doesn't compile , age is private
		// obj.age = 25;
		//System.out.println(obj.name);
	}

}
