package Day10;

public class Review2 {

	public static void main(String[] args) {
		
		//if (true) {
		//	System.out.println("Python");
		//	System.out.println("Python");
			
		//} else {
		//	System.out.println("Java");
		//}
		System.out.println(getNum(2000));
		System.out.println(getNum(7));
		
		String res = getNum(1000);
		System.out.println(res);
		
		getNum(999); //มันคือ method ไม่ไ้ดสั่งพิม จึงไม่เห็นอะไร
		
		printName("John", 18);
		printName("Alex", 35);
		printName("Ramesh", 15);
		
		
		
	}

	public static String getNum(int num) {
		//999 >= 1000 -> false
		if (num >= 1000) {
			return "big number";
		} else {
			return "regular number";
		}
	}
		
	public static void printName(String name, int age) {

			if (age > 21) {
				// void methods can have return statement
				// it will just exit from the method.
				return;
			} 
			
			System.out.println("Name: " + name); 
		}
		
}

