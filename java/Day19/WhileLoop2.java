package Day19;
import java.util.Scanner;
public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of prints:");
		int numberOfPrints = sc.nextInt();
		
		// 				 3 > 10  -> false
		if (numberOfPrints > 10) {
			System.out.println("I cannot print more than 10");
			
		} else {
			// out loop is here
			int count = 0;
			//        0 < 3 -> true
			while(count < numberOfPrints) {
				System.out.println("Java is great");
				count++; // อันนี้จำเป็นต้องมี ไม่งั้นจะไม่หยุดพิมพ์ จนต้องกด stop
			}
		}

	}

}
