package Day7;

import java.util.Scanner;

public class ScannerInJava {

	public static void main(String[] args) {
		//Scanner will let us get input from user (from console)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		
		String answer = scanner.next();
		System.out.println("Nice to meet you, " + answer + "!");
		
		//ลองใช้เป็น int
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		System.out.println("Oh, you are " + age + " years old.");
		
		// TODO get input from user on "Where do you live?"
		// and print answer out.
		
		System.out.println("Where do you live?");
		//String address = scanner.next(); //ตอนนี้จะพิมออกมาแค่ประโยคแรก ถ้าต้องการใส่ทั้งที่อยู่ ต้องใช้ .nextLine แต่ไม่ได้อ่ะ
		String address = scanner.next() + scanner.nextLine();
		System.out.println("I live at , " + address);
		
		//ex in Day 8
		
		//int firstNumber, secondNumber, result;
		//System.out.println("Enter first number: ");
		//firstNumber = scanner.nextInt();
		
		//System.out.println("Enter second number: ");
		//firstNumber =scanner.nextInt();
		
		//System.out.println(firstNumber + " " + secondNumber + "=" + result);
		//firstNumber = scanner.nextInt();
	
		
		
		
 		

	}

}
