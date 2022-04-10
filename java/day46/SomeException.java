package day46;

public class SomeException {

	public static void main(String[] args) {
		
		// NullPointerException
		// When do you get null pointer exception?
		// We get null pointer exception when our object is null(reference pointing
		// to null) and we are trying to use some property or method of this object.

		String str = null;
		System.out.println(str);//null
		System.out.println(str == null); //true

		// System.out.println(str.toUpperCase());//java.lang.NullPointerException

		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");

		System.out.println("---------------");

		Car car = null;
		System.out.println("Yes, they are equal.");
		// car.model = "Audi"; // java.lang.NullPointerException

		String val = getValue();
		if ("apple".equals(val)) { //put know value value first (apple 
			System.out.println("Yes, they are equal.");
		} else {
			System.out.println("No, they are not equal.");
		}
	}

	public static String getValue() {
		return null;
	}

}

class Car {
	public String model;
	public String color;
}
