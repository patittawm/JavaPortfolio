package day39;

import day40.Student;

public class StudentDemo2 { // C3 สร้างมาเพีื่อ day 40

	public static void main(String[] args) {
		Student obj = new Student();
		obj.name = "John Doe";
		//obj.course = "Java";// it doesn't compile, course is protected
		//obj.grade = 100.0; //it doesn't compile, grade is default
		

	}

}
