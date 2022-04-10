package Day24;

public class StaticKeyword {
	public static void main (String[] args) {
		
		School obj = new School();
		obj.name = "TLA";
		School.year = 2018;
		//obj.year = 2018;  // ใช้ 
		
		System.out.println(obj.name);
		System.out.println(School.year);
					//     (obj.year);
		
		System.out.println("--------");
		
		School obj2 = new School();
		obj2.year = 2020;
		System.out.println(obj2.name);//null		
		
		System.out.println(obj2.year); // 2020
		System.out.println(School.year); // 2018
	}

}
