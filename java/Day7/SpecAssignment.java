package Day7;

public class SpecAssignment {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		
		//increase the value of num by 10
		//    100+10
		num = num + 10;
		System.out.println(num); // 110
		
		num += 10;
		System.out.println(num); //120
		
		// decrease value by 20
		//   120 - 20
		num = num - 20;
		System.out.println(num);
		
		// decrease value by 15 using spec assignment oper
				num -= 15;
				System.out.println(num); // 85
				
				// increase value by 2
				// num = num * 2;
				num *= 2;
		
		
	}
}
