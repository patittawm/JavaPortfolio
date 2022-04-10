package day8;

import java.util.Scanner;

public class Multiply {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int num1, num2,result;
		
		
		//System.out.println("How much for apple ?");
		
		////num1 = scanner.next();
		//System.out.println("price is  " + num1 + "per lb");
		
		 //num2 = scanner.next();
		//System.out.println("I like to have " + num2 + " lb");
		
		//result = scanner.next();
		//System.out.println("total price is  " + num1 * num2 + "per lb");
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
		
		result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		
		

	}

}
