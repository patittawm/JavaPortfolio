package day33;

public class PassByValue {

	public static void main(String[] args) {
		//All primitive int java are passed by value ถ้าต้องการเปลี่ยน ต้องทำการ reassign
		// #1
		int num = 99;  // they live together
		System.out.println(num); // 99
		m(num);
		System.out.println(num); // 99
		
		

	}
	// #1
	public static void m(int n) {
		// n = num;
		n = 100;  // ไม่เปลี่ยน ยังคง พิม 99
		
	}

}
