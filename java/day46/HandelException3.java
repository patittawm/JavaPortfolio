package day46;
import java.util.InputMismatchException;
import java.util.Scanner;
public class HandelException3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number from 1-5: ");
		
		int num = 0;
		// try and catch จะทำครอบคลุมถึง switch ก็ได้ ผลออกมาเหมือนกัน ถ้าแบบสั้นๆ ก็แบบนี้ แต่have to 
		// add int num = 0; value 
		try {
			num = sc.nextInt();  //เริ่มตั้งแต่ this line
		
		} catch (InputMismatchException iE) {
			
			System.out.println("Numeric values only");
			return; // exit from void method
			// System.exit(0); // shutdown the thread.
		}
			
			switch(num) { // ใน switch นี้ ถุกต้อง
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Numbers from 1-5 only.");
		}// TODO handle exception for non numeric values and print "Numeric values only"

	}

}
