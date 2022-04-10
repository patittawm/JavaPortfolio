package day43;
/*
 * 1. Abstract classes cannot be instantiated directly.
 * we cannot create objects out of abstract classes.
 * 
 * 2. Abstract classes can have abstract methods.
 * 
 * 3. Abstract classes can have regular methods and instance variables
 * 
 * 4. Abstract classes cannot be tagged as final, private and protected
 * 
 * 5. If regular class extends abstract class, it must implement(override)
 *    abstract methods of abstract class.
 *    
 * 6. If abstract class extends abstract class, it is not required to
 *    override abstract methods.    
 */
public abstract class C {  //C1
	public abstract void flower();
	
	public abstract void color(); 
	
	public abstract int box();
	
	//Abstract class can have regular methods and variables
	
	public void printHi() {
		System.out.println("hi!");
	}
	
	public String getStr() {
		return "str";
	}
	
}
