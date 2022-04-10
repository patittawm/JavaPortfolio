package day40;

public class Superhero { // No.B1
	public String name;
	public int powerLevel;

	// What's constructor in Java?
	// - It is a special method that helps to create objects.
	// + constructor name is the same name as class name
	// + it doesn't have return type
	// + we call our constructor when we create an object
	// + if we don't define custom constructor , the default constructor will be
	// provide by java
	// + we can have overloaded constructor
			
	// create default constructor ถ้าไม่สร้าง อันนี้ ด้านล่างจะไม่ คอมไพล์
	public Superhero() {
		System.out.println("Inside empty constructor");
	}

	// ต้อง assign มา สร้าง instructor
	public Superhero(String name) {
		// this(); // it will call empty constructor inside this constructor
		// this(); // จะต้องอยู่บรรทัดแรกของ statement
		System.out.println("Inside 1 argument constructor");
		this.name = name; // ต้องครีเอทด้วย ไม่งั้นจะได้ null in SuperheroDemo ->System.out.println(hero2.name);
	}

	public Superhero(String name, int powerLevel) {
		// this("Abc); //it will call constructor with one argument
		// this("Abc); จะเรียก method -> ด้านบน public Superhero(String name)
		System.out.println("Inside 2 argument constructor");
		this.name = name;
		this.powerLevel = powerLevel;
	}

	// Can we call constructor inside another constructor?
	// Yes, we can
	// we need to use this() keyword do so.
	// it should the first statement inside the constructor.

}
