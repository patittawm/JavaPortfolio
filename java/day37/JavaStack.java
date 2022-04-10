package day37;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		// Stack is LIFO data structure
		//Last In, First out
		//push(); will add mew element to the stack
		//pop(); will get and remove element from the stack nase LIFO order
		
		Stack<String> emails = new Stack<>();
		emails.push("Email from : John");
		emails.push("Email from : Alex");
		emails.push("Email from : Florencia");
		emails.push("Email from : Smith");
		
		System.out.println(emails);//[Email from : John, Email from : Alex, Email from : Florencia, Email from : Smith]
		
		String emailOnTop = emails.pop();
		System.out.println("Frading this email - " + emailOnTop);//Frading this email - Email from : Smith
		System.out.println(emails);//[Email from : John, Email from : Alex, Email from : Florencia]
		
		emailOnTop = emails.pop();
		System.out.println("Frading this email - " + emailOnTop);//Frading this email - Email from : Florencia
		System.out.println(emails);//[Email from : John, Email from : Alex]
		
		while(!emails.isEmpty()) {
			System.out.println("------");
			emailOnTop = emails.pop();
			System.out.println("Frading this email - " + emailOnTop);
			
			
		}
	}

}
