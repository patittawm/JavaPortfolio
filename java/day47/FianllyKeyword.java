package day47;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FianllyKeyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter some number");
			int num = sc.nextInt();
			System.out.println("Provide number was : " + num);
			
			
		} catch(InputMismatchException e) {
			System.out.println("exception is handled");
		} finally {
			System.out.println("in the finally block");
			sc.close();
		}
		
		// finally block is optional
		// finally block will always run if there is exception or there no.
		// Most of the time we use to close used resources(files, db connections)

	}

}
