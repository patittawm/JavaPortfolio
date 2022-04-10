package Day6;

public class School {
	
	public static void main(String[] args) {
		String name = "Kitty";
		int students = 35;
		String street = "Grizzly blve";
		
		System.out.println(name);
		System.out.println(students); 
		System.out.println(street);
		
	}

} /* ทั้งหมดเป็น static variable not Instance
		ที่ส่งไปเป็นแบบนี้แต่ผิด

public class School {
	public static String name = "Kitty";
	public static int students = 35;
	public static String street = "Grizzly blve";

	public static void main(String[] args) {
		
		System.out.println(name);
		System.out.println(students); 
		System.out.println(street);
		
	}

}

*/