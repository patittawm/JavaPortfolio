package day4;

public class Var {

	public static void main(String[] args) {
		String firstName;
		firstName = "John";
		System.out.println(firstName);//John
		System.out.println("firstName"); //firstName
		
		firstName = "Smith";              //reassign firstName ผลที่ออกมาคือ ชื่อใหม่ที่เราเพื่งสั่ง
		System.out.println(firstName);
		firstName = "Alex";
		System.out.println(firstName); // Alex
		
		// We cannot declare variables with same name
		// String firstName;
		
		String lastName = "Doe";
		System.out.println(lastName); // Doe
		
		// We can declare multiple variables in the same statement.
		String address = "101 Main st", state = "VA", country = "USA";
		System.out.println(address + state + country);//101 Main stVAUSA
		System.out.println(address + "," + state + "," + country);
		
		String address1 = "200 North St";
		String state1 = "MA";
		String country1 = "USA";
		System.out.println(address1 + " " + state1 + " " + country1);

	}

}
