package day44;

public class ZooKeeper { //R4

	public static void main(String[] args) {
		Reptile obj = new Crocodile();
		//Crocodile obj1 = new Reptile(); // doesn't compile

		Reptile obj2 = new Alligator();
		//Reptile obj2 -> reference type
		//Reference type will decide what method / properties 
		// available to call
		
		// new Aligator() -> actual object
		// If method was overriden the overridden method
		// will be executed (NOT FOR HIDING
		obj2.run();
		obj.run();
		System.out.println(obj2.name); // John
		
		System.out.println("----Type casting----");
		// Type casting
		Alligator alligator = new Alligator();
		Reptile reptile = alligator;
		
		Reptile r = new Reptile();
		// Alligator a = r; // doesn't compile
		// Alligator a2 = (Alligator)r; // throws runtime exception
		Reptile r2 = new Alligator();
		Alligator a = (Alligator)r2; //// type casting
		
		feed(r);
		feed(alligator);
		feed(new Crocodile());
		
	}
	// no static it doesn't compile
	public static void feed(Reptile r) {
		
		System.out.println(r.getClass());
	}
}
