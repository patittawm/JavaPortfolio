package Day18;

public class EnumInJava {
	
	enum Country {USA, Canada, UK,Brazil, Russia}; // กำหนดค่าคงที่ให้ตรงนี้
	enum MyNumbers {One, Two, Three};
	public static void main(String[] args) {
		
		
		double fee = getFeeByCountry(Country.USA);
		System.out.println("Your fee: " + fee);
		
		fee = getFeeByCountry(Country.Russia);
		System.out.println("Your fee: " + fee);
		
		myMethod(MyNumbers.One);
		
		
	}
/*
 * usa 10.00
 * Canada 12.00
 * UK   9.0
 * BraZil 8.0
 */

	// แตกต่างจากปกติ 
	public static double getFeeByCountry(Country country) {
		switch(country) {
		case USA:
			return 10.00;
		case Canada:
			return 12.00;
		case UK:
			return 9.0;
		case Brazil:
			return 8.0;
		case Russia:
			return 8.0;
		default:
			return -1;
		
		}
	}	
		// ใช้ enum เปรียบเทียบ
		public static void myMethod(MyNumbers number) {
			
			if(number.equals(MyNumbers.One)) {
				System.out.println(1);
			} else if (number == MyNumbers.Two) {
				System.out.println(2 * 2);
			} else if (number == MyNumbers.Three) {
				System.out.println(3 * 3);
			}
	}
		
}
